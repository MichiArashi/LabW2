package ru.ifmo.se.pokemon;



public class Withdraw extends StatusMove {
    public Withdraw() {
        type = Type.WATER;
        power = 0;
        accuracy = 0;
        priority = 40;
    }
    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.DEFENSE, 1);
    }
    @Override
    protected String describe() {
        return "применил Withdraw";
    }
}
