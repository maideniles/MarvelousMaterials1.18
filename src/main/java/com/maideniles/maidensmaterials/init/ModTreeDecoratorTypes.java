package com.maideniles.maidensmaterials.init;

import com.maideniles.maidensmaterials.util.Registration;
import com.maideniles.maidensmaterials.world.gen.feature.tree.decorator.leaf.*;
import com.maideniles.maidensmaterials.world.gen.feature.tree.decorator.trunk.*;
import com.mojang.serialization.Codec;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecorator;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecoratorType;
import net.minecraftforge.registries.RegistryObject;

public class ModTreeDecoratorTypes  {
    private static <T extends TreeDecorator> RegistryObject<?> register(String p_236877_0_, Codec<T> p_236877_1_) {
        return Registration.TREE_DECORATORS.register(p_236877_0_,
                () -> new TreeDecoratorType<>(p_236877_1_));
    }

    public static final RegistryObject<TreeDecoratorType<CrabappleLeafVineDecorator>> CRABAPPLE_LEAF_VINE =
            (RegistryObject<TreeDecoratorType<CrabappleLeafVineDecorator>>) register("crabapple_leaf_vine_decorator",
                    CrabappleLeafVineDecorator.CODEC);

    public static final RegistryObject<TreeDecoratorType<CrabappleTrunkVineDecorator>> CRABAPPLE_TRUNK_VINE =
            (RegistryObject<TreeDecoratorType<CrabappleTrunkVineDecorator>>) register("crabapple_trunk_vine_decorator",
                    CrabappleTrunkVineDecorator.CODEC);

    public static final RegistryObject<TreeDecoratorType<PoincianaLeafVineDecorator>> POINCIANA_LEAF_VINE =
            (RegistryObject<TreeDecoratorType<PoincianaLeafVineDecorator>>) register("poinciana_leaf_vine_decorator",
                    PoincianaLeafVineDecorator.CODEC);

    public static final RegistryObject<TreeDecoratorType<PoincianaTrunkVineDecorator>> POINCIANA_TRUNK_VINE =
            (RegistryObject<TreeDecoratorType<PoincianaTrunkVineDecorator>>) register("poinciana_trunk_vine_decorator",
                    PoincianaTrunkVineDecorator.CODEC);

    public static final RegistryObject<TreeDecoratorType<LaburnumLeafVineDecorator>> LABURNUM_LEAF_VINE =
            (RegistryObject<TreeDecoratorType<LaburnumLeafVineDecorator>>) register("laburnum_leaf_vine_decorator",
                    LaburnumLeafVineDecorator.CODEC);

    public static final RegistryObject<TreeDecoratorType<LaburnumTrunkVineDecorator>> LABURNUM_TRUNK_VINE =
            (RegistryObject<TreeDecoratorType<LaburnumTrunkVineDecorator>>) register("laburnum_trunk_vine_decorator",
                    LaburnumTrunkVineDecorator.CODEC);

    public static final RegistryObject<TreeDecoratorType<JadeLeafVineDecorator>> JADE_LEAF_VINE =
            (RegistryObject<TreeDecoratorType<JadeLeafVineDecorator>>) register("jade_leaf_vine_decorator",
                    JadeLeafVineDecorator.CODEC);

    public static final RegistryObject<TreeDecoratorType<JadeTrunkVineDecorator>> JADE_TRUNK_VINE =
            (RegistryObject<TreeDecoratorType<JadeTrunkVineDecorator>>) register("jade_trunk_vine_decorator",
                    JadeTrunkVineDecorator.CODEC);

    public static final RegistryObject<TreeDecoratorType<JacarandaLeafVineDecorator>> JACARANDA_LEAF_VINE =
            (RegistryObject<TreeDecoratorType<JacarandaLeafVineDecorator>>) register("jacaranda_leaf_vine_decorator",
                    JacarandaLeafVineDecorator.CODEC);

