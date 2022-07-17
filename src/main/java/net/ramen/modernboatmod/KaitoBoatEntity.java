package net.ramen.modernboatmod;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.network.Packet;
import net.minecraft.world.World;

public class KaitoBoatEntity extends MobEntity {
    public KaitoBoatEntity(EntityType<? extends MobEntity> entityType, World world) {
        super(entityType, world);
    }
    public Packet<?> createSpawnPacket() {
        return null;
    }
}
