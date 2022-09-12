package org.fasttrack.exercise3;

public class Chiken implements BehaviourAnimal{
    private static final String NAME="chicken";

    @Override
    public String talk() {
        return NAME + " talk piu-piu";
    }

    @Override
    public String walk() {
        return NAME + " walk like a chicken";
    }

    @Override
    public String eat() {
        return NAME + " eat corn";
    }
}
