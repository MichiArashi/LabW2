package ru.ifmo.se.pokemon;



public class Chimchar extends Pokemon {
    public Chimchar(String name, int level){
        super(name, level);
        setType(Type.FIRE);
        setStats(198, 108, 83, 108, 83,114);
        setMove(new Flamethrower(), new WillOWisp());
    }
}
