package net.kayn.kayns_spells.registry;

import net.kayn.kayns_spells.Kayns_spells;
import net.kayn.kayns_spells.entity.mobs.SummonedDoppelganger;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EntityRegistry {
    private static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, Kayns_spells.MOD_ID);

    public static void register(IEventBus eventBus) {
        ENTITIES.register(eventBus);
    }

    public static final RegistryObject<EntityType<SummonedDoppelganger>> SUMMONED_DOPPELGANGER =
        ENTITIES.register("summoned_darkdoppelganger", () -> EntityType.Builder.<SummonedDoppelganger>of(SummonedDoppelganger::new, MobCategory.MONSTER)
                .sized(.6f, 1.8f)
                .clientTrackingRange(64)
                .build(ResourceLocation.fromNamespaceAndPath(Kayns_spells.MOD_ID, "summoned_darkdoppelganger").toString()));
}