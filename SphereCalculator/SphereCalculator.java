import java.util.Scanner;

public class SphereCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the sphere's radius: ");
        double radius = scanner.nextDouble();

        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        double surfaceArea = 4 * Math.PI * Math.pow(radius, 2);

        System.out.printf("Volume: %.4f%n", volume);
        System.out.printf("Surface area: %.4f%n", surfaceArea);

        scanner.close();
    }
}