package ru.ifmo.se.pokemon;
public class LabTwo {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon shuckle = new Shuckle("mario",1);
        Pokemon doduo = new Doduo("дудо",1);
        Pokemon dodrio = new Dodrio("дудри",1);
        Pokemon chimchar = new Chimchar("wowlite",1);
        Pokemon monferno = new Monferno("wow",1);
        Pokemon infernape = new Infernape("wooow",1);

        b.addAlly(shuckle);
        b.addAlly(infernape);
        b.addAlly(dodrio);

        b.addFoe(doduo);
        b.addFoe(chimchar);
        b.addFoe(monferno);

        b.go();
    }
}


