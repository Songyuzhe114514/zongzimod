package com.github.songyuzhe;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    // 原来的粽子食物属性 - 旧版本格式
    public static final FoodComponent ZONGZI = new FoodComponent.Builder()
        .hunger(6)  // 注意：旧版本用 hunger() 而不是 nutrition()
        .saturationModifier(0.6f)
        .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100, 0), 0.3f)
        .alwaysEdible()
        .build();
    
    // 烤粽子的食物属性
    public static final FoodComponent ZONGZI_COOKED = new FoodComponent.Builder()
        .hunger(8)
        .saturationModifier(0.8f)
        .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 200, 0), 0.5f)
        .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 600, 0), 0.25f)
        .alwaysEdible()
        .build();
}