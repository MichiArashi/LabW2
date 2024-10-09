package ru.ifmo.se.pokemon;



public class FlameCharge extends PhysicalMove {
    public FlameCharge(){
        type= Type.FIRE;
        power=50;
        accuracy=100;
        priority=20;
    }

    @Override
    protected void applyOppDamage(Pokemon p, double damage){
        p.setMod(Stat.HP, (int) Math.round(damage));
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.SPEED, 1);
    }

    @Override
    protected String describe(){
        return "применил Flame Charge";
    }
}
