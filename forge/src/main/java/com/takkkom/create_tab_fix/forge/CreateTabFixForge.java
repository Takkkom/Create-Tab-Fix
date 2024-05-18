package com.takkkom.create_tab_fix.forge;

import com.takkkom.create_tab_fix.CreateTabFix;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(CreateTabFix.MOD_ID)
public class CreateTabFixForge {
    public CreateTabFixForge() {
        // registrate must be given the mod event bus on forge before registration
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        CreateTabFix.init();
    }
}
