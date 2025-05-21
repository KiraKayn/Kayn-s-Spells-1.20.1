package net.kayn.kayns_spells.spells.eldritch;

import io.redspace.ironsspellbooks.api.config.DefaultConfig;
import io.redspace.ironsspellbooks.api.magic.MagicData;
import io.redspace.ironsspellbooks.api.registry.SchoolRegistry;
import io.redspace.ironsspellbooks.api.spells.*;
import net.kayn.kayns_spells.Kayns_spells;
import net.kayn.kayns_spells.entity.mobs.SummonedDoppelganger;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;

@AutoSpellConfig
public class HeavenlyCloneSpell extends AbstractSpell {
    private final ResourceLocation spellId = ResourceLocation.fromNamespaceAndPath(Kayns_spells.MOD_ID, "summon_darkdoppelganger");


    private final DefaultConfig defaultConfig = new DefaultConfig().setMinRarity(SpellRarity.LEGENDARY).setSchoolResource(SchoolRegistry.ELDRITCH_RESOURCE).setMaxLevel(1).setCooldownSeconds(180).build();

    public HeavenlyCloneSpell() {
        this.manaCostPerLevel = 0;
        this.baseSpellPower = 10;
        this.spellPowerPerLevel = 0;
        this.castTime = 40;
        this.baseManaCost = 500;
    }

    @Override
    public CastType getCastType() {
        return CastType.LONG;
    }

    @Override
    public DefaultConfig getDefaultConfig() {
        return defaultConfig;
    }

    @Override
    public ResourceLocation getSpellResource() {
        return spellId;
    }

    @Override
    public boolean canBeInterrupted(@Nullable Player player) {
        return false;
    }

    @Override
    public void onCast(Level world, int spellLevel, LivingEntity entity, CastSource castSource, MagicData playerMagicData) {
        int summonTime = 20 * 60 * 10; // 10 minutes

        SummonedDoppelganger clone = new SummonedDoppelganger(world, entity);
        clone.setPos(entity.position());

        // Set health, damage, or any other attributes
        clone.getAttributes().getInstance(Attributes.ATTACK_DAMAGE).setBaseValue(15);
        clone.getAttributes().getInstance(Attributes.MAX_HEALTH).setBaseValue(200);
        clone.getAttributes().getInstance(Attributes.MOVEMENT_SPEED).setBaseValue(0.3);
        clone.getAttributes().getInstance(Attributes.FOLLOW_RANGE).setBaseValue(20);
        clone.setHealth(clone.getMaxHealth());

        world.addFreshEntity(clone);

        // Optional: Add effects, timers, visuals, or sounds
        // clone.addEffect(new MobEffectInstance(...));

        super.onCast(world, spellLevel, entity, castSource, playerMagicData);
    }
}
