package com.takkkom.create_tab_fix;

import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreateTabFix {
    public static final String MOD_ID = "create_tab_fix";
    public static final String NAME = "Create Tab Fix";
    public static final Logger LOGGER = LoggerFactory.getLogger(NAME);


    public static void init() {
    }

    public static ResourceLocation id(String path) {
        return new ResourceLocation(MOD_ID, path);
    }
}
