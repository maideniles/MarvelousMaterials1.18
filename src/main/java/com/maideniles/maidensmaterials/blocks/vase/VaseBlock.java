package com.maideniles.maidensmaterials.blocks.vase;

import com.maideniles.maidensmaterials.init.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class VaseBlock extends Block {
    public static final IntegerProperty FLOWER = IntegerProperty.create("flower",0,9);
    protected static final VoxelShape SHAPE = Block.box(5.0D, 0.0D, 5.0D, 11.0D, 5.0D, 11.0D);

    public VaseBlock(Properties p_49795_) {
        super(p_49795_);
        this.registerDefaultState(this.stateDefinition.any().setValue(FLOWER, Integer.valueOf(0)));

    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(FLOWER);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter p_48946_, BlockPos p_48947_, CollisionContext p_48948_) {
        return SHAPE;
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand handIn, BlockHitResult pHit) {
        ItemStack deco = player.getItemInHand(handIn);
        boolean flag = false;
        if (!level.isClientSide() && state.getValue(FLOWER) ==0) {

//CRABAPPLE//
            if (deco.getItem() == ModItems.CRABAPPLE_BLOSSOMS.get()) {
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(FLOWER, 1));
                deco.shrink(1);
                flag=true;
            }

//POINCIANA//
            if (deco.getItem() == ModItems.POINCIANA_BLOSSOMS.get()) {
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(FLOWER, 2));

                deco.shrink(1);
                flag=true;
            }
//LABURNUM//
            if (deco.getItem() == ModItems.LABURNUM_BLOSSOMS.get()) {
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(FLOWER,3));
                deco.shrink(1);
                flag=true;
            }
//JADE//
            if (deco.getItem() == ModItems.JADE_BLOSSOMS.get()) {
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(FLOWER,4));
                deco.shrink(1);
                flag=true;
            }
//PAULOWNIA//
            if (deco.getItem() == ModItems.PAULOWNIA_BLOSSOMS.get()) {
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(FLOWER,5));
                deco.shrink(1);
                flag=true;
            }
//WISTERIA//
            if (deco.getItem() == ModItems.WISTERIA_BLOSSOMS.get()) {
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(FLOWER,6));

                deco.shrink(1);
                flag=true;
            }
//JACARANDA//
            if (deco.getItem() == ModItems.JACARANDA_BLOSSOMS.get()) {
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(FLOWER,7));
                deco.shrink(1);
                flag=true;
            }
//DOGWOOD//
            if (deco.getItem() == ModItems.DOGWOOD_BLOSSOMS.get()) {
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(FLOWER,8));
                deco.shrink(1);
                flag=true;
            }
//SILVERBELL//
            if (deco.getItem() == ModItems.SILVERBELL_BLOSSOMS.get()) {
                level.setBlockAndUpdate(pos, this.defaultBlockState().setValue(FLOWER,9));
                deco.shrink(1);
                flag=true;
            }

      }
        return InteractionResult.PASS;

    }


    @Override
    public void playerWillDestroy(Level level, BlockPos pos, BlockState state, Player player) {

        BlockState blockstate = level.getBlockState(pos);

        if (blockstate.getBlock() == this ) { level.destroyBlock(pos,true); }

        if(blockstate.getValue(FLOWER) == 1){popResource(level, pos, new ItemStack(ModItems.CRABAPPLE_BLOSSOMS.get()));}
        if(blockstate.getValue(FLOWER) == 2){popResource(level, pos, new ItemStack(ModItems.POINCIANA_BLOSSOMS.get()));}
        if(blockstate.getValue(FLOWER) == 3){popResource(level, pos, new ItemStack(ModItems.LABURNUM_BLOSSOMS.get()));}
        if(blockstate.getValue(FLOWER) == 4){popResource(level, pos, new ItemStack(ModItems.JADE_BLOSSOMS.get()));}
        if(blockstate.getValue(FLOWER) == 5){popResource(level, pos, new ItemStack(ModItems.PAULOWNIA_BLOSSOMS.get()));}
        if(blockstate.getValue(FLOWER) == 6){popResource(level, pos, new ItemStack(ModItems.WISTERIA_BLOSSOMS.get()));}
        if(blockstate.getValue(FLOWER) == 7){popResource(level, pos, new ItemStack(ModItems.JACARANDA_BLOSSOMS.get()));}
        if(blockstate.getValue(FLOWER) == 8){popResource(level, pos, new ItemStack(ModItems.DOGWOOD_BLOSSOMS.get()));}
        if(blockstate.getValue(FLOWER) == 9){popResource(level, pos, new ItemStack(ModItems.SILVERBELL_BLOSSOMS.get()));}

    }


}
