package org.fasttrack.exercise3;

public class Dog implements BehaviourAnimal{
    private static final String NAME="dog";
    @Override
    public String talk() {
        return NAME +  " talk ham";
    }

    @Override
    public String walk() {
        return NAME + " runing like a dog";
    }

    @Override
    public String eat() {
        return NAME + " eats bones";
    }
}
