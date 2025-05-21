package net.kayn.kayns_spells.registry;

import io.redspace.ironsspellbooks.api.spells.AbstractSpell;
import net.kayn.kayns_spells.Kayns_spells;
import net.kayn.kayns_spells.spells.eldritch.HeavenlyCloneSpell;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class SpellRegistry {
    private static final DeferredRegister<AbstractSpell> SPELLS = DeferredRegister.create(io.redspace.ironsspellbooks.api.registry.SpellRegistry.SPELL_REGISTRY_KEY, Kayns_spells.MOD_ID);
    public static void register(IEventBus eventBus) {
        SPELLS.register(eventBus);
    }

    private static RegistryObject<AbstractSpell> registerSpell(AbstractSpell spell) {
        return SPELLS.register(spell.getSpellName(), () -> spell);
    }

    public static final RegistryObject<AbstractSpell> HEAVENLY_CLONE = registerSpell(new HeavenlyCloneSpell());
}