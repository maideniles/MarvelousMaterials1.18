package com.maideniles.maidensmaterials.blocks.tree;

import com.maideniles.maidensmaterials.init.ModBlocks;
import com.maideniles.maidensmaterials.init.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.Random;

public class GrowingFruitLeavesBlock extends BushBlock implements BonemealableBlock {
    public static final IntegerProperty AGE = BlockStateProperties.AGE_3;
    private static final VoxelShape FRUIT_LEAVES = Block.box(0, 0.0D, 0, 16.0D, 16.0D, 16.0D);

    public GrowingFruitLeavesBlock(Properties properties) {
        super(Properties.of(Material.LEAVES).noOcclusion().strength(2.5F).sound(SoundType.FLOWERING_AZALEA));
        this.registerDefaultState(this.getStateDefinition().any().setValue(AGE, Integer.valueOf(0)));

    }


    public ItemStack getCloneItemStack(BlockGetter p_57256_, BlockPos p_57257_, BlockState p_57258_) {
        return new ItemStack(Items.APPLE);
    }


    public VoxelShape getShape(BlockState p_57291_, BlockGetter p_57292_, BlockPos p_57293_, CollisionContext p_57294_) {

            return FRUIT_LEAVES;

    }

    public boolean isRandomlyTicking(BlockState p_57284_) {
        return p_57284_.getValue(AGE) < 3;
    }

    public void randomTick(BlockState p_57286_, ServerLevel p_57287_, BlockPos p_57288_, Random p_57289_) {
        int i = p_57286_.getValue(AGE);
        if (i < 3 && p_57287_.getRawBrightness(p_57288_.above(), 0) >= 9 && net.minecraftforge.common.ForgeHooks.onCropsGrowPre(p_57287_, p_57288_, p_57286_,p_57289_.nextInt(5) == 0)) {
            p_57287_.setBlock(p_57288_, p_57286_.setValue(AGE, Integer.valueOf(i + 1)), 2);
            net.minecraftforge.common.ForgeHooks.onCropsGrowPost(p_57287_, p_57288_, p_57286_);
        }

    }


