public class WhileLoopExample {
    public static void main(String[] args) {

        System.out.println("Counting from 1 to 5 using while loop:");
        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }

        System.out.println("\nExample 2: Looping until a condition is met");
        int counter = 10;
        while (counter > 0) {
            System.out.println("Counter is: " + counter);
            counter--;
        }
        System.out.println("Blast off!");

        System.out.println("\nExample 3: Reading user input until 'quit'");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String input = "";
        while (!input.equalsIgnoreCase("quit")) {
            System.out.print("Enter something (or 'quit' to exit): ");
            input = scanner.nextLine();
            System.out.println("You entered: " + input);
        }
        scanner.close();

        System.out.println("\nExample 4: Looping with a boolean flag");
        boolean running = true;
        int timer = 0;
        while (running) {
            System.out.println("Timer: " + timer);
            timer++;
            if (timer >= 3) {
                running = false;
                System.out.println("Timer reached 3, stopping.");
            }
        }
    }
}