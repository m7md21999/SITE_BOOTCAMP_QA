package com.company.core.animal;

public class Animal {

    public void eat()
    {
        System.out.println("Eating ...");
    }

    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.eat();

        Dog dog = new Dog();
        dog.talk();
        dog.eat();

        //down-casting
        Animal cat = new Cat();
        cat.eat();

        //way 1
        Cat c = (Cat)cat;
        c.talk();

        //way 2
        ((Cat)cat).talk();



    }
}


