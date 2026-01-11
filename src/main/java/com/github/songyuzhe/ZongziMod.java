package com.github.songyuzhe;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ZongziMod implements ModInitializer {
    public static final String MOD_ID = "zongzimod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    
    @Override
    public void onInitialize() {
        LOGGER.info("=======================================");
        LOGGER.info("粽子模组 v1.0 初始化中...");
        LOGGER.info("作者：粽子（aka 网卡哥）");
        LOGGER.info("包名：com.github.songyuzhe");
        LOGGER.info("目标：从网卡哥到 Java 大师！");
        LOGGER.info("=======================================");
        
        // 注册物品
        ModItems.registerItems();
    }
}
