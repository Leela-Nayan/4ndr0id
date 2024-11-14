abstract class Animal {
    // Base class method
    abstract void sound();
  }
  
  class Dog extends Animal {
    // Overriding the sound() method
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
  }
  
  class Cat extends Animal {
    // Overriding the sound() method
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
  }
  
  public class Test2 {
    public static void main(String[] args) {
        Animal myDog = new Dog();  // Animal reference, Dog object
        Animal myCat = new Cat();  // Animal reference, Cat object
  
        myDog.sound();  // Output: Dog barks
        myCat.sound();  // Output: Cat meows
    }
  }