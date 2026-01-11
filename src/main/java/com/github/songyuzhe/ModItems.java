package com.github.songyuzhe;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ModItems {
    public static final String MOD_ID = "zongzimod";
    private static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    
    // 原来的粽子物品
    public static final Item ZONGZI = new Item(new FabricItemSettings()
        .food(ModFoodComponents.ZONGZI)
    );
    
    // 烤粽子物品
    public static final Item ZONGZI_COOKED = new Item(new FabricItemSettings()
        .food(ModFoodComponents.ZONGZI_COOKED)
    );
    
    // 创建一个自定义的物品组（可选）
    public static final ItemGroup ZONGZI_GROUP = FabricItemGroup.builder()
        .icon(() -> new ItemStack(ZONGZI))
        .displayName(Text.translatable("itemGroup.zongzimod.zongzi_group"))
        .entries((displayContext, entries) -> {
            entries.add(ZONGZI);
            entries.add(ZONGZI_COOKED);
        })
        .build();
    
    // 注册所有物品
    public static void registerItems() {
        // 注册原来的粽子
        Registry.register(Registries.ITEM, 
            new Identifier(MOD_ID, "zongzi"), 
            ZONGZI);
        
        // 注册烤粽子
        Registry.register(Registries.ITEM, 
            new Identifier(MOD_ID, "zongzi_cooked"), 
            ZONGZI_COOKED);
        
        // 注册自定义物品组（可选）
        Registry.register(Registries.ITEM_GROUP, 
            new Identifier(MOD_ID, "zongzi_group"), 
            ZONGZI_GROUP);
        
        // 将粽子添加到现有的食物物品组中
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
            entries.add(ZONGZI);
            entries.add(ZONGZI_COOKED);
        });
        
        LOGGER.info("已注册物品：粽子 (Zongzi) 和 烤粽子 (Zongzi Cooked)");
    }
}