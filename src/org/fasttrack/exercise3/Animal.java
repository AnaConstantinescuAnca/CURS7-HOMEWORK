package org.fasttrack.exercise3;

public class Animal {
    private BehaviourAnimal behaviourAnimal;
    public Animal(BehaviourAnimal behaviourAnimal){
        this.behaviourAnimal=behaviourAnimal;
    }

    public static void main(String[] args) {
        Animal cat   = new Animal(new Cat());

        System.out.println(cat.behaviourAnimal.walk());
        System.out.println(cat.behaviourAnimal.eat());
        System.out.println(cat.behaviourAnimal.talk());

        Animal dog = new Animal(new Dog());
        System.out.println(dog.behaviourAnimal.talk());
        System.out.println(dog.behaviourAnimal.walk());
        System.out.println(dog.behaviourAnimal.eat());

        Animal mouse = new Animal(new Mouse());
        System.out.println(mouse.behaviourAnimal.talk());
        System.out.println(mouse.behaviourAnimal.walk());
        System.out.println(mouse.behaviourAnimal.eat());

        Animal chicken = new Animal(new Chiken());
        System.out.println(chicken.behaviourAnimal.talk());
        System.out.println(chicken.behaviourAnimal.walk());
        System.out.println(chicken.behaviourAnimal.eat());

        Animal duck = new Animal(new Duck());
        System.out.println(duck.behaviourAnimal.talk());
        System.out.println(duck.behaviourAnimal.walk());
        System.out.println(duck.behaviourAnimal.eat());
    }
}
