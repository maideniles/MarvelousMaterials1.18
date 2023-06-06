package com.maideniles.maidensmaterials.world.gen.feature.tree;


import com.maideniles.maidensmaterials.init.ModBlocks;
import com.mojang.serialization.Codec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CocoaBlock;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;

import java.util.Random;

public class PalmTreeFeature extends Feature<TreeConfiguration> {


    private final int maxHeight = 20;


    public PalmTreeFeature(Codec<TreeConfiguration> p_67201_) {
        super(p_67201_);
    }




    public static boolean isDirt(BlockState p_159760_) {
        return p_159760_.is(BlockTags.DIRT);
    }

    @Override
    public boolean place(FeaturePlaceContext<TreeConfiguration> context) {
        BlockPos position = context.origin();
        BlockState state = context.level().getBlockState(position);
        Random rand = new Random();



        BlockPos.MutableBlockPos myMutableBlockPos = new BlockPos.MutableBlockPos().move(Direction.DOWN);

        // check if block underneath is viable, if not, don't gen tree//
        if (!context.level().getBlockState(position.below()).is(BlockTags.DIRT)) {
            return false;
        } else {

            int seg1Height = inclusiveBoundedRandom(rand, 1, 9),
                    seg2Height = inclusiveBoundedRandom(rand, 1, 4),
                    seg3Height = inclusiveBoundedRandom(rand, 1, 7);
            int height = 0;




            //Segment 1
            for(int i = 0;  i < seg1Height && height < maxHeight; i++, height++)
                this.setBlock(context.level(), myMutableBlockPos.move(Direction.UP), Blocks.JUNGLE_LOG.defaultBlockState());

//store random direction in this variable//
            Direction newDir = Direction.Plane.HORIZONTAL.getRandomDirection(rand);

            //offset by that variable direction here//
            myMutableBlockPos.move(newDir);


            //Segment 2
            for(int i = 0;  i < seg2Height && height < maxHeight; i++, height++)
                this.setBlock(context.level(), myMutableBlockPos.move(Direction.UP), Blocks.JUNGLE_LOG.defaultBlockState());

            //check to see if the tree is at max height before moving forward//
            if(height < maxHeight) {

                //offset again by the same variable direction here//
                myMutableBlockPos.move(newDir);

                //Segment 3
                for (int i = 0; i < seg3Height && height < maxHeight; i++, height++)
                    this.setBlock(context.level(), myMutableBlockPos.move(Direction.UP), Blocks.JUNGLE_LOG.defaultBlockState());

                //set log cross for top of tree
                context.level().setBlock(myMutableBlockPos.offset(1,0,0), Blocks.JUNGLE_LOG.defaultBlockState().setValue(RotatedPillarBlock.AXIS, Direction.Axis.X), 3);
                context.level().setBlock(myMutableBlockPos.offset(0,0,1), Blocks.JUNGLE_LOG.defaultBlockState().setValue(RotatedPillarBlock.AXIS, Direction.Axis.Z), 3);
                context.level().setBlock(myMutableBlockPos.offset(-1,0,0), Blocks.JUNGLE_LOG.defaultBlockState().setValue(RotatedPillarBlock.AXIS, Direction.Axis.X), 3);
                context.level().setBlock(myMutableBlockPos.offset(0,0,-1), Blocks.JUNGLE_LOG.defaultBlockState().setValue(RotatedPillarBlock.AXIS, Direction.Axis.Z), 3);

                //place coconuts under log cross
                if(rand.nextInt(3) == 0) {

                    context.level().setBlock(myMutableBlockPos.offset(1, -1, 0), Blocks.COCOA.defaultBlockState().setValue(CocoaBlock.AGE, Integer.valueOf(rand.nextInt(3))), 3);
                }

                if(rand.nextInt(3) == 0) {
                    context.level().setBlock(myMutableBlockPos.offset(0, -1, 1), Blocks.COCOA.defaultBlockState().setValue(CocoaBlock.AGE, Integer.valueOf(rand.nextInt(3))), 3);
                }


                if(rand.nextInt(3) == 0) {
                    context.level().setBlock(myMutableBlockPos.offset(-1, -1, 0), Blocks.COCOA.defaultBlockState().setValue(CocoaBlock.AGE, Integer.valueOf(rand.nextInt(3))), 3);
                }


                if(rand.nextInt(3) == 0) {
                    context.level().setBlock(myMutableBlockPos.offset(0, -1, -1), Blocks.COCOA.defaultBlockState().setValue(CocoaBlock.AGE, Integer.valueOf(rand.nextInt(3))), 3);
                }

                //place leaves

                context.level().setBlock(myMutableBlockPos.offset(0,1,0), ModBlocks.PALM_LEAVES.get().defaultBlockState(), 3);

                context.level().setBlock(myMutableBlockPos.offset(5,-3,0), ModBlocks.PALM_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT,true), 3);  //trim
                context.level().setBlock(myMutableBlockPos.offset(0,-3,-5), ModBlocks.PALM_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT,true), 3);
                context.level().setBlock(myMutableBlockPos.offset(-5,-3,0), ModBlocks.PALM_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT,true), 3);
                context.level().setBlock(myMutableBlockPos.offset(0,-3,5), ModBlocks.PALM_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT,true), 3);

                context.level().setBlock(myMutableBlockPos.offset(3,-2,3), ModBlocks.PALM_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT,true), 3);  //trim
                context.level().setBlock(myMutableBlockPos.offset(3,-2,-3), ModBlocks.PALM_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT,true), 3);
                context.level().setBlock(myMutableBlockPos.offset(-3,-2,3), ModBlocks.PALM_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT,true), 3);
                context.level().setBlock(myMutableBlockPos.offset(-3,-2,-3), ModBlocks.PALM_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT,true), 3);

                context.level().setBlock(myMutableBlockPos.offset(5,-2,0), ModBlocks.PALM_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT,true), 3);
                context.level().setBlock(myMutableBlockPos.offset(0,-2,-5), ModBlocks.PALM_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT,true), 3);
                context.level().setBlock(myMutableBlockPos.offset(-5,-2,0), ModBlocks.PALM_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT,true), 3);
                context.level().setBlock(myMutableBlockPos.offset(0,-2,5), ModBlocks.PALM_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT,true), 3);

                context.level().setBlock(myMutableBlockPos.offset(3,-1,3), ModBlocks.PALM_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT,true), 3);  //trim
                context.level().setBlock(myMutableBlockPos.offset(3,-1,-3), ModBlocks.PALM_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT,true), 3);
                context.level().setBlock(myMutableBlockPos.offset(-3,-1,3), ModBlocks.PALM_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT,true), 3);
                context.level().setBlock(myMutableBlockPos.offset(-3,-1,-3), ModBlocks.PALM_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT,true), 3);


                context.level().setBlock(myMutableBlockPos.offset(1,-1,1), ModBlocks.PALM_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT,true), 3);
                context.level().setBlock(myMutableBlockPos.offset(1,-1,-1), ModBlocks.PALM_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT,true), 3);
                context.level().setBlock(myMutableBlockPos.offset(-1,-1,1), ModBlocks.PALM_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT,true), 3);
                context.level().setBlock(myMutableBlockPos.offset(-1,-1,-1), ModBlocks.PALM_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT,true), 3);

                context.level().setBlock(myMutableBlockPos.offset(4,-1,0), ModBlocks.PALM_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT,true), 3);
                context.level().setBlock(myMutableBlockPos.offset(0,-1,-4), ModBlocks.PALM_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT,true), 3);
                context.level().setBlock(myMutableBlockPos.offset(-4,-1,0), ModBlocks.PALM_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT,true), 3);
                context.level().setBlock(myMutableBlockPos.offset(0,-1,4), ModBlocks.PALM_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT,true), 3);



                context.level().setBlock(myMutableBlockPos.offset(4,0,0), ModBlocks.PALM_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT,true), 3);
                context.level().setBlock(myMutableBlockPos.offset(0,0,-4), ModBlocks.PALM_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT,true), 3);
                context.level().setBlock(myMutableBlockPos.offset(-4,0,0), ModBlocks.PALM_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT,true), 3);
                context.level().setBlock(myMutableBlockPos.offset(0,0,4), ModBlocks.PALM_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT,true), 3);

                context.level().setBlock(myMutableBlockPos.offset(1,0,1), ModBlocks.PALM_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT,true), 3);
                context.level().setBlock(myMutableBlockPos.offset(1,0,-1), ModBlocks.PALM_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT,true), 3);
                context.level().setBlock(myMutableBlockPos.offset(-1,0,1), ModBlocks.PALM_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT,true), 3);
                context.level().setBlock(myMutableBlockPos.offset(-1,0,-1), ModBlocks.PALM_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT,true), 3);

                context.level().setBlock(myMutableBlockPos.offset(2,0,0), ModBlocks.PALM_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT,true), 3);
                context.level().setBlock(myMutableBlockPos.offset(0,0,-2), ModBlocks.PALM_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT,true), 3);
                context.level().setBlock(myMutableBlockPos.offset(-2,0,0), ModBlocks.PALM_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT,true), 3);
                context.level().setBlock(myMutableBlockPos.offset(0,0,2), ModBlocks.PALM_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT,true), 3);

                context.level().setBlock(myMutableBlockPos.offset(3,1,0), ModBlocks.PALM_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT,true), 3);
                context.level().setBlock(myMutableBlockPos.offset(0,1,-3), ModBlocks.PALM_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT,true), 3);
                context.level().setBlock(myMutableBlockPos.offset(-3,1,0), ModBlocks.PALM_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT,true), 3);
                context.level().setBlock(myMutableBlockPos.offset(0,1,3), ModBlocks.PALM_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT,true), 3);

                context.level().setBlock(myMutableBlockPos.offset(1,1,0), ModBlocks.PALM_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT,true), 3);
                context.level().setBlock(myMutableBlockPos.offset(0,1,1), ModBlocks.PALM_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT,true), 3);
                context.level().setBlock(myMutableBlockPos.offset(-1,1,0), ModBlocks.PALM_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT,true), 3);
                context.level().setBlock(myMutableBlockPos.offset(0,1,-1), ModBlocks.PALM_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT,true), 3);

                context.level().setBlock(myMutableBlockPos.offset(1,1,1), ModBlocks.PALM_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT,true), 3);
                context.level().setBlock(myMutableBlockPos.offset(1,1,-1), ModBlocks.PALM_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT,true), 3);
                context.level().setBlock(myMutableBlockPos.offset(-1,1,1), ModBlocks.PALM_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT,true), 3);
                context.level().setBlock(myMutableBlockPos.offset(-1,1,-1), ModBlocks.PALM_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT,true), 3);

                context.level().setBlock(myMutableBlockPos.offset(2,1,0), ModBlocks.PALM_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT,true), 3);
                context.level().setBlock(myMutableBlockPos.offset(0,1,-2), ModBlocks.PALM_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT,true), 3);
                context.level().setBlock(myMutableBlockPos.offset(-2,1,0), ModBlocks.PALM_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT,true), 3);
                context.level().setBlock(myMutableBlockPos.offset(0,1,2), ModBlocks.PALM_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT,true), 3);

                context.level().setBlock(myMutableBlockPos.offset(2,1,2), ModBlocks.PALM_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT,true), 3);
                context.level().setBlock(myMutableBlockPos.offset(2,1,-2), ModBlocks.PALM_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT,true), 3);
                context.level().setBlock(myMutableBlockPos.offset(-2,1,2), ModBlocks.PALM_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT,true), 3);
                context.level().setBlock(myMutableBlockPos.offset(-2,1,-2), ModBlocks.PALM_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT,true), 3);


                context.level().setBlock(myMutableBlockPos.offset(1,2,1), ModBlocks.PALM_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT,true), 3);
                context.level().setBlock(myMutableBlockPos.offset(1,2,-1), ModBlocks.PALM_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT,true), 3);
                context.level().setBlock(myMutableBlockPos.offset(-1,2,1), ModBlocks.PALM_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT,true), 3);
                context.level().setBlock(myMutableBlockPos.offset(-1,2,-1), ModBlocks.PALM_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT,true), 3);


                context.level().setBlock(myMutableBlockPos.offset(2,0,2), ModBlocks.PALM_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT,true), 3);
                context.level().setBlock(myMutableBlockPos.offset(2,0,-2), ModBlocks.PALM_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT,true), 3);
                context.level().setBlock(myMutableBlockPos.offset(-2,0,2), ModBlocks.PALM_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT,true), 3);
                context.level().setBlock(myMutableBlockPos.offset(-2,0,-2), ModBlocks.PALM_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT,true), 3);

                context.level().setBlock(myMutableBlockPos.offset(0,2,0), ModBlocks.PALM_LEAVES.get().defaultBlockState().setValue(LeavesBlock.PERSISTENT,true), 3);

            }
        }
        return true;
    }






    private static int inclusiveBoundedRandom(Random random, int min, int max) {
        return min + random.nextInt(max-min);
    }

 /*   private boolean checkBlockUnderneath (BlockPos pos, IWorldGenerationReader worldIn, BaseTreeFeatureConfig config)
    {
        // check if it's dirt underneath (or sand, for this tree)
        if ((isDirtAt(worldIn, pos.down()) || worldIn.hasBlockState(pos.down(), (state) -> state.isIn(BlockTags.SAND)))) {
            // I don't want to set sand to dirt
            if (isDirtAt(worldIn, pos.down())) {
                this.setBlock(context.level()In, pos.down(),Blocks.DIRT.defaultBlockState());
            }
            return true;
        } else {
            return false;
        }
    }
*/
}