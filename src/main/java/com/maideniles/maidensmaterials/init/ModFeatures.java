package com.maideniles.maidensmaterials.init;

import com.google.common.collect.ImmutableList;
import com.maideniles.maidensmaterials.util.Registration;
import com.maideniles.maidensmaterials.world.gen.feature.tree.PalmTreeFeature;
import com.maideniles.maidensmaterials.world.gen.feature.tree.decorator.leaf.*;
import com.maideniles.maidensmaterials.world.gen.feature.tree.decorator.trunk.*;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.util.random.SimpleWeightedRandomList;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FancyFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.WeightedStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.FancyTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.ForkingTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraftforge.registries.RegistryObject;


public class ModFeatures {

      public static final ConfiguredFeature<TreeConfiguration, ?> CRABAPPLE_CONFIG = FeatureUtils.register("crabapple_tree",
            Feature.TREE.configured((new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(ModBlocks.CRABAPPLE_LOG.get()), new
                    ForkingTrunkPlacer(3, 4, 2),
                    new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(ModBlocks.CRABAPPLE_LEAVES.get().defaultBlockState(), 1)
                            .add(ModBlocks.CRABAPPLE_LEAVES.get().defaultBlockState(), 2)),
                    new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(3), 3),
                    new TwoLayersFeatureSize(0, 0, 0)).ignoreVines().build())));

    public static final ConfiguredFeature<TreeConfiguration, ?> CRABAPPLE_VINES_CONFIG = FeatureUtils.register("crabapple_vines_tree",
            Feature.TREE.configured((new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(ModBlocks.CRABAPPLE_LOG.get()), new
                    ForkingTrunkPlacer(3, 4, 2),
                    new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(ModBlocks.CRABAPPLE_LEAVES.get().defaultBlockState(), 1)
                            .add(ModBlocks.CRABAPPLE_LEAVES.get().defaultBlockState(), 2)),
                    new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(3), 3),
                    new TwoLayersFeatureSize(0, 0, 0)).decorators(ImmutableList.of(CrabappleTrunkVineDecorator.INSTANCE,
                    CrabappleLeafVineDecorator.INSTANCE)).build())));

    public static final ConfiguredFeature<TreeConfiguration, ?> POINCIANA_CONFIG = FeatureUtils.register("poinciana_tree",
            Feature.TREE.configured((new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(ModBlocks.POINCIANA_LOG.get()), new
                    FancyTrunkPlacer(3, 4, 1),
                    new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(ModBlocks.POINCIANA_LEAVES.get().defaultBlockState(), 1)
                            .add(ModBlocks.POINCIANA_LEAVES.get().defaultBlockState(), 2)),
                    new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(3), 3),
                    new TwoLayersFeatureSize(0, 0, 0)).ignoreVines().build())));

    public static final ConfiguredFeature<TreeConfiguration, ?> POINCIANA_VINES_CONFIG = FeatureUtils.register("poinciana_vines_tree",
            Feature.TREE.configured((new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(ModBlocks.POINCIANA_LOG.get()), new
                    FancyTrunkPlacer(3, 4, 1),
                    new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(ModBlocks.POINCIANA_LEAVES.get().defaultBlockState(), 1)
                            .add(ModBlocks.POINCIANA_LEAVES.get().defaultBlockState(), 2)),
                    new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(3), 3),
                    new TwoLayersFeatureSize(0, 0, 0)).decorators(ImmutableList.of(PoincianaTrunkVineDecorator.INSTANCE,
                    PoincianaLeafVineDecorator.INSTANCE)).build())));

    public static final ConfiguredFeature<TreeConfiguration, ?> LABURNUM_CONFIG = FeatureUtils.register("laburnum_tree",
            Feature.TREE.configured((new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(ModBlocks.LABURNUM_LOG.get()), new
                    StraightTrunkPlacer(4, 4, 3),
                    new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(ModBlocks.LABURNUM_LEAVES.get().defaultBlockState(), 1)
                            .add(ModBlocks.LABURNUM_LEAVES.get().defaultBlockState(), 2)),
                    new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(3), 3),
                    new TwoLayersFeatureSize(0, 0, 0)).ignoreVines().build())));

    public static final ConfiguredFeature<TreeConfiguration, ?> LABURNUM_VINES_CONFIG = FeatureUtils.register("laburnum_vines_tree",
            Feature.TREE.configured((new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(ModBlocks.LABURNUM_LOG.get()), new
                    StraightTrunkPlacer(4, 4, 3),
                    new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(ModBlocks.LABURNUM_LEAVES.get().defaultBlockState(), 1)
                            .add(ModBlocks.LABURNUM_LEAVES.get().defaultBlockState(), 2)),
                    new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(3), 3),
                    new TwoLayersFeatureSize(0, 0, 0)).decorators(ImmutableList.of(LaburnumTrunkVineDecorator.INSTANCE,
                    LaburnumLeafVineDecorator.INSTANCE)).build())));

    public static final ConfiguredFeature<TreeConfiguration, ?> JADE_CONFIG = FeatureUtils.register("jade_tree",
            Feature.TREE.configured((new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(ModBlocks.JADE_LOG.get()), new
                    ForkingTrunkPlacer(3, 4, 2),
                    new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(ModBlocks.JADE_LEAVES.get().defaultBlockState(), 1)
                            .add(ModBlocks.JADE_LEAVES.get().defaultBlockState(), 2)),
                    new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(3), 3),
                    new TwoLayersFeatureSize(0, 0, 0)).ignoreVines().build())));

    public static final ConfiguredFeature<TreeConfiguration, ?> JADE_VINES_CONFIG = FeatureUtils.register("jade_vines_tree",
            Feature.TREE.configured((new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(ModBlocks.JADE_LOG.get()), new
                    ForkingTrunkPlacer(3, 4, 2),
                    new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(ModBlocks.JADE_LEAVES.get().defaultBlockState(), 1)
                            .add(ModBlocks.JADE_LEAVES.get().defaultBlockState(), 2)),
                    new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(3), 3),
                    new TwoLayersFeatureSize(0, 0, 0)).decorators(ImmutableList.of(JadeTrunkVineDecorator.INSTANCE,
                    JadeLeafVineDecorator.INSTANCE)).build())));

    public static final ConfiguredFeature<TreeConfiguration, ?> PAULOWNIA_CONFIG = FeatureUtils.register("paulownia_tree",
            Feature.TREE.configured((new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(ModBlocks.PAULOWNIA_LOG.get()), new
                    FancyTrunkPlacer(3, 4, 1),
                    new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(ModBlocks.PAULOWNIA_LEAVES.get().defaultBlockState(), 1)
                            .add(ModBlocks.PAULOWNIA_LEAVES.get().defaultBlockState(), 2)),
                    new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(3), 3),
                    new TwoLayersFeatureSize(0, 0, 0)).ignoreVines().build())));

    public static final ConfiguredFeature<TreeConfiguration, ?> PAULOWNIA_VINES_CONFIG = FeatureUtils.register("paulownia_vines_tree",
            Feature.TREE.configured((new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(ModBlocks.PAULOWNIA_LOG.get()), new
                    FancyTrunkPlacer(3, 4, 1),
                    new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(ModBlocks.PAULOWNIA_LEAVES.get().defaultBlockState(), 1)
                            .add(ModBlocks.PAULOWNIA_LEAVES.get().defaultBlockState(), 2)),
                    new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(3), 3),
                    new TwoLayersFeatureSize(0, 0, 0)).decorators(ImmutableList.of(PaulowniaTrunkVineDecorator.INSTANCE,
                    PaulowniaLeafVineDecorator.INSTANCE)).build())));

    public static final ConfiguredFeature<TreeConfiguration, ?> WISTERIA_CONFIG = FeatureUtils.register("wisteria_tree",
            Feature.TREE.configured((new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(ModBlocks.WISTERIA_LOG.get()), new
                    ForkingTrunkPlacer(4, 4, 3),
                    new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(ModBlocks.WISTERIA_LEAVES.get().defaultBlockState(), 1)
                            .add(ModBlocks.WISTERIA_LEAVES.get().defaultBlockState(), 2)),
                    new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(3), 3),
                    new TwoLayersFeatureSize(0, 0, 0)).ignoreVines().build())));

    public static final ConfiguredFeature<TreeConfiguration, ?> WISTERIA_VINES_CONFIG = FeatureUtils.register("wisteria_vines_tree",
            Feature.TREE.configured((new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(ModBlocks.WISTERIA_LOG.get()), new
                    ForkingTrunkPlacer(4, 4, 3),
                    new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(ModBlocks.WISTERIA_LEAVES.get().defaultBlockState(), 1)
                            .add(ModBlocks.WISTERIA_LEAVES.get().defaultBlockState(), 2)),
                    new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(3), 3),
                    new TwoLayersFeatureSize(0, 0, 0)).decorators(ImmutableList.of(WisteriaTrunkVineDecorator.INSTANCE,
                    WisteriaLeafVineDecorator.INSTANCE)).build())));

    public static final ConfiguredFeature<TreeConfiguration, ?> JACARANDA_CONFIG = FeatureUtils.register("jacaranda_tree",
            Feature.TREE.configured((new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(ModBlocks.JACARANDA_LOG.get()), new
                    ForkingTrunkPlacer(3, 4, 2),
                    new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(ModBlocks.JACARANDA_LEAVES.get().defaultBlockState(), 1)
                            .add(ModBlocks.JACARANDA_LEAVES.get().defaultBlockState(), 2)),
                    new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(3), 3),
                    new TwoLayersFeatureSize(0, 0, 0)).ignoreVines().build())));

    public static final ConfiguredFeature<TreeConfiguration, ?> JACARANDA_VINES_CONFIG = FeatureUtils.register("jacaranda_vines_tree",
            Feature.TREE.configured((new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(ModBlocks.JACARANDA_LOG.get()), new
                    ForkingTrunkPlacer(3, 4, 2),
                    new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(ModBlocks.JACARANDA_LEAVES.get().defaultBlockState(), 1)
                            .add(ModBlocks.JACARANDA_LEAVES.get().defaultBlockState(), 2)),
                    new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(3), 3),
                    new TwoLayersFeatureSize(0, 0, 0)).decorators(ImmutableList.of(JacarandaTrunkVineDecorator.INSTANCE,
                    JacarandaLeafVineDecorator.INSTANCE)).build())));

    public static final ConfiguredFeature<TreeConfiguration, ?> DOGWOOD_CONFIG = FeatureUtils.register("dogwood_tree",
            Feature.TREE.configured((new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(ModBlocks.DOGWOOD_LOG.get()), new
                    StraightTrunkPlacer(3, 4, 2),
                    new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(ModBlocks.DOGWOOD_LEAVES.get().defaultBlockState(), 1)
                            .add(ModBlocks.DOGWOOD_LEAVES.get().defaultBlockState(), 2)),
                    new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(3), 3),
                    new TwoLayersFeatureSize(0, 0, 0)).ignoreVines().build())));

    public static final ConfiguredFeature<TreeConfiguration, ?> DOGWOOD_VINES_CONFIG = FeatureUtils.register("dogwood_vines_tree",
            Feature.TREE.configured((new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(ModBlocks.DOGWOOD_LOG.get()), new
                    StraightTrunkPlacer(3, 4, 2),
                    new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(ModBlocks.DOGWOOD_LEAVES.get().defaultBlockState(), 1)
                            .add(ModBlocks.DOGWOOD_LEAVES.get().defaultBlockState(), 2)),
                    new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(3), 3),
                    new TwoLayersFeatureSize(0, 0, 0)).decorators(ImmutableList.of(DogwoodTrunkVineDecorator.INSTANCE,
                    DogwoodLeafVineDecorator.INSTANCE)).build())));

    public static final ConfiguredFeature<TreeConfiguration, ?> SILVERBELL_CONFIG = FeatureUtils.register("silverbell_tree",
            Feature.TREE.configured((new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(ModBlocks.SILVERBELL_LOG.get()), new
                    StraightTrunkPlacer(4, 4, 3),
                    new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(ModBlocks.SILVERBELL_LEAVES.get().defaultBlockState(), 1)
                            .add(ModBlocks.SILVERBELL_LEAVES.get().defaultBlockState(), 2)),
                    new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(3), 3),
                    new TwoLayersFeatureSize(0, 0, 0)).ignoreVines().build())));

    public static final ConfiguredFeature<TreeConfiguration, ?> SILVERBELL_VINES_CONFIG = FeatureUtils.register("silverbell_vines_tree",
            Feature.TREE.configured((new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(ModBlocks.SILVERBELL_LOG.get()), new
                    StraightTrunkPlacer(4, 4, 3),
                    new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(ModBlocks.SILVERBELL_LEAVES.get().defaultBlockState(), 1)
                            .add(ModBlocks.SILVERBELL_LEAVES.get().defaultBlockState(), 2)),
                    new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(3), 3),
                    new TwoLayersFeatureSize(0, 0, 0)).decorators(ImmutableList.of(SilverbellTrunkVineDecorator.INSTANCE,
                    SilverbellLeafVineDecorator.INSTANCE)).build())));


    public static final ConfiguredFeature<TreeConfiguration, ?>APPLE_CONFIG = FeatureUtils.register("apple_tree",
            Feature.TREE.configured((new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(ModBlocks.CEDAR_LOG.get()), new
                    FancyTrunkPlacer(4, 2, 2),
                    new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(ModBlocks.APPLE_LEAVES.get().defaultBlockState(), 1)
                            .add(ModBlocks.GROWING_APPLE_LEAVES.get().defaultBlockState(), 2)),
                    new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(4), 4),
                    new TwoLayersFeatureSize(0, 0, 0)).ignoreVines().build())));

    public static final ConfiguredFeature<TreeConfiguration, ?>CHERRY_CONFIG = FeatureUtils.register("cherry_tree",
            Feature.TREE.configured((new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(ModBlocks.CEDAR_LOG.get()), new
                    FancyTrunkPlacer(4, 2, 2),
                    new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(ModBlocks.CHERRY_LEAVES.get().defaultBlockState(), 1)
                            .add(ModBlocks.GROWING_CHERRY_LEAVES.get().defaultBlockState(), 2)),
                    new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(4), 4),
                    new TwoLayersFeatureSize(0, 0, 0)).ignoreVines().build())));

    public static final ConfiguredFeature<TreeConfiguration, ?>GRAPEFRUIT_CONFIG = FeatureUtils.register("grapefruit_tree",
            Feature.TREE.configured((new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(ModBlocks.CEDAR_LOG.get()), new
                    FancyTrunkPlacer(4, 2, 2),
                    new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(ModBlocks.GRAPEFRUIT_LEAVES.get().defaultBlockState(), 1)
                            .add(ModBlocks.GROWING_GRAPEFRUIT_LEAVES.get().defaultBlockState(), 2)),
                    new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(4), 4),
                    new TwoLayersFeatureSize(0, 0, 0)).ignoreVines().build())));

    public static final ConfiguredFeature<TreeConfiguration, ?>LEMON_CONFIG = FeatureUtils.register("lemon_tree",
            Feature.TREE.configured((new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(ModBlocks.CEDAR_LOG.get()), new
                    FancyTrunkPlacer(4, 2, 2),
                    new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(ModBlocks.LEMON_LEAVES.get().defaultBlockState(), 1)
                            .add(ModBlocks.GROWING_LEMON_LEAVES.get().defaultBlockState(), 2)),
                    new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(4), 4),
                    new TwoLayersFeatureSize(0, 0, 0)).ignoreVines().build())));

    public static final ConfiguredFeature<TreeConfiguration, ?>LIME_CONFIG = FeatureUtils.register("lime_tree",
            Feature.TREE.configured((new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(ModBlocks.CEDAR_LOG.get()), new
                    FancyTrunkPlacer(4, 2, 2),
                    new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(ModBlocks.LIME_LEAVES.get().defaultBlockState(), 1)
                            .add(ModBlocks.GROWING_LIME_LEAVES.get().defaultBlockState(), 2)),
                    new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(4), 4),
                    new TwoLayersFeatureSize(0, 0, 0)).ignoreVines().build())));

    public static final ConfiguredFeature<TreeConfiguration, ?>ORANGE_CONFIG = FeatureUtils.register("orange_tree",
            Feature.TREE.configured((new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(ModBlocks.CEDAR_LOG.get()), new
                    FancyTrunkPlacer(4, 2, 2),
                    new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(ModBlocks.ORANGE_LEAVES.get().defaultBlockState(), 1)
                            .add(ModBlocks.GROWING_ORANGE_LEAVES.get().defaultBlockState(), 2)),
                    new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(4), 4),
                    new TwoLayersFeatureSize(0, 0, 0)).ignoreVines().build())));

    public static final ConfiguredFeature<TreeConfiguration, ?>PEACH_CONFIG = FeatureUtils.register("peach_tree",
            Feature.TREE.configured((new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(ModBlocks.CEDAR_LOG.get()), new
                    FancyTrunkPlacer(4, 2, 2),
                    new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(ModBlocks.PEACH_LEAVES.get().defaultBlockState(), 1)
                            .add(ModBlocks.GROWING_PEACH_LEAVES.get().defaultBlockState(), 2)),
                    new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(4), 4),
                    new TwoLayersFeatureSize(0, 0, 0)).ignoreVines().build())));

    public static final ConfiguredFeature<TreeConfiguration, ?>PEAR_CONFIG = FeatureUtils.register("pear_tree",
            Feature.TREE.configured((new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(ModBlocks.CEDAR_LOG.get()), new
                    FancyTrunkPlacer(4, 2, 2),
                    new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(ModBlocks.PEAR_LEAVES.get().defaultBlockState(), 1)
                            .add(ModBlocks.GROWING_PEAR_LEAVES.get().defaultBlockState(), 2)),
                    new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(4), 4),
                    new TwoLayersFeatureSize(0, 0, 0)).ignoreVines().build())));

    public static final ConfiguredFeature<TreeConfiguration, ?>PLUM_CONFIG = FeatureUtils.register("plum_tree",
            Feature.TREE.configured((new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(ModBlocks.CEDAR_LOG.get()), new
                    FancyTrunkPlacer(4, 2, 2),
                    new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(ModBlocks.PLUM_LEAVES.get().defaultBlockState(), 1)
                            .add(ModBlocks.GROWING_PLUM_LEAVES.get().defaultBlockState(), 2)),
                    new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(4), 4),
                    new TwoLayersFeatureSize(0, 0, 0)).ignoreVines().build())));

    public static final ConfiguredFeature<TreeConfiguration, ?>PALM_TREE_CONFIG = FeatureUtils.register("palm_tree",
            ModFeatures.PALM_TREE_INSTANCE.configured((new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(Blocks.AIR), new
                    FancyTrunkPlacer(4, 2, 2),
                    new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(Blocks.AIR.defaultBlockState(), 1)
                            .add(Blocks.AIR.defaultBlockState(), 2)),
                    new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(4), 4),
                    new TwoLayersFeatureSize(0, 0, 0)).ignoreVines().build())));

    public static final ConfiguredFeature<TreeConfiguration, ?> CEDAR_VINES_CONFIG = FeatureUtils.register("paulownia_vines_tree",
            Feature.TREE.configured((new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(ModBlocks.CEDAR_LOG.get()), new
                    FancyTrunkPlacer(3, 4, 1),
                    new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(ModBlocks.CEDAR_LEAVES.get().defaultBlockState(), 1)
                            .add(ModBlocks.CEDAR_LEAVES.get().defaultBlockState(), 2)),
                    new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(3), 3),
                    new TwoLayersFeatureSize(0, 0, 0)).decorators(ImmutableList.of(CedarTrunkVineDecorator.INSTANCE,
                    CedarLeafVineDecorator.INSTANCE)).build())));

    public static final ConfiguredFeature<TreeConfiguration, ?> CEDAR_CONFIG = FeatureUtils.register("cedar_tree",
            Feature.TREE.configured((new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(ModBlocks.CEDAR_LOG.get()), new
                    FancyTrunkPlacer(3, 4, 1),
                    new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(ModBlocks.CEDAR_LEAVES.get().defaultBlockState(), 1)
                            .add(ModBlocks.CEDAR_LEAVES.get().defaultBlockState(), 2)),
                    new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(3), 3),
                    new TwoLayersFeatureSize(0, 0, 0)).ignoreVines().build())));


    public static final Feature<TreeConfiguration> PALM_TREE_INSTANCE = new PalmTreeFeature(TreeConfiguration.CODEC);
    public static final RegistryObject<Feature<TreeConfiguration>> PALM_TREE = Registration.FEATURES.register("palm_tree", () -> PALM_TREE_INSTANCE);




}

