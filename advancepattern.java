
public class advancepattern {

    // Print Hollow rectangle
    // public static void hollow_rect(int totRows, int totCols) {
    // //outer loop
    // for (int i = 1; i <= totRows; i++) {
    // //innerloop -col
    // for (int j = 1; j <= totCols; j++) {
    // //cell - (i,j)
    // if (i == 1 || i == totRows || j == 1 || j == totCols) {
    // //boundry cell
    // System.out.print("*");
    // } else {
    // System.out.print(" ");
    // }
    // }
    // System.out.println();
    // }
    // }
    // public static void main(String args[]) {
    // // Scanner sc = new Scanner(System.in);
    // hollow_rect(4, 5);
    //
    //
    // 2 print inverted rotated half pyramid.
    // public static void inverted_rotated_half_pyramid(int n) {
    // //outer
    // for (int i = 1; i <= n; i++) {
    // //Spaces
    // for (int j = 1; j <= n - i; j++) {
    // System.out.print(" ");
    // }
    // //Stars
    // for (int j = 1; j <= i; j++) {
    // System.out.print("*");
    // }
    // System.out.println();
    // }
    // }
    // public static void main(String args[]) {
    // inverted_rotated_half_pyramid(4);
    //
    //
    // 5.print inverted half pyraamidal pattern with number.
    // public static void inverted_half_pyramid_withNumb(int n) {
    // for (int i = 1; i <= n; i++) {
    // //ineerr -nub
    // for (int j = 1; j <= n - i + 1; j++) {
    // System.out.print(j);
    // }
    // System.out.println();
    // }
    // }
    // public static void main(String args[]) {
    // inverted_half_pyramid_withNumb(5);
    //
    //
    // 6.Print floyds triangle .
    // public static void floyds_triangle(int n) {
    // //outer
    // int counter = 1;
    // for (int i = 1; i <= n; i++) {
    // //inner - how many times will counter be printed
    // for (int j = 1; j <= i; j++) {
    // System.out.print(counter + " ");
    // counter++;
    // }
    // System.out.println ();
    // }
    // }
    // public static void main(String args[]) {
    // floyds_triangle(5);
    //
    //
    // 7.Print zero one triangle.
    // public static void zero_one_triangle(int n) {
    // for (int i = 1; i <= n; i++) {
    // for (int j = 1; j <= i; j++) {
    // if ((i + j) % 2 == 0) {
    // System.out.print("1");
    // } else {
    // System.out.print("0");
    // }
    // }
    // System.out.println();
    // }
    // }
    // public static void main(String args[]) {
    // zero_one_triangle(5);
    //
    //
    // 8.Print Butterfly Pattern.
    // public static void butterfly(int n) {
    // //1st hlf
    // for (int i = 1; i <= n; i++) {
    // //stars - i
    // for (int j = 1; j <= i; j++) {
    // System.out.print("*");
    // }
    // //(spaces - 2*(n-i)
    // for (int j = 1; j <= 2 * (n - i); j++) {
    // System.out.print(" ");
    // }
    // //stars - i
    // for (int j = 1; j <= i; j++) {
    // System.out.print("*");
    // }
    // System.out.println();
    // }
    // //2nd half
    // for (int i = n; i >= 1; i--) {
    // //stars - i
    // for (int j = 1; j <= i; j++) {
    // System.out.print("*");
    // }
    // //(spaces - 2*(n-i)
    // for (int j = 1; j <= 2 * (n - i); j++) {
    // System.out.print(" ");
    // }
    // //stars - i
    // for (int j = 1; j <= i; j++) {
    // System.out.print("*");
    // }
    // System.out.println();
    // }
    // }
    // public static void main(String args[]) {
    // butterfly(5);
    //
    //
    // 9.Print Solid Rhombuss
    // public static void solid_rhombus(int n) {
    // for (int i = 1; i <= n; i++) {
    // //spaces
    // for (int j = 1; j <= (n - i); j++) {
    // System.out.print(" ");
    // }
    // //stars
    // for (int j = 1; j <= n; j++) {
    // System.out.print("*");
    // }
    // System.out.println();
    // }
    // }
    // public static void main(String args[]) {
    // solid_rhombus(8);
    //
    //
    // 10. print tilted hollow rhombus
    // public static void tilted_hollow_rhombus(int n) {
    // for (int i = 1; i <= n; i++) {
    // //spaces
    // for (int j = 1; j <= (n - i); j++) {
    // System.out.print(" ");
    // }
    // //hollow rectangle - starss
    // for (int j = 1; j <= n; j++) {
    // if (i == 1 || i == n || j == 1 || j == n) {
    // System.out.print("*");
    // } else {
    // System.out.print(" ");
    // }
    // }
    // System.out.println();
    // }
    // }
    // public static void main(String args[]) {
    // tilted_hollow_rhombus(5);
    //
    //
    // 11.
    public static void dimond(int n) {
        // 1st half
        for (int i = 1; i <= n; i++) {
            // for spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2nd half
        for (int i = n; i >= 1; i--) {
            // for spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String arg[]) {
        dimond(10);

    }
}
