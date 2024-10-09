package ru.ifmo.se.pokemon;



public class SlackOff extends StatusMove {
    public SlackOff(){
        type= Type.NORMAL;
        power=0;
        accuracy=0;
        priority=5;
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.HP, (int) (-1*p.getStat(Stat.HP)*0.5));
    }

    @Override
    protected String describe(){
        return "применил Slack Off";
    }
}