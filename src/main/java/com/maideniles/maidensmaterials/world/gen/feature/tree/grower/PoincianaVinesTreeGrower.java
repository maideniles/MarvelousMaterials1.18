package com.maideniles.maidensmaterials.world.gen.feature.tree.grower;

import com.maideniles.maidensmaterials.init.ModFeatures;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

import java.util.Random;

public class PoincianaVinesTreeGrower extends AbstractTreeGrower {

    protected ConfiguredFeature<?, ?> getConfiguredFeature(Random pRandom, boolean pLargeHive) {
        return ModFeatures.POINCIANA_VINES_CONFIG;
    }
}
