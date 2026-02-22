
// import java.util.*;

public class javabasics {

    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);

        // System.out.print("hello Aman sahu\n vivek\n");
        // System.out.print("hello Aman sahu\n");
        // System.out.println("hello Aman sahu");
        // System.out.println("****");
        // System.out.println("***");
        // System.out.println("**");
        // System.out.println("*");
        // int a =10;
        // int b=5;
        // System.out.println(a);
        // System.out.println(b);
        // String name ="aman sahu";
        // System.out.println(name);
        // a=50;
        // System.out.println(a);
        // b=a;
        // System.out.print(b);
//1 byte=8 bits
// byte b=8;//b byte[-128 to 127] 256
//         System.out.println(b);
//         char ch ='a';//2 bytes
//         System.out.println(ch);
//         boolean var =false;//1 byte[true false]
//         System.out.println(var);
//         float price=2.5;//4 bytes
//         int number=45;//4 bytes
//         //long[8 bytes]
//         //double[8 bytes]
        // short n=240;// 2 bytes
        //  // code to calculate sum
        //    int a=10;
        //    int b=5;
        //    int sum =a+b;
        //     System.out.println(sum);
        // input in java// for name /for one word (next)
        // String input = sc.next();
        // System.out.println(input);
        //  //input for full name / pragraphe also (nextLine)
        // String name = sc.nextLine();
        // System.out.println(name);
        // for integer
        //     int number = sc.nextInt();
        //     System.out.println(number);
        // float price = sc.nextFloat();
        //System.out.println(price);
        //  double price = sc.nextDouble();
        // System.out.println(price);
        // boolean var = sc.nextBoolean();
        //System.out.println(var);
        //sum of a & b by using iput
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = a + b;
        // System.out.println(sum);
        //PRoduct od a&b 
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int product = a * b;
        // System.out.println(product);
        //Area of circle
        // float r = sc.nextFloat();
        // float area = 3.14f * r * r;
        // System.out.println(area);
        // Type conversion (widening)
        // conversion happens when:
        //a. type compatible
        //b.destination type> source type
        //   byte>short>int>float>long>double.
        //example
        //float number = sc.nextInt();
        //System.out.println(number);//right
        //
        //int number = sc.nextFloat();
        //System.out.println(number);//wrong;
        // type casting[jabrdasti chnage karna][narrowing ,explicet conversion]
        // float marks = 99.999f;
        // int marks2 = (int) marks;
        // System.out.println(marks2);
        // char ch = 'a';
        // int number = ch;
        // System.out.println(number);
        //Type promotion in expressions 
        //change byte,short,char into int
        // char a = 'a';
        // char b = 'b';
        // System.out.println((int) (b));
        // System.out.println((int) (a));
        // System.out.println(b - a);
        // short a = 5;
        // byte b = 25;
        // char c = 'c';
        // // byte bt = (a+b+c);[error]
        // byte bt = (byte) (a + b + c);
        // System.out.println(bt);
        //if one oprend is long ,float,or double the whole expreession is prometed to long , float or double respectively.
        int a = 10;
        float b = 20.25f;
        long c = 25;
        double d = 30;
        double ans = a + b + c + d;
        // int ans =a+b+c+d;{error found}
        System.out.println(ans);

    }
}
//BOILERPLATE code 
