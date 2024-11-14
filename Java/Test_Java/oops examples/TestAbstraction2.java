// abstract class Demo //abstract class  
// {  
// //abstract method declaration  
// abstract void display();  
// }  
// public class MyClass extends Demo  
// {  
// //method impelmentation  
// void display()  
// {  
// System.out.println("Abstract method?");  
// }  
// public static void main(String args[])  
// {  
// //creating object of abstract class  
// MyClass obj = new MyClass();  
// //invoking abstract method  
// obj.display();  
// }  
// }  

//--------------------------------------------------------------------------------------------------------------------------

// // abstract class  
// abstract class Multiply {  
     
//     // abstract methods   
//     // sub class must implement these methods  
//     public abstract int MultiplyTwo (int n1, int n2);  
//     public abstract int MultiplyThree (int n1, int n2, int n3);  
       
//     // regular method with body  
//     public void show() {  
//      System.out.println ("Method of abstract class Multiply");  
//     }  
//  }  
//  // Regular class extends abstract class  
//  class AbstractMethodEx1 extends Multiply {  
   
//    // if the abstract methods are not implemented, compiler will give an error  
//     public int MultiplyTwo (int num1, int num2) {  
//      return num1 * num2;  
//     }  
//     public int MultiplyThree (int num1, int num2, int num3) {  
//      return num1 * num2 * num3;  
//     }  
   
//     // main method  
//     public static void main (String args[]) {  
//      Multiply obj = new AbstractMethodEx1();  
//      System.out.println ("Multiplication of 2 numbers: " + obj.MultiplyTwo (10, 50));  
//      System.out.println ("Multiplication of 3 numbers: " + obj.MultiplyThree (5, 8, 10));  
//      obj.show();  
//     }  
//  }  

//----------------------------------------------------------------------------------------------------------------------

//ALL IN ONE EXAMPLE OF ABSTRACT CLASS
abstract class Bike{  
   Bike(){System.out.println("bike is created");}  
   abstract void run();  
   void changeGear(){System.out.println("gear changed");}  
 }  
//Creating a Child class which inherits Abstract class  
 class Honda extends Bike{  
 void run(){System.out.println("running safely..");}  
 }  
//Creating a Test class which calls abstract and non-abstract methods  
 class TestAbstraction2{  
 public static void main(String args[]){  
  Bike obj = new Honda();  
  obj.run();  
  obj.changeGear();  
 }  
}  