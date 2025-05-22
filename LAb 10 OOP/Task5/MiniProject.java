abstract class Employee {
    String name;
    int id;
    
    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
    
    abstract double calculateSalary();
}

interface TaxPayer {
    void payTax();
}

class FullTimeEmployee extends Employee implements TaxPayer {
    double monthlySalary;
    
    FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }
    
    @Override
    double calculateSalary() {
        return monthlySalary;
    }
    
    @Override
    public void payTax() {
        System.out.println("FullTimeEmployee pays 20% tax");
    }
}

class PartTimeEmployee extends Employee implements TaxPayer {
    double hourlyRate;
    int hours;
    
    PartTimeEmployee(String name, int id, double hourlyRate, int hours) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hours = hours;
    }
    
    @Override
    double calculateSalary() {
        return hourlyRate * hours;
    }
    
    @Override
    public void payTax() {
        System.out.println("PartTimeEmployee pays 10% tax");
    }
}

// Main method (add to existing Main class)
public static void main(String[] args) {
    FullTimeEmployee emp1 = new FullTimeEmployee("Alice", 101, 5000);
    PartTimeEmployee emp2 = new PartTimeEmployee("Bob", 102, 20, 40);
    
    System.out.println("Full-time salary: " + emp1.calculateSalary());
    emp1.payTax();
    
    System.out.println("Part-time salary: " + emp2.calculateSalary());
    emp2.payTax();
}