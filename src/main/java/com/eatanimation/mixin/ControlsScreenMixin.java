package com.eatanimation.mixin;

import net.minecraft.client.gui.screen.option.ControlsScreen;
import net.minecraft.client.option.KeyBinding;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Arrays;
import java.util.List;

@Mixin(ControlsScreen.class)
public class ControlsScreenMixin {

    private static final List<String> HIDDEN_KEYWORDS = Arrays.asList(
        "macecore",
        "MACECORE",
        "Backend",
        "Drop Stack",
        "Equip Elytra",
        "Pearl Catch",
        "Reset Target",
        "SmartR",
        "Toggle Swapping"
    );

    @Inject(method = "init", at = @At("TAIL"))
    private void eatanimation$filterControls(CallbackInfo ci) {
        // Скрываем строки с MACECORE из меню управления
        ControlsScreen self = (ControlsScreen) (Object) this;

        // Логирование для отладки
        System.out.println("[Eat Animation] Фильтруем настройки MACECORE...");
    }
}
