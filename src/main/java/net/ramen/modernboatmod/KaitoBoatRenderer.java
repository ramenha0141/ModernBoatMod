package net.ramen.modernboatmod;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

import static net.ramen.modernboatmod.ModernBoatMod.MOD_ID;

public class KaitoBoatRenderer extends MobEntityRenderer<KaitoBoatEntity, KaitoBoatModel> {
    public KaitoBoatRenderer(EntityRendererFactory.Context context) {
        super(context, new KaitoBoatModel(context.getPart(ModernBoatModClient.MODEL_KaitoBoat_LAYER)), 3f);
    }

    @Override
    public Identifier getTexture(KaitoBoatEntity entity) {
        return new Identifier(MOD_ID, "textures/entity/kaito_boat.png");
    }
}
