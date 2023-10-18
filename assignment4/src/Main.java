import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\n1. Rectangle\n2. Circle\n3. Triangle\n4. Square\n5. Exit");

            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter width: ");
                    double width = scan.nextDouble();
                    System.out.print("Enter height: ");
                    double height = scan.nextDouble();
                    Rectangle rectangle = new Rectangle(width, height);
                    System.out.println("\nArea: " + rectangle.getArea());
                    System.out.println("Perimeter: " + rectangle.getPerimeter());
                    break;
                case 2:
                    System.out.print("Enter radius: ");
                    double radius = scan.nextDouble();
                    Circle circle = new Circle(radius);
                    System.out.println("\nArea: " + circle.getArea());
                    System.out.println("Perimeter: " + circle.getPerimeter());
                    break;
                case 3:
                    System.out.print("Enter side1: ");
                    double side1 = scan.nextDouble();
                    System.out.print("Enter side2: ");
                    double side2 = scan.nextDouble();
                    System.out.print("Enter side3: ");
                    double side3 = scan.nextDouble();
                    Triangle triangle = new Triangle(side1, side2, side3);
                    System.out.println("\nArea: " + triangle.getArea());
                    System.out.println("Perimeter: " + triangle.getPerimeter());
                    break;
                case 4:
                    System.out.print("Enter side length: ");
                    double sideLength = scan.nextDouble();
                    Square square = new Square(sideLength);
                    System.out.println("\nArea: " + square.getArea());
                    System.out.println("Perimeter: " + square.getPerimeter());
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("\nInvalid option!");
            }
        }
        scan.close();
    }
}
