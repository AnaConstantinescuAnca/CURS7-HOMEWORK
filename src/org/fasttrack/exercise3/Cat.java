package org.fasttrack.exercise3;

public class Cat implements BehaviourAnimal{
    private static final String NAME = "cat";

    @Override
    public String talk() {
        return NAME + " talk miau";
    }

    @Override
    public String walk() {
        return NAME + " walks like a cat";
    }

    @Override
    public String eat() {
        return NAME+ " eats fish";
    }
}

