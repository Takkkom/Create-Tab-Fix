package com.takkkom.create_tab_fix.mixin.create;

import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.RegistryEntry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Map;

@Mixin(CreateRegistrate.class)
public class MixinCreateRegistrate {

    @Shadow @Final private static Map<RegistryEntry<?>, ResourceKey<CreativeModeTab>> TAB_LOOKUP = Collections.synchronizedMap(new IdentityHashMap<>());

    public MixinCreateRegistrate(){
    }
}
