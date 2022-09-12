package org.fasttrack.exercise3;

public class Duck implements BehaviourAnimal{
    private static final String NAME="duck";


    @Override
    public String talk() {
        return NAME + " talk mac-mac";
    }

    @Override
    public String walk() {
        return NAME + " walking like a duck";
    }

    @Override
    public String eat() {
        return NAME + " eat corn grains";
    }
}
