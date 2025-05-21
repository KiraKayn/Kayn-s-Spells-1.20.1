package net.kayn.kayns_spells.setup;

import net.kayn.kayns_spells.Kayns_spells;
import net.kayn.kayns_spells.entity.renderers.SummonedDoppelgangerEntityRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.kayn.kayns_spells.registry.EntityRegistry;

@Mod.EventBusSubscriber(modid = Kayns_spells.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientSetup {
    @SubscribeEvent
    public static void rendererRegister(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(EntityRegistry.SUMMONED_DOPPELGANGER.get(), SummonedDoppelgangerEntityRenderer::new);
    }
}
