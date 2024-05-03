package org.dawnoftime.ancientarchi.registry;

import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.dawnoftime.ancientarchi.worldgen.feature.DefaultCropsFeature;
import org.dawnoftime.ancientarchi.worldgen.feature.DoTFeature;

public class DoTBFeaturesRegistry {
    private static final DeferredRegister<Feature<?>> FEATURES = DeferredRegister.create(ForgeRegistries.FEATURES, org.dawnoftime.ancientarchi.AncientArchitecture.MOD_ID);

    public static final RegistryObject<Feature<SimpleBlockConfiguration>> DOT_FEATURE = FEATURES.register("dot_feature",
            () -> new DoTFeature(SimpleBlockConfiguration.CODEC));

    public static final RegistryObject<Feature<RandomPatchConfiguration>> DEFAULT_CROPS = FEATURES.register("default_crops",
            () -> new DefaultCropsFeature(RandomPatchConfiguration.CODEC));

    public static void register(IEventBus eventBus) {
        FEATURES.register(eventBus);
    }
}
