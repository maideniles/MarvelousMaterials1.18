package com.maideniles.maidensmaterials.world.gen.feature.tree.decorator.leaf;


import com.maideniles.maidensmaterials.blocks.tree.vine.WisteriaVineBlock;
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

public class WisteriaLeafVineDecorator extends TreeDecorator {

    public static final Codec<WisteriaLeafVineDecorator> CODEC;
    public static final WisteriaLeafVineDecorator INSTANCE = new WisteriaLeafVineDecorator();
    public WisteriaLeafVineDecorator() {

    }

    @Override
    protected TreeDecoratorType<?> type() {
        return ModTreeDecoratorTypes.WISTERIA_LEAF_VINE.get();
    }





    public void place(LevelSimulatedReader p_161735_, BiConsumer<BlockPos, BlockState> p_161736_, Random p_161737_, List<BlockPos> blockPos, List<BlockPos> p_161739_) {
        p_161739_.forEach((p_161744_) -> {


            if (p_161737_.nextInt(4) == 0) {
                BlockPos blockpos = p_161744_.west();
                if (Feature.isAir(p_161735_, blockpos)) {
                    addHangingVine(p_161735_, blockpos, WisteriaVineBlock.EAST, p_161736_);
                }
            }

            if (p_161737_.nextInt(4) == 0) {
                BlockPos blockpos1 = p_161744_.east();
                if (Feature.isAir(p_161735_, blockpos1)) {
                    addHangingVine(p_161735_, blockpos1, WisteriaVineBlock.WEST, p_161736_);
                }
            }

            if (p_161737_.nextInt(4) == 0) {
                BlockPos blockpos2 = p_161744_.north();
                if (Feature.isAir(p_161735_, blockpos2)) {
                    addHangingVine(p_161735_, blockpos2, WisteriaVineBlock.SOUTH, p_161736_);
                }
            }

            if (p_161737_.nextInt(4) == 0) {
                BlockPos blockpos3 = p_161744_.south();
                if (Feature.isAir(p_161735_, blockpos3)) {
                    addHangingVine(p_161735_, blockpos3, WisteriaVineBlock.NORTH, p_161736_);
                }
            }

        });
    }


    protected static void placeVine(BiConsumer<BlockPos, BlockState> p_161751_, BlockPos p_161752_, BooleanProperty p_161753_) {


        p_161751_.accept(p_161752_, ModBlocks.WISTERIA_VINE.get().defaultBlockState().setValue(p_161753_, Boolean.valueOf(true)));
    }


    private static void addHangingVine(LevelSimulatedReader p_161730_, BlockPos p_161731_, BooleanProperty p_161732_, BiConsumer<BlockPos, BlockState> p_161733_) {
        placeVine(p_161733_, p_161731_, p_161732_);
        int i = 4;

        for(BlockPos blockpos = p_161731_.below(); Feature.isAir(p_161730_, blockpos) && i > 0; --i) {
            placeVine(p_161733_, blockpos, p_161732_);
            blockpos = blockpos.below();
        }

    }

    static {
        CODEC = Codec.unit(() -> {
            return INSTANCE;
        });
    }
}
