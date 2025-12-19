import java.util.Scanner;

public class Program_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = sc.nextDouble();

        System.out.print("Enter b: ");
        double b = sc.nextDouble();

        System.out.print("Enter operation: ");
        String type = sc.next();

        Calculator calc = new Calculator(a, b);
        System.out.println("Result: " + calc.calculate(type));


    }
}
class Calculator {
    double a;
    double b;

    Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    double calculate(String type) {
        if (type.equalsIgnoreCase("add")) {
            return a + b;
        } else if (type.equalsIgnoreCase("subtract")) {
            return a - b;
        } else if (type.equalsIgnoreCase("multiply")) {
            return a * b;
        } else if (type.equalsIgnoreCase("divide")) {
            if (b == 0) {
                System.out.println("Division by zero not allowed");
                return 0;
            }
            return a / b;
        } else {
            System.out.println("Invalid operation");
            return 0;
        }
    }

}
