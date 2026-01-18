public class jnest{
    public static void main(String[] args) {
        boolean isEmployed = true;
        int salary = 50000;

        if (isEmployed == true) {
            
            if (salary >= 40000) {
                System.out.println("Congratulations! You qualify for a loan.");
            } else {
                System.out.println("Salary too low for a loan.");
            }
        } else {
            System.out.println("You must be employed to apply.");
        }
    }
}