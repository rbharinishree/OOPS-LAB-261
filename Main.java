
abstract class Animal {
   
    abstract void sound();

    
    void sleep() {
        System.out.println("Sleeping...");
    }
}


class Dog extends Animal {
    // Implement abstract method
    void sound() {
        System.out.println("Dog barks");
    }
}


public class Main {
    public static void main(String[] args) {
        Animal a = new Dog();  
        a.sound();             
        a.sleep();             
    }
}