    public static final RegistryObject<TreeDecoratorType<JacarandaTrunkVineDecorator>> JACARANDA_TRUNK_VINE =
            (RegistryObject<TreeDecoratorType<JacarandaTrunkVineDecorator>>) register("jacaranda_trunk_vine_decorator",
                    JacarandaTrunkVineDecorator.CODEC);

    public static final RegistryObject<TreeDecoratorType<PaulowniaLeafVineDecorator>> PAULOWNIA_LEAF_VINE =
            (RegistryObject<TreeDecoratorType<PaulowniaLeafVineDecorator>>) register("paulownia_leaf_vine_decorator",
                    PaulowniaLeafVineDecorator.CODEC);

    public static final RegistryObject<TreeDecoratorType<PaulowniaTrunkVineDecorator>> PAULOWNIA_TRUNK_VINE =
            (RegistryObject<TreeDecoratorType<PaulowniaTrunkVineDecorator>>) register("paulownia_trunk_vine_decorator",
                    PaulowniaTrunkVineDecorator.CODEC);

    public static final RegistryObject<TreeDecoratorType<DogwoodLeafVineDecorator>> DOGWOOD_LEAF_VINE =
            (RegistryObject<TreeDecoratorType<DogwoodLeafVineDecorator>>) register("dogwood_leaf_vine_decorator",
                    DogwoodLeafVineDecorator.CODEC);

    public static final RegistryObject<TreeDecoratorType<DogwoodTrunkVineDecorator>> DOGWOOD_TRUNK_VINE =
            (RegistryObject<TreeDecoratorType<DogwoodTrunkVineDecorator>>) register("dogwood_trunk_vine_decorator",
                    DogwoodTrunkVineDecorator.CODEC);

    public static final RegistryObject<TreeDecoratorType<WisteriaLeafVineDecorator>> WISTERIA_LEAF_VINE =
            (RegistryObject<TreeDecoratorType<WisteriaLeafVineDecorator>>) register("wisteria_leaf_vine_decorator",
                    WisteriaLeafVineDecorator.CODEC);

    public static final RegistryObject<TreeDecoratorType<WisteriaTrunkVineDecorator>> WISTERIA_TRUNK_VINE =
            (RegistryObject<TreeDecoratorType<WisteriaTrunkVineDecorator>>) register("wisteria_trunk_vine_decorator",
                    WisteriaTrunkVineDecorator.CODEC);

    public static final RegistryObject<TreeDecoratorType<SilverbellLeafVineDecorator>> SILVERBELL_LEAF_VINE =
            (RegistryObject<TreeDecoratorType<SilverbellLeafVineDecorator>>) register("silverbell_leaf_vine_decorator",
                    SilverbellLeafVineDecorator.CODEC);

    public static final RegistryObject<TreeDecoratorType<SilverbellTrunkVineDecorator>> SILVERBELL_TRUNK_VINE =
            (RegistryObject<TreeDecoratorType<SilverbellTrunkVineDecorator>>) register("silverbell_trunk_vine_decorator",
                    SilverbellTrunkVineDecorator.CODEC);

    public static final RegistryObject<TreeDecoratorType<CedarLeafVineDecorator>> CEDAR_LEAF_VINE =
            (RegistryObject<TreeDecoratorType<CedarLeafVineDecorator>>) register("cedar_leaf_vine_decorator",
                    CedarLeafVineDecorator.CODEC);

    public static final RegistryObject<TreeDecoratorType<CedarTrunkVineDecorator>> CEDAR_TRUNK_VINE =
            (RegistryObject<TreeDecoratorType<CedarTrunkVineDecorator>>) register("cedar_trunk_vine_decorator",
                   CedarTrunkVineDecorator.CODEC);






    //  public static final RegistryObject<TreeDecoratorType<MaidensMushroomDecorator>> MAIDENS_MUSHROOM =
 //           (RegistryObject<TreeDecoratorType<MaidensMushroomDecorator>>) register("maidens_mushroom_decorator",
 //                   MaidensMushroomDecorator.field_236874_c_);





    public static void register(){}
}