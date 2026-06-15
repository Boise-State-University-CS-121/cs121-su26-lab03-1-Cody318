import java.util.Scanner;
import java.util.Random;

public class Accountgenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        String firstInitial = firstName.substring(0, 1);
        String lastNamePart = lastName.substring(0, 5);

        Random random = new Random();
        int randomNumber = random.nextInt(90) + 10; 

        String username = (firstInitial + lastNamePart + randomNumber).toLowerCase();

        System.out.println("Username: " + username);

        scanner.close();
    }
}
