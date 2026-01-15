public class log {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("(a < b && b > 15): " + (a < b && b > 15));
        
        System.out.println("(a > b || b > 15): " + (a > b || b > 15));

        System.out.println("!(a < b): " + !(a < b));
    }
}
