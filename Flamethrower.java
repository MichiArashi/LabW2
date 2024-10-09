package ru.ifmo.se.pokemon;


public class Flamethrower extends SpecialMove {
    public Flamethrower(){
        type= Type.FIRE;
        power=90;
        accuracy=100;
        priority=15;
    }
    @Override
    protected void applyOppDamage(Pokemon p, double damage){
        p.setMod(Stat.HP, (int) Math.round(damage));
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random()<=0.1){
            Effect.burn(p);
        }
    }
    @Override
    protected String describe(){
        return "применил Flamethrower";
    }
}