
import java.awt.Color;

public class Arrays2d {

    // Q.1 = Creation of matrix and search of elements.

    // public static boolean search(int matrix[][],int key){
    // for(int i= 0;i<matrix.length;i++){
    // for(int j=0;j<matrix[0].length;j++){
    // if(matrix[i][j] == key ){
    // System.out.println("found at cell (" + i+ "," +j+")");
    // return true;
    // }
    // }
    // }
    // System.out.println("key is not found");
    // return false;
    // }
    // public static void main(String args[]){
    // int matrix [][] = new int[3][3];
    // int n= matrix.length,m=matrix[0].length;
    // Scanner sc = new Scanner (System.in);
    // System.out.println("enter the array elements : =");
    // for(int i=0;i<n;i++){
    // for(int j=0;j<m;j++){
    // matrix[i][j]= sc.nextInt();
    // }
    // }

    // for(int i=0;i<n;i++){
    // for(int j=0;j<m;j++){
    // System.out.print(matrix[i][j] + " ");
    // }
    // System.out.println();

    // }
    // System.out.print("Enter key to search: ");
    // int key = sc.nextInt();
    // search(matrix, key);
    // }

    // Q.2= Spiral matrix .

    // public static void SpiralMatrix(int matrix[][]){
    // int startRow=0;
    // int startCol=0;
    // int endRow=matrix.length-1;
    // int endCol=matrix[0].length-1;

    // while(startRow<=endRow && startCol<=endCol){
    // //top
    // for(int j=startCol;j<=endCol;j++){
    // System.out.print(matrix[startRow][j] + " ");
    // }
    // //right
    // for(int i=startRow+1;i<=endRow;i++){
    // System.out.print(matrix[i][endCol] + " ");
    // }
    // //bottam
    // for(int j=endCol-1;j>=startCol;j--){
    // if (startRow==endRow) {
    // break;
    // }
    // System.out.print(matrix[endRow][j] + " ");
    // }
    // //left
    // for(int i=endRow-1;i>=startRow+1;i--){
    // if(startCol==endCol){
    // break;
    // }
    // System.out.print(matrix[i][startCol] + " ");
    // }
    // startCol++;
    // startRow++;
    // endCol--;
    // endRow--;
    // }
    // System.out.println();

    // }

    // public static void main(String args[]){
    // int matrix[][] = {
    // {1,2,3,4},
    // {5,6,7,8},
    // {9,10,11,12},
    // {13,14,15,16}
    // };
    // SpiralMatrix(matrix);
    // }

    // Q.3= sum of diagonals .

    public static int DiagonalSum(int matrix[][]) {

        int sum = 0;
        // 1st method
        // for (int i = 0; i < matrix.length; i++) {
        //     for (int j = 0; j < matrix[0].length; j++) {
        //         if (i == j) {
        //             sum += matrix[i][j];
        //         } else if (i + j == matrix.length - 1) {
        //             sum += matrix[i][j];
        //         }
        //     }

        // }
        // return sum;


        //2nd mathod 
    //     for(int i= 0;i<matrix.length;i++){
    //         //pd
    //         sum += matrix [i][i];
    //         //sd
    //         if(i!=matrix.length-1-i){
    //             sum+=matrix[i][matrix.length-i-1];
    //         }
    //     }
    //     return sum;


    // }

    // public static void main(String args[]) {
    //     int matrix[][] = {
    //             { 1, 2, 3, 4 },
    //             { 5, 6, 7, 8 },
    //             { 9, 10, 11, 12 },
    //             { 13, 14, 15, 16 }
    //     };
        
    //     int sum = DiagonalSum(matrix); 
    // System.out.println("Sum of diagonals: " + sum); 
    // }



    // Q.4 search in sorted matrix .
    public static boolean stairCaseSearch(int matrix[][],int key){
        int row=0 ,col=matrix[0].length-1;
        while(row <matrix.length && col>=0){
            if (matrix[row][col] == key) {
                System.out.println("found keyst (" + row + "," +col+ ")");
            return true;
            }
            else if(key<matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("key not found");
        return false;

    }

    public static void main(String args[]){
        int marix[][]={
             {}
    }
}
