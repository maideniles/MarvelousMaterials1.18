package com.maideniles.maidensmaterials.init;

import com.maideniles.maidensmaterials.MarvelousMaterials;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MarvelousMaterials.MOD_ID);

    //IMPLEMENTS//
    public static final RegistryObject<Item> PRUNING_SHEARS = ITEMS.register("pruning_shears",
            () -> new Item(new Item.Properties().durability(64).tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    //ESSENCES//

    public static final RegistryObject<Item> FLORAL_ESSENCE = ITEMS.register("floral_essence",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> EARTHEN_ESSENCE = ITEMS.register("earthen_essence",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));
    //BLOSSOMS//
    public static final RegistryObject<Item> CRABAPPLE_BLOSSOMS = ITEMS.register("crabapple_blossoms",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> POINCIANA_BLOSSOMS = ITEMS.register("poinciana_blossoms",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> LABURNUM_BLOSSOMS = ITEMS.register("laburnum_blossoms",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> JADE_BLOSSOMS = ITEMS.register("jade_blossoms",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> PAULOWNIA_BLOSSOMS = ITEMS.register("paulownia_blossoms",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> WISTERIA_BLOSSOMS = ITEMS.register("wisteria_blossoms",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> JACARANDA_BLOSSOMS = ITEMS.register("jacaranda_blossoms",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> DOGWOOD_BLOSSOMS = ITEMS.register("dogwood_blossoms",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> SILVERBELL_BLOSSOMS = ITEMS.register("silverbell_blossoms",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    //FRUIT//
    public static final RegistryObject<Item> CHERRIES = ITEMS.register("cherries",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)
                    .food(new FoodProperties.Builder().nutrition(2).saturationMod(1F).build())));

    public static final RegistryObject<Item> PEACH = ITEMS.register("peach",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)
                    .food(new FoodProperties.Builder().nutrition(2).saturationMod(1F).build())));

    public static final RegistryObject<Item> ORANGE = ITEMS.register("orange",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)
                    .food(new FoodProperties.Builder().nutrition(2).saturationMod(1F).build())));

    public static final RegistryObject<Item> GRAPEFRUIT = ITEMS.register("grapefruit",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)
                    .food(new FoodProperties.Builder().nutrition(2).saturationMod(1F).build())));

    public static final RegistryObject<Item> LEMON = ITEMS.register("lemon",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)
                    .food(new FoodProperties.Builder().nutrition(2).saturationMod(1F).build())));
    public static final RegistryObject<Item> LIME = ITEMS.register("lime",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)
                    .food(new FoodProperties.Builder().nutrition(2).saturationMod(1F).build())));

    public static final RegistryObject<Item> PEAR = ITEMS.register("pear",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)
                    .food(new FoodProperties.Builder().nutrition(2).saturationMod(1F).build())));

    public static final RegistryObject<Item> PLUM = ITEMS.register("plum",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)
                    .food(new FoodProperties.Builder().nutrition(2).saturationMod(1F).build())));




    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
