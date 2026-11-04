package com.eatanimation.mixin;

import net.minecraft.client.option.GameOptions;
import net.minecraft.client.option.KeyBinding;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Mixin(GameOptions.class)
public class GameOptionsMixin {

    private static final List<String> HIDDEN_NAMES = Arrays.asList(
        "key.macecore.backend",
        "key.macecore.drop_stack",
        "key.macecore.equip_elytra",
        "key.macecore.pearl_catch",
        "key.macecore.reset_target",
        "key.macecore.smartr",
        "key.macecore.toggle_swapping"
    );

    @ModifyVariable(method = "load", at = @At("STORE"), ordinal = 0)
    private KeyBinding[] eatanimation$filterKeyBindings(KeyBinding[] bindings) {
        List<KeyBinding> filtered = new ArrayList<>();

        for (KeyBinding binding : bindings) {
            String name = binding.getTranslationKey();
            boolean isHidden = false;

            for (String hidden : HIDDEN_NAMES) {
                if (name.toLowerCase().contains(hidden.toLowerCase())) {
                    isHidden = true;
                    break;
                }
            }

            // Также проверяем по категории
            if (!isHidden) {
                String category = binding.getCategory().getName();
                if (category.toLowerCase().contains("macecore")) {
                    isHidden = true;
                }
            }

            if (!isHidden) {
                filtered.add(binding);
            }
        }

        System.out.println("[Eat Animation] Скрыто клавиш MACECORE: " + (bindings.length - filtered.size()));

        return filtered.toArray(new KeyBinding[0]);
    }
}
