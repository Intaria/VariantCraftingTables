package kittehmod.vct.blocks;

import kittehmod.vct.VariantCraftingTablesMod;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class VCTBlocks
{	
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, VariantCraftingTablesMod.MOD_ID);

	// Vanilla
    public static final RegistryObject<Block> SPRUCE_CRAFTING_TABLE = BLOCKS.register("spruce_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BIRCH_CRAFTING_TABLE = BLOCKS.register("birch_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> JUNGLE_CRAFTING_TABLE = BLOCKS.register("jungle_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> ACACIA_CRAFTING_TABLE = BLOCKS.register("acacia_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> DARK_OAK_CRAFTING_TABLE = BLOCKS.register("dark_oak_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> MANGROVE_CRAFTING_TABLE = BLOCKS.register("mangrove_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BAMBOO_CRAFTING_TABLE = BLOCKS.register("bamboo_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD))); // With One Twenty Backport
    public static final RegistryObject<Block> CRIMSON_CRAFTING_TABLE = BLOCKS.register("crimson_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.NETHER_WOOD).strength(2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> WARPED_CRAFTING_TABLE = BLOCKS.register("warped_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.NETHER_WOOD).strength(2.5F).sound(SoundType.WOOD)));

    /* The big, popular mods */
    // Biomes o' Plenty
    public static final RegistryObject<Block> BOP_CHERRY_CRAFTING_TABLE = BLOCKS.register("bop_cherry_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BOP_DEAD_CRAFTING_TABLE = BLOCKS.register("bop_dead_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BOP_FIR_CRAFTING_TABLE = BLOCKS.register("bop_fir_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BOP_HELLBARK_CRAFTING_TABLE = BLOCKS.register("bop_hellbark_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.NETHER_WOOD).strength(2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BOP_JACARANDA_CRAFTING_TABLE = BLOCKS.register("bop_jacaranda_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BOP_MAGIC_CRAFTING_TABLE = BLOCKS.register("bop_magic_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BOP_MAHOGANY_CRAFTING_TABLE = BLOCKS.register("bop_mahogany_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.NETHER_WOOD).strength(2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BOP_PALM_CRAFTING_TABLE = BLOCKS.register("bop_palm_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BOP_REDWOOD_CRAFTING_TABLE = BLOCKS.register("bop_redwood_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BOP_UMBRAN_CRAFTING_TABLE = BLOCKS.register("bop_umbran_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BOP_WILLOW_CRAFTING_TABLE = BLOCKS.register("bop_willow_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));

    // Twilight Forest
    public static final RegistryObject<Block> CANOPY_CRAFTING_TABLE = BLOCKS.register("canopy_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> DARKWOOD_CRAFTING_TABLE = BLOCKS.register("darkwood_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> TWILIGHT_MANGROVE_CRAFTING_TABLE = BLOCKS.register("twilight_mangrove_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> MINEWOOD_CRAFTING_TABLE = BLOCKS.register("minewood_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> SORTINGWOOD_CRAFTING_TABLE = BLOCKS.register("sortingwood_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> TIMEWOOD_CRAFTING_TABLE = BLOCKS.register("timewood_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> TRANSWOOD_CRAFTING_TABLE = BLOCKS.register("transwood_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> TWILIGHT_OAK_CRAFTING_TABLE = BLOCKS.register("twilight_oak_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> TOWERWOOD_CRAFTING_TABLE = BLOCKS.register("towerwood_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));

	/* Abnormals Mods */
    // Atmospheric
    public static final RegistryObject<Block> ASPEN_CRAFTING_TABLE = BLOCKS.register("aspen_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> GRIMWOOD_CRAFTING_TABLE = BLOCKS.register("grimwood_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.NETHER_WOOD).strength(2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> KOUSA_CRAFTING_TABLE = BLOCKS.register("kousa_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> MORADO_CRAFTING_TABLE = BLOCKS.register("morado_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> ROSEWOOD_CRAFTING_TABLE = BLOCKS.register("rosewood_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> YUCCA_CRAFTING_TABLE = BLOCKS.register("yucca_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));
    
    // Autumnity
    public static final RegistryObject<Block> MAPLE_CRAFTING_TABLE = BLOCKS.register("maple_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));
        
    // Caverns and Chasms
    public static final RegistryObject<Block> AZALEA_CRAFTING_TABLE = BLOCKS.register("azalea_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));
    
    // Endergetic Expansion
    public static final RegistryObject<Block> POISE_CRAFTING_TABLE = BLOCKS.register("poise_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));
    
    // Environmental
    public static final RegistryObject<Block> CHERRY_CRAFTING_TABLE = BLOCKS.register("cherry_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> WILLOW_CRAFTING_TABLE = BLOCKS.register("willow_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> WISTERIA_CRAFTING_TABLE = BLOCKS.register("wisteria_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));

	/* Team Aurora Mods */
    // Abundance
 	public static final RegistryObject<Block> JACARANDA_CRAFTING_TABLE = BLOCKS.register("jacaranda_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));
 	public static final RegistryObject<Block> REDBUD_CRAFTING_TABLE = BLOCKS.register("redbud_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));
    
    // Bayou Blues
 	public static final RegistryObject<Block> CYPRESS_CRAFTING_TABLE = BLOCKS.register("cypress_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));

 	// Enhanced Mushrooms
 	public static final RegistryObject<Block> BROWN_MUSHROOM_CRAFTING_TABLE = BLOCKS.register("brown_mushroom_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));
 	public static final RegistryObject<Block> RED_MUSHROOM_CRAFTING_TABLE = BLOCKS.register("red_mushroom_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));

	/* Miscellaneous Mods */
 	// Abundant Atmosphere
  	public static final RegistryObject<Block> ASH_CRAFTING_TABLE = BLOCKS.register("ash_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));
  	public static final RegistryObject<Block> GOURDROT_CRAFTING_TABLE = BLOCKS.register("gourdrot_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));
 	
 	// Ad Astra
  	public static final RegistryObject<Block> AERONOS_CRAFTING_TABLE = BLOCKS.register("aeronos_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));
  	public static final RegistryObject<Block> GLACIAN_CRAFTING_TABLE = BLOCKS.register("glacian_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));
  	public static final RegistryObject<Block> STROPHAR_CRAFTING_TABLE = BLOCKS.register("strophar_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));
 	
 	// Architects Palette
  	public static final RegistryObject<Block> TWISTED_CRAFTING_TABLE = BLOCKS.register("twisted_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));
  	
  	// Ars Nouveau
  	public static final RegistryObject<Block> ARCHWOOD_CRAFTING_TABLE = BLOCKS.register("archwood_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));  	
  	
  	// Biome Makeover
  	public static final RegistryObject<Block> BM_ANCIENT_OAK_CRAFTING_TABLE = BLOCKS.register("bm_ancient_oak_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));
  	public static final RegistryObject<Block> BM_BLIGHTED_BALSA_CRAFTING_TABLE = BLOCKS.register("bm_blighted_balsa_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));
  	public static final RegistryObject<Block> BM_SWAMP_CYPRESS_CRAFTING_TABLE = BLOCKS.register("bm_swamp_cypress_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));  	
  	public static final RegistryObject<Block> BM_WILLOW_CRAFTING_TABLE = BLOCKS.register("bm_willow_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));

  	// Caupona
 	public static final RegistryObject<Block> WALNUT_CRAFTING_TABLE = BLOCKS.register("walnut_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));
  	
  	// Ceilands
  	public static final RegistryObject<Block> CEILTRUNK_CRAFTING_TABLE = BLOCKS.register("ceiltrunk_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));
  	public static final RegistryObject<Block> LUZAWOOD_CRAFTING_TABLE = BLOCKS.register("luzawood_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));
  	
  	// Colourful Azaleas
 	public static final RegistryObject<Block> AZULE_AZALEA_CRAFTING_TABLE = BLOCKS.register("azule_azalea_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));
 	public static final RegistryObject<Block> BRIGHT_AZALEA_CRAFTING_TABLE = BLOCKS.register("bright_azalea_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));
 	public static final RegistryObject<Block> FISS_AZALEA_CRAFTING_TABLE = BLOCKS.register("fiss_azalea_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));
 	public static final RegistryObject<Block> ROZE_AZALEA_CRAFTING_TABLE = BLOCKS.register("roze_azalea_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));
 	public static final RegistryObject<Block> TECAL_AZALEA_CRAFTING_TABLE = BLOCKS.register("tecal_azalea_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));
 	public static final RegistryObject<Block> TITANIUM_AZALEA_CRAFTING_TABLE = BLOCKS.register("titanium_azalea_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));
 	public static final RegistryObject<Block> WALNUT_AZALEA_CRAFTING_TABLE = BLOCKS.register("walnut_azalea_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));
  	
 	// Darker Depths
 	public static final RegistryObject<Block> PETRIFIED_CRAFTING_TABLE = BLOCKS.register("petrified_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.STONE).strength(4.0F).sound(SoundType.WOOD)));
    
 	// Deeper & Darker
 	public static final RegistryObject<Block> ECHO_CRAFTING_TABLE = BLOCKS.register("echo_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.SCULK).strength(2.5F).sound(SoundType.WOOD)));

 	// Ecologics
 	public static final RegistryObject<Block> ECO_AZALEA_CRAFTING_TABLE = BLOCKS.register("eco_azalea_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));
 	public static final RegistryObject<Block> ECO_FLOWERING_AZALEA_CRAFTING_TABLE = BLOCKS.register("eco_flowering_azalea_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));
 	public static final RegistryObject<Block> ECO_COCONUT_CRAFTING_TABLE = BLOCKS.register("eco_coconut_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));
 	public static final RegistryObject<Block> ECO_WALNUT_CRAFTING_TABLE = BLOCKS.register("eco_walnut_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));
 	
 	// End's Phantasm
 	public static final RegistryObject<Block> EBONY_CRAFTING_TABLE = BLOCKS.register("ebony_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));
 	public static final RegistryObject<Block> PREAM_CRAFTING_TABLE = BLOCKS.register("pream_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));
 	
 	// Enlightened End
 	public static final RegistryObject<Block> CONGEALED_CRAFTING_TABLE = BLOCKS.register("congealed_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD).noOcclusion()));
 	public static final RegistryObject<Block> VERDANT_CRAFTING_TABLE = BLOCKS.register("verdant_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD))); 	
 	
 	// Extended Mushrooms
 	public static final RegistryObject<Block> MUSHROOM_CRAFTING_TABLE = BLOCKS.register("mushroom_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD).noOcclusion()));
 	public static final RegistryObject<Block> POISONOUS_MUSHROOM_CRAFTING_TABLE = BLOCKS.register("poisonous_mushroom_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD).noOcclusion()));
 	public static final RegistryObject<Block> HONEY_FUNGUS_CRAFTING_TABLE = BLOCKS.register("honey_fungus_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD).noOcclusion()));
 	public static final RegistryObject<Block> GLOWSHROOM_CRAFTING_TABLE = BLOCKS.register("glowshroom_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).lightLevel((ll) -> { return 11; }).strength(2.5F).sound(SoundType.WOOD)));

 	// Forbidden & Arcanus
 	public static final RegistryObject<Block> ARCANE_EDELWOOD_CRAFTING_TABLE = BLOCKS.register("arcane_edelwood_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));
 	public static final RegistryObject<Block> CHERRYWOOD_CRAFTING_TABLE = BLOCKS.register("cherrywood_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));
 	public static final RegistryObject<Block> EDELWOOD_CRAFTING_TABLE = BLOCKS.register("edelwood_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));
 	public static final RegistryObject<Block> FUNGYSS_CRAFTING_TABLE = BLOCKS.register("fungyss_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));
 	public static final RegistryObject<Block> AURUM_CRAFTING_TABLE = BLOCKS.register("aurum_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));
 	
 	// Fruit Trees
 	public static final RegistryObject<Block> FT_CHERRY_CRAFTING_TABLE = BLOCKS.register("ft_cherry_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD))); 	
 	public static final RegistryObject<Block> FT_CITRUS_CRAFTING_TABLE = BLOCKS.register("ft_citrus_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD))); 	 	
 	
 	// Gardens of the Dead
 	public static final RegistryObject<Block> SOULBLIGHT_CRAFTING_TABLE = BLOCKS.register("soulblight_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.NETHER_WOOD).strength(2.5F).sound(SoundType.WOOD))); 	
 	public static final RegistryObject<Block> WHISTLECANE_CRAFTING_TABLE = BLOCKS.register("whistlecane_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.NETHER_WOOD).strength(2.5F).sound(SoundType.WOOD))); 	 	
 	
 	// Good Ending
 	public static final RegistryObject<Block> GE_CYPRESS_CRAFTING_TABLE = BLOCKS.register("ge_cypress_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD))); 	
 	public static final RegistryObject<Block> GE_MUDDY_OAK_CRAFTING_TABLE = BLOCKS.register("ge_muddy_oak_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD))); 	 	
 	
 	// Habitat
 	public static final RegistryObject<Block> FAIRY_RING_MUSHROOM_CRAFTING_TABLE = BLOCKS.register("fairy_ring_mushroom_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));

 	// Hexcasting
 	public static final RegistryObject<Block> EDIFIED_CRAFTING_TABLE = BLOCKS.register("edified_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD))); 	
 	
 	// Hexerei
 	public static final RegistryObject<Block> HEXEREI_MAHOGANY_CRAFTING_TABLE = BLOCKS.register("hexerei_mahogany_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD))); 	
 	public static final RegistryObject<Block> HEXEREI_WILLOW_CRAFTING_TABLE = BLOCKS.register("hexerei_willow_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD))); 	
 	
 	// Malum
 	public static final RegistryObject<Block> RUNEWOOD_CRAFTING_TABLE = BLOCKS.register("runewood_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD))); 	
 	public static final RegistryObject<Block> SOULWOOD_CRAFTING_TABLE = BLOCKS.register("soulwood_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD))); 	
 	
 	// Morecraft
 	public static final RegistryObject<Block> NETHERWOOD_CRAFTING_TABLE = BLOCKS.register("netherwood_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.NETHER_WOOD).strength(2.5F).sound(SoundType.WOOD)));

 	// Nether's Exoticism
 	public static final RegistryObject<Block> JABOTICABA_CRAFTING_TABLE = BLOCKS.register("jaboticaba_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));
 	public static final RegistryObject<Block> RAMBOUTAN_CRAFTING_TABLE = BLOCKS.register("ramboutan_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD))); 	
 	
 	// New World
 	public static final RegistryObject<Block> FIR_CRAFTING_TABLE = BLOCKS.register("fir_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD))); 	
 	
    // Outer End
 	public static final RegistryObject<Block> AZURE_CRAFTING_TABLE = BLOCKS.register("azure_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));
 	
 	// Prehistoric Fauna
    public static final RegistryObject<Block> ARAUCARIA_CRAFTING_TABLE = BLOCKS.register("araucaria_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> HEIDIPHYLLUM_CRAFTING_TABLE = BLOCKS.register("heidiphyllum_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> LIRIODENDRITES_CRAFTING_TABLE = BLOCKS.register("liriodendrites_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> METASEQUOIA_CRAFTING_TABLE = BLOCKS.register("metasequoia_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PROTOJUNIPEROXYLON_CRAFTING_TABLE = BLOCKS.register("protojuniperoxylon_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PROTOPICEOXYLON_CRAFTING_TABLE = BLOCKS.register("protopiceoxylon_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> ZAMITES_CRAFTING_TABLE = BLOCKS.register("zamites_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));
 	
    // Pyromancy
 	public static final RegistryObject<Block> PYROWOOD_CRAFTING_TABLE = BLOCKS.register("pyrowood_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.NETHER_WOOD).strength(2.5F).sound(SoundType.WOOD)));
 	public static final RegistryObject<Block> ROTTEN_PLANKS_CRAFTING_TABLE = BLOCKS.register("rotten_planks_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));
    
  	// Quark
 	public static final RegistryObject<Block> QUARK_ANCIENT_CRAFTING_TABLE = BLOCKS.register("quark_ancient_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));
 	public static final RegistryObject<Block> QUARK_AZALEA_CRAFTING_TABLE = BLOCKS.register("quark_azalea_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));
 	public static final RegistryObject<Block> QUARK_BLOSSOM_CRAFTING_TABLE = BLOCKS.register("quark_blossom_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));
    
 	// Regions Unexplored
 	public static final RegistryObject<Block> RUE_BAOBAB_CRAFTING_TABLE = BLOCKS.register("rue_baobab_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD))); 	 	
 	public static final RegistryObject<Block> RUE_BLACKWOOD_CRAFTING_TABLE = BLOCKS.register("rue_blackwood_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD))); 	 	
 	public static final RegistryObject<Block> RUE_CHERRY_CRAFTING_TABLE = BLOCKS.register("rue_cherry_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD))); 	 	
 	public static final RegistryObject<Block> RUE_CYPRESS_CRAFTING_TABLE = BLOCKS.register("rue_cypress_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD))); 	 	
 	public static final RegistryObject<Block> RUE_DEAD_CRAFTING_TABLE = BLOCKS.register("rue_dead_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD))); 	 	
 	public static final RegistryObject<Block> RUE_EUCALYPTUS_CRAFTING_TABLE = BLOCKS.register("rue_eucalyptus_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD))); 	 	
 	public static final RegistryObject<Block> RUE_JOSHUA_CRAFTING_TABLE = BLOCKS.register("rue_joshua_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD))); 	 	
 	public static final RegistryObject<Block> RUE_LARCH_CRAFTING_TABLE = BLOCKS.register("rue_larch_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD))); 	 	
 	public static final RegistryObject<Block> RUE_MAPLE_CRAFTING_TABLE = BLOCKS.register("rue_maple_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD))); 	 	
 	public static final RegistryObject<Block> RUE_MAUVE_CRAFTING_TABLE = BLOCKS.register("rue_mauve_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD))); 	 	
 	public static final RegistryObject<Block> RUE_PALM_CRAFTING_TABLE = BLOCKS.register("rue_palm_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD))); 	 	
 	public static final RegistryObject<Block> RUE_PINE_CRAFTING_TABLE = BLOCKS.register("rue_pine_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD))); 	 	
 	public static final RegistryObject<Block> RUE_REDWOOD_CRAFTING_TABLE = BLOCKS.register("rue_redwood_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD))); 	 	
 	public static final RegistryObject<Block> RUE_WILLOW_CRAFTING_TABLE = BLOCKS.register("rue_willow_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD))); 	 	

 	// Silent Gear
 	public static final RegistryObject<Block> SG_NETHERWOOD_CRAFTING_TABLE = BLOCKS.register("sg_netherwood_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.NETHER_WOOD).strength(2.5F).sound(SoundType.WOOD))); 	
 	
 	// Snowy Spirits
 	public static final RegistryObject<Block> GINGERBREAD_CRAFTING_TABLE = BLOCKS.register("gingerbread_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));
 	
 	// Tinkers Construct
 	public static final RegistryObject<Block> BLOODSHROOM_CRAFTING_TABLE = BLOCKS.register("bloodshroom_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));
 	public static final RegistryObject<Block> GREENHEART_CRAFTING_TABLE = BLOCKS.register("greenheart_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));
 	public static final RegistryObject<Block> SKYROOT_CRAFTING_TABLE = BLOCKS.register("skyroot_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));
 	
 	// Twigs
 	public static final RegistryObject<Block> STRIPPED_BAMBOO_CRAFTING_TABLE = BLOCKS.register("stripped_bamboo_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD))); 	
 	
 	// Undergarden
 	public static final RegistryObject<Block> GRONGLE_CRAFTING_TABLE = BLOCKS.register("grongle_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));
 	public static final RegistryObject<Block> SMOGSTEM_CRAFTING_TABLE = BLOCKS.register("smogstem_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));
 	public static final RegistryObject<Block> WIGGLEWOOD_CRAFTING_TABLE = BLOCKS.register("wigglewood_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));

 	// Windswept
 	public static final RegistryObject<Block> CHESTNUT_CRAFTING_TABLE = BLOCKS.register("chestnut_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));
 	public static final RegistryObject<Block> HOLLY_CRAFTING_TABLE = BLOCKS.register("holly_crafting_table", () -> new VCTCraftingTableBlock(Block.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));
 	
}
