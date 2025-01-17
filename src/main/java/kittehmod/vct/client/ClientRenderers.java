package kittehmod.vct.client;

import kittehmod.vct.blocks.VCTBlocks;
import kittehmod.vct.entities.VCTEntities;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.client.renderer.entity.MinecartRenderer;

public class ClientRenderers
{
	@SuppressWarnings("removal")
	public static void initialize() {
		ItemBlockRenderTypes.setRenderLayer(VCTBlocks.CONGEALED_CRAFTING_TABLE.get(), RenderType.translucent());
		
		EntityRenderers.register(VCTEntities.CRAFTING_TABLE_MINECART.get(), (entity) -> { return new MinecartRenderer<>(entity, ModelLayers.MINECART); });

	}
}
