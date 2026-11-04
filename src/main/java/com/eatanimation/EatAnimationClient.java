package com.eatanimation;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EatAnimationClient implements ClientModInitializer {
    public static final String MOD_ID = "eatanimation";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitializeClient() {
        LOGGER.info("Eat Animation загружен! Скрываем настройки MACECORE...");
    }
}
