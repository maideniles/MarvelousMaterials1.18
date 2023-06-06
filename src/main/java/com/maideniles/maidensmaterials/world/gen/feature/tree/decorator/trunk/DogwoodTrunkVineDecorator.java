package com.maideniles.maidensmaterials.world.gen.feature.tree.decorator.trunk;



import com.maideniles.maidensmaterials.blocks.tree.vine.DogwoodVineBlock;
import com.maideniles.maidensmaterials.init.ModBlocks;
import com.maideniles.maidensmaterials.init.ModTreeDecoratorTypes;
import com.mojang.serialization.Codec;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecorator;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecoratorType;

import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;

public class DogwoodTrunkVineDecorator extends TreeDecorator {

    public static final Codec<DogwoodTrunkVineDecorator> CODEC;
    public static final DogwoodTrunkVineDecorator INSTANCE = new DogwoodTrunkVineDecorator();
    public DogwoodTrunkVineDecorator() {

    }
    protected TreeDecoratorType<?> type() {
        return ModTreeDecoratorTypes.DOGWOOD_TRUNK_VINE.get();
    }


    protected static void placeVine(BiConsumer<BlockPos, BlockState> p_161751_, BlockPos p_161752_, BooleanProperty p_161753_) {
        p_161751_.accept(p_161752_, ModBlocks.DOGWOOD_VINE.get().defaultBlockState().setValue(p_161753_, Boolean.valueOf(true)));
    }

    public void place(LevelSimulatedReader p_161755_, BiConsumer<BlockPos, BlockState> p_161756_, Random p_161757_, List<BlockPos> p_161758_, List<BlockPos> p_161759_) {
        p_161758_.forEach((p_161764_) -> {
            if (p_161757_.nextInt(3) > 0) {
                BlockPos blockpos = p_161764_.west();
                if (Feature.isAir(p_161755_, blockpos)) {
                    placeVine(p_161756_, blockpos, DogwoodVineBlock.EAST);
                }
            }

            if (p_161757_.nextInt(3) > 0) {
                BlockPos blockpos1 = p_161764_.east();
                if (Feature.isAir(p_161755_, blockpos1)) {
                    placeVine(p_161756_, blockpos1, DogwoodVineBlock.WEST);
                }
            }

            if (p_161757_.nextInt(3) > 0) {
                BlockPos blockpos2 = p_161764_.north();
                if (Feature.isAir(p_161755_, blockpos2)) {
                    placeVine(p_161756_, blockpos2, DogwoodVineBlock.SOUTH);
                }
            }

            if (p_161757_.nextInt(3) > 0) {
                BlockPos blockpos3 = p_161764_.south();
                if (Feature.isAir(p_161755_, blockpos3)) {
                    placeVine(p_161756_, blockpos3, DogwoodVineBlock.NORTH);
                }
            }

        });
    }

    static {
        CODEC = Codec.unit(() -> {
            return INSTANCE;
        });
    }
}