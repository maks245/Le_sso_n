package Homeworks.HW9;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();

                if (radius <= 0) {
                    throw new IllegalArgumentException("Radius must be positive.");
                }

                Circle circle = new Circle(radius);


                System.out.println("The square of the circle is: " + circle.calculateSquare());
                System.out.println("The perimeter of the circle is: " + circle.calculatePerimeter());

                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (java.util.InputMismatchException e) {
                System.out.println("Error: Please enter a valid numeric value.");
                scanner.nextLine();
            }
        }
    }
}


