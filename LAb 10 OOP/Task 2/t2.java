interface Vehicle {
    void start();
    void stop();
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car started with key");
    }
    @Override
    public void stop() {
        System.out.println("Car stopped");
    }
}

class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bike started with kick");
    }
    @Override
    public void stop() {
        System.out.println("Bike stopped");
    }
}

// Main method (add to existing Main class)
public static void main(String[] args) {
    Car car = new Car();
    Bike bike = new Bike();
    
    car.start();
    car.stop();
    
    bike.start();
    bike.stop();
}