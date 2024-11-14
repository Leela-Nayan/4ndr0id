class Person{
    String name;

    Person(){
    
    }

    Person(String s){
    name = s;
    }

    void greet(){
    System.out.println("Hello, "+ name + "!");    
    }
}

public class constructor{
    public static void main(String args []){
        Person p1 = new Person("Nayan");
        p1.greet();
        Person p2 = new Person();
    }
}