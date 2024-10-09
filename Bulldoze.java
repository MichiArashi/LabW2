package ru.ifmo.se.pokemon;

public class Bulldoze extends PhysicalMove {
    public Bulldoze() {
        type = Type.GROUND;
        power = 60;
        accuracy = 100;
        priority = 20;
    }
    @Override
    protected void applyOppDamage(Pokemon p, double damage) {
        p.setMod(Stat.HP, (int) Math.round(damage));
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.SPEED, -1);
    }
    @Override
    protected String describe() {
        return "применил Bulldoze";
    }
}
