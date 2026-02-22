//import java.util.*;

public class OOPS {
    
    public static void main(String args[]){
        //Pen p1 = new Pen();  //created a pen object called p1

        // p1.setColor("blue");
        // System.out.println(p1.color);
        // p1.setTip(5);
        // System.out.println(p1.tip);
        // p1.color = "Yellow";
        // System.out.println(p1.color);

//

        // p1.setColor("blue");
        // System.out.println(p1.getColor());
        // p1.setTip(5);
        // System.out.println(p1.getTip());
        // p1.setColor("Yellow");
        // System.out.println(p1.getColor());



        //
        BankAccount myAcc = new BankAccount();
        myAcc.username = "amansahu";
        myAcc.password = "sahuaman";  // error find because password is a private thing you can chnage it but not access it
        myAcc.setPassword("sahuaman");


        //
    //      Student s1 = new Student();
    //    Student s2 = new Student("shradha");
    //    System.out.println(s2.name);
    //    Student s3 = new Student(123);
    //    System.out.println(s3.roll);
    //    //Student s4 = new Student("aman", 567) //not exist
//
//copy constructor
        //   Student s1 = new Student();
        //   s1.name = "shradha";
        //   s1.roll = 456;
        //   s1.password = "abcd";
        //   s1.marks[0] =  100;
        //   s1.marks[1] = 90;
        //   s1.marks[2] = 80;

        //   Student s2 = new Student(s1);
        //   s2.password = "xyz";
        //   s1.marks[2] = 100;
        //   for(int i=0; i<3; i++){
        //     System.out.println(s2.marks[i]);
        //   }


        //
        // Fish shark = new Fish();
        // shark.eat();
        // Fish tuna = new Fish();
        // tuna.breathe();
        // Fish jalpari = new Fish();
        // jalpari.swim();


        //
        // Dog dobby = new Dog();
        // dobby.eat();
        // dobby.legs = 4;
        // System.out.println(dobby.legs);
//
        // Calculator calc = new Calculator();
        // System.out.println(calc.sum(1,2));
        // System.out.println(calc.sum((float)1.5,(float)2.5));
        // System.out.println(calc.sum(1,2,4));
        
        //
        // Deer d = new Deer();
        // d.eat();

        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();

        //
        // Horse h =new Horse();
        // h.eat();
        // h.walk();
        // System.out.println(h.color);
        // Chicken c = new Chicken();
        // c.eat();
        // c.walk();
        //Animal a = new Animal();
       // Mustang myHorse = new Mustang()
//;

    }
    
}


// class Pen{
//     String color;
//     int tip;

//     void setColor(String newColor){
//         color = newColor;
//     }

//     void setTip(int newTip){
//         tip = newTip;
//     }

// }

// class Pen{
//     private String color;
//     private int tip;

//     String getColor(){
//         return this.color;
//     }

//     int getTip(){
//         return this.tip;
//     }

//     void setColor(String newColor){
//         color = newColor;
//     }

//     void setTip(int newTip){
//         tip = newTip;
//     }
//

      
//}





//
class BankAccount {
    public String username;
    private String password;
    public void setPassword(String pwd) {
        password = pwd;
    }
}



// class Student{

//     String name;
//     int roll;
//     String password;
//     int marks[];
    // shallow copy constructor
    // Student(Student s1){
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks;
    // }

    //deep copy constructor // if you explore then go and search lazy copy on stackoverflown.
//     Student(Student s1){
//         marks = new int[3];
//         this.name = s1.name;
//         this.roll = s1.roll;
//         for(int i=0; i<marks.length; i++){
//             this.marks[i] = s1.marks[i];
//         }
//     }

//     Student(){  //non-parameterized construtor.
//         marks = new int[3];
//         System.out.println("constructor is called....");

//     }

//     Student(String name){//parameterrized constructor.
//         marks = new int[3];
//         this.name = name;
//     }

//     Student(int roll){
//         marks = new int[3];
//         this.roll = roll;
//     }
// }


//  Base class
// class Animal{
//     String color;

//     void eat(){
//         System.out.println("eats");
//     }

//     void breathe(){
//         System.out.println("breathes");
//     }
// }

//Derived Class
// class Fish extends Animal{
//     int fins;

//     void swim(){
//         System.out.println("swims in water");
//     }
// }

//Multi level inheritence
// class Mammal extends Animal{
//      int legs;
// }

// class Dog extends Mammal{
//     String breed;
// }


//method overloading
// class Calculator{
//     int sum(int a,int b){
//         return a+b;
//     }
//     float sum(float a,float b){
//         return a+b;
//     }
//     int sum(int a,int b,int c){
//         return a+b+c;
//     }
// }

//Method overriding
// class Animal{
//     void eat(){
//         System.out.println("eat anything");
//     }
// }
// class Deer extends Animal{
//     void eat(){
//         System.out.println("eats grass");
//     }
// }


//

// abstract class Animal{
//     String color;
//     Animal(){
//         System.out.println("animal conatructor called");
//         color = "brown";
//     }

//     void eat(){
//         System.out.println("animal eats");
//     }
//     abstract void walk();
// }

// class Horse extends Animal{
//     Horse(){
//         System.out.println("horse constructor callled");

//     }
//     void changeColor(){
        
//         color = "dark brown";
//     }
//     void walk(){
//         System.out.println("Walks on 4 legs");
//     }
// }

// class  Mustang extends Horse {
//     Mustang(){
//         System.out.println("Mustang constructor called");
//     }

// }

// class Chicken extends Animal{
//     void changeColor(){
//         color = "Yellow";
//     }

//     void walk(){
//         System.out.println("Walks on 2 legs");
//     }
// }