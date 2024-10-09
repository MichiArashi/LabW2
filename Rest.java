package ru.ifmo.se.pokemon;



public class Rest extends StatusMove {
    public Rest() {
        type = Type.PSYCHIC;
        power = 0;
        accuracy = 0;
        priority = 5;
    }
    Effect e = new Effect().turns(2);
    @Override
    protected void applySelfEffects(Pokemon p) {
        e.sleep(p);
        p.restore();
    }
    @Override
    protected String describe() {
        return "хочет спать!";
    }
}
