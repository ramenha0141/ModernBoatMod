package net.ramen.modernboatmod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ModernBoatMod implements ModInitializer {
	public static final String MOD_ID = "modernboatmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static final EntityType<KaitoBoatEntity> kaito_boat = Registry.register(
			Registry.ENTITY_TYPE,
			new Identifier(MOD_ID, "kaito_boat"),
			FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, KaitoBoatEntity::new).dimensions(EntityDimensions.fixed(3f, 3f)).build()
	);

	@Override
	public void onInitialize() {
		FabricDefaultAttributeRegistry.register(kaito_boat, KaitoBoatEntity.createMobAttributes());
	}
}
