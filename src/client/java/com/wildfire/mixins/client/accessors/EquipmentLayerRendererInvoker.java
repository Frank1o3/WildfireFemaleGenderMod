package com.wildfire.mixins.client.accessors;

import net.minecraft.client.renderer.entity.layers.EquipmentLayerRenderer;
import net.minecraft.client.resources.model.EquipmentClientInfo;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.equipment.trim.ArmorTrim;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(EquipmentLayerRenderer.class)
public interface EquipmentLayerRendererInvoker {

    @Invoker("createTrimSpriteKey")
    static Object wildfire$createTrimSpriteKey(
            ArmorTrim trim,
            EquipmentClientInfo.LayerType layerType,
            ResourceKey<?> atlas
    ) {
        throw new AssertionError();
    }
}
