// this code is for basic math operations


package Assignment01;

import java.util.Scanner;

public class BasicMathOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " x " + b + " = " + (a * b));
        if(b != 0) {
            System.out.println(a + " / " + b + " = " + (a / b));
            System.out.println(a + " mod " + b + " = " + (a % b));
        } else {
            System.out.println("Division/modulus by zero not allowed.");
        }
    }
}

