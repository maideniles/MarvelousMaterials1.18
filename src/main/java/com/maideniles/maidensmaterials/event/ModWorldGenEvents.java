package com.maideniles.maidensmaterials.event;

import com.maideniles.maidensmaterials.MarvelousMaterials;
import com.maideniles.maidensmaterials.init.ModTreeGen;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MarvelousMaterials.MOD_ID)
public class ModWorldGenEvents {
    @SubscribeEvent
    public static void ModWorldGenEvents(final BiomeLoadingEvent event) {

        ModTreeGen.generateTrees(event);
    }
}