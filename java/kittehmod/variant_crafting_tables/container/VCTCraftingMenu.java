package kittehmod.variant_crafting_tables.container;

import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.inventory.CraftingMenu;
import net.minecraft.world.level.block.Block;

public class VCTCraftingMenu extends CraftingMenu
{
	private final ContainerLevelAccess access;
	private final Block block;

	public VCTCraftingMenu(int id, Inventory playerInventoryIn, Block blockIn) {
		this(id, playerInventoryIn, ContainerLevelAccess.NULL, blockIn);
	}

	public VCTCraftingMenu(int p_39356_, Inventory inv, ContainerLevelAccess p_39358_, Block blockIn) {
		super(p_39356_, inv, p_39358_);
		this.access = p_39358_;
		this.block = blockIn;
	}

	/**
	 * Determines whether supplied player can use this container
	 */
	@Override
	public boolean stillValid(Player playerIn) {
		return stillValid(this.access, playerIn, block);
	}

}