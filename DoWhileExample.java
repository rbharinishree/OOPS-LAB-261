import java.util.Scanner;
public class DoWhileExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.print("Please enter a number between 1 and 10: ");
            number = scanner.nextInt();
            
            if (number < 1 || number > 10) {
                System.out.println("Invalid entry! Try again.");
            }
            
        } while (number < 1 || number > 10); 

        System.out.println("Thank you! You entered: " + number);
        scanner.close();
    }
}