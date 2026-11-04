package com.eatanimation.mixin;

import net.minecraft.client.option.KeyBinding;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Arrays;
import java.util.List;

@Mixin(KeyBinding.class)
public class KeyBindingMixin {

    // Список модов/ключевых слов для скрытия
    private static final List<String> HIDDEN_MODS = Arrays.asList(
        "macecore",
        "MACECORE"
    );

    @Inject(method = "getCategory", at = @At("HEAD"), cancellable = true)
    private void eatanimation$hideCategory(CallbackInfoReturnable<String> cir) {
        KeyBinding self = (KeyBinding) (Object) this;
        String category = self.getCategory().getName();

        // Проверяем, относится ли к MACECORE
        for (String hidden : HIDDEN_MODS) {
            if (category.toLowerCase().contains(hidden.toLowerCase())) {
                // Перемещаем в скрытую категорию
                cir.setReturnValue("hidden");
                return;
            }
        }
    }
}
