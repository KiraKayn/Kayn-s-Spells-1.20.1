package net.kayn.kayns_spells.init;

import net.kayn.kayns_spells.Kayns_spells;
import net.kayn.kayns_spells.effect.DemonsMarkEffect;
import net.kayn.kayns_spells.effect.GoldenResolveEffect;
import net.kayn.kayns_spells.effect.BlackenedCurseEffect;
import net.minecraft.world.effect.MobEffect;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEffects {
    public static final DeferredRegister<MobEffect> EFFECTS = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, Kayns_spells.MOD_ID);

    public static final RegistryObject<MobEffect> DEMONS_MARK = EFFECTS.register("demons_mark", DemonsMarkEffect::new);
    public static final RegistryObject<MobEffect> GOLDEN_RESOLVE = EFFECTS.register("golden_resolve", GoldenResolveEffect::new);
    public static final RegistryObject<MobEffect> BLACKENED_CURSE = EFFECTS.register("blackened_curse", GoldenResolveEffect::new);

    public static void register(IEventBus eventBus)
    {
        EFFECTS.register(eventBus);
    }
}