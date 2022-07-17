// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
package net.ramen.modernboatmod;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;

public class KaitoBoatModel extends EntityModel<KaitoBoatEntity> {
	private final ModelPart stair;
	private final ModelPart banner1;
	private ModelPart banner_r1;
	private final ModelPart banner2;
	private ModelPart banner_r2;
	private final ModelPart banner3;
	private ModelPart banner_r3;
	private final ModelPart lantern1;
	private ModelPart top_r1;
	private ModelPart top_r2;
	private final ModelPart lantern2;
	private ModelPart top_r3;
	private ModelPart top_r4;
	private final ModelPart bb_main;
	public KaitoBoatModel(ModelPart root) {
		this.stair = root.getChild("stair");
		this.banner1 = root.getChild("banner1");
		this.banner2 = root.getChild("banner2");
		this.banner3 = root.getChild("banner3");
		this.lantern1 = root.getChild("lantern1");
		this.lantern2 = root.getChild("lantern2");
		this.bb_main = root.getChild("bb_main");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData stair = modelPartData.addChild("stair", ModelPartBuilder.create().uv(0, 0).cuboid(-8.0F, -8.0F, -8.0F, 16.0F, 8.0F, 16.0F, new Dilation(0.0F))
		.uv(8, 0).cuboid(-8.0F, -16.0F, 0.0F, 16.0F, 8.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData banner1 = modelPartData.addChild("banner1", ModelPartBuilder.create().uv(0, 0).cuboid(-6.5F, 0.0F, -1.0F, 13.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -41.0F, 8.0F));

		ModelPartData banner_r1 = banner1.addChild("banner_r1", ModelPartBuilder.create().uv(64, 32).mirrored().cuboid(-6.5F, 0.0F, -2.0F, 13.0F, 27.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.0F));

		ModelPartData banner2 = modelPartData.addChild("banner2", ModelPartBuilder.create().uv(0, 0).cuboid(-6.5F, 0.0F, -1.0F, 13.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(16.0F, -41.0F, 8.0F));

		ModelPartData banner_r2 = banner2.addChild("banner_r2", ModelPartBuilder.create().uv(64, 32).mirrored().cuboid(-6.5F, 0.0F, -2.0F, 13.0F, 27.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.0F));

		ModelPartData banner3 = modelPartData.addChild("banner3", ModelPartBuilder.create().uv(0, 0).cuboid(-6.5F, 0.0F, -1.0F, 13.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-16.0F, -41.0F, 8.0F));

		ModelPartData banner_r3 = banner3.addChild("banner_r3", ModelPartBuilder.create().uv(64, 32).mirrored().cuboid(-6.5F, 0.0F, -2.0F, 13.0F, 27.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.0F));

		ModelPartData lantern1 = modelPartData.addChild("lantern1", ModelPartBuilder.create().uv(0, 64).cuboid(13.0F, -23.0F, 13.0F, 6.0F, 7.0F, 6.0F, new Dilation(0.0F))
		.uv(24, 64).cuboid(14.0F, -25.0F, 14.0F, 4.0F, 2.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData top_r1 = lantern1.addChild("top_r1", ModelPartBuilder.create().uv(40, 64).cuboid(-1.5F, -2.0F, 0.0F, 3.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(16.0F, -25.0F, 16.0F, 0.0F, 0.7854F, 0.0F));

		ModelPartData top_r2 = lantern1.addChild("top_r2", ModelPartBuilder.create().uv(40, 64).cuboid(-1.5F, -2.0F, 0.0F, 3.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(16.0F, -25.0F, 16.0F, 0.0F, -0.7854F, 0.0F));

		ModelPartData lantern2 = modelPartData.addChild("lantern2", ModelPartBuilder.create().uv(0, 64).cuboid(13.0F, -23.0F, 13.0F, 6.0F, 7.0F, 6.0F, new Dilation(0.0F))
		.uv(24, 64).cuboid(14.0F, -25.0F, 14.0F, 4.0F, 2.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(-32.0F, 24.0F, 0.0F));

		ModelPartData top_r3 = lantern2.addChild("top_r3", ModelPartBuilder.create().uv(40, 64).cuboid(-1.5F, -2.0F, 0.0F, 3.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(16.0F, -25.0F, 16.0F, 0.0F, 0.7854F, 0.0F));

		ModelPartData top_r4 = lantern2.addChild("top_r4", ModelPartBuilder.create().uv(40, 64).cuboid(-1.5F, -2.0F, 0.0F, 3.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(16.0F, -25.0F, 16.0F, 0.0F, -0.7854F, 0.0F));

		ModelPartData bb_main = modelPartData.addChild("bb_main", ModelPartBuilder.create().uv(0, 0).cuboid(-8.0F, -16.0F, 8.0F, 16.0F, 16.0F, 16.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-8.0F, -16.0F, 24.0F, 16.0F, 8.0F, 16.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(8.0F, -16.0F, 8.0F, 16.0F, 8.0F, 16.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-24.0F, -16.0F, 8.0F, 16.0F, 8.0F, 16.0F, new Dilation(0.0F))
		.uv(0, 12).cuboid(-2.0F, -32.0F, 14.0F, 4.0F, 16.0F, 4.0F, new Dilation(0.0F))
		.uv(0, 12).cuboid(-2.0F, -48.0F, 14.0F, 4.0F, 16.0F, 4.0F, new Dilation(0.0F))
		.uv(0, 12).cuboid(-2.0F, -64.0F, 14.0F, 4.0F, 16.0F, 4.0F, new Dilation(0.0F))
		.uv(0, 12).cuboid(14.0F, -64.0F, 14.0F, 4.0F, 16.0F, 4.0F, new Dilation(0.0F))
		.uv(0, 12).cuboid(-18.0F, -64.0F, 14.0F, 4.0F, 16.0F, 4.0F, new Dilation(0.0F))
		.uv(2, 3).cuboid(-14.0F, -63.0F, 15.0F, 28.0F, 3.0F, 2.0F, new Dilation(0.0F))
		.uv(2, 1).cuboid(-14.0F, -57.0F, 15.0F, 28.0F, 3.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 45).cuboid(-8.0F, -67.0F, 8.0F, 16.0F, 3.0F, 16.0F, new Dilation(0.0F))
		.uv(0, 45).cuboid(8.0F, -67.0F, 8.0F, 16.0F, 3.0F, 16.0F, new Dilation(0.0F))
		.uv(0, 45).cuboid(-24.0F, -67.0F, 8.0F, 16.0F, 3.0F, 16.0F, new Dilation(0.0F))
		.uv(0, 45).cuboid(-8.0F, 0.0F, -8.0F, 16.0F, 3.0F, 16.0F, new Dilation(0.0F))
		.uv(0, 45).cuboid(-8.0F, 0.0F, -24.0F, 16.0F, 3.0F, 16.0F, new Dilation(0.0F))
		.uv(64, 0).cuboid(8.0F, -16.0F, -24.0F, 3.0F, 16.0F, 16.0F, new Dilation(0.0F))
		.uv(64, 0).cuboid(8.0F, -16.0F, -8.0F, 3.0F, 16.0F, 16.0F, new Dilation(0.0F))
		.uv(64, 0).cuboid(-11.0F, -16.0F, -8.0F, 3.0F, 16.0F, 16.0F, new Dilation(0.0F))
		.uv(64, 0).cuboid(-11.0F, -16.0F, -24.0F, 3.0F, 16.0F, 16.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-8.0F, -16.0F, -40.0F, 16.0F, 16.0F, 16.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-8.0F, -16.0F, -56.0F, 16.0F, 8.0F, 16.0F, new Dilation(0.0F))
		.uv(0, 45).cuboid(-8.0F, -16.0F, -72.0F, 16.0F, 3.0F, 16.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));
		return TexturedModelData.of(modelData, 128, 128);
	}
	@Override
	public void setAngles(KaitoBoatEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		stair.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		banner1.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		banner2.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		banner3.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		lantern1.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		lantern2.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		bb_main.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}
}