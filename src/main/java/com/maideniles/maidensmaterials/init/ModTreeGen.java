package com.maideniles.maidensmaterials.init;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import java.util.Set;

public class ModTreeGen {


    public static void generateTrees(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);


        //HOT  OR WARM BIOMES?//

        if ( event.getCategory() == Biome.BiomeCategory.PLAINS) {

            event.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModPlacements.CRABAPPLE_PLACEMENT);
            event.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModPlacements.CRABAPPLE_VINES_PLACEMENT);

            event.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,ModPlacements.POINCIANA_PLACEMENT);
            event.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,ModPlacements.POINCIANA_VINES_PLACEMENT);

            event.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,ModPlacements.LABURNUM_PLACEMENT);
            event.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,ModPlacements.LABURNUM_VINES_PLACEMENT);


            event.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModPlacements.JADE_PLACEMENT);
            event.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModPlacements.JADE_VINES_PLACEMENT);

            event.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,ModPlacements.PAULOWNIA_PLACEMENT);
            event.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,ModPlacements.PAULOWNIA_VINES_PLACEMENT);

            event.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,ModPlacements.WISTERIA_PLACEMENT);
            event.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,ModPlacements.WISTERIA_VINES_PLACEMENT);

            event.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModPlacements.JACARANDA_PLACEMENT);
            event.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModPlacements.JACARANDA_VINES_PLACEMENT);

            event.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,ModPlacements.DOGWOOD_PLACEMENT);
            event.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,ModPlacements.DOGWOOD_VINES_PLACEMENT);

            event.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,ModPlacements.SILVERBELL_PLACEMENT);
            event.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,ModPlacements.SILVERBELL_VINES_PLACEMENT);

            event.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,ModPlacements.CEDAR_PLACEMENT);
            event.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,ModPlacements.CEDAR_VINES_PLACEMENT);
        }

        if(event.getCategory() == Biome.BiomeCategory.FOREST){
            event.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModPlacements.APPLE_TREE_PLACEMENT);
            event.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModPlacements.CHERRY_TREE_PLACEMENT);
            event.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModPlacements.GRAPEFRUIT_TREE_PLACEMENT);
            event.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModPlacements.LEMON_TREE_PLACEMENT);
            event.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModPlacements.LIME_TREE_PLACEMENT);
            event.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModPlacements.ORANGE_TREE_PLACEMENT);
            event.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModPlacements.PEACH_TREE_PLACEMENT);
            event.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModPlacements.PEAR_TREE_PLACEMENT);
            event.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModPlacements.PLUM_TREE_PLACEMENT);

        }

        //if(event.getCategory() == Biome.BiomeCategory.BEACH){
  //          event.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,ModPlacements.PALM_TREE_PLACEMENT);
    //    }


    }
}
