package kittehmod.vct.items;

import javax.annotation.Nullable;

import kittehmod.vct.entities.MinecartCraftingTable;
import net.minecraft.core.BlockPos;
import net.minecraft.core.BlockSource;
import net.minecraft.core.Direction;
import net.minecraft.core.dispenser.DefaultDispenseItemBehavior;
import net.minecraft.core.dispenser.DispenseItemBehavior;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseRailBlock;
import net.minecraft.world.level.block.DispenserBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.RailShape;
import net.minecraft.world.level.gameevent.GameEvent;

public class CraftingTableMinecartItem extends Item
{
	@Nullable
	private final MinecartCraftingTable.CraftingTableType craftingTableType;

	private static final DispenseItemBehavior DISPENSE_ITEM_BEHAVIOR = new DefaultDispenseItemBehavior() {
		private final DefaultDispenseItemBehavior defaultDispenseItemBehavior = new DefaultDispenseItemBehavior();

		/**
		 * Dispense the specified stack, play the dispense sound and spawn particles.
		 */
		@SuppressWarnings("deprecation")
		public ItemStack execute(BlockSource source, ItemStack stack) {
			Direction direction = source.getBlockState().getValue(DispenserBlock.FACING);
			Level world = source.getLevel();
			double d0 = source.x() + (double) direction.getStepX() * 1.125D;
			double d1 = Math.floor(source.y()) + (double) direction.getStepY();
			double d2 = source.z() + (double) direction.getStepZ() * 1.125D;
			BlockPos blockpos = source.getPos().relative(direction);
			BlockState blockstate = world.getBlockState(blockpos);
			RailShape railshape = blockstate.getBlock() instanceof BaseRailBlock ? ((BaseRailBlock) blockstate.getBlock()).getRailDirection(blockstate, world, blockpos, null) : RailShape.NORTH_SOUTH;
			double d3;
			if (blockstate.is(BlockTags.RAILS)) {
				if (railshape.isAscending()) {
					d3 = 0.6D;
				} else {
					d3 = 0.1D;
				}
			} else {
				if (!blockstate.isAir() || !world.getBlockState(blockpos.below()).is(BlockTags.RAILS)) {
					return this.defaultDispenseItemBehavior.dispense(source, stack);
				}

				BlockState blockstate1 = world.getBlockState(blockpos.below());
				RailShape railshape1 = blockstate1.getBlock() instanceof BaseRailBlock ? blockstate1.getValue(((BaseRailBlock) blockstate1.getBlock()).getShapeProperty()) : RailShape.NORTH_SOUTH;
				if (direction != Direction.DOWN && railshape1.isAscending()) {
					d3 = -0.4D;
				} else {
					d3 = -0.9D;
				}
			}

			MinecartCraftingTable minecartentity = new MinecartCraftingTable(world, d0, d1 + d3, d2);
			if (stack.getItem() instanceof CraftingTableMinecartItem) {
				CraftingTableMinecartItem item = (CraftingTableMinecartItem) stack.getItem();
				minecartentity.setCraftingTableType(item.craftingTableType);
			} else {
				minecartentity.setCraftingTableType(MinecartCraftingTable.CraftingTableType.OAK);
			}
			if (stack.hasCustomHoverName()) {
				minecartentity.setCustomName(stack.getHoverName());
			}
			world.addFreshEntity(minecartentity);
			stack.shrink(1);
			return stack;
		}

		/**
		 * Play the dispense sound from the specified block.
		 */
		protected void playSound(BlockSource source) {
			source.getLevel().levelEvent(1000, source.getPos(), 0);
		}
	};

	public CraftingTableMinecartItem(Item.Properties builder) {
		super(builder);
		this.craftingTableType = null;
		DispenserBlock.registerBehavior(this, DISPENSE_ITEM_BEHAVIOR);
	}

	public CraftingTableMinecartItem(Item.Properties builder, MinecartCraftingTable.CraftingTableType tableType) {
		super(builder);
		this.craftingTableType = tableType;
		DispenserBlock.registerBehavior(this, DISPENSE_ITEM_BEHAVIOR);
	}

	/**
	 * Called when this item is used when targetting a Block
	 */
	public InteractionResult useOn(UseOnContext context) {
		Level level = context.getLevel();
		BlockPos blockpos = context.getClickedPos();
		BlockState blockstate = level.getBlockState(blockpos);
		Player player = context.getPlayer();
		if (!blockstate.is(BlockTags.RAILS)) {
			return InteractionResult.FAIL;
		} else {
			ItemStack itemstack = context.getItemInHand();
			if (!level.isClientSide) {
				RailShape railshape = blockstate.getBlock() instanceof BaseRailBlock ? ((BaseRailBlock) blockstate.getBlock()).getRailDirection(blockstate, level, blockpos, null) : RailShape.NORTH_SOUTH;
				double d0 = 0.0D;
				if (railshape.isAscending()) {
					d0 = 0.5D;
				}

				MinecartCraftingTable minecartentity = new MinecartCraftingTable(level, (double) blockpos.getX() + 0.5D, (double) blockpos.getY() + 0.0625D + d0, (double) blockpos.getZ() + 0.5D);
				minecartentity.setCraftingTableType(this.craftingTableType);
				if (itemstack.hasCustomHoverName()) {
					minecartentity.setCustomName(itemstack.getDisplayName());
				}

				level.addFreshEntity(minecartentity);
				level.gameEvent(GameEvent.ENTITY_PLACE, blockpos, GameEvent.Context.of(player, level.getBlockState(blockpos.below())));
			}
			else {
				level.playSound(player, blockpos.getX(), blockpos.getY(), blockpos.getZ(), SoundEvents.MINECART_RIDING, SoundSource.NEUTRAL, 0.5F, 0.5F); //Workaround for lack of sound.
			}
			itemstack.shrink(1);
			return InteractionResult.sidedSuccess(level.isClientSide);
		}
	}
}
