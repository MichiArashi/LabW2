package ru.ifmo.se.pokemon;



public class  Monferno extends Chimchar{
    public Monferno (String name, int level){
        super(name, level);
        setStats(238, 144, 98, 144, 98, 150);
        setType(Type.FIRE, Type.FIGHTING);
        setMove(new SlackOff(),new Flamethrower(), new WillOWisp());
    }
}