package ru.ifmo.se.pokemon;



public class SludgeBomb extends SpecialMove {
    public SludgeBomb() {
        type = Type.POISON;
        power = 90;
        accuracy = 100;
        priority = 10;
    }

    @Override
    protected void applyOppDamage(Pokemon p, double damage) {
        p.setMod(Stat.HP, (int) Math.round(damage));
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.3) Effect.poison(p);
    }
    @Override
    protected String describe() {
        return "применил Sludge Bomb";
    }
}