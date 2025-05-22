abstract class Animal {
    abstract void makeSound();
    void cast() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow");
    }
}

// Main method for testing
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        
        dog.cast();
        dog.makeSound();
        
        cat.cast();
        cat.makeSound();
    }
}