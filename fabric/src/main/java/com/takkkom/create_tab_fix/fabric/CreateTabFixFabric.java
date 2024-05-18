package com.takkkom.create_tab_fix.fabric;

import io.github.fabricators_of_create.porting_lib.util.EnvExecutor;
import com.takkkom.create_tab_fix.CreateTabFix;
import net.fabricmc.api.ModInitializer;

public class CreateTabFixFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        CreateTabFix.init();
        CreateTabFix.LOGGER.info(EnvExecutor.unsafeRunForDist(
                () -> () -> "{} is accessing Porting Lib on a Fabric client!",
                () -> () -> "{} is accessing Porting Lib on a Fabric server!"
                ), CreateTabFix.NAME);
    }
}
