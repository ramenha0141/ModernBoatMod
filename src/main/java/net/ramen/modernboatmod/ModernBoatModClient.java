package net.ramen.modernboatmod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

import static net.ramen.modernboatmod.ModernBoatMod.MOD_ID;

@Environment(EnvType.CLIENT)
public class ModernBoatModClient implements ClientModInitializer {
    public static final EntityModelLayer MODEL_KaitoBoat_LAYER = new EntityModelLayer(new Identifier(MOD_ID, "kaito_boat"), "main");
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModernBoatMod.kaito_boat, KaitoBoatRenderer::new);
    }
}
