import java.util.Scanner;

public class NumberComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two integers (space separated): ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        // Comparison
        if (a > b) System.out.println("a > b");
        else if (a < b) System.out.println("a < b");
        else System.out.println("a = b");
        
        // Operations
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        if (b != 0) System.out.println("Division: " + ((double)a / b));
        else System.out.println("Division by zero");
        
        scanner.close();
    }
}
