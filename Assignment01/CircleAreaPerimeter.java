// this code is for calculating the area and perimeter of a circle

package Assignment01;

import java.util.Scanner;

public class CircleAreaPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();
        double area = Math.PI * radius * radius;
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Area is: " + area);
        System.out.println("Perimeter is: " + perimeter);
    }
}

