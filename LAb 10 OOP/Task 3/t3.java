abstract class Shape {
    abstract double area();
}

interface Printable {
    void print();
}

class Rectangle extends Shape implements Printable {
    double width, height;
    
    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    @Override
    public double area() {
        return width * height;
    }
    
    @Override
    public void print() {
        System.out.println("Area: " + area());
    }
}

// Main method (add to existing Main class)
public static void main(String[] args) {
    Rectangle rect = new Rectangle(5, 10);
    rect.print(); // Output: Area: 50.0
}