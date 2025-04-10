import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {
        System.out.println("Counting from 1 to 5 using do-while:");
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 5);

        System.out.println("\nExample 2: Getting user input until they enter 'quit'");
        Scanner scanner = new Scanner(System.in);
        String userInput;

        do {
            System.out.print("Enter something (or 'quit' to exit): ");
            userInput = scanner.nextLine();
            System.out.println("You entered: " + userInput);
        } while (!userInput.equalsIgnoreCase("quit"));

        System.out.println("\nExample 3: Simple menu");
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Option A");
            System.out.println("2. Option B");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("You selected Option A.");
                    break;
                case 2:
                    System.out.println("You selected Option B.");
                    break;
                case 3:
                    System.out.println("Exiting.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);

        scanner.close();
    }
}