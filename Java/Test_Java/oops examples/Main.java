class Animal {
    Animal getAnimal() {
        System.out.println("Animal getAnimal() called");
        return this;
    }
}

class Dog extends Animal {
    @Override
    Dog getAnimal() {  // Covariant return type
        System.out.println("Dog getAnimal() called");
        return this;
    }

    void bark() {
        System.out.println("Woof! Woof!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.getAnimal();  // Calls Animal's getAnimal method

        Dog myDog = new Dog();
        myDog.getAnimal().bark();  // Calls Dog's getAnimal method and then bark()

        Animal animalRefToDog = new Dog();
        animalRefToDog.getAnimal();  // Calls Dog's getAnimal method due to polymorphism
    }
}
