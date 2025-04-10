public class ArrayExample {
    public static void main(String[] args) {
        String[] names = {"Shaun", "Joshua", "Custodio"};

        System.out.println("Number of names: " + names.length);

        System.out.println("First name: " + names[0]);
        System.out.println("Middle name: " + names[1]);
        System.out.println("Last name: " + names[2]);

        System.out.println("\nAll names:");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        System.out.println("\nAnother way to loop through (enhanced for loop):");
        
        for (String name : names) {
            System.out.println(name);
        }

        
        int[] scores = {85, 92, 78, 95, 88};

        System.out.println("\nScores:");
        
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        System.out.println("Total score: " + sum);

        
        double average = (double) sum / scores.length;
        System.out.println("Average score: " + average);
    }
}