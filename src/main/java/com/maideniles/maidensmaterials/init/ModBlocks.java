package com.maideniles.maidensmaterials.init;


import com.maideniles.maidensmaterials.MarvelousMaterials;
import com.maideniles.maidensmaterials.blocks.tree.GrowingFruitLeavesBlock;
import com.maideniles.maidensmaterials.blocks.tree.MaidenSaplingBlock;
import com.maideniles.maidensmaterials.blocks.tree.MaidensLeafBlock;
import com.maideniles.maidensmaterials.blocks.tree.vine.CrabappleVineBlock;
import com.maideniles.maidensmaterials.blocks.tree.vine.PoincianaVineBlock;
import com.maideniles.maidensmaterials.blocks.vase.VaseBlock;
import com.maideniles.maidensmaterials.world.gen.feature.tree.grower.*;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, MarvelousMaterials.MOD_ID);


    public static final RegistryObject<Block> CRABAPPLE_LOG = registerBlock("crabapple_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.0F).randomTicks().sound(SoundType.WOOD)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> POINCIANA_LOG = registerBlock("poinciana_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.0F).randomTicks().sound(SoundType.WOOD)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LABURNUM_LOG = registerBlock("laburnum_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.0F).randomTicks().sound(SoundType.WOOD)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JADE_LOG = registerBlock("jade_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.0F).randomTicks().sound(SoundType.WOOD)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PAULOWNIA_LOG = registerBlock("paulownia_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.0F).randomTicks().sound(SoundType.WOOD)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WISTERIA_LOG = registerBlock("wisteria_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.0F).randomTicks().sound(SoundType.WOOD)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JACARANDA_LOG = registerBlock("jacaranda_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.0F).randomTicks().sound(SoundType.WOOD)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> DOGWOOD_LOG = registerBlock("dogwood_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.0F).randomTicks().sound(SoundType.WOOD)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SILVERBELL_LOG = registerBlock("silverbell_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.0F).randomTicks().sound(SoundType.WOOD)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CEDAR_LOG = registerBlock("cedar_log",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(2F)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PALM_LOG = registerBlock("palm_log",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(2F)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    //FOREST SAPLINGS//
    public static final RegistryObject<Block> CRABAPPLE_SAPLING = registerBlock("crabapple_sapling",
            () -> new MaidenSaplingBlock(new CrabappleTreeGrower(),BlockBehaviour.Properties.of(Material.PLANT).strength(2.0F).noOcclusion().instabreak().noCollission().sound(SoundType.CROP)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> POINCIANA_SAPLING = registerBlock("poinciana_sapling",
            () -> new MaidenSaplingBlock(new PoincianaTreeGrower(),BlockBehaviour.Properties.of(Material.PLANT).strength(2.0F).noOcclusion().instabreak().noCollission().sound(SoundType.CROP)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LABURNUM_SAPLING = registerBlock("laburnum_sapling",
            () -> new MaidenSaplingBlock(new LaburnumTreeGrower(),BlockBehaviour.Properties.of(Material.PLANT).strength(2.0F).noOcclusion().instabreak().noCollission().sound(SoundType.CROP)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JADE_SAPLING = registerBlock("jade_sapling",
            () -> new MaidenSaplingBlock(new JadeTreeGrower(),BlockBehaviour.Properties.of(Material.PLANT).strength(2.0F).noOcclusion().instabreak().noCollission().sound(SoundType.CROP)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PAULOWNIA_SAPLING = registerBlock("paulownia_sapling",
            () -> new MaidenSaplingBlock(new PaulowniaTreeGrower(),BlockBehaviour.Properties.of(Material.PLANT).strength(2.0F).noOcclusion().instabreak().noCollission().sound(SoundType.CROP)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WISTERIA_SAPLING = registerBlock("wisteria_sapling",
            () -> new MaidenSaplingBlock(new WisteriaTreeGrower(),BlockBehaviour.Properties.of(Material.PLANT).strength(2.0F).noOcclusion().instabreak().noCollission().sound(SoundType.CROP)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JACARANDA_SAPLING = registerBlock("jacaranda_sapling",
            () -> new MaidenSaplingBlock(new JacarandaTreeGrower(),BlockBehaviour.Properties.of(Material.PLANT).strength(2.0F).noOcclusion().instabreak().noCollission().sound(SoundType.CROP)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> DOGWOOD_SAPLING = registerBlock("dogwood_sapling",
            () -> new MaidenSaplingBlock(new DogwoodTreeGrower(),BlockBehaviour.Properties.of(Material.PLANT).strength(2.0F).noOcclusion().instabreak().noCollission().sound(SoundType.CROP)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SILVERBELL_SAPLING = registerBlock("silverbell_sapling",
            () -> new MaidenSaplingBlock(new SilverbellTreeGrower(),BlockBehaviour.Properties.of(Material.PLANT).strength(2.0F).noOcclusion().instabreak().noCollission().sound(SoundType.CROP)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PALM_SAPLING = registerBlock("palm_sapling",
            () -> new MaidenSaplingBlock(new PalmTreeGrower(),BlockBehaviour.Properties.of(Material.PLANT).strength(2.0F).noOcclusion().instabreak().noCollission().sound(SoundType.CROP)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CEDAR_SAPLING = registerBlock("cedar_sapling",
            () -> new MaidenSaplingBlock(new CedarTreeGrower(),BlockBehaviour.Properties.of(Material.PLANT).strength(2.0F).noOcclusion().instabreak().noCollission().sound(SoundType.CROP)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);




    public static final RegistryObject<Block> CRABAPPLE_LEAVES = registerBlock("crabapple_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.of(Material.LEAVES).strength(0.2F).randomTicks().sound(SoundType.GRASS).noOcclusion()),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> POINCIANA_LEAVES = registerBlock("poinciana_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.of(Material.LEAVES).strength(0.2F).randomTicks().sound(SoundType.GRASS).noOcclusion()),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LABURNUM_LEAVES = registerBlock("laburnum_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.of(Material.LEAVES).strength(0.2F).randomTicks().sound(SoundType.GRASS).noOcclusion()),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JADE_LEAVES = registerBlock("jade_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.of(Material.LEAVES).strength(0.2F).randomTicks().sound(SoundType.GRASS).noOcclusion()),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PAULOWNIA_LEAVES = registerBlock("paulownia_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.of(Material.LEAVES).strength(0.2F).randomTicks().sound(SoundType.GRASS).noOcclusion()),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WISTERIA_LEAVES = registerBlock("wisteria_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.of(Material.LEAVES).strength(0.2F).randomTicks().sound(SoundType.GRASS).noOcclusion()),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JACARANDA_LEAVES = registerBlock("jacaranda_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.of(Material.LEAVES).strength(0.2F).randomTicks().sound(SoundType.GRASS).noOcclusion()),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> DOGWOOD_LEAVES = registerBlock("dogwood_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.of(Material.LEAVES).strength(0.2F).randomTicks().sound(SoundType.GRASS).noOcclusion()),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SILVERBELL_LEAVES = registerBlock("silverbell_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.of(Material.LEAVES).strength(0.2F).randomTicks().sound(SoundType.GRASS).noOcclusion()),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CEDAR_LEAVES = registerBlock("cedar_leaves",
            () -> new Block(BlockBehaviour.Properties.of(Material.LEAVES).strength(2F).noOcclusion()),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PALM_LEAVES = registerBlock("palm_leaves",
            () -> new Block(BlockBehaviour.Properties.of(Material.LEAVES).strength(2F).noOcclusion()),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);


    //FRUIT LEAVES//
    public static final RegistryObject<Block> GROWING_APPLE_LEAVES = registerBlock("growing_apple_leaves",
            () -> new GrowingFruitLeavesBlock(BlockBehaviour.Properties.of(Material.LEAVES).strength(2F).noOcclusion()));

    public static final RegistryObject<Block> GROWING_CHERRY_LEAVES = registerBlock("growing_cherry_leaves",
            () -> new GrowingFruitLeavesBlock(BlockBehaviour.Properties.of(Material.LEAVES).strength(2F).noOcclusion()));

    public static final RegistryObject<Block> GROWING_PEACH_LEAVES = registerBlock("growing_peach_leaves",
            () -> new GrowingFruitLeavesBlock(BlockBehaviour.Properties.of(Material.LEAVES).strength(2F).noOcclusion()));

    public static final RegistryObject<Block> GROWING_ORANGE_LEAVES = registerBlock("growing_orange_leaves",
            () -> new GrowingFruitLeavesBlock(BlockBehaviour.Properties.of(Material.LEAVES).strength(2F).noOcclusion()));

    public static final RegistryObject<Block> GROWING_GRAPEFRUIT_LEAVES = registerBlock("growing_grapefruit_leaves",
            () -> new GrowingFruitLeavesBlock(BlockBehaviour.Properties.of(Material.LEAVES).strength(2F).noOcclusion()));

    public static final RegistryObject<Block> GROWING_LEMON_LEAVES = registerBlock("growing_lemon_leaves",
            () -> new GrowingFruitLeavesBlock(BlockBehaviour.Properties.of(Material.LEAVES).strength(2F).noOcclusion()));

    public static final RegistryObject<Block> GROWING_LIME_LEAVES = registerBlock("growing_lime_leaves",
            () -> new GrowingFruitLeavesBlock(BlockBehaviour.Properties.of(Material.LEAVES).strength(2F).noOcclusion()));

    public static final RegistryObject<Block> GROWING_PEAR_LEAVES = registerBlock("growing_pear_leaves",
            () -> new GrowingFruitLeavesBlock(BlockBehaviour.Properties.of(Material.LEAVES).strength(2F).noOcclusion()));

    public static final RegistryObject<Block> GROWING_PLUM_LEAVES = registerBlock("growing_plum_leaves",
            () -> new GrowingFruitLeavesBlock(BlockBehaviour.Properties.of(Material.LEAVES).strength(2F).noOcclusion()));

    //ORCHARD LEAVES- NO FRUIT//
    public static final RegistryObject<Block> APPLE_LEAVES = registerBlock("apple_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.of(Material.LEAVES).strength(2F).noOcclusion()));

    public static final RegistryObject<Block> CHERRY_LEAVES = registerBlock("cherry_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.of(Material.LEAVES).strength(2F).noOcclusion()));

    public static final RegistryObject<Block> PEACH_LEAVES = registerBlock("peach_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.of(Material.LEAVES).strength(2F).noOcclusion()));

    public static final RegistryObject<Block> ORANGE_LEAVES = registerBlock("orange_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.of(Material.LEAVES).strength(2F).noOcclusion()));

    public static final RegistryObject<Block> GRAPEFRUIT_LEAVES = registerBlock("grapefruit_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.of(Material.LEAVES).strength(2F).noOcclusion()));

    public static final RegistryObject<Block> LEMON_LEAVES = registerBlock("lemon_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.of(Material.LEAVES).strength(2F).noOcclusion()));

    public static final RegistryObject<Block> LIME_LEAVES = registerBlock("lime_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.of(Material.LEAVES).strength(2F).noOcclusion()));

    public static final RegistryObject<Block> PEAR_LEAVES = registerBlock("pear_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.of(Material.LEAVES).strength(2F).noOcclusion()));

    public static final RegistryObject<Block> PLUM_LEAVES = registerBlock("plum_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.of(Material.LEAVES).strength(2F).noOcclusion()));

    //VINES-FLOWERING//
    public static final RegistryObject<Block> CRABAPPLE_VINE = registerBlock("crabapple_vine",
            () -> new CrabappleVineBlock(BlockBehaviour.Properties.of(Material.PLANT).strength(2F).noOcclusion()),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> POINCIANA_VINE = registerBlock("poinciana_vine",
            () -> new PoincianaVineBlock(BlockBehaviour.Properties.of(Material.PLANT).strength(2F).noOcclusion()),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LABURNUM_VINE = registerBlock("laburnum_vine",
            () -> new VineBlock(BlockBehaviour.Properties.of(Material.PLANT).strength(2F).noOcclusion()),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PAULOWNIA_VINE = registerBlock("paulownia_vine",
            () -> new VineBlock(BlockBehaviour.Properties.of(Material.PLANT).strength(2F).noOcclusion()),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WISTERIA_VINE = registerBlock("wisteria_vine",
            () -> new VineBlock(BlockBehaviour.Properties.of(Material.PLANT).strength(2F).noOcclusion()),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JACARANDA_VINE = registerBlock("jacaranda_vine",
            () -> new VineBlock(BlockBehaviour.Properties.of(Material.PLANT).strength(2F).noOcclusion()),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> DOGWOOD_VINE = registerBlock("dogwood_vine",
            () -> new VineBlock(BlockBehaviour.Properties.of(Material.PLANT).strength(2F).noOcclusion()),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SILVERBELL_VINE = registerBlock("silverbell_vine",
            () -> new VineBlock(BlockBehaviour.Properties.of(Material.PLANT).strength(2F).noOcclusion()),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JADE_VINE = registerBlock("jade_vine",
            () -> new VineBlock(BlockBehaviour.Properties.of(Material.PLANT).strength(2F).noOcclusion()),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CEDAR_VINE = registerBlock("cedar_vine",
            () -> new VineBlock(BlockBehaviour.Properties.of(Material.PLANT).strength(2F).noOcclusion()),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);


    public static final RegistryObject<Block> RED_CLAY_BLOCK = registerBlock("red_clay_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ORANGE_CLAY_BLOCK = registerBlock("orange_clay_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> YELLOW_CLAY_BLOCK = registerBlock("yellow_clay_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LIME_CLAY_BLOCK = registerBlock("lime_clay_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> GREEN_CLAY_BLOCK = registerBlock("green_clay_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CYAN_CLAY_BLOCK = registerBlock("cyan_clay_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LIGHT_BLUE_CLAY_BLOCK = registerBlock("light_blue_clay_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BLUE_CLAY_BLOCK = registerBlock("blue_clay_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PURPLE_CLAY_BLOCK = registerBlock("purple_clay_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MAGENTA_CLAY_BLOCK = registerBlock("magenta_clay_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PINK_CLAY_BLOCK = registerBlock("pink_clay_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WHITE_CLAY_BLOCK = registerBlock("white_clay_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LIGHT_GRAY_CLAY_BLOCK = registerBlock("light_gray_clay_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> GRAY_CLAY_BLOCK = registerBlock("gray_clay_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BLACK_CLAY_BLOCK = registerBlock("black_clay_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BROWN_CLAY_BLOCK = registerBlock("brown_clay_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);





    //COLORED BRICK BLOCKS//
    public static final RegistryObject<Block> RED_BRICK_BLOCK = registerBlock("red_brick_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ORANGE_BRICK_BLOCK = registerBlock("orange_brick_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> YELLOW_BRICK_BLOCK = registerBlock("yellow_brick_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LIME_BRICK_BLOCK = registerBlock("lime_brick_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> GREEN_BRICK_BLOCK = registerBlock("green_brick_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CYAN_BRICK_BLOCK = registerBlock("cyan_brick_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LIGHT_BLUE_BRICK_BLOCK = registerBlock("light_blue_brick_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BLUE_BRICK_BLOCK = registerBlock("blue_brick_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PURPLE_BRICK_BLOCK = registerBlock("purple_brick_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MAGENTA_BRICK_BLOCK = registerBlock("magenta_brick_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PINK_BRICK_BLOCK = registerBlock("pink_brick_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WHITE_BRICK_BLOCK = registerBlock("white_brick_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LIGHT_GRAY_BRICK_BLOCK = registerBlock("light_gray_brick_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> GRAY_BRICK_BLOCK = registerBlock("gray_brick_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BLACK_BRICK_BLOCK = registerBlock("black_brick_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BROWN_BRICK_BLOCK = registerBlock("brown_brick_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    //LARGE BRICK BLOCKS//
    public static final RegistryObject<Block> RED_LARGE_BRICK_BLOCK = registerBlock("red_large_brick_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ORANGE_LARGE_BRICK_BLOCK = registerBlock("orange_large_brick_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> YELLOW_LARGE_BRICK_BLOCK = registerBlock("yellow_large_brick_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LIME_LARGE_BRICK_BLOCK = registerBlock("lime_large_brick_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> GREEN_LARGE_BRICK_BLOCK = registerBlock("green_large_brick_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CYAN_LARGE_BRICK_BLOCK = registerBlock("cyan_large_brick_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LIGHT_BLUE_LARGE_BRICK_BLOCK = registerBlock("light_blue_large_brick_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BLUE_LARGE_BRICK_BLOCK = registerBlock("blue_large_brick_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PURPLE_LARGE_BRICK_BLOCK = registerBlock("purple_large_brick_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MAGENTA_LARGE_BRICK_BLOCK = registerBlock("magenta_large_brick_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PINK_LARGE_BRICK_BLOCK = registerBlock("pink_large_brick_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WHITE_LARGE_BRICK_BLOCK = registerBlock("white_large_brick_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LIGHT_GRAY_LARGE_BRICK_BLOCK = registerBlock("light_gray_large_brick_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> GRAY_LARGE_BRICK_BLOCK = registerBlock("gray_large_brick_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BLACK_LARGE_BRICK_BLOCK = registerBlock("black_large_brick_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BROWN_LARGE_BRICK_BLOCK = registerBlock("brown_large_brick_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);


//GEMSTONE ORES//

    public static final RegistryObject<Block> JASPER_ORE = registerBlock("jasper_ore",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CARNELIAN_ORE = registerBlock("carnelian_ore",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CITRINE_ORE = registerBlock("citrine_ore",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> AVENTURINE_ORE = registerBlock("aventurine_ore",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JADE_ORE = registerBlock("jade_ore",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CHALCOPYRITE_ORE = registerBlock("chalcopyrite_ore",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LABRADORITE_ORE = registerBlock("labradorite_ore",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MOONSTONE_ORE = registerBlock("moonstone_ore",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SODALITE_ORE = registerBlock("sodalite_ore",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> AMETHYST_ORE = registerBlock("amethyst_ore",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ROSE_QUARTZ_ORE = registerBlock("rose_quartz_ore",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MICA_ORE = registerBlock("mica_ore",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);



//GEMSTONE BLOCKS//

    public static final RegistryObject<Block> JASPER_BLOCK = registerBlock("jasper_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.AMETHYST).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CARNELIAN_BLOCK = registerBlock("carnelian_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.AMETHYST).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CITRINE_BLOCK = registerBlock("citrine_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.AMETHYST).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> AVENTURINE_BLOCK = registerBlock("aventurine_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.AMETHYST).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JADE_BLOCK = registerBlock("jade_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.AMETHYST).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CHALCOPYRITE_BLOCK = registerBlock("chalcopyrite_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.AMETHYST).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LABRADORITE_BLOCK = registerBlock("labradorite_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.AMETHYST).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MOONSTONE_BLOCK = registerBlock("moonstone_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.AMETHYST).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SODALITE_BLOCK = registerBlock("sodalite_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.AMETHYST).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> AMETHYST_BLOCK = registerBlock("amethyst_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.AMETHYST).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ROSE_QUARTZ_BLOCK = registerBlock("rose_quartz_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.AMETHYST).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MICA_BLOCK = registerBlock("mica_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.AMETHYST).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);


    //GEMSTONE TILE BLOCKS//
//GEMSTONE TILE 1//
    public static final RegistryObject<Block> JASPER_TILE_1 = registerBlock("jasper_tile_1",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CARNELIAN_TILE_1 = registerBlock("carnelian_tile_1",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CITRINE_TILE_1 = registerBlock("citrine_tile_1",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> AVENTURINE_TILE_1 = registerBlock("aventurine_tile_1",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JADE_TILE_1 = registerBlock("jade_tile_1",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CHALCOPYRITE_TILE_1 = registerBlock("chalcopyrite_tile_1",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LABRADORITE_TILE_1 = registerBlock("labradorite_tile_1",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MOONSTONE_TILE_1 = registerBlock("moonstone_tile_1",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SODALITE_TILE_1 = registerBlock("sodalite_tile_1",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> AMETHYST_TILE_1 = registerBlock("amethyst_tile_1",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ROSE_QUARTZ_TILE_1 = registerBlock("rose_quartz_tile_1",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MICA_TILE_1 = registerBlock("mica_tile_1",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    //GEMSTONE TILE 2//
    public static final RegistryObject<Block> JASPER_TILE_2 = registerBlock("jasper_tile_2",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CARNELIAN_TILE_2 = registerBlock("carnelian_tile_2",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CITRINE_TILE_2 = registerBlock("citrine_tile_2",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> AVENTURINE_TILE_2 = registerBlock("aventurine_tile_2",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);
    public static final RegistryObject<Block> JADE_TILE_2 = registerBlock("jade_tile_2",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CHALCOPYRITE_TILE_2 = registerBlock("chalcopyrite_tile_2",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LABRADORITE_TILE_2 = registerBlock("labradorite_tile_2",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MOONSTONE_TILE_2 = registerBlock("moonstone_tile_2",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SODALITE_TILE_2 = registerBlock("sodalite_tile_2",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> AMETHYST_TILE_2 = registerBlock("amethyst_tile_2",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ROSE_QUARTZ_TILE_2 = registerBlock("rose_quartz_tile_2",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MICA_TILE_2 = registerBlock("mica_tile_2",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    //GEMSTONE TILE 3//
    public static final RegistryObject<Block> JASPER_TILE_3 = registerBlock("jasper_tile_3",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CARNELIAN_TILE_3 = registerBlock("carnelian_tile_3",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CITRINE_TILE_3 = registerBlock("citrine_tile_3",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> AVENTURINE_TILE_3 = registerBlock("aventurine_tile_3",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JADE_TILE_3 = registerBlock("jade_tile_3",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CHALCOPYRITE_TILE_3 = registerBlock("chalcopyrite_tile_3",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LABRADORITE_TILE_3 = registerBlock("labradorite_tile_3",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MOONSTONE_TILE_3 = registerBlock("moonstone_tile_3",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SODALITE_TILE_3 = registerBlock("sodalite_tile_3",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> AMETHYST_TILE_3 = registerBlock("amethyst_tile_3",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ROSE_QUARTZ_TILE_3 = registerBlock("rose_quartz_tile_3",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MICA_TILE_3 = registerBlock("mica_tile_3",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    //GEMSTONE TILE 4//
    public static final RegistryObject<Block> JASPER_TILE_4 = registerBlock("jasper_tile_4",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CARNELIAN_TILE_4 = registerBlock("carnelian_tile_4",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CITRINE_TILE_4 = registerBlock("citrine_tile_4",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> AVENTURINE_TILE_4 = registerBlock("aventurine_tile_4",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JADE_TILE_4 = registerBlock("jade_tile_4",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CHALCOPYRITE_TILE_4 = registerBlock("chalcopyrite_tile_4",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LABRADORITE_TILE_4 = registerBlock("labradorite_tile_4",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MOONSTONE_TILE_4 = registerBlock("moonstone_tile_4",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SODALITE_TILE_4 = registerBlock("sodalite_tile_4",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> AMETHYST_TILE_4 = registerBlock("amethyst_tile_4",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ROSE_QUARTZ_TILE_4 = registerBlock("rose_quartz_tile_4",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MICA_TILE_4 = registerBlock("mica_tile_4",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    //GEMSTONE TILE 5//
    public static final RegistryObject<Block> JASPER_TILE_5 = registerBlock("jasper_tile_5",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CARNELIAN_TILE_5 = registerBlock("carnelian_tile_5",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CITRINE_TILE_5 = registerBlock("citrine_tile_5",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> AVENTURINE_TILE_5 = registerBlock("aventurine_tile_5",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JADE_TILE_5 = registerBlock("jade_tile_5",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CHALCOPYRITE_TILE_5 = registerBlock("chalcopyrite_tile_5",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LABRADORITE_TILE_5 = registerBlock("labradorite_tile_5",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MOONSTONE_TILE_5 = registerBlock("moonstone_tile_5",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SODALITE_TILE_5 = registerBlock("sodalite_tile_5",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> AMETHYST_TILE_5 = registerBlock("amethyst_tile_5",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ROSE_QUARTZ_TILE_5 = registerBlock("rose_quartz_tile_5",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MICA_TILE_5 = registerBlock("mica_tile_5",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    //GEMSTONE TILE 6//
    public static final RegistryObject<Block> JASPER_TILE_6 = registerBlock("jasper_tile_6",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CARNELIAN_TILE_6 = registerBlock("carnelian_tile_6",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CITRINE_TILE_6 = registerBlock("citrine_tile_6",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> AVENTURINE_TILE_6 = registerBlock("aventurine_tile_6",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JADE_TILE_6 = registerBlock("jade_tile_6",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CHALCOPYRITE_TILE_6 = registerBlock("chalcopyrite_tile_6",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LABRADORITE_TILE_6 = registerBlock("labradorite_tile_6",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MOONSTONE_TILE_6 = registerBlock("moonstone_tile_6",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SODALITE_TILE_6 = registerBlock("sodalite_tile_6",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> AMETHYST_TILE_6 = registerBlock("amethyst_tile_6",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ROSE_QUARTZ_TILE_6 = registerBlock("rose_quartz_tile_6",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MICA_TILE_6 = registerBlock("mica_tile_6",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    //ESSENCE BLOCKS//
    public static final RegistryObject<Block> EARTHEN_ESSENCE_BLOCK = registerBlock("earthen_essence_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> FLORAL_ESSENCE_BLOCK = registerBlock("floral_essence_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WHITEWASHED_PLANKS = registerBlock("whitewashed_planks",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(2.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);


//STAINED PLANKS//

    public static final RegistryObject<Block> RED_STAINED_PLANKS = registerBlock("red_stained_planks",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(2.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ORANGE_STAINED_PLANKS = registerBlock("orange_stained_planks",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(2.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> YELLOW_STAINED_PLANKS = registerBlock("yellow_stained_planks",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(2.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LIME_STAINED_PLANKS = registerBlock("lime_stained_planks",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(2.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> GREEN_STAINED_PLANKS = registerBlock("green_stained_planks",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(2.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CYAN_STAINED_PLANKS = registerBlock("cyan_stained_planks",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(2.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_PLANKS = registerBlock("light_blue_stained_planks",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(2.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BLUE_STAINED_PLANKS = registerBlock("blue_stained_planks",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(2.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PURPLE_STAINED_PLANKS = registerBlock("purple_stained_planks",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(2.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MAGENTA_STAINED_PLANKS = registerBlock("magenta_stained_planks",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(2.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PINK_STAINED_PLANKS = registerBlock("pink_stained_planks",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(2.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WHITE_STAINED_PLANKS = registerBlock("white_stained_planks",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(2.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_PLANKS = registerBlock("light_gray_stained_planks",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(2.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> GRAY_STAINED_PLANKS = registerBlock("gray_stained_planks",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(2.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BLACK_STAINED_PLANKS = registerBlock("black_stained_planks",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(2.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BROWN_STAINED_PLANKS = registerBlock("brown_stained_planks",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(2.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);



    //WOOD PLANKS//
    public static final RegistryObject<Block> CRABAPPLE_PLANKS = registerBlock("crabapple_planks",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(2.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> POINCIANA_PLANKS = registerBlock("poinciana_planks",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(2.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LABURNUM_PLANKS = registerBlock("laburnum_planks",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(2.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JADE_PLANKS = registerBlock("jade_planks",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(2.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PAULOWNIA_PLANKS = registerBlock("paulownia_planks",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(2.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WISTERIA_PLANKS = registerBlock("wisteria_planks",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(2.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JACARANDA_PLANKS = registerBlock("jacaranda_planks",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(2.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> DOGWOOD_PLANKS = registerBlock("dogwood_planks",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(2.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SILVERBELL_PLANKS = registerBlock("silverbell_planks",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(2.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CEDAR_PLANKS = registerBlock("cedar_planks",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(2.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PALM_PLANKS = registerBlock("palm_planks",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(2.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);



//VASES//

public static final RegistryObject<Block> VASE_RED = registerBlock("vase_red",
        () -> new VaseBlock(BlockBehaviour.Properties.of(Material.CLAY).noOcclusion().instabreak()),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

public static final RegistryObject<Block> VASE_ORANGE = registerBlock("vase_orange",
            () -> new VaseBlock(BlockBehaviour.Properties.of(Material.CLAY).noOcclusion().instabreak()),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> VASE_YELLOW = registerBlock("vase_yellow",
            () -> new VaseBlock(BlockBehaviour.Properties.of(Material.CLAY).noOcclusion().instabreak()),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> VASE_LIME = registerBlock("vase_lime",
            () -> new VaseBlock(BlockBehaviour.Properties.of(Material.CLAY).noOcclusion().instabreak()),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> VASE_GREEN = registerBlock("vase_green",
            () -> new VaseBlock(BlockBehaviour.Properties.of(Material.CLAY).noOcclusion().instabreak()),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> VASE_CYAN = registerBlock("vase_cyan",
            () -> new VaseBlock(BlockBehaviour.Properties.of(Material.CLAY).noOcclusion().instabreak()),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> VASE_LIGHT_BLUE = registerBlock("vase_light_blue",
            () -> new VaseBlock(BlockBehaviour.Properties.of(Material.CLAY).noOcclusion().instabreak()),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> VASE_BLUE = registerBlock("vase_blue",
            () -> new VaseBlock(BlockBehaviour.Properties.of(Material.CLAY).noOcclusion().instabreak()),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> VASE_PURPLE = registerBlock("vase_purple",
            () -> new VaseBlock(BlockBehaviour.Properties.of(Material.CLAY).noOcclusion().instabreak()),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> VASE_MAGENTA = registerBlock("vase_magenta",
            () -> new VaseBlock(BlockBehaviour.Properties.of(Material.CLAY).noOcclusion().instabreak()),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> VASE_PINK = registerBlock("vase_pink",
            () -> new VaseBlock(BlockBehaviour.Properties.of(Material.CLAY).noOcclusion().instabreak()),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> VASE_WHITE = registerBlock("vase_white",
            () -> new VaseBlock(BlockBehaviour.Properties.of(Material.CLAY).noOcclusion().instabreak()),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> VASE_LIGHT_GRAY = registerBlock("vase_light_gray",
            () -> new VaseBlock(BlockBehaviour.Properties.of(Material.CLAY).noOcclusion().instabreak()),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> VASE_GRAY = registerBlock("vase_gray",
            () -> new VaseBlock(BlockBehaviour.Properties.of(Material.CLAY).noOcclusion().instabreak()),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> VASE_BLACK = registerBlock("vase_black",
            () -> new VaseBlock(BlockBehaviour.Properties.of(Material.CLAY).noOcclusion().instabreak()),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> VASE_BROWN = registerBlock("vase_brown",
            () -> new VaseBlock(BlockBehaviour.Properties.of(Material.CLAY).noOcclusion().instabreak()),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(MarvelousMaterials.MAIDENS_BLOCKS_GROUP)));
    }
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }


}