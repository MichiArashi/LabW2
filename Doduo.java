package ru.ifmo.se.pokemon;



public class Doduo extends Pokemon {
    public Doduo(String name, int level) {
        super(name, level);
        setType(Type.NORMAL, Type.FLYING);
        setStats(180, 157, 85, 67, 67, 139);
        setMove(new Rest(), new WorkUp(), new Facade());
    }
}
