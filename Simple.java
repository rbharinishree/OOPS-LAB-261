
class Animal {
    
    public void sound() {
        System.out.println("This animal makes a sound");
    }
}

class Cat extends Animal {
    
   
    public void sound() {
        System.out.println("Meow Meow");
    }
}


class Dog extends Animal {
    
   
    public void sound() {
        System.out.println("Woof Woof");
    }
}


public class Simple{
    
    public static void main(String[] args) {
        
       
        
        Animal animal1 = new Animal();
        Animal animal2 = new Cat();   
        Animal animal3 = new Dog();   
        
        animal1.sound();   
        animal2.sound();  
        animal3.sound();   
        
        System.out.println("----------------");
        
        
        Cat myCat = new Cat();
        myCat.sound();   
        
        Dog myDog = new Dog();
        myDog.sound();   
    }
}
