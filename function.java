
//public class function {

    // public static void printHelloWorld() {
    //     System.out.println("Hello World");
    //     System.out.println("Hello World");
    // }
    // public static int calculateSum(int num1, int num2) //return type(parameters or formal parameter)
    // {
    //     int sum = num1 + num2;
    //     return sum;
    // 
    //Call by value.
    // public static void swap(int a, int b){
    //     int temp =a;
    //     a = b;
    //     b =temp;
    //     System.out.println("a = " + a);
    //     System.out.println("b = " +b);
    // }
    // public static void main(String args[]) {
    //      Scanner sc = new Scanner(System.in);
    //     // int a = sc.nextInt();
    //     // int b = sc.nextInt();
    //     // int sum = calculateSum(a, b);//arguments or actual parameters
    //     // System.out.println("sum is :" + sum);
    //     //
    //     //
    //     //Swap 
    //     int a =5;
    //     int b =10;
    //     swap(a,b);
    //
    //
    // public static int multiply(int a, int b) {
    //     int product = a * b;
    //     return product;
    // }
    // //
    // public static void main(String args[]) {
    //     int a = 3;
    //     int b = 5;
    //     int prod = multiply(a, b);
    //     System.out.println("a* b =" + prod);
    //     prod = multiply(10, 20);
    //     System.out.println("a * b =" + prod);
    //
    //
    //Factorail;
    // public static int fact(int n) {
    //     int f = 1;
    //     for (int i = 1; i <= n; i++) {
    //         f = f * i;
    //     }
    //     return f; //fact of n.
    // }
    // //Binomial cofficent 
    // public static int binoco(int n, int r) {
    //     int fact_n = fact(n);
    //     int fact_r = fact(r);
    //     int fact_nmr = fact(n - r);
    //     int binoco = fact_n / (fact_r * fact_nmr);
    //     return binoco;
    // }
    // public static void main(String args[]) {
    //     System.out.println(binoco(5, 2));
    //
    //
    //Sum of two numbbers
    // public static int sum(int a, int b) {
    //     return a + b;
    // }
    // //fucn calculate sum of 3 numb ;
    // public static int sum(int a, int b, int c) {
    //     return a + b + c;
    // }
    //
    //Funcn to cal sum 
    // public static float sum(float a, float b) {
    //     return a + b;
    // }
    //
    // public static void main(String args[]) {
    //     // System.out.println(sum(3, 5));
    //     // System.out.println(sum(5, 2, 1));
    //     System.out.println(sum(3.2f, 4.8f));
    ////
    //
    //
    //Prime number.
    //  public static boolean isprime(int n) {
    //     //corner cases
    //     //2
    //     if (n == 2) {
    //         return true;
    //     }
    //     boolean isprime = true;
    //     for (int i = 2; i <= n - 1; i++) {
    //         if (n % i == 0) {
    //             isprime = false;
    //             break;
    //         }
    //     }
    //     return isprime;
    // }

    // public static void main(String args[]) {
    //     System.out.println(isprime(2));


    //
    //
    //Optimize rule to check prime nummb.
    // public static boolean isprime(int n) {
    //     if (n == 2) {
    //         return true;
    //     }
    //     for (int i = 2; i <= Math.sqrt(n); i++) {
    //         if (n % i == 0) {
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    // //For range of prime numb
    // public static void primesInRange(int n) {
    //     for (int i = 2; i <= n; i++) {
    //         if (isprime(i)) {//true
    //             System.out.print(i + " ");
    //         }
    //     }
    //     System.out.println();
    // }

    // public static void main(String args[]) {
    //     //System.out.print(isprime(7));
    //     primesInRange(20); //2 to 20
    //
    //

    //
    //bainary to decimal;
//     public static void binToDec(int binNum) {
//         int myNum = binNum;
//         int pow = 0;
//         int decNum = 0;

//         while (binNum > 0) {
//             int lastdigit = binNum % 10;
//             decNum = decNum + (lastdigit * (int) Math.pow(2, pow));
//             pow++;
//             binNum = binNum / 10;
//         }
//         System.out.println("decimal of " + myNum + "  =" + decNum);
//     }

//     //
//     //Decimal to binary
//     public static void decToBin(int n) {
//         int myNum = n;
//         int pow = 0;
//         int binNum = 0;
//         while (n > 0) {
//             int rem = n % 2;
//             binNum = binNum + (rem * (int) Math.pow(10, pow));
//             pow++;
//             n = n / 2;
//         }
//         System.out.println("binary form of " + myNum + " = " + binNum);
//     }

//     public static void main(String args[]) {
//         //binToDec(111);
//         decToBin(5);

//      }
//  }
