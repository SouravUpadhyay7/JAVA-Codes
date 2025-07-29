
// This code is for calculating the area and perimeter of a rectangle

package Assignment01;

import java.util.Scanner;

public class RectangleAreaPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter width: ");
        double width = sc.nextDouble();
        System.out.print("Enter height: ");
        double height = sc.nextDouble();
        double area = width * height;
        double perimeter = 2 * (width + height);
        System.out.println("Area is: " + area);
        System.out.println("Perimeter is: " + perimeter);
    }
}

