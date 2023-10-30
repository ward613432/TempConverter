import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean valid = false;
        boolean end = false;
        double celsius = 0;
        double farenheit = 0;

        while (!end) {
            // conversion stuffs
            do {
                System.out.println("Please enter a temperature in degrees C to be converted in degrees F:");

                if (scanner.hasNextDouble()) {
                    celsius = scanner.nextDouble();
                    farenheit = (celsius * 9/5) + 32;
                    valid = true;
                } else {
                    System.out.println("That wasn't a valid input. Please try again.");
                    scanner.nextLine();
                }
            } while (!valid);
            scanner.nextLine();
            valid = false;

            System.out.printf("%-10s %.02f\n", "Degrees C:", celsius);
            System.out.printf("%-10s %.02f\n", "Degrees F:", farenheit);

            // continue/stop stuffs
            do {
                System.out.println("Would you like to make another conversion? [Y/N]");

                if (scanner.hasNextLine()) {
                    String yn = scanner.nextLine().toLowerCase();
                    if (yn.equals("n")) {
                        end = true;
                        valid = true;
                    } else if (yn.equals("y")) {
                        valid = true;
                    } else {
                        System.out.println("That wasn't a valid input. Please try again.");
                    }
                }
            } while (!valid);
            valid = false;
        }
    }
}