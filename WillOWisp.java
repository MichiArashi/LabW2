package ru.ifmo.se.pokemon;



public class WillOWisp extends StatusMove {
    public WillOWisp(){
        type = Type.FIRE;
        power = 0;
        accuracy = 85;
        priority = 15;
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect.burn(p);
        p.setMod(Stat.ATTACK, (int) (-1*(p.getStat(Stat.ATTACK)*0.5)));
    }
    @Override
    protected String describe(){
        return "применил Will-O-Wisp";
    }
}
