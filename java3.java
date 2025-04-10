public class ForLoopIf {
    public static void main(String[] args) {
        
        System.out.println("Even and Odd Numbers:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is even");
            } else {
                System.out.println(i + " is odd");
            }
        }

        System.out.println("\nNumbers divisible by 3:");
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                System.out.println(i + " is divisible by 3");
            }
        }

        System.out.println("\nFinding a specific name:");
        String[] names = {"Rodel", "Christian", "Martinez", "Anna", "Mark"};
        String searchName = "Christian";
        boolean found = false;

        for (String name : names) {
            if (name.equals(searchName)) {
                System.out.println(searchName + " found in the array!");
                found = true;
                break; 
            }
        }

        if (!found) {
            System.out.println(searchName + " not found in the array.");
        }

        System.out.println("\nPrinting numbers with a condition:");
        for (int i = 1; i <= 10; i++) {
            if (i > 5) {
                System.out.println(i + " is greater than 5");
            }
        }
    }
}