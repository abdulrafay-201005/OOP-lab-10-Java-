interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

class Duck implements Flyable, Swimmable {
    @Override
    public void fly() {
        System.out.println("Duck flies");
    }
    @Override
    public void swim() {
        System.out.println("Duck swims");
    }
}

// Main method (add to existing Main class)
public static void main(String[] args) {
    Duck duck = new Duck();
    duck.fly();
    duck.swim();
}