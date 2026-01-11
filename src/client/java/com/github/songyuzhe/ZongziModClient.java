package com.github.songyuzhe;

import net.fabricmc.api.ClientModInitializer;

public class ZongziModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ZongziMod.LOGGER.info("客户端初始化完成！");
        ZongziMod.LOGGER.info("网卡哥提醒：请保持网络稳定！");
    }
}
