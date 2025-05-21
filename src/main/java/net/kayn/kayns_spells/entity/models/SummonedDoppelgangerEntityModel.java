package net.kayn.kayns_spells.entity.models;

import io.redspace.ironsspellbooks.entity.mobs.abstract_spell_casting_mob.AbstractSpellCastingMob;
import io.redspace.ironsspellbooks.entity.mobs.abstract_spell_casting_mob.AbstractSpellCastingMobModel;
import net.bandit.darkdoppelganger.DarkDoppelgangerMod;
import net.minecraft.resources.ResourceLocation;

public class SummonedDoppelgangerEntityModel extends AbstractSpellCastingMobModel {
    public static final ResourceLocation TEXTURE = ResourceLocation.fromNamespaceAndPath(DarkDoppelgangerMod.MOD_ID, "textures/entity/dark_doppelganger.png");

    @Override
    public ResourceLocation getTextureResource(AbstractSpellCastingMob object) {
        return TEXTURE;
    }
}
