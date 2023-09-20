package kittehmod.vct.items;

import javax.annotation.Nullable;

import kittehmod.vct.VariantCraftingTablesMod;
import kittehmod.vct.blocks.VCTBlocks;
import kittehmod.vct.entities.MinecartCraftingTable.CraftingTableType;
import net.minecraft.network.chat.contents.TranslatableContents;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.loading.FMLEnvironment;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class VCTItems
{
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, VariantCraftingTablesMod.MOD_ID);
	
	// Vanilla
	public static final RegistryObject<Item> SPRUCE_CRAFTING_TABLE = ITEMS.register("spruce_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.SPRUCE_CRAFTING_TABLE.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
	public static final RegistryObject<Item> BIRCH_CRAFTING_TABLE = ITEMS.register("birch_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.BIRCH_CRAFTING_TABLE.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
	public static final RegistryObject<Item> JUNGLE_CRAFTING_TABLE = ITEMS.register("jungle_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.JUNGLE_CRAFTING_TABLE.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
	public static final RegistryObject<Item> ACACIA_CRAFTING_TABLE = ITEMS.register("acacia_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.ACACIA_CRAFTING_TABLE.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
	public static final RegistryObject<Item> DARK_OAK_CRAFTING_TABLE = ITEMS.register("dark_oak_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.DARK_OAK_CRAFTING_TABLE.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
	public static final RegistryObject<Item> MANGROVE_CRAFTING_TABLE = ITEMS.register("mangrove_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.MANGROVE_CRAFTING_TABLE.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
	public static final RegistryObject<Item> BAMBOO_CRAFTING_TABLE = ITEMS.register("bamboo_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.BAMBOO_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("one_twenty_backport", CreativeModeTab.TAB_DECORATIONS))));
	public static final RegistryObject<Item> CRIMSON_CRAFTING_TABLE = ITEMS.register("crimson_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.CRIMSON_CRAFTING_TABLE.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
	public static final RegistryObject<Item> WARPED_CRAFTING_TABLE = ITEMS.register("warped_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.WARPED_CRAFTING_TABLE.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
	
	public static final RegistryObject<Item> OAK_CRAFTING_TABLE_MINECART = ITEMS.register("oak_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(CreativeModeTab.TAB_TRANSPORTATION).stacksTo(1), CraftingTableType.OAK));
	public static final RegistryObject<Item> SPRUCE_CRAFTING_TABLE_MINECART = ITEMS.register("spruce_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(CreativeModeTab.TAB_TRANSPORTATION).stacksTo(1), CraftingTableType.SPRUCE));
	public static final RegistryObject<Item> BIRCH_CRAFTING_TABLE_MINECART = ITEMS.register("birch_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(CreativeModeTab.TAB_TRANSPORTATION).stacksTo(1), CraftingTableType.BIRCH));
	public static final RegistryObject<Item> JUNGLE_CRAFTING_TABLE_MINECART = ITEMS.register("jungle_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(CreativeModeTab.TAB_TRANSPORTATION).stacksTo(1), CraftingTableType.JUNGLE));
	public static final RegistryObject<Item> ACACIA_CRAFTING_TABLE_MINECART = ITEMS.register("acacia_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(CreativeModeTab.TAB_TRANSPORTATION).stacksTo(1), CraftingTableType.ACACIA));
	public static final RegistryObject<Item> DARK_OAK_CRAFTING_TABLE_MINECART = ITEMS.register("dark_oak_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(CreativeModeTab.TAB_TRANSPORTATION).stacksTo(1), CraftingTableType.DARK_OAK));
	public static final RegistryObject<Item> MANGROVE_CRAFTING_TABLE_MINECART = ITEMS.register("mangrove_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(CreativeModeTab.TAB_TRANSPORTATION).stacksTo(1), CraftingTableType.MANGROVE));
	public static final RegistryObject<Item> BAMBOO_CRAFTING_TABLE_MINECART = ITEMS.register("bamboo_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("one_twenty_backport", CreativeModeTab.TAB_TRANSPORTATION)).stacksTo(1), CraftingTableType.BAMBOO));
	public static final RegistryObject<Item> CRIMSON_CRAFTING_TABLE_MINECART = ITEMS.register("crimson_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(CreativeModeTab.TAB_TRANSPORTATION).stacksTo(1), CraftingTableType.CRIMSON));
	public static final RegistryObject<Item> WARPED_CRAFTING_TABLE_MINECART = ITEMS.register("warped_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(CreativeModeTab.TAB_TRANSPORTATION).stacksTo(1), CraftingTableType.WARPED));

    /* The big, popular mods */
	// Biomes o' Plenty
	public static final RegistryObject<Item> BOP_CHERRY_CRAFTING_TABLE = ITEMS.register("bop_cherry_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.BOP_CHERRY_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("biomesoplenty", getTabWithMatchingName("biomesoplenty", CreativeModeTab.TAB_DECORATIONS)))));
	public static final RegistryObject<Item> BOP_DEAD_CRAFTING_TABLE = ITEMS.register("bop_dead_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.BOP_DEAD_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("biomesoplenty", getTabWithMatchingName("biomesoplenty", CreativeModeTab.TAB_DECORATIONS)))));
	public static final RegistryObject<Item> BOP_FIR_CRAFTING_TABLE = ITEMS.register("bop_fir_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.BOP_FIR_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("biomesoplenty", getTabWithMatchingName("biomesoplenty", CreativeModeTab.TAB_DECORATIONS)))));
	public static final RegistryObject<Item> BOP_HELLBARK_CRAFTING_TABLE = ITEMS.register("bop_hellbark_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.BOP_HELLBARK_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("biomesoplenty", getTabWithMatchingName("biomesoplenty", CreativeModeTab.TAB_DECORATIONS)))));
	public static final RegistryObject<Item> BOP_JACARANDA_CRAFTING_TABLE = ITEMS.register("bop_jacaranda_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.BOP_JACARANDA_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("biomesoplenty", getTabWithMatchingName("biomesoplenty", CreativeModeTab.TAB_DECORATIONS)))));
	public static final RegistryObject<Item> BOP_MAGIC_CRAFTING_TABLE = ITEMS.register("bop_magic_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.BOP_MAGIC_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("biomesoplenty", getTabWithMatchingName("biomesoplenty", CreativeModeTab.TAB_DECORATIONS)))));
	public static final RegistryObject<Item> BOP_MAHOGANY_CRAFTING_TABLE = ITEMS.register("bop_mahogany_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.BOP_MAHOGANY_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("biomesoplenty", getTabWithMatchingName("biomesoplenty", CreativeModeTab.TAB_DECORATIONS)))));
	public static final RegistryObject<Item> BOP_PALM_CRAFTING_TABLE = ITEMS.register("bop_palm_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.BOP_PALM_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("biomesoplenty", getTabWithMatchingName("biomesoplenty", CreativeModeTab.TAB_DECORATIONS)))));
	public static final RegistryObject<Item> BOP_REDWOOD_CRAFTING_TABLE = ITEMS.register("bop_redwood_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.BOP_REDWOOD_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("biomesoplenty", getTabWithMatchingName("biomesoplenty", CreativeModeTab.TAB_DECORATIONS)))));
	public static final RegistryObject<Item> BOP_UMBRAN_CRAFTING_TABLE = ITEMS.register("bop_umbran_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.BOP_UMBRAN_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("biomesoplenty", getTabWithMatchingName("biomesoplenty", CreativeModeTab.TAB_DECORATIONS)))));
	public static final RegistryObject<Item> BOP_WILLOW_CRAFTING_TABLE = ITEMS.register("bop_willow_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.BOP_WILLOW_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("biomesoplenty", getTabWithMatchingName("biomesoplenty", CreativeModeTab.TAB_DECORATIONS)))));
	
	public static final RegistryObject<Item> BOP_CHERRY_CRAFTING_TABLE_MINECART = ITEMS.register("bop_cherry_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("biomesoplenty", getTabWithMatchingName("biomesoplenty", CreativeModeTab.TAB_TRANSPORTATION))).stacksTo(1), CraftingTableType.BOP_CHERRY));
	public static final RegistryObject<Item> BOP_DEAD_CRAFTING_TABLE_MINECART = ITEMS.register("bop_dead_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("biomesoplenty", getTabWithMatchingName("biomesoplenty", CreativeModeTab.TAB_TRANSPORTATION))).stacksTo(1), CraftingTableType.BOP_DEAD));
	public static final RegistryObject<Item> BOP_FIR_CRAFTING_TABLE_MINECART = ITEMS.register("bop_fir_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("biomesoplenty", getTabWithMatchingName("biomesoplenty", CreativeModeTab.TAB_TRANSPORTATION))).stacksTo(1), CraftingTableType.BOP_FIR));
	public static final RegistryObject<Item> BOP_HELLBARK_CRAFTING_TABLE_MINECART = ITEMS.register("bop_hellbark_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("biomesoplenty", getTabWithMatchingName("biomesoplenty", CreativeModeTab.TAB_TRANSPORTATION))).stacksTo(1), CraftingTableType.BOP_HELLBARK));
	public static final RegistryObject<Item> BOP_JACARANDA_CRAFTING_TABLE_MINECART = ITEMS.register("bop_jacaranda_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("biomesoplenty", getTabWithMatchingName("biomesoplenty", CreativeModeTab.TAB_TRANSPORTATION))).stacksTo(1), CraftingTableType.BOP_JACARANDA));
	public static final RegistryObject<Item> BOP_MAGIC_CRAFTING_TABLE_MINECART = ITEMS.register("bop_magic_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("biomesoplenty", getTabWithMatchingName("biomesoplenty", CreativeModeTab.TAB_TRANSPORTATION))).stacksTo(1), CraftingTableType.BOP_MAGIC));
	public static final RegistryObject<Item> BOP_MAHOGANY_CRAFTING_TABLE_MINECART = ITEMS.register("bop_mahogany_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("biomesoplenty", getTabWithMatchingName("biomesoplenty", CreativeModeTab.TAB_TRANSPORTATION))).stacksTo(1), CraftingTableType.BOP_MAHOGANY));
	public static final RegistryObject<Item> BOP_PALM_CRAFTING_TABLE_MINECART = ITEMS.register("bop_palm_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("biomesoplenty", getTabWithMatchingName("biomesoplenty", CreativeModeTab.TAB_TRANSPORTATION))).stacksTo(1), CraftingTableType.BOP_PALM));
	public static final RegistryObject<Item> BOP_REDWOOD_CRAFTING_TABLE_MINECART = ITEMS.register("bop_redwood_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("biomesoplenty", getTabWithMatchingName("biomesoplenty", CreativeModeTab.TAB_TRANSPORTATION))).stacksTo(1), CraftingTableType.BOP_REDWOOD));
	public static final RegistryObject<Item> BOP_UMBRAN_CRAFTING_TABLE_MINECART = ITEMS.register("bop_umbran_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("biomesoplenty", getTabWithMatchingName("biomesoplenty", CreativeModeTab.TAB_TRANSPORTATION))).stacksTo(1), CraftingTableType.BOP_UMBRAN));
	public static final RegistryObject<Item> BOP_WILLOW_CRAFTING_TABLE_MINECART = ITEMS.register("bop_willow_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("biomesoplenty", getTabWithMatchingName("biomesoplenty", CreativeModeTab.TAB_TRANSPORTATION))).stacksTo(1), CraftingTableType.BOP_WILLOW));
	
	// Twilight Forest
	public static final RegistryObject<Item> CANOPY_CRAFTING_TABLE = ITEMS.register("canopy_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.CANOPY_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("twilightforest", getTabWithMatchingName("twilightforest", CreativeModeTab.TAB_DECORATIONS)))));
	public static final RegistryObject<Item> DARKWOOD_CRAFTING_TABLE = ITEMS.register("darkwood_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.DARKWOOD_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("twilightforest", getTabWithMatchingName("twilightforest", CreativeModeTab.TAB_DECORATIONS)))));
	public static final RegistryObject<Item> TWILIGHT_MANGROVE_CRAFTING_TABLE = ITEMS.register("twilight_mangrove_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.TWILIGHT_MANGROVE_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("twilightforest", getTabWithMatchingName("twilightforest", CreativeModeTab.TAB_DECORATIONS)))));
	public static final RegistryObject<Item> MINEWOOD_CRAFTING_TABLE = ITEMS.register("minewood_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.MINEWOOD_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("twilightforest", getTabWithMatchingName("twilightforest", CreativeModeTab.TAB_DECORATIONS)))));
	public static final RegistryObject<Item> SORTINGWOOD_CRAFTING_TABLE = ITEMS.register("sortingwood_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.SORTINGWOOD_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("twilightforest", getTabWithMatchingName("twilightforest", CreativeModeTab.TAB_DECORATIONS)))));
	public static final RegistryObject<Item> TIMEWOOD_CRAFTING_TABLE = ITEMS.register("timewood_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.TIMEWOOD_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("twilightforest", getTabWithMatchingName("twilightforest", CreativeModeTab.TAB_DECORATIONS)))));
	public static final RegistryObject<Item> TRANSWOOD_CRAFTING_TABLE = ITEMS.register("transwood_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.TRANSWOOD_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("twilightforest", getTabWithMatchingName("twilightforest", CreativeModeTab.TAB_DECORATIONS)))));
	public static final RegistryObject<Item> TWILIGHT_OAK_CRAFTING_TABLE = ITEMS.register("twilight_oak_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.TWILIGHT_OAK_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("twilightforest", getTabWithMatchingName("twilightforest", CreativeModeTab.TAB_DECORATIONS)))));
	public static final RegistryObject<Item> TOWERWOOD_CRAFTING_TABLE = ITEMS.register("towerwood_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.TOWERWOOD_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("twilightforest", getTabWithMatchingName("twilightforest", CreativeModeTab.TAB_DECORATIONS)))));

	public static final RegistryObject<Item> CANOPY_CRAFTING_TABLE_MINECART = ITEMS.register("canopy_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("twilightforest", getTabWithMatchingName("twilightforest", CreativeModeTab.TAB_TRANSPORTATION))).stacksTo(1), CraftingTableType.CANOPY));
	public static final RegistryObject<Item> DARKWOOD_CRAFTING_TABLE_MINECART = ITEMS.register("darkwood_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("twilightforest", getTabWithMatchingName("twilightforest", CreativeModeTab.TAB_TRANSPORTATION))).stacksTo(1), CraftingTableType.DARKWOOD));
	public static final RegistryObject<Item> TWILIGHT_MANGROVE_CRAFTING_TABLE_MINECART = ITEMS.register("twilight_mangrove_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("twilightforest", getTabWithMatchingName("twilightforest", CreativeModeTab.TAB_TRANSPORTATION))).stacksTo(1), CraftingTableType.TWILIGHT_MANGROVE));
	public static final RegistryObject<Item> MINEWOOD_CRAFTING_TABLE_MINECART = ITEMS.register("minewood_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("twilightforest", getTabWithMatchingName("twilightforest", CreativeModeTab.TAB_TRANSPORTATION))).stacksTo(1), CraftingTableType.MINEWOOD));
	public static final RegistryObject<Item> SORTINGWOOD_CRAFTING_TABLE_MINECART = ITEMS.register("sortingwood_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("twilightforest", getTabWithMatchingName("twilightforest", CreativeModeTab.TAB_TRANSPORTATION))).stacksTo(1), CraftingTableType.SORTINGWOOD));
	public static final RegistryObject<Item> TIMEWOOD_CRAFTING_TABLE_MINECART = ITEMS.register("timewood_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("twilightforest", getTabWithMatchingName("twilightforest", CreativeModeTab.TAB_TRANSPORTATION))).stacksTo(1), CraftingTableType.TIMEWOOD));
	public static final RegistryObject<Item> TRANSWOOD_CRAFTING_TABLE_MINECART = ITEMS.register("transwood_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("twilightforest", getTabWithMatchingName("twilightforest", CreativeModeTab.TAB_TRANSPORTATION))).stacksTo(1), CraftingTableType.TRANSWOOD));
	public static final RegistryObject<Item> TWILIGHT_OAK_CRAFTING_TABLE_MINECART = ITEMS.register("twilight_oak_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("twilightforest", getTabWithMatchingName("twilightforest", CreativeModeTab.TAB_TRANSPORTATION))).stacksTo(1), CraftingTableType.TWILIGHT_OAK));
	public static final RegistryObject<Item> TOWERWOOD_CRAFTING_TABLE_MINECART = ITEMS.register("towerwood_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("tflostblocks", getTabWithMatchingName("twilightforest", CreativeModeTab.TAB_TRANSPORTATION))).stacksTo(1), CraftingTableType.TOWERWOOD));

	/* Abnormals Mods */
	// Atmospheric
	public static final RegistryObject<Item> ASPEN_CRAFTING_TABLE = ITEMS.register("aspen_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.ASPEN_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("atmospheric", CreativeModeTab.TAB_DECORATIONS))));
	public static final RegistryObject<Item> GRIMWOOD_CRAFTING_TABLE = ITEMS.register("grimwood_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.GRIMWOOD_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("atmospheric", CreativeModeTab.TAB_DECORATIONS))));
	public static final RegistryObject<Item> KOUSA_CRAFTING_TABLE = ITEMS.register("kousa_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.KOUSA_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("atmospheric", CreativeModeTab.TAB_DECORATIONS))));
	public static final RegistryObject<Item> MORADO_CRAFTING_TABLE = ITEMS.register("morado_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.MORADO_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("atmospheric", CreativeModeTab.TAB_DECORATIONS))));
	public static final RegistryObject<Item> ROSEWOOD_CRAFTING_TABLE = ITEMS.register("rosewood_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.ROSEWOOD_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("atmospheric", CreativeModeTab.TAB_DECORATIONS))));
	public static final RegistryObject<Item> YUCCA_CRAFTING_TABLE = ITEMS.register("yucca_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.YUCCA_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("atmospheric", CreativeModeTab.TAB_DECORATIONS))));

	public static final RegistryObject<Item> ASPEN_CRAFTING_TABLE_MINECART = ITEMS.register("aspen_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("atmospheric", CreativeModeTab.TAB_TRANSPORTATION)).stacksTo(1), CraftingTableType.ASPEN));
	public static final RegistryObject<Item> GRIMWOOD_CRAFTING_TABLE_MINECART = ITEMS.register("grimwood_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("atmospheric", CreativeModeTab.TAB_TRANSPORTATION)).stacksTo(1), CraftingTableType.GRIMWOOD));
	public static final RegistryObject<Item> KOUSA_CRAFTING_TABLE_MINECART = ITEMS.register("kousa_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("atmospheric", CreativeModeTab.TAB_TRANSPORTATION)).stacksTo(1), CraftingTableType.KOUSA));
	public static final RegistryObject<Item> MORADO_CRAFTING_TABLE_MINECART = ITEMS.register("morado_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("atmospheric", CreativeModeTab.TAB_TRANSPORTATION)).stacksTo(1), CraftingTableType.MORADO));
	public static final RegistryObject<Item> ROSEWOOD_CRAFTING_TABLE_MINECART = ITEMS.register("rosewood_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("atmospheric", CreativeModeTab.TAB_TRANSPORTATION)).stacksTo(1), CraftingTableType.ROSEWOOD));
	public static final RegistryObject<Item> YUCCA_CRAFTING_TABLE_MINECART = ITEMS.register("yucca_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("atmospheric", CreativeModeTab.TAB_TRANSPORTATION)).stacksTo(1), CraftingTableType.YUCCA));
	
	// Autumnity
	public static final RegistryObject<Item> MAPLE_CRAFTING_TABLE = ITEMS.register("maple_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.MAPLE_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("autumnity", CreativeModeTab.TAB_DECORATIONS))));

	public static final RegistryObject<Item> MAPLE_CRAFTING_TABLE_MINECART = ITEMS.register("maple_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("autumnity", CreativeModeTab.TAB_TRANSPORTATION)).stacksTo(1), CraftingTableType.MAPLE));

	// Caverns and Chasms
	public static final RegistryObject<Item> AZALEA_CRAFTING_TABLE = ITEMS.register("azalea_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.AZALEA_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("caverns_and_chasms", CreativeModeTab.TAB_DECORATIONS))));

	public static final RegistryObject<Item> AZALEA_CRAFTING_TABLE_MINECART = ITEMS.register("azalea_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("caverns_and_chasms", CreativeModeTab.TAB_TRANSPORTATION)).stacksTo(1), CraftingTableType.AZALEA));
	
	// Endergetic Expansion
	public static final RegistryObject<Item> POISE_CRAFTING_TABLE = ITEMS.register("poise_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.POISE_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("endergetic", CreativeModeTab.TAB_DECORATIONS))));

	public static final RegistryObject<Item> POISE_CRAFTING_TABLE_MINECART = ITEMS.register("poise_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("endergetic", CreativeModeTab.TAB_TRANSPORTATION)).stacksTo(1), CraftingTableType.POISE));
	
	// Environmental
	public static final RegistryObject<Item> CHERRY_CRAFTING_TABLE = ITEMS.register("cherry_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.CHERRY_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("environmental", CreativeModeTab.TAB_DECORATIONS))));
	public static final RegistryObject<Item> WILLOW_CRAFTING_TABLE = ITEMS.register("willow_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.WILLOW_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("environmental", CreativeModeTab.TAB_DECORATIONS))));
	public static final RegistryObject<Item> WISTERIA_CRAFTING_TABLE = ITEMS.register("wisteria_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.WISTERIA_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("environmental", CreativeModeTab.TAB_DECORATIONS))));
	
	public static final RegistryObject<Item> CHERRY_CRAFTING_TABLE_MINECART = ITEMS.register("cherry_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("environmental", CreativeModeTab.TAB_TRANSPORTATION)).stacksTo(1), CraftingTableType.CHERRY));
	public static final RegistryObject<Item> WILLOW_CRAFTING_TABLE_MINECART = ITEMS.register("willow_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("environmental", CreativeModeTab.TAB_TRANSPORTATION)).stacksTo(1), CraftingTableType.WILLOW));
	public static final RegistryObject<Item> WISTERIA_CRAFTING_TABLE_MINECART = ITEMS.register("wisteria_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("environmental", CreativeModeTab.TAB_TRANSPORTATION)).stacksTo(1), CraftingTableType.WISTERIA));
	
	/* Team Aurora Mods */
	// Horizons
	public static final RegistryObject<Item> CYPRESS_CRAFTING_TABLE = ITEMS.register("cypress_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.CYPRESS_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("horizons", CreativeModeTab.TAB_DECORATIONS))));
	public static final RegistryObject<Item> JACARANDA_CRAFTING_TABLE = ITEMS.register("jacaranda_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.JACARANDA_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("horizons", CreativeModeTab.TAB_DECORATIONS))));
	public static final RegistryObject<Item> REDBUD_CRAFTING_TABLE = ITEMS.register("redbud_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.REDBUD_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("horizons", CreativeModeTab.TAB_DECORATIONS))));

	public static final RegistryObject<Item> CYPRESS_CRAFTING_TABLE_MINECART = ITEMS.register("cypress_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("horizons", CreativeModeTab.TAB_TRANSPORTATION)).stacksTo(1), CraftingTableType.CYPRESS));
	public static final RegistryObject<Item> JACARANDA_CRAFTING_TABLE_MINECART = ITEMS.register("jacaranda_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("horizons", CreativeModeTab.TAB_TRANSPORTATION)).stacksTo(1), CraftingTableType.JACARANDA));
	public static final RegistryObject<Item> REDBUD_CRAFTING_TABLE_MINECART = ITEMS.register("redbud_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("horizons", CreativeModeTab.TAB_TRANSPORTATION)).stacksTo(1), CraftingTableType.REDBUD));
		
	// Enhanced Mushrooms
	public static final RegistryObject<Item> BROWN_MUSHROOM_CRAFTING_TABLE = ITEMS.register("brown_mushroom_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.BROWN_MUSHROOM_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("enhanced_mushrooms", CreativeModeTab.TAB_DECORATIONS))));
	public static final RegistryObject<Item> RED_MUSHROOM_CRAFTING_TABLE = ITEMS.register("red_mushroom_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.RED_MUSHROOM_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("enhanced_mushrooms", CreativeModeTab.TAB_DECORATIONS))));

	public static final RegistryObject<Item> BROWN_MUSHROOM_CRAFTING_TABLE_MINECART = ITEMS.register("brown_mushroom_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("enhanced_mushrooms", CreativeModeTab.TAB_TRANSPORTATION)).stacksTo(1), CraftingTableType.BROWN_MUSHROOM));
	public static final RegistryObject<Item> RED_MUSHROOM_CRAFTING_TABLE_MINECART = ITEMS.register("red_mushroom_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("enhanced_mushrooms", CreativeModeTab.TAB_TRANSPORTATION)).stacksTo(1), CraftingTableType.RED_MUSHROOM));
	
	/* Miscellaneous Mods */
	// Abundant Atmosphere
	public static final RegistryObject<Item> ASH_CRAFTING_TABLE = ITEMS.register("ash_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.ASH_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("abundant_atmosphere", CreativeModeTab.TAB_DECORATIONS))));
	public static final RegistryObject<Item> GOURDROT_CRAFTING_TABLE = ITEMS.register("gourdrot_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.GOURDROT_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("abundant_atmosphere", CreativeModeTab.TAB_DECORATIONS))));

	public static final RegistryObject<Item> ASH_CRAFTING_TABLE_MINECART = ITEMS.register("ash_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("abundant_atmosphere", CreativeModeTab.TAB_TRANSPORTATION)).stacksTo(1), CraftingTableType.ASH));
	public static final RegistryObject<Item> GOURDROT_CRAFTING_TABLE_MINECART = ITEMS.register("gourdrot_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("abundant_atmosphere", CreativeModeTab.TAB_TRANSPORTATION)).stacksTo(1), CraftingTableType.GOURDROT));
	
	// Ad Astra
	public static final RegistryObject<Item> AERONOS_CRAFTING_TABLE = ITEMS.register("aeronos_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.AERONOS_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("ad_astra", CreativeModeTab.TAB_DECORATIONS))));
	public static final RegistryObject<Item> GLACIAN_CRAFTING_TABLE = ITEMS.register("glacian_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.GLACIAN_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("ad_astra", CreativeModeTab.TAB_DECORATIONS))));
	public static final RegistryObject<Item> STROPHAR_CRAFTING_TABLE = ITEMS.register("strophar_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.STROPHAR_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("ad_astra", CreativeModeTab.TAB_DECORATIONS))));

	public static final RegistryObject<Item> AERONOS_CRAFTING_TABLE_MINECART = ITEMS.register("aeronos_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("ad_astra", CreativeModeTab.TAB_TRANSPORTATION)).stacksTo(1), CraftingTableType.AERONOS));
	public static final RegistryObject<Item> GLACIAN_CRAFTING_TABLE_MINECART = ITEMS.register("glacian_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("ad_astra", CreativeModeTab.TAB_TRANSPORTATION)).stacksTo(1), CraftingTableType.GLACIAN));
	public static final RegistryObject<Item> STROPHAR_CRAFTING_TABLE_MINECART = ITEMS.register("strophar_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("ad_astra", CreativeModeTab.TAB_TRANSPORTATION)).stacksTo(1), CraftingTableType.STROPHAR));
	
	// Architects Palette
	public static final RegistryObject<Item> TWISTED_CRAFTING_TABLE = ITEMS.register("twisted_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.TWISTED_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("architects_palette", CreativeModeTab.TAB_DECORATIONS))));

	public static final RegistryObject<Item> TWISTED_CRAFTING_TABLE_MINECART = ITEMS.register("twisted_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("architects_palette", CreativeModeTab.TAB_TRANSPORTATION)).stacksTo(1), CraftingTableType.TWISTED));

	// Ars Nouveau
	public static final RegistryObject<Item> ARCHWOOD_CRAFTING_TABLE = ITEMS.register("archwood_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.ARCHWOOD_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("ars_nouveau", CreativeModeTab.TAB_DECORATIONS))));

	public static final RegistryObject<Item> ARCHWOOD_CRAFTING_TABLE_MINECART = ITEMS.register("archwood_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("ars_nouveau", CreativeModeTab.TAB_TRANSPORTATION)).stacksTo(1), CraftingTableType.ARCHWOOD));
	
	// Biome Makeover
	public static final RegistryObject<Item> BM_ANCIENT_OAK_CRAFTING_TABLE = ITEMS.register("bm_ancient_oak_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.BM_ANCIENT_OAK_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("biomemakeover", getTabWithMatchingName("biomemakeover.biomemakeover", CreativeModeTab.TAB_DECORATIONS)))));
	public static final RegistryObject<Item> BM_BLIGHTED_BALSA_CRAFTING_TABLE = ITEMS.register("bm_blighted_balsa_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.BM_BLIGHTED_BALSA_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("biomemakeover", getTabWithMatchingName("biomemakeover.biomemakeover", CreativeModeTab.TAB_DECORATIONS)))));
	public static final RegistryObject<Item> BM_SWAMP_CYPRESS_CRAFTING_TABLE = ITEMS.register("bm_swamp_cypress_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.BM_SWAMP_CYPRESS_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("biomemakeover", getTabWithMatchingName("biomemakeover.biomemakeover", CreativeModeTab.TAB_DECORATIONS)))));
	public static final RegistryObject<Item> BM_WILLOW_CRAFTING_TABLE = ITEMS.register("bm_willow_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.BM_WILLOW_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("biomemakeover", getTabWithMatchingName("biomemakeover.biomemakeover", CreativeModeTab.TAB_DECORATIONS)))));

	public static final RegistryObject<Item> BM_ANCIENT_OAK_CRAFTING_TABLE_MINECART = ITEMS.register("bm_ancient_oak_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("biomemakeover", getTabWithMatchingName("biomemakeover.biomemakeover", CreativeModeTab.TAB_TRANSPORTATION))).stacksTo(1), CraftingTableType.BM_ANCIENT_OAK));	
	public static final RegistryObject<Item> BM_BLIGHTED_BALSA_CRAFTING_TABLE_MINECART = ITEMS.register("bm_blighted_balsa_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("biomemakeover", getTabWithMatchingName("biomemakeover.biomemakeover", CreativeModeTab.TAB_TRANSPORTATION))).stacksTo(1), CraftingTableType.BM_BLIGHTED_BALSA));
	public static final RegistryObject<Item> BM_SWAMP_CYPRESS_CRAFTING_TABLE_MINECART = ITEMS.register("bm_swamp_cypress_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("biomemakeover", getTabWithMatchingName("biomemakeover.biomemakeover", CreativeModeTab.TAB_TRANSPORTATION))).stacksTo(1), CraftingTableType.BM_SWAMP_CYPRESS));
	public static final RegistryObject<Item> BM_WILLOW_CRAFTING_TABLE_MINECART = ITEMS.register("bm_willow_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("biomemakeover", getTabWithMatchingName("biomemakeover.biomemakeover", CreativeModeTab.TAB_TRANSPORTATION))).stacksTo(1), CraftingTableType.BM_WILLOW));
	
	// Caupona
	public static final RegistryObject<Item> WALNUT_CRAFTING_TABLE = ITEMS.register("walnut_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.WALNUT_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("caupona", CreativeModeTab.TAB_DECORATIONS))));

	public static final RegistryObject<Item> WALNUT_CRAFTING_TABLE_MINECART = ITEMS.register("walnut_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("caupona", CreativeModeTab.TAB_TRANSPORTATION)).stacksTo(1), CraftingTableType.WALNUT));
	
	// Ceilands
	public static final RegistryObject<Item> CEILTRUNK_CRAFTING_TABLE = ITEMS.register("ceiltrunk_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.CEILTRUNK_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("ceilands", getTabWithMatchingName("tab_ceilands", CreativeModeTab.TAB_DECORATIONS)))));
	public static final RegistryObject<Item> LUZAWOOD_CRAFTING_TABLE = ITEMS.register("luzawood_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.LUZAWOOD_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("ceilands", getTabWithMatchingName("tab_ceilands", CreativeModeTab.TAB_DECORATIONS)))));

	public static final RegistryObject<Item> CEILTRUNK_CRAFTING_TABLE_MINECART = ITEMS.register("ceiltrunk_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("ceilands", getTabWithMatchingName("tab_ceilands", CreativeModeTab.TAB_TRANSPORTATION))).stacksTo(1), CraftingTableType.CEILTRUNK));
	public static final RegistryObject<Item> LUZAWOOD_CRAFTING_TABLE_MINECART = ITEMS.register("luzawood_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("ceilands", getTabWithMatchingName("tab_ceilands", CreativeModeTab.TAB_TRANSPORTATION))).stacksTo(1), CraftingTableType.LUZAWOOD));

	// Colourful Azaleas
	public static final RegistryObject<Item> AZULE_AZALEA_CRAFTING_TABLE = ITEMS.register("azule_azalea_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.AZULE_AZALEA_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("colorfulazaleas", getTabWithMatchingName("colorfulazaleas.colorful_azaleas", CreativeModeTab.TAB_DECORATIONS))))); 
	public static final RegistryObject<Item> BRIGHT_AZALEA_CRAFTING_TABLE = ITEMS.register("bright_azalea_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.BRIGHT_AZALEA_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("colorfulazaleas", getTabWithMatchingName("colorfulazaleas.colorful_azaleas", CreativeModeTab.TAB_DECORATIONS)))));
	public static final RegistryObject<Item> FISS_AZALEA_CRAFTING_TABLE = ITEMS.register("fiss_azalea_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.FISS_AZALEA_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("colorfulazaleas", getTabWithMatchingName("colorfulazaleas.colorful_azaleas", CreativeModeTab.TAB_DECORATIONS)))));
	public static final RegistryObject<Item> ROZE_AZALEA_CRAFTING_TABLE = ITEMS.register("roze_azalea_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.ROZE_AZALEA_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("colorfulazaleas", getTabWithMatchingName("colorfulazaleas.colorful_azaleas", CreativeModeTab.TAB_DECORATIONS)))));
	public static final RegistryObject<Item> TECAL_AZALEA_CRAFTING_TABLE = ITEMS.register("tecal_azalea_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.TECAL_AZALEA_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("colorfulazaleas", getTabWithMatchingName("colorfulazaleas.colorful_azaleas", CreativeModeTab.TAB_DECORATIONS)))));
	public static final RegistryObject<Item> TITANIUM_AZALEA_CRAFTING_TABLE = ITEMS.register("titanium_azalea_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.TITANIUM_AZALEA_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("colorfulazaleas", getTabWithMatchingName("colorfulazaleas.colorful_azaleas", CreativeModeTab.TAB_DECORATIONS)))));
	public static final RegistryObject<Item> WALNUT_AZALEA_CRAFTING_TABLE = ITEMS.register("walnut_azalea_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.WALNUT_AZALEA_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("colorfulazaleas", getTabWithMatchingName("colorfulazaleas.colorful_azaleas", CreativeModeTab.TAB_DECORATIONS)))));

	public static final RegistryObject<Item> AZULE_AZALEA_CRAFTING_TABLE_MINECART = ITEMS.register("azule_azalea_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("colorfulazaleas", getTabWithMatchingName("colorfulazaleas.colorful_azaleas", CreativeModeTab.TAB_TRANSPORTATION))).stacksTo(1), CraftingTableType.AZULE_AZALEA));	
	public static final RegistryObject<Item> BRIGHT_AZALEA_CRAFTING_TABLE_MINECART = ITEMS.register("bright_azalea_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("colorfulazaleas", getTabWithMatchingName("colorfulazaleas.colorful_azaleas", CreativeModeTab.TAB_TRANSPORTATION))).stacksTo(1), CraftingTableType.BRIGHT_AZALEA));	
	public static final RegistryObject<Item> FISS_AZALEA_CRAFTING_TABLE_MINECART = ITEMS.register("fiss_azalea_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("colorfulazaleas", getTabWithMatchingName("colorfulazaleas.colorful_azaleas", CreativeModeTab.TAB_TRANSPORTATION))).stacksTo(1), CraftingTableType.FISS_AZALEA));	
	public static final RegistryObject<Item> ROZE_AZALEA_CRAFTING_TABLE_MINECART = ITEMS.register("roze_azalea_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("colorfulazaleas", getTabWithMatchingName("colorfulazaleas.colorful_azaleas", CreativeModeTab.TAB_TRANSPORTATION))).stacksTo(1), CraftingTableType.ROZE_AZALEA));	
	public static final RegistryObject<Item> TECAL_AZALEA_CRAFTING_TABLE_MINECART = ITEMS.register("tecal_azalea_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("colorfulazaleas", getTabWithMatchingName("colorfulazaleas.colorful_azaleas", CreativeModeTab.TAB_TRANSPORTATION))).stacksTo(1), CraftingTableType.TECAL_AZALEA));	
	public static final RegistryObject<Item> TITANIUM_AZALEA_CRAFTING_TABLE_MINECART = ITEMS.register("titanium_azalea_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("colorfulazaleas", getTabWithMatchingName("colorfulazaleas.colorful_azaleas", CreativeModeTab.TAB_TRANSPORTATION))).stacksTo(1), CraftingTableType.TITANIUM_AZALEA));	
	public static final RegistryObject<Item> WALNUT_AZALEA_CRAFTING_TABLE_MINECART = ITEMS.register("walnut_azalea_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("colorfulazaleas", getTabWithMatchingName("colorfulazaleas.colorful_azaleas", CreativeModeTab.TAB_TRANSPORTATION))).stacksTo(1), CraftingTableType.WALNUT_AZALEA));	
	
	// Darker Depths
	public static final RegistryObject<Item> PETRIFIED_CRAFTING_TABLE = ITEMS.register("petrified_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.PETRIFIED_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("darkerdepths", CreativeModeTab.TAB_DECORATIONS))));

	public static final RegistryObject<Item> PETRIFIED_CRAFTING_TABLE_MINECART = ITEMS.register("petrified_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("darkerdepths", CreativeModeTab.TAB_TRANSPORTATION)).stacksTo(1), CraftingTableType.PETRIFIED));

	// Deeper & Darker
	public static final RegistryObject<Item> ECHO_CRAFTING_TABLE = ITEMS.register("echo_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.ECHO_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("deeperdarker", getTabWithMatchingName("deeperdarker", CreativeModeTab.TAB_DECORATIONS)))));

	public static final RegistryObject<Item> ECHO_CRAFTING_TABLE_MINECART = ITEMS.register("echo_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("deeperdarker", getTabWithMatchingName("deeperdarker", CreativeModeTab.TAB_TRANSPORTATION))).stacksTo(1), CraftingTableType.ECHO));
	
	// Ecologics
	public static final RegistryObject<Item> ECO_AZALEA_CRAFTING_TABLE = ITEMS.register("eco_azalea_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.ECO_AZALEA_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("ecologics", getTabWithMatchingName("ecologics.tab", CreativeModeTab.TAB_DECORATIONS)))));
	public static final RegistryObject<Item> ECO_FLOWERING_AZALEA_CRAFTING_TABLE = ITEMS.register("eco_flowering_azalea_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.ECO_FLOWERING_AZALEA_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("ecologics.tab", getTabWithMatchingName("ecologics", CreativeModeTab.TAB_DECORATIONS)))));
	public static final RegistryObject<Item> ECO_COCONUT_CRAFTING_TABLE = ITEMS.register("eco_coconut_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.ECO_COCONUT_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("ecologics", getTabWithMatchingName("ecologics.tab", CreativeModeTab.TAB_DECORATIONS)))));
	public static final RegistryObject<Item> ECO_WALNUT_CRAFTING_TABLE = ITEMS.register("eco_walnut_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.ECO_WALNUT_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("ecologics", getTabWithMatchingName("ecologics.tab", CreativeModeTab.TAB_DECORATIONS)))));

	public static final RegistryObject<Item> ECO_AZALEA_CRAFTING_TABLE_MINECART = ITEMS.register("eco_azalea_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("ecologics", getTabWithMatchingName("ecologics.tab", CreativeModeTab.TAB_TRANSPORTATION))).stacksTo(1), CraftingTableType.ECO_AZALEA));
	public static final RegistryObject<Item> ECO_FLOWERING_AZALEA_CRAFTING_TABLE_MINECART = ITEMS.register("eco_flowering_azalea_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("ecologics", getTabWithMatchingName("ecologics.tab", CreativeModeTab.TAB_TRANSPORTATION))).stacksTo(1), CraftingTableType.ECO_FLOWERING_AZALEA));
	public static final RegistryObject<Item> ECO_COCONUT_CRAFTING_TABLE_MINECART = ITEMS.register("eco_coconut_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("ecologics", getTabWithMatchingName("ecologics.tab", CreativeModeTab.TAB_TRANSPORTATION))).stacksTo(1), CraftingTableType.ECO_COCONUT));
	public static final RegistryObject<Item> ECO_WALNUT_CRAFTING_TABLE_MINECART = ITEMS.register("eco_walnut_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("ecologics", getTabWithMatchingName("ecologics.tab", CreativeModeTab.TAB_TRANSPORTATION))).stacksTo(1), CraftingTableType.ECO_WALNUT));
	
	// End's Phantasm
	public static final RegistryObject<Item> EBONY_CRAFTING_TABLE = ITEMS.register("ebony_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.EBONY_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("phantasm", getTabWithMatchingName("tabphantasm", CreativeModeTab.TAB_DECORATIONS)))));
	public static final RegistryObject<Item> PREAM_CRAFTING_TABLE = ITEMS.register("pream_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.PREAM_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("phantasm", getTabWithMatchingName("tabphantasm", CreativeModeTab.TAB_DECORATIONS)))));

	public static final RegistryObject<Item> EBONY_CRAFTING_TABLE_MINECART = ITEMS.register("ebony_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("phantasm", getTabWithMatchingName("tabphantasm", CreativeModeTab.TAB_TRANSPORTATION))).stacksTo(1), CraftingTableType.EBONY));
	public static final RegistryObject<Item> PREAM_CRAFTING_TABLE_MINECART = ITEMS.register("pream_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("phantasm", getTabWithMatchingName("tabphantasm", CreativeModeTab.TAB_TRANSPORTATION))).stacksTo(1), CraftingTableType.PREAM));
	
	// Enlightened End
	public static final RegistryObject<Item> CONGEALED_CRAFTING_TABLE = ITEMS.register("congealed_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.CONGEALED_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("enlightened_end", getTabWithMatchingName("tabenlightened_end_tab", CreativeModeTab.TAB_DECORATIONS)))));
	public static final RegistryObject<Item> VERDANT_CRAFTING_TABLE = ITEMS.register("verdant_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.VERDANT_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("enlightened_end", getTabWithMatchingName("tabenlightened_end_tab", CreativeModeTab.TAB_DECORATIONS)))));
	
	public static final RegistryObject<Item> CONGEALED_CRAFTING_TABLE_MINECART = ITEMS.register("congealed_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("enlightened_end", getTabWithMatchingName("tabenlightened_end_tab", CreativeModeTab.TAB_TRANSPORTATION))).stacksTo(1), CraftingTableType.CONGEALED));
	public static final RegistryObject<Item> VERDANT_CRAFTING_TABLE_MINECART = ITEMS.register("verdant_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("enlightened_end", getTabWithMatchingName("tabenlightened_end_tab", CreativeModeTab.TAB_TRANSPORTATION))).stacksTo(1), CraftingTableType.VERDANT));
	
	// Extended Mushrooms
	public static final RegistryObject<Item> MUSHROOM_CRAFTING_TABLE = ITEMS.register("mushroom_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.MUSHROOM_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("extendedmushrooms", CreativeModeTab.TAB_DECORATIONS))));
	public static final RegistryObject<Item> POISONOUS_MUSHROOM_CRAFTING_TABLE = ITEMS.register("poisonous_mushroom_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.POISONOUS_MUSHROOM_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("extendedmushrooms", CreativeModeTab.TAB_DECORATIONS))));
	public static final RegistryObject<Item> HONEY_FUNGUS_CRAFTING_TABLE = ITEMS.register("honey_fungus_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.HONEY_FUNGUS_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("extendedmushrooms", CreativeModeTab.TAB_DECORATIONS))));
	public static final RegistryObject<Item> GLOWSHROOM_CRAFTING_TABLE = ITEMS.register("glowshroom_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.GLOWSHROOM_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("extendedmushrooms", CreativeModeTab.TAB_DECORATIONS))));

	public static final RegistryObject<Item> MUSHROOM_CRAFTING_TABLE_MINECART = ITEMS.register("mushroom_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("extendedmushrooms", CreativeModeTab.TAB_TRANSPORTATION)).stacksTo(1), CraftingTableType.MUSHROOM));
	public static final RegistryObject<Item> POISONOUS_MUSHROOM_CRAFTING_TABLE_MINECART = ITEMS.register("poisonous_mushroom_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("extendedmushrooms", CreativeModeTab.TAB_TRANSPORTATION)).stacksTo(1), CraftingTableType.POISONOUS_MUSHROOM));
	public static final RegistryObject<Item> HONEY_FUNGUS_CRAFTING_TABLE_MINECART = ITEMS.register("honey_fungus_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("extendedmushrooms", CreativeModeTab.TAB_TRANSPORTATION)).stacksTo(1), CraftingTableType.HONEY_FUNGUS));
	public static final RegistryObject<Item> GLOWSHROOM_CRAFTING_TABLE_MINECART = ITEMS.register("glowshroom_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("extendedmushrooms", CreativeModeTab.TAB_TRANSPORTATION)).stacksTo(1), CraftingTableType.GLOWSHROOM));

	// Forbidden & Arcanus
	public static final RegistryObject<Item> ARCANE_EDELWOOD_CRAFTING_TABLE = ITEMS.register("arcane_edelwood_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.ARCANE_EDELWOOD_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("forbidden_arcanus", getTabWithMatchingName("forbidden_arcanus", CreativeModeTab.TAB_DECORATIONS)))));
	public static final RegistryObject<Item> CHERRYWOOD_CRAFTING_TABLE = ITEMS.register("cherrywood_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.CHERRYWOOD_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("forbidden_arcanus", getTabWithMatchingName("forbidden_arcanus", CreativeModeTab.TAB_DECORATIONS)))));
	public static final RegistryObject<Item> EDELWOOD_CRAFTING_TABLE = ITEMS.register("edelwood_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.EDELWOOD_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("forbidden_arcanus", getTabWithMatchingName("forbidden_arcanus", CreativeModeTab.TAB_DECORATIONS)))));
	public static final RegistryObject<Item> FUNGYSS_CRAFTING_TABLE = ITEMS.register("fungyss_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.FUNGYSS_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("forbidden_arcanus", getTabWithMatchingName("forbidden_arcanus", CreativeModeTab.TAB_DECORATIONS)))));
	public static final RegistryObject<Item> AURUM_CRAFTING_TABLE = ITEMS.register("aurum_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.AURUM_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("forbidden_arcanus", getTabWithMatchingName("forbidden_arcanus", CreativeModeTab.TAB_DECORATIONS)))));

	public static final RegistryObject<Item> ARCANE_EDELWOOD_CRAFTING_TABLE_MINECART = ITEMS.register("arcane_edelwood_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("forbidden_arcanus", getTabWithMatchingName("forbidden_arcanus", CreativeModeTab.TAB_TRANSPORTATION))).stacksTo(1), CraftingTableType.ARCANE_EDELWOOD));
	public static final RegistryObject<Item> CHERRYWOOD_CRAFTING_TABLE_MINECART = ITEMS.register("cherrywood_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("forbidden_arcanus", getTabWithMatchingName("forbidden_arcanus", CreativeModeTab.TAB_TRANSPORTATION))).stacksTo(1), CraftingTableType.CHERRYWOOD));
	public static final RegistryObject<Item> EDELWOOD_CRAFTING_TABLE_MINECART = ITEMS.register("edelwood_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("forbidden_arcanus", getTabWithMatchingName("forbidden_arcanus", CreativeModeTab.TAB_TRANSPORTATION))).stacksTo(1), CraftingTableType.EDELWOOD));
	public static final RegistryObject<Item> FUNGYSS_CRAFTING_TABLE_MINECART = ITEMS.register("fungyss_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("forbidden_arcanus", getTabWithMatchingName("forbidden_arcanus", CreativeModeTab.TAB_TRANSPORTATION))).stacksTo(1), CraftingTableType.FUNGYSS));
	public static final RegistryObject<Item> AURUM_CRAFTING_TABLE_MINECART = ITEMS.register("aurum_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("forbidden_arcanus", getTabWithMatchingName("forbidden_arcanus", CreativeModeTab.TAB_TRANSPORTATION))).stacksTo(1), CraftingTableType.AURUM));
	
	// Fruit Trees
	public static final RegistryObject<Item> FT_CHERRY_CRAFTING_TABLE = ITEMS.register("ft_cherry_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.FT_CHERRY_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("fruittrees", CreativeModeTab.TAB_DECORATIONS))));
	public static final RegistryObject<Item> FT_CITRUS_CRAFTING_TABLE = ITEMS.register("ft_citrus_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.FT_CITRUS_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("fruittrees", CreativeModeTab.TAB_DECORATIONS))));	

	public static final RegistryObject<Item> FT_CHERRY_CRAFTING_TABLE_MINECART = ITEMS.register("ft_cherry_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("fruittrees", CreativeModeTab.TAB_TRANSPORTATION)).stacksTo(1), CraftingTableType.FT_CHERRY));
	public static final RegistryObject<Item> FT_CITRUS_CRAFTING_TABLE_MINECART = ITEMS.register("ft_citrus_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("fruittrees", CreativeModeTab.TAB_TRANSPORTATION)).stacksTo(1), CraftingTableType.FT_CITRUS));

	// Gardens of the Dead
	public static final RegistryObject<Item> SOULBLIGHT_CRAFTING_TABLE = ITEMS.register("soulblight_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.SOULBLIGHT_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("gardens_of_the_dead", CreativeModeTab.TAB_DECORATIONS))));
	public static final RegistryObject<Item> WHISTLECANE_CRAFTING_TABLE = ITEMS.register("whistlecane_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.WHISTLECANE_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("gardens_of_the_dead", CreativeModeTab.TAB_DECORATIONS))));

	public static final RegistryObject<Item> SOULBLIGHT_CRAFTING_TABLE_MINECART = ITEMS.register("soulblight_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("gardens_of_the_dead", getTabWithMatchingName("gardens_of_the_dead", CreativeModeTab.TAB_TRANSPORTATION))).stacksTo(1), CraftingTableType.SOULBLIGHT));
	public static final RegistryObject<Item> WHISTLECANE_CRAFTING_TABLE_MINECART = ITEMS.register("whistlecane_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("gardens_of_the_dead", getTabWithMatchingName("gardens_of_the_dead", CreativeModeTab.TAB_TRANSPORTATION))).stacksTo(1), CraftingTableType.WHISTLECANE));	
	
	// Good Ending
	public static final RegistryObject<Item> GE_CYPRESS_CRAFTING_TABLE = ITEMS.register("ge_cypress_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.GE_CYPRESS_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("goodending", CreativeModeTab.TAB_DECORATIONS))));
	public static final RegistryObject<Item> GE_MUDDY_OAK_CRAFTING_TABLE = ITEMS.register("ge_muddy_oak_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.GE_MUDDY_OAK_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("goodending", CreativeModeTab.TAB_DECORATIONS))));

	public static final RegistryObject<Item> GE_CYPRESS_CRAFTING_TABLE_MINECART = ITEMS.register("ge_cypress_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("hexcasting", getTabWithMatchingName("goodending", CreativeModeTab.TAB_TRANSPORTATION))).stacksTo(1), CraftingTableType.GE_CYPRESS));
	public static final RegistryObject<Item> GE_MUDDY_OAK_CRAFTING_TABLE_MINECART = ITEMS.register("ge_muddy_oak_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("hexcasting", getTabWithMatchingName("goodending", CreativeModeTab.TAB_TRANSPORTATION))).stacksTo(1), CraftingTableType.GE_MUDDY_OAK));

	// Habitat
	public static final RegistryObject<Item> FAIRY_RING_MUSHROOM_CRAFTING_TABLE = ITEMS.register("fairy_ring_mushroom_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.FAIRY_RING_MUSHROOM_CRAFTING_TABLE.get(), new Item.Properties().tab(ModList.get().isLoaded("enhanced_mushrooms") ? conditionallyAddTab("habitat", CreativeModeTab.TAB_DECORATIONS) : null)));

	public static final RegistryObject<Item> FAIRY_RING_MUSHROOM_CRAFTING_TABLE_MINECART = ITEMS.register("fairy_ring_mushroom_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(ModList.get().isLoaded("enhanced_mushrooms") ? conditionallyAddTab("habitat", CreativeModeTab.TAB_TRANSPORTATION) : null).stacksTo(1), CraftingTableType.FAIRY_RING_MUSHROOM));
	
	// Hexcasting
	public static final RegistryObject<Item> EDIFIED_CRAFTING_TABLE = ITEMS.register("edified_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.EDIFIED_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("hexcasting", getTabWithMatchingName("hexcasting", CreativeModeTab.TAB_DECORATIONS)))));

	public static final RegistryObject<Item> EDIFIED_CRAFTING_TABLE_MINECART = ITEMS.register("edified_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("hexcasting", getTabWithMatchingName("hexcasting", CreativeModeTab.TAB_TRANSPORTATION))).stacksTo(1), CraftingTableType.EDIFIED));

	// Hexerei
	public static final RegistryObject<Item> HEXEREI_MAHOGANY_CRAFTING_TABLE = ITEMS.register("hexerei_mahogany_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.HEXEREI_MAHOGANY_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("hexerei", getTabWithMatchingName("hexereiModTab", CreativeModeTab.TAB_DECORATIONS)))));
	public static final RegistryObject<Item> HEXEREI_WILLOW_CRAFTING_TABLE = ITEMS.register("hexerei_willow_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.HEXEREI_WILLOW_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("hexerei", getTabWithMatchingName("hexereiModTab", CreativeModeTab.TAB_DECORATIONS)))));

	public static final RegistryObject<Item> HEXEREI_MAHOGANY_CRAFTING_TABLE_MINECART = ITEMS.register("hexerei_mahogany_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("hexerei", getTabWithMatchingName("hexereiModTab", CreativeModeTab.TAB_TRANSPORTATION))).stacksTo(1), CraftingTableType.HEXEREI_MAHOGANY));
	public static final RegistryObject<Item> HEXEREI_WILLOW_CRAFTING_TABLE_MINECART = ITEMS.register("hexerei_willow_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("hexerei", getTabWithMatchingName("hexereiModTab", CreativeModeTab.TAB_TRANSPORTATION))).stacksTo(1), CraftingTableType.HEXEREI_WILLOW));
	
	// Malum
	public static final RegistryObject<Item> RUNEWOOD_CRAFTING_TABLE = ITEMS.register("runewood_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.RUNEWOOD_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("malum", getTabWithMatchingName("malum_natural_wonders", CreativeModeTab.TAB_DECORATIONS)))));
	public static final RegistryObject<Item> SOULWOOD_CRAFTING_TABLE = ITEMS.register("soulwood_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.SOULWOOD_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("malum", getTabWithMatchingName("malum_natural_wonders", CreativeModeTab.TAB_DECORATIONS)))));

	public static final RegistryObject<Item> RUNEWOOD_CRAFTING_TABLE_MINECART = ITEMS.register("runewood_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("malum", getTabWithMatchingName("malum", CreativeModeTab.TAB_TRANSPORTATION))).stacksTo(1), CraftingTableType.RUNEWOOD));
	public static final RegistryObject<Item> SOULWOOD_CRAFTING_TABLE_MINECART = ITEMS.register("soulwood_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("malum", getTabWithMatchingName("malum", CreativeModeTab.TAB_TRANSPORTATION))).stacksTo(1), CraftingTableType.SOULWOOD));
	
	// Morecraft
	public static final RegistryObject<Item> NETHERWOOD_CRAFTING_TABLE = ITEMS.register("netherwood_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.NETHERWOOD_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("morecraft", CreativeModeTab.TAB_DECORATIONS))));

	public static final RegistryObject<Item> NETHERWOOD_CRAFTING_TABLE_MINECART = ITEMS.register("netherwood_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("morecraft", CreativeModeTab.TAB_TRANSPORTATION)).stacksTo(1), CraftingTableType.NETHERWOOD));
	
	// Nether's Exoticism
	public static final RegistryObject<Item> JABOTICABA_CRAFTING_TABLE = ITEMS.register("jaboticaba_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.JABOTICABA_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("nethers_exoticism", getTabWithMatchingName("tabnethers_exoticism", CreativeModeTab.TAB_DECORATIONS)))));
	public static final RegistryObject<Item> RAMBOUTAN_CRAFTING_TABLE = ITEMS.register("ramboutan_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.RAMBOUTAN_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("nethers_exoticism", getTabWithMatchingName("tabnethers_exoticism", CreativeModeTab.TAB_DECORATIONS)))));

	public static final RegistryObject<Item> JABOTICABA_CRAFTING_TABLE_MINECART = ITEMS.register("jaboticaba_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("nethers_exoticism", getTabWithMatchingName("tabnethers_exoticism", CreativeModeTab.TAB_TRANSPORTATION))).stacksTo(1), CraftingTableType.JABOTICABA));
	public static final RegistryObject<Item> RAMBOUTAN_CRAFTING_TABLE_MINECART = ITEMS.register("ramboutan_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("nethers_exoticism", getTabWithMatchingName("tabnethers_exoticism", CreativeModeTab.TAB_TRANSPORTATION))).stacksTo(1), CraftingTableType.RAMBOUTAN));
	
	// New World
	public static final RegistryObject<Item> FIR_CRAFTING_TABLE = ITEMS.register("fir_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.FIR_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("newworld", CreativeModeTab.TAB_DECORATIONS))));

	public static final RegistryObject<Item> FIR_CRAFTING_TABLE_MINECART = ITEMS.register("fir_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("newworld", CreativeModeTab.TAB_TRANSPORTATION)).stacksTo(1), CraftingTableType.FIR));
	
	// Outer End
	public static final RegistryObject<Item> AZURE_CRAFTING_TABLE = ITEMS.register("azure_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.AZURE_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("outer_end", CreativeModeTab.TAB_DECORATIONS))));

	public static final RegistryObject<Item> AZURE_CRAFTING_TABLE_MINECART = ITEMS.register("azure_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("outer_end", CreativeModeTab.TAB_TRANSPORTATION)).stacksTo(1), CraftingTableType.AZURE));
	
	// Prehistoric Fauna
	public static final RegistryObject<Item> ARAUCARIA_CRAFTING_TABLE = ITEMS.register("araucaria_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.ARAUCARIA_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("prehistoricfauna", getTabWithMatchingName("prehistoric_decoration_tab", CreativeModeTab.TAB_DECORATIONS)))));
	public static final RegistryObject<Item> HEIDIPHYLLUM_CRAFTING_TABLE = ITEMS.register("heidiphyllum_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.HEIDIPHYLLUM_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("prehistoricfauna", getTabWithMatchingName("prehistoric_decoration_tab", CreativeModeTab.TAB_DECORATIONS)))));
	public static final RegistryObject<Item> LIRIODENDRITES_CRAFTING_TABLE = ITEMS.register("liriodendrites_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.LIRIODENDRITES_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("prehistoricfauna", getTabWithMatchingName("prehistoric_decoration_tab", CreativeModeTab.TAB_DECORATIONS)))));
	public static final RegistryObject<Item> METASEQUOIA_CRAFTING_TABLE = ITEMS.register("metasequoia_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.METASEQUOIA_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("prehistoricfauna", getTabWithMatchingName("prehistoric_decoration_tab", CreativeModeTab.TAB_DECORATIONS)))));
	public static final RegistryObject<Item> PROTOJUNIPEROXYLON_CRAFTING_TABLE = ITEMS.register("protojuniperoxylon_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.PROTOJUNIPEROXYLON_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("prehistoricfauna", getTabWithMatchingName("prehistoric_decoration_tab", CreativeModeTab.TAB_DECORATIONS)))));
	public static final RegistryObject<Item> PROTOPICEOXYLON_CRAFTING_TABLE = ITEMS.register("protopiceoxylon_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.PROTOPICEOXYLON_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("prehistoricfauna", getTabWithMatchingName("prehistoric_decoration_tab", CreativeModeTab.TAB_DECORATIONS)))));
	public static final RegistryObject<Item> ZAMITES_CRAFTING_TABLE = ITEMS.register("zamites_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.ZAMITES_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("prehistoricfauna", getTabWithMatchingName("prehistoric_decoration_tab", CreativeModeTab.TAB_DECORATIONS)))));

	public static final RegistryObject<Item> ARAUCARIA_CRAFTING_TABLE_MINECART = ITEMS.register("araucaria_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("prehistoricfauna", getTabWithMatchingName("prehistoric_misc_tab", CreativeModeTab.TAB_TRANSPORTATION))).stacksTo(1), CraftingTableType.ARAUCARIA));
	public static final RegistryObject<Item> HEIDIPHYLLUM_CRAFTING_TABLE_MINECART = ITEMS.register("heidiphyllum_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("prehistoricfauna", getTabWithMatchingName("prehistoric_misc_tab", CreativeModeTab.TAB_TRANSPORTATION))).stacksTo(1), CraftingTableType.HEIDIPHYLLUM));
	public static final RegistryObject<Item> LIRIODENDRITES_CRAFTING_TABLE_MINECART = ITEMS.register("liriodendrites_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("prehistoricfauna", getTabWithMatchingName("prehistoric_misc_tab", CreativeModeTab.TAB_TRANSPORTATION))).stacksTo(1), CraftingTableType.LIRIODENDRITES));
	public static final RegistryObject<Item> METASEQUOIA_CRAFTING_TABLE_MINECART = ITEMS.register("metasequoia_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("prehistoricfauna", getTabWithMatchingName("prehistoric_misc_tab", CreativeModeTab.TAB_TRANSPORTATION))).stacksTo(1), CraftingTableType.METASEQUOIA));
	public static final RegistryObject<Item> PROTOJUNIPEROXYLON_CRAFTING_TABLE_MINECART = ITEMS.register("protojuniperoxylon_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("prehistoricfauna", getTabWithMatchingName("prehistoric_misc_tab", CreativeModeTab.TAB_TRANSPORTATION))).stacksTo(1), CraftingTableType.PROTOJUNIPEROXYLON));
	public static final RegistryObject<Item> PROTOPICEOXYLON_CRAFTING_TABLE_MINECART = ITEMS.register("protopiceoxylon_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("prehistoricfauna", getTabWithMatchingName("prehistoric_misc_tab", CreativeModeTab.TAB_TRANSPORTATION))).stacksTo(1), CraftingTableType.PROTOPICEOXYLON));
	public static final RegistryObject<Item> ZAMITES_CRAFTING_TABLE_MINECART = ITEMS.register("zamites_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("prehistoricfauna", getTabWithMatchingName("prehistoric_misc_tab", CreativeModeTab.TAB_TRANSPORTATION))).stacksTo(1), CraftingTableType.ZAMITES));
	
	// Pyromancy
	public static final RegistryObject<Item> PYROWOOD_CRAFTING_TABLE = ITEMS.register("pyrowood_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.PYROWOOD_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("pyromancer", CreativeModeTab.TAB_DECORATIONS))));
	public static final RegistryObject<Item> ROTTEN_PLANKS_CRAFTING_TABLE = ITEMS.register("rotten_planks_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.ROTTEN_PLANKS_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("pyromancer", CreativeModeTab.TAB_DECORATIONS))));

	public static final RegistryObject<Item> PYROWOOD_CRAFTING_TABLE_MINECART = ITEMS.register("pyrowood_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("pyromancer", CreativeModeTab.TAB_TRANSPORTATION)).stacksTo(1), CraftingTableType.PYROWOOD));
	public static final RegistryObject<Item> ROTTEN_PLANKS_CRAFTING_TABLE_MINECART = ITEMS.register("rotten_planks_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("pyromancer", CreativeModeTab.TAB_TRANSPORTATION)).stacksTo(1), CraftingTableType.ROTTEN_PLANKS));
	
	// Quark
	public static final RegistryObject<Item> QUARK_ANCIENT_CRAFTING_TABLE = ITEMS.register("quark_ancient_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.QUARK_ANCIENT_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("quark", CreativeModeTab.TAB_DECORATIONS))));
	public static final RegistryObject<Item> QUARK_AZALEA_CRAFTING_TABLE = ITEMS.register("quark_azalea_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.QUARK_AZALEA_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("quark", CreativeModeTab.TAB_DECORATIONS))));
	public static final RegistryObject<Item> QUARK_BLOSSOM_CRAFTING_TABLE = ITEMS.register("quark_blossom_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.QUARK_BLOSSOM_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("quark", CreativeModeTab.TAB_DECORATIONS))));

	public static final RegistryObject<Item> QUARK_ANCIENT_CRAFTING_TABLE_MINECART = ITEMS.register("quark_ancient_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("quark", CreativeModeTab.TAB_TRANSPORTATION)).stacksTo(1), CraftingTableType.QUARK_ANCIENT));
	public static final RegistryObject<Item> QUARK_AZALEA_CRAFTING_TABLE_MINECART = ITEMS.register("quark_azalea_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("quark", CreativeModeTab.TAB_TRANSPORTATION)).stacksTo(1), CraftingTableType.QUARK_AZALEA));
	public static final RegistryObject<Item> QUARK_BLOSSOM_CRAFTING_TABLE_MINECART = ITEMS.register("quark_blossom_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("quark", CreativeModeTab.TAB_TRANSPORTATION)).stacksTo(1), CraftingTableType.QUARK_BLOSSOM));
	
	// Regions Unexplored
	public static final RegistryObject<Item> RUE_BAOBAB_CRAFTING_TABLE = ITEMS.register("rue_baobab_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.RUE_BAOBAB_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("regions_unexplored", getTabWithMatchingName("regions_unexplored_decorations_tab", CreativeModeTab.TAB_DECORATIONS)))));
	public static final RegistryObject<Item> RUE_BLACKWOOD_CRAFTING_TABLE = ITEMS.register("rue_blackwood_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.RUE_BLACKWOOD_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("regions_unexplored", getTabWithMatchingName("regions_unexplored_decorations_tab", CreativeModeTab.TAB_DECORATIONS)))));
	public static final RegistryObject<Item> RUE_CHERRY_CRAFTING_TABLE = ITEMS.register("rue_cherry_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.RUE_CHERRY_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("regions_unexplored", getTabWithMatchingName("regions_unexplored_decorations_tab", CreativeModeTab.TAB_DECORATIONS)))));
	public static final RegistryObject<Item> RUE_CYPRESS_CRAFTING_TABLE = ITEMS.register("rue_cypress_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.RUE_CYPRESS_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("regions_unexplored", getTabWithMatchingName("regions_unexplored_decorations_tab", CreativeModeTab.TAB_DECORATIONS)))));
	public static final RegistryObject<Item> RUE_DEAD_CRAFTING_TABLE = ITEMS.register("rue_dead_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.RUE_DEAD_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("regions_unexplored", getTabWithMatchingName("regions_unexplored_decorations_tab", CreativeModeTab.TAB_DECORATIONS)))));
	public static final RegistryObject<Item> RUE_EUCALYPTUS_CRAFTING_TABLE = ITEMS.register("rue_eucalyptus_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.RUE_EUCALYPTUS_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("regions_unexplored", getTabWithMatchingName("regions_unexplored_decorations_tab", CreativeModeTab.TAB_DECORATIONS)))));
	public static final RegistryObject<Item> RUE_JOSHUA_CRAFTING_TABLE = ITEMS.register("rue_joshua_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.RUE_JOSHUA_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("regions_unexplored", getTabWithMatchingName("regions_unexplored_decorations_tab", CreativeModeTab.TAB_DECORATIONS)))));
	public static final RegistryObject<Item> RUE_LARCH_CRAFTING_TABLE = ITEMS.register("rue_larch_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.RUE_LARCH_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("regions_unexplored", getTabWithMatchingName("regions_unexplored_decorations_tab", CreativeModeTab.TAB_DECORATIONS)))));
	public static final RegistryObject<Item> RUE_MAPLE_CRAFTING_TABLE = ITEMS.register("rue_maple_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.RUE_MAPLE_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("regions_unexplored", getTabWithMatchingName("regions_unexplored_decorations_tab", CreativeModeTab.TAB_DECORATIONS)))));
	public static final RegistryObject<Item> RUE_MAUVE_CRAFTING_TABLE = ITEMS.register("rue_mauve_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.RUE_MAUVE_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("regions_unexplored", getTabWithMatchingName("regions_unexplored_decorations_tab", CreativeModeTab.TAB_DECORATIONS)))));
	public static final RegistryObject<Item> RUE_PALM_CRAFTING_TABLE = ITEMS.register("rue_palm_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.RUE_PALM_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("regions_unexplored", getTabWithMatchingName("regions_unexplored_decorations_tab", CreativeModeTab.TAB_DECORATIONS)))));
	public static final RegistryObject<Item> RUE_PINE_CRAFTING_TABLE = ITEMS.register("rue_pine_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.RUE_PINE_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("regions_unexplored", getTabWithMatchingName("regions_unexplored_decorations_tab", CreativeModeTab.TAB_DECORATIONS)))));
	public static final RegistryObject<Item> RUE_REDWOOD_CRAFTING_TABLE = ITEMS.register("rue_redwood_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.RUE_REDWOOD_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("regions_unexplored", getTabWithMatchingName("regions_unexplored_decorations_tab", CreativeModeTab.TAB_DECORATIONS)))));
	public static final RegistryObject<Item> RUE_WILLOW_CRAFTING_TABLE = ITEMS.register("rue_willow_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.RUE_WILLOW_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("regions_unexplored", getTabWithMatchingName("regions_unexplored_decorations_tab", CreativeModeTab.TAB_DECORATIONS)))));

	public static final RegistryObject<Item> RUE_BAOBAB_CRAFTING_TABLE_MINECART = ITEMS.register("rue_baobab_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("regions_unexplored", getTabWithMatchingName("regions_unexplored_other_tab", CreativeModeTab.TAB_TRANSPORTATION))).stacksTo(1), CraftingTableType.RUE_BAOBAB));
	public static final RegistryObject<Item> RUE_BLACKWOOD_CRAFTING_TABLE_MINECART = ITEMS.register("rue_blackwood_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("regions_unexplored", getTabWithMatchingName("regions_unexplored_other_tab", CreativeModeTab.TAB_TRANSPORTATION))).stacksTo(1), CraftingTableType.RUE_BLACKWOOD));
	public static final RegistryObject<Item> RUE_CHERRY_CRAFTING_TABLE_MINECART = ITEMS.register("rue_cherry_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("regions_unexplored", getTabWithMatchingName("regions_unexplored_other_tab", CreativeModeTab.TAB_TRANSPORTATION))).stacksTo(1), CraftingTableType.RUE_CHERRY));
	public static final RegistryObject<Item> RUE_CYPRESS_CRAFTING_TABLE_MINECART = ITEMS.register("rue_cypress_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("regions_unexplored", getTabWithMatchingName("regions_unexplored_other_tab", CreativeModeTab.TAB_TRANSPORTATION))).stacksTo(1), CraftingTableType.RUE_CYPRESS));
	public static final RegistryObject<Item> RUE_DEAD_CRAFTING_TABLE_MINECART = ITEMS.register("rue_dead_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("regions_unexplored", getTabWithMatchingName("regions_unexplored_other_tab", CreativeModeTab.TAB_TRANSPORTATION))).stacksTo(1), CraftingTableType.RUE_DEAD));
	public static final RegistryObject<Item> RUE_EUCALYPTUS_CRAFTING_TABLE_MINECART = ITEMS.register("rue_eucalyptus_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("regions_unexplored", getTabWithMatchingName("regions_unexplored_other_tab", CreativeModeTab.TAB_TRANSPORTATION))).stacksTo(1), CraftingTableType.RUE_EUCALYPTUS));
	public static final RegistryObject<Item> RUE_JOSHUA_CRAFTING_TABLE_MINECART = ITEMS.register("rue_joshua_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("regions_unexplored", getTabWithMatchingName("regions_unexplored_other_tab", CreativeModeTab.TAB_TRANSPORTATION))).stacksTo(1), CraftingTableType.RUE_JOSHUA));
	public static final RegistryObject<Item> RUE_LARCH_CRAFTING_TABLE_MINECART = ITEMS.register("rue_larch_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("regions_unexplored", getTabWithMatchingName("regions_unexplored_other_tab", CreativeModeTab.TAB_TRANSPORTATION))).stacksTo(1), CraftingTableType.RUE_LARCH));
	public static final RegistryObject<Item> RUE_MAPLE_CRAFTING_TABLE_MINECART = ITEMS.register("rue_maple_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("regions_unexplored", getTabWithMatchingName("regions_unexplored_other_tab", CreativeModeTab.TAB_TRANSPORTATION))).stacksTo(1), CraftingTableType.RUE_MAPLE));
	public static final RegistryObject<Item> RUE_MAUVE_CRAFTING_TABLE_MINECART = ITEMS.register("rue_mauve_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("regions_unexplored", getTabWithMatchingName("regions_unexplored_other_tab", CreativeModeTab.TAB_TRANSPORTATION))).stacksTo(1), CraftingTableType.RUE_MAUVE));
	public static final RegistryObject<Item> RUE_PALM_CRAFTING_TABLE_MINECART = ITEMS.register("rue_palm_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("regions_unexplored", getTabWithMatchingName("regions_unexplored_other_tab", CreativeModeTab.TAB_TRANSPORTATION))).stacksTo(1), CraftingTableType.RUE_PALM));
	public static final RegistryObject<Item> RUE_PINE_CRAFTING_TABLE_MINECART = ITEMS.register("rue_pine_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("regions_unexplored", getTabWithMatchingName("regions_unexplored_other_tab", CreativeModeTab.TAB_TRANSPORTATION))).stacksTo(1), CraftingTableType.RUE_PINE));
	public static final RegistryObject<Item> RUE_REDWOOD_CRAFTING_TABLE_MINECART = ITEMS.register("rue_redwood_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("regions_unexplored", getTabWithMatchingName("regions_unexplored_other_tab", CreativeModeTab.TAB_TRANSPORTATION))).stacksTo(1), CraftingTableType.RUE_REDWOOD));
	public static final RegistryObject<Item> RUE_WILLOW_CRAFTING_TABLE_MINECART = ITEMS.register("rue_willow_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("regions_unexplored", getTabWithMatchingName("regions_unexplored_other_tab", CreativeModeTab.TAB_TRANSPORTATION))).stacksTo(1), CraftingTableType.RUE_WILLOW));

	// Silent Gear
	public static final RegistryObject<Item> SG_NETHERWOOD_CRAFTING_TABLE = ITEMS.register("sg_netherwood_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.SG_NETHERWOOD_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("silentgear", getTabWithMatchingName("silentgear", CreativeModeTab.TAB_DECORATIONS)))));

	public static final RegistryObject<Item> SG_NETHERWOOD_CRAFTING_TABLE_MINECART = ITEMS.register("sg_netherwood_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("silentgear", getTabWithMatchingName("silentgear", CreativeModeTab.TAB_TRANSPORTATION))).stacksTo(1), CraftingTableType.SG_NETHERWOOD));

	// Snowy Spirit
	public static final RegistryObject<Item> GINGERBREAD_CRAFTING_TABLE = ITEMS.register("gingerbread_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.GINGERBREAD_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("snowyspirit", CreativeModeTab.TAB_DECORATIONS))));
	
	public static final RegistryObject<Item> GINGERBREAD_CRAFTING_TABLE_MINECART = ITEMS.register("gingerbread_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("snowyspirits", CreativeModeTab.TAB_TRANSPORTATION)).stacksTo(1), CraftingTableType.GINGERBREAD));
	
	// Tinkers Construct
	public static final RegistryObject<Item> BLOODSHROOM_CRAFTING_TABLE = ITEMS.register("bloodshroom_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.BLOODSHROOM_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("tconstruct", getTabWithMatchingName("tconstruct.world", CreativeModeTab.TAB_DECORATIONS)))));
	public static final RegistryObject<Item> GREENHEART_CRAFTING_TABLE = ITEMS.register("greenheart_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.GREENHEART_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("tconstruct", getTabWithMatchingName("tconstruct.world", CreativeModeTab.TAB_DECORATIONS)))));
	public static final RegistryObject<Item> SKYROOT_CRAFTING_TABLE = ITEMS.register("skyroot_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.SKYROOT_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("tconstruct", getTabWithMatchingName("tconstruct.world", CreativeModeTab.TAB_DECORATIONS)))));

	public static final RegistryObject<Item> BLOODSHROOM_CRAFTING_TABLE_MINECART = ITEMS.register("bloodshroom_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("tconstruct", getTabWithMatchingName("tconstruct.world", CreativeModeTab.TAB_TRANSPORTATION))).stacksTo(1), CraftingTableType.BLOODSHROOM));
	public static final RegistryObject<Item> GREENHEART_CRAFTING_TABLE_MINECART = ITEMS.register("greenheart_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("tconstruct", getTabWithMatchingName("tconstruct.world", CreativeModeTab.TAB_TRANSPORTATION))).stacksTo(1), CraftingTableType.GREENHEART));
	public static final RegistryObject<Item> SKYROOT_CRAFTING_TABLE_MINECART = ITEMS.register("skyroot_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("tconstruct", getTabWithMatchingName("tconstruct.world", CreativeModeTab.TAB_TRANSPORTATION))).stacksTo(1), CraftingTableType.SKYROOT));
	
	// Twigs 
	public static final RegistryObject<Item> STRIPPED_BAMBOO_CRAFTING_TABLE = ITEMS.register("stripped_bamboo_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.STRIPPED_BAMBOO_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("twigs", getTabWithMatchingName("twigs:item_group", CreativeModeTab.TAB_DECORATIONS)))));
	
	public static final RegistryObject<Item> STRIPPED_BAMBOO_CRAFTING_TABLE_MINECART = ITEMS.register("stripped_bamboo_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("twigs", getTabWithMatchingName("twigs:item_group", CreativeModeTab.TAB_TRANSPORTATION))).stacksTo(1), CraftingTableType.STRIPPED_BAMBOO));
	
	// Undergarden
	public static final RegistryObject<Item> GRONGLE_CRAFTING_TABLE = ITEMS.register("grongle_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.GRONGLE_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("undergarden", getTabWithMatchingName("undergarden_group", CreativeModeTab.TAB_DECORATIONS)))));
	public static final RegistryObject<Item> SMOGSTEM_CRAFTING_TABLE = ITEMS.register("smogstem_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.SMOGSTEM_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("undergarden", getTabWithMatchingName("undergarden_group", CreativeModeTab.TAB_DECORATIONS)))));
	public static final RegistryObject<Item> WIGGLEWOOD_CRAFTING_TABLE = ITEMS.register("wigglewood_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.WIGGLEWOOD_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("undergarden", getTabWithMatchingName("undergarden_group", CreativeModeTab.TAB_DECORATIONS)))));

	public static final RegistryObject<Item> GRONGLE_CRAFTING_TABLE_MINECART = ITEMS.register("grongle_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("undergarden", getTabWithMatchingName("undergarden_group", CreativeModeTab.TAB_TRANSPORTATION))).stacksTo(1), CraftingTableType.GRONGLE));
	public static final RegistryObject<Item> SMOGSTEM_CRAFTING_TABLE_MINECART = ITEMS.register("smogstem_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("undergarden", getTabWithMatchingName("undergarden_group", CreativeModeTab.TAB_TRANSPORTATION))).stacksTo(1), CraftingTableType.SMOGSTEM));
	public static final RegistryObject<Item> WIGGLEWOOD_CRAFTING_TABLE_MINECART = ITEMS.register("wigglewood_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("undergarden", getTabWithMatchingName("undergarden_group", CreativeModeTab.TAB_TRANSPORTATION))).stacksTo(1), CraftingTableType.WIGGLEWOOD));
	
	// Windswept
	public static final RegistryObject<Item> CHESTNUT_CRAFTING_TABLE = ITEMS.register("chestnut_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.CHESTNUT_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("windswept", CreativeModeTab.TAB_DECORATIONS))));
	public static final RegistryObject<Item> HOLLY_CRAFTING_TABLE = ITEMS.register("holly_crafting_table", () -> new VCTCraftingTableItem(VCTBlocks.HOLLY_CRAFTING_TABLE.get(), new Item.Properties().tab(conditionallyAddTab("windswept", CreativeModeTab.TAB_DECORATIONS))));
	
	public static final RegistryObject<Item> CHESTNUT_CRAFTING_TABLE_MINECART = ITEMS.register("chestnut_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("windswept", CreativeModeTab.TAB_TRANSPORTATION)).stacksTo(1), CraftingTableType.CHESTNUT));
	public static final RegistryObject<Item> HOLLY_CRAFTING_TABLE_MINECART = ITEMS.register("holly_crafting_table_minecart", () -> new CraftingTableMinecartItem(new Item.Properties().tab(conditionallyAddTab("windswept", CreativeModeTab.TAB_TRANSPORTATION)).stacksTo(1), CraftingTableType.HOLLY));
	
	@Nullable
    private static CreativeModeTab conditionallyAddTab(String modid, CreativeModeTab tab) {
    	if (ModList.get().isLoaded(modid)) {
    		return tab;
    	}
    	else {
    		return null;
    	}
    }
    
    private static CreativeModeTab getTabWithMatchingName(String tabName, CreativeModeTab fallbackTab) {
    	CreativeModeTab tab = null;
    	if (FMLEnvironment.dist == Dist.DEDICATED_SERVER) { // Check to make sure the code doesn't advance on server to prevent crashes.
    		return null;
    	}
    	for (CreativeModeTab tempTab : CreativeModeTab.TABS) {
    		if (tempTab.getDisplayName().getContents() instanceof TranslatableContents) { // Check if it's the correct class to avoid crashes.
	    		TranslatableContents tabContents = (TranslatableContents) tempTab.getDisplayName().getContents();
	    		if (tabContents.getKey().equalsIgnoreCase("itemGroup." + tabName)) {
	    			tab = tempTab;
	    			break;
	    		}
    		}
    	}
    	if (tab == null) { // If for some reason the tab doesn't exist, fallback.
    		tab = fallbackTab;
    	}
    	return tab;
    }

}