    public InteractionResult use(BlockState state, Level p_57276_, BlockPos pos, Player p_57278_, InteractionHand p_57279_, BlockHitResult p_57280_) {
        int i = state.getValue(AGE);
        boolean flag = i == 3;
        if (!flag && p_57278_.getItemInHand(p_57279_).is(Items.BONE_MEAL)) {
            return InteractionResult.PASS;
        } else if (i > 1) {
            int j = 1 + p_57276_.random.nextInt(2);
            Block block = state.getBlock();
            if (block == ModBlocks.APPLE_LEAVES.get()) {
                popResource(p_57276_, pos, new ItemStack(Items.APPLE, j + (flag ? 1 : 0)));
                p_57276_.playSound((Player) null, pos, SoundEvents.SWEET_BERRY_BUSH_PICK_BERRIES, SoundSource.BLOCKS, 1.0F, 0.8F + p_57276_.random.nextFloat() * 0.4F);
                p_57276_.setBlock(pos, state.setValue(AGE, Integer.valueOf(1)), 2);
                return InteractionResult.sidedSuccess(p_57276_.isClientSide);
            }
            if (block == ModBlocks.CHERRY_LEAVES.get()) {
                popResource(p_57276_, pos, new ItemStack(ModItems.CHERRIES.get(), j + (flag ? 1 : 0)));
                p_57276_.playSound((Player) null, pos, SoundEvents.SWEET_BERRY_BUSH_PICK_BERRIES, SoundSource.BLOCKS, 1.0F, 0.8F + p_57276_.random.nextFloat() * 0.4F);
                p_57276_.setBlock(pos, state.setValue(AGE, Integer.valueOf(1)), 2);
                return InteractionResult.sidedSuccess(p_57276_.isClientSide);
            }

            if (block == ModBlocks.PEACH_LEAVES.get()) {
                popResource(p_57276_, pos, new ItemStack(ModItems.PEACH.get(), j + (flag ? 1 : 0)));
                p_57276_.playSound((Player) null, pos, SoundEvents.SWEET_BERRY_BUSH_PICK_BERRIES, SoundSource.BLOCKS, 1.0F, 0.8F + p_57276_.random.nextFloat() * 0.4F);
                p_57276_.setBlock(pos, state.setValue(AGE, Integer.valueOf(1)), 2);
                return InteractionResult.sidedSuccess(p_57276_.isClientSide);
            }

            if (block == ModBlocks.ORANGE_LEAVES.get()) {
                popResource(p_57276_, pos, new ItemStack(ModItems.GRAPEFRUIT.get(), j + (flag ? 1 : 0)));
                p_57276_.playSound((Player) null, pos, SoundEvents.SWEET_BERRY_BUSH_PICK_BERRIES, SoundSource.BLOCKS, 1.0F, 0.8F + p_57276_.random.nextFloat() * 0.4F);
                p_57276_.setBlock(pos, state.setValue(AGE, Integer.valueOf(1)), 2);
                return InteractionResult.sidedSuccess(p_57276_.isClientSide);
            }

            if (block == ModBlocks.GRAPEFRUIT_LEAVES.get()) {
                popResource(p_57276_, pos, new ItemStack(ModItems.ORANGE.get(), j + (flag ? 1 : 0)));
                p_57276_.playSound((Player) null, pos, SoundEvents.SWEET_BERRY_BUSH_PICK_BERRIES, SoundSource.BLOCKS, 1.0F, 0.8F + p_57276_.random.nextFloat() * 0.4F);
                p_57276_.setBlock(pos, state.setValue(AGE, Integer.valueOf(1)), 2);
                return InteractionResult.sidedSuccess(p_57276_.isClientSide);
            }

            if (block == ModBlocks.LEMON_LEAVES.get()) {
                popResource(p_57276_, pos, new ItemStack(ModItems.LEMON.get(), j + (flag ? 1 : 0)));
                p_57276_.playSound((Player) null, pos, SoundEvents.SWEET_BERRY_BUSH_PICK_BERRIES, SoundSource.BLOCKS, 1.0F, 0.8F + p_57276_.random.nextFloat() * 0.4F);
                p_57276_.setBlock(pos, state.setValue(AGE, Integer.valueOf(1)), 2);
                return InteractionResult.sidedSuccess(p_57276_.isClientSide);
            }
            if (block == ModBlocks.LIME_LEAVES.get()) {
                popResource(p_57276_, pos, new ItemStack(ModItems.LIME.get(), j + (flag ? 1 : 0)));
                p_57276_.playSound((Player) null, pos, SoundEvents.SWEET_BERRY_BUSH_PICK_BERRIES, SoundSource.BLOCKS, 1.0F, 0.8F + p_57276_.random.nextFloat() * 0.4F);
                p_57276_.setBlock(pos, state.setValue(AGE, Integer.valueOf(1)), 2);
                return InteractionResult.sidedSuccess(p_57276_.isClientSide);
            }

            if (block == ModBlocks.PEAR_LEAVES.get()) {
                popResource(p_57276_, pos, new ItemStack(ModItems.PEAR.get(), j + (flag ? 1 : 0)));
                p_57276_.playSound((Player) null, pos, SoundEvents.SWEET_BERRY_BUSH_PICK_BERRIES, SoundSource.BLOCKS, 1.0F, 0.8F + p_57276_.random.nextFloat() * 0.4F);
                p_57276_.setBlock(pos, state.setValue(AGE, Integer.valueOf(1)), 2);
                return InteractionResult.sidedSuccess(p_57276_.isClientSide);
            }

            if (block == ModBlocks.PLUM_LEAVES.get()) {
                popResource(p_57276_, pos, new ItemStack(ModItems.PLUM.get(), j + (flag ? 1 : 0)));
                p_57276_.playSound((Player) null, pos, SoundEvents.SWEET_BERRY_BUSH_PICK_BERRIES, SoundSource.BLOCKS, 1.0F, 0.8F + p_57276_.random.nextFloat() * 0.4F);
                p_57276_.setBlock(pos, state.setValue(AGE, Integer.valueOf(1)), 2);
                return InteractionResult.sidedSuccess(p_57276_.isClientSide);




            }

        }
        return super.use(state, p_57276_, pos, p_57278_, p_57279_, p_57280_);
    }
        protected void createBlockStateDefinition (StateDefinition.Builder < Block, BlockState > p_57282_){
            p_57282_.add(AGE);
        }

        public boolean isValidBonemealTarget (BlockGetter p_57260_, BlockPos p_57261_, BlockState p_57262_,
        boolean p_57263_){
            return p_57262_.getValue(AGE) < 3;
        }

        public boolean isBonemealSuccess (Level p_57265_, Random p_57266_, BlockPos p_57267_, BlockState p_57268_){
            return true;
        }

        public void performBonemeal (ServerLevel p_57251_, Random p_57252_, BlockPos p_57253_, BlockState p_57254_){
            int i = Math.min(3, p_57254_.getValue(AGE) + 1);
            p_57251_.setBlock(p_57253_, p_57254_.setValue(AGE, Integer.valueOf(i)), 2);
        }


        protected boolean mayPlaceOn (BlockState state, BlockGetter getter, BlockPos pos){
            Block block = state.getBlock();

            return state.is(BlockTags.DIRT) || state.is(Blocks.FARMLAND) || state.is(BlockTags.LEAVES) || state.is(BlockTags.LOGS)
                    || block == Blocks.AIR || block == this || block == Blocks.SAND || block == Blocks.PODZOL;
        }


    }


