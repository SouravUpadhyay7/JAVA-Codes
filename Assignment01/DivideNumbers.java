
// this code is for dividing two numbers




package Assignment01;
import java.util.Scanner;
public class DivideNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numerator: ");
        int a = sc.nextInt();
        System.out.print("Enter denominator: ");
        int b = sc.nextInt();
        if(b != 0) {
            int result = a / b;
            System.out.println("Result: " + result);
        } else {
            System.out.println("Division by zero is not allowed.");
        }
    }
}
