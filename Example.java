class Parent {
    void view() {
        System.out.println("this is a parent class method");
    }
}

class Child extends Parent {    
    void view() {              
        System.out.println("this is a child class method");  
    }
}

public class Example {
    public static void main(String[] args) {
        
        Parent p = new Parent();          
        p.view();                        
        
        Child c = new Child();          
        c.view();                        
        
        Parent ref = new Child();         
        ref.view();                       
}
}