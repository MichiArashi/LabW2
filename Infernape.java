package ru.ifmo.se.pokemon;



public class  Infernape extends Monferno {
    public Infernape (String name, int level){
        super(name, level);
        setStats(262, 191, 132, 191, 132, 198);
        setType(Type.FIRE, Type.FIGHTING);
        setMove(new FlameCharge(),new SlackOff(),new Flamethrower(), new WillOWisp());
    }
}
