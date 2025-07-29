package Assignment01;

import java.util.Scanner;

public class HelloName {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Hello");
            System.out.print("Enter your name: ");
            String name = sc.nextLine();
            System.out.println(name);
        }
    }
}
