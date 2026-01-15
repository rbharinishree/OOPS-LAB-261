public class un{
    public static void main(String[] args) {

        int a = 10;

        System.out.println("Initial value of a: " + a);

        System.out.println("Unary plus (+a): " + (+a));
        System.out.println("Unary minus (-a): " + (-a));

       
        System.out.println("Post-increment (a++): " + (a++));
        System.out.println("After post-increment, a = " + a);

        System.out.println("Pre-increment (++a): " + (++a));

      
        System.out.println("Post-decrement (a--): " + (a--));
        System.out.println("After post-decrement, a = " + a);

        System.out.println("Pre-decrement (--a): " + (--a));

     
        boolean red= true;
        System.out.println("red = " + red);
        System.out.println("FALSE(!red): " + (!red));
    }
}
