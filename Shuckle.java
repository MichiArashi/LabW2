package ru.ifmo.se.pokemon;



public class Shuckle extends Pokemon {
    public Shuckle(String name, int level) {
        super(name, level);
        setType(Type.BUG, Type.ROCK);
        setStats(150, 22, 418, 22, 418, 13);
        setMove(new Facade(), new Bulldoze(), new SludgeBomb(), new Withdraw());
    }
}
