package ru.ifmo.se.pokemon;



public class TriAttack extends SpecialMove {
    public TriAttack() {
        type = Type.NORMAL;
        power = 80;
        accuracy = 100;
        priority = 10;
    }
    @Override
    protected void applyOppDamage(Pokemon p, double damage) {
        p.setMod(Stat.HP, (int) Math.round(damage));
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.2) {
            if (Math.random() <= 0.0667) Effect.paralyze(p);
            else if (Math.random() <= 0.0667) Effect.burn(p);
            else Effect.freeze(p);
        }
    }
    @Override
    protected String describe() {
        return "применил Tri Attack";
    }
}
