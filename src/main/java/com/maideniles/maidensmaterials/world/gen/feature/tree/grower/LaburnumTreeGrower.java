package com.maideniles.maidensmaterials.world.gen.feature.tree.grower;

import com.maideniles.maidensmaterials.init.ModFeatures;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

import java.util.Random;

public class LaburnumTreeGrower extends AbstractTreeGrower {

    protected ConfiguredFeature<?, ?> getConfiguredFeature(Random pRandom, boolean pLargeHive) {
        if(pRandom.nextInt(10) ==0) { return ModFeatures.LABURNUM_VINES_CONFIG;}

        return ModFeatures.LABURNUM_CONFIG;
    }
}
