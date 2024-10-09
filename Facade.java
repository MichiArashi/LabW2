package ru.ifmo.se.pokemon;



public class Facade extends PhysicalMove {
    public Facade() {
        type = Type.NORMAL;
        power = 70;
        accuracy = 100;
        priority = 20;
    }
    @Override
    protected void applyOppDamage(Pokemon p, double damage) {
        Status status = p.getCondition();
        if (status.equals(Status.BURN) || status.equals(Status.PARALYZE) || status.equals(Status.POISON)) {
            p.setMod(Stat.HP, (int) Math.round(damage) * 2);
        }
        p.setMod(Stat.HP, (int) Math.round(damage));
    }
    @Override
    protected String describe() {
        return "применил Facade";
    }
}
