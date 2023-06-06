package com.maideniles.maidensmaterials.world.gen.feature.tree.grower;

import com.maideniles.maidensmaterials.init.ModFeatures;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

import java.util.Random;

public class JadeTreeGrower extends AbstractTreeGrower {
    /**
     * @return a {@link net.minecraft.world.level.levelgen.feature.ConfiguredFeature} of this tree
     */
    protected ConfiguredFeature<?, ?> getConfiguredFeature(Random pRandom, boolean pLargeHive) {
        if(pRandom.nextInt(10) ==0) { return ModFeatures.JADE_VINES_CONFIG;}

        return ModFeatures.JADE_CONFIG;

    }

}