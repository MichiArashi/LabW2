package ru.ifmo.se.pokemon;



public class WorkUp extends StatusMove {
    public WorkUp(){
        type= Type.NORMAL;
        power=0;
        accuracy=0;
        priority=30;
    }
    protected void applySelfEffect(Pokemon p){
        p.setMod(Stat.ATTACK,1);
        p.setMod(Stat.SPECIAL_ATTACK,1);

    }
    @Override
    protected String describe(){
        return "применил Work Up";
    }
}
