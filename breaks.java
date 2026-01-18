public class breaks{
    public static void main(String[] args) {
        // A loop intended to run 10 times
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Breaking at 5...");
                break; // This exits the loop entirely
            }
            System.out.println("Number: " + i);
        }
        System.out.println("Loop finished.");
    }
}