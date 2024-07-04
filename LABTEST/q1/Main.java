import java.io.FileWriter;
import java.io.IOException;

abstract class Employee {
    String name;
    double basicPay;

    Employee(String name, double basicPay) {
        this.name = name;
        this.basicPay = basicPay;
    }

    abstract void getEmployeeDetails();
    abstract void displayEmployeeDetails();
    abstract double computeSalary();
}

class HeadTeacher extends Employee {
    HeadTeacher(String name, double basicPay) {
        super(name, basicPay);
    }

    void getEmployeeDetails() {}

    void displayEmployeeDetails() {}

    double computeSalary() {
        double da = 0.45 * basicPay;
        double hra = 0.12 * basicPay;
        double medicalAllowance = 1500;
        double totalSalary = basicPay + da + hra + medicalAllowance;
        return totalSalary;
    }
}

class AssistantTeacher extends Employee {
    AssistantTeacher(String name, double basicPay) {
        super(name, basicPay);
    }

    void getEmployeeDetails() {}

    void displayEmployeeDetails() {}

    double computeSalary() {
        double da = 0.45 * basicPay;
        double hra = 0.12 * basicPay;
        double medicalAllowance = 1500;
        double totalSalary = basicPay + da + hra + medicalAllowance;
        return totalSalary;
    }
}

class Librarian extends Employee {
    Librarian(String name, double basicPay) {
        super(name, basicPay);
    }

    void getEmployeeDetails() {}

    void displayEmployeeDetails() {}

    double computeSalary() {
        double da = 0.45 * basicPay;
        double hra = 0.12 * basicPay;
        double medicalAllowance = 1500;
        double totalSalary = basicPay + da + hra + medicalAllowance;
        return totalSalary;
    }
}

public class Main {
    public static void main(String[] args) {
        HeadTeacher alpha = new HeadTeacher("Mr. Alpha", 30000);
        AssistantTeacher beta = new AssistantTeacher("Mr. Beta", 27000);
        AssistantTeacher gamma = new AssistantTeacher("Mrs. Gamma", 25000);
        Librarian delta = new Librarian("Miss. Delta", 20000);

        double alphaSalary = alpha.computeSalary();
        double betaSalary = beta.computeSalary();
        double gammaSalary = gamma.computeSalary();
        double deltaSalary = delta.computeSalary();

        
        try {
            FileWriter writer = new FileWriter("employee_salary.txt");
            writer.write("Name: " + alpha.name + ", Basic Pay: " + alpha.basicPay + ", Total Salary: " + alphaSalary + "\n");
            writer.write("Name: " + beta.name + ", Basic Pay: " + beta.basicPay + ", Total Salary: " + betaSalary + "\n");
            writer.write("Name: " + gamma.name + ", Basic Pay: " + gamma.basicPay + ", Total Salary: " + gammaSalary + "\n");
            writer.write("Name: " + delta.name + ", Basic Pay: " + delta.basicPay + ", Total Salary: " + deltaSalary + "\n");
            writer.close();
        } catch (IOException e) {
           System.out.println("An error occurred while writing to file.");
           e.printStackTrace();
        }
    }
}
