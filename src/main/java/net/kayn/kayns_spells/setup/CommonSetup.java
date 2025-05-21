package net.kayn.kayns_spells.setup;

import net.kayn.kayns_spells.Kayns_spells;
import net.kayn.kayns_spells.entity.mobs.SummonedDoppelganger;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.kayn.kayns_spells.registry.EntityRegistry;

@Mod.EventBusSubscriber(modid = Kayns_spells.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CommonSetup {
    @SubscribeEvent
    public static void onAttributeCreate(EntityAttributeCreationEvent event) {
        event.put(EntityRegistry.SUMMONED_DOPPELGANGER.get(), SummonedDoppelganger.createAttributes().build());
    }
}