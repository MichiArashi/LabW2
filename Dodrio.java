package ru.ifmo.se.pokemon;



public class Dodrio extends Doduo {
    public Dodrio(String name, int level) {
        super(name, level);
        setType(Type.NORMAL, Type.FLYING);
        setStats(230, 202, 130, 112, 112, 202);
        setMove(new TriAttack(),new Rest(), new WorkUp(), new Facade());
    }
}
