package net.kayn.kayns_spells.entity.renderers;

import io.redspace.ironsspellbooks.entity.mobs.abstract_spell_casting_mob.AbstractSpellCastingMobRenderer;
import net.kayn.kayns_spells.entity.models.SummonedDoppelgangerEntityModel;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class SummonedDoppelgangerEntityRenderer extends AbstractSpellCastingMobRenderer {
    public SummonedDoppelgangerEntityRenderer(EntityRendererProvider.Context context) {
        super(context, new SummonedDoppelgangerEntityModel());
    }
}
