package org.fasttrack.exercise3;

public class Mouse implements BehaviourAnimal{
    private static final String NAME="mouse";
    @Override
    public String talk() {
        return  NAME + " talk chit-chit";
    }

    @Override
    public String walk() {
        return NAME + " walk like a mouse";
    }

    @Override
    public String eat() {
        return NAME + " eat anything";
    }
}
