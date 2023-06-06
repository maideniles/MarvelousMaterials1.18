package com.maideniles.maidensmaterials.blocks.tree;

import com.maideniles.maidensmaterials.init.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.registries.RegistryObject;

public class MaidensLeafBlock extends LeavesBlock {

    private final RegistryObject<Item> blossom;
    public MaidensLeafBlock(Properties properties, RegistryObject<Item> blossom) {
        super(Properties.of(Material.LEAVES).noOcclusion().strength(2.5F).sound(SoundType.FLOWERING_AZALEA));
        this.blossom = blossom;
    }

    public RegistryObject<Item> getBlossom() {
        return this.blossom;
    }

    private static final VoxelShape SHAPE = Block.box(0, 0, 0, 16, 16.0, 16);


    public static VoxelShape getSHAPE() {
        return SHAPE;
    }

    public InteractionResult use(BlockState state, Level p_57276_, BlockPos p_57277_, Player p_57278_, InteractionHand p_57279_, BlockHitResult p_57280_) {

        Block leaves = state.getBlock();
        ItemStack shears = p_57278_.getItemInHand(p_57279_);

        if (shears.is(ModItems.PRUNING_SHEARS.get())) {

            shears.setDamageValue(1);
                popResource(p_57276_, p_57277_, new ItemStack(this.getBlossom().get(), 1));
                p_57276_.playSound((Player)null, p_57277_, SoundEvents.AZALEA_HIT, SoundSource.BLOCKS, 1.0F, 0.8F + p_57276_.random.nextFloat() * 0.4F);



                if (RANDOM.nextInt(100) < 5){
                 popResource(p_57276_, p_57277_, new ItemStack(ModItems.FLORAL_ESSENCE.get(), 1));
             }

                return InteractionResult.sidedSuccess(p_57276_.isClientSide);
            }


         else {
            return super.use(state, p_57276_, p_57277_, p_57278_, p_57279_, p_57280_);
        }
    }













}

