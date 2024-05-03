package org.dawnoftime.ancientarchi.registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class DoTBCreativeModeTabsRegistry {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, org.dawnoftime.ancientarchi.AncientArchitecture.MOD_ID);
    public static RegistryObject<CreativeModeTab> DOT_TAB = CREATIVE_MODE_TABS.register("dot_tab", () -> CreativeModeTab.builder().icon(() -> new ItemStack(DoTBBlocksRegistry.COMMELINA.get())).title(Component.translatable("itemGroup." + org.dawnoftime.ancientarchi.AncientArchitecture.MOD_ID + ".dottab")).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
