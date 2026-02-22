
public class Arrays1 {

    //public static void main(String args[]) {
    //int marks[] = new int[100];
    // Scanner sc = new Scanner(System.in);
    //int phy ;
    //phy  = sc.nextInt();
    // System.out.println("length of array" + marks.length);
    // marks[0] = sc.nextInt(); //phy 
    // marks[1] = sc.nextInt();//chem
    // marks[2] = sc.nextInt();//phy
    // System.out.println("phy :" + marks[0]);
    // System.out.println("chem :" + marks[1]);
    // System.out.println("Maths:" + marks[2]);
    // //update marks 
    // marks[1] = marks[1] + 1;   //+,-,+,*,/
    // System.out.println("chem :" + marks[1]);
    // int percentage = (marks[0] + marks[1] + marks[2]) / 3;
    // System.out.println("percentage =" + percentage + "%");
    //
    //
    // public static void update(int marks[], int nonchangable) {
    //     nonchangable = 10;
    //     for (int i = 0; i < marks.length; i++) {
    //         marks[i] = marks[i] + 1;
    //     }
    // }

    // public static void main(String args[]) {
    //     int marks[] = {97, 98, 99};
    //     int nonchangable = 5;
    //     update(marks, nonchangable);
    //     System.out.println(nonchangable);

    //     //print marks
    //     for (int i = 0; i < marks.length; i++) {
    //         System.out.print(marks[i] + " ");
    //     }
    //     System.out.println();


//LINEAR SEARCH CODE;
    // public static int linearsearch(int numbers[],int key){
    //     for(int i=0;i<numbers.length;i++){
    //         if(numbers[i]==key){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }

    // public static void main(String args[]){
    //     int numbers[]={2,4,6,8,10,12,14,16};
    //     int key=16;

    //     int index= linearsearch(numbers,key);
    //     if(index==-1){
    //         System.out.println("not found");
    //     }else{
    //         System.out.println("key is at inddex " + index);
    //     }
    // }


//Q. Write a java programme to choose fast food in canteen menu by using Array.

// public static int linearsearch(String menu[],String item){
//     for(int i=0;i<menu.length;i++) {
//         if(menu[i].equalsIgnoreCase(item)){
//             return i;
//         }
//     }
//     return -1;
// }

// public static void main(String args[]){
//     String menu[] ={"samosa","chai","burgur","coffee","vadapao"};
//     String item = "vadapao";
//     int index = linearsearch(menu,item);
//     if(index== -1){
//         System.out.println("not found");
//     }else{
//         System.out.println("item is at index :" + index);
//     }
// }



// Largest Number 
// public static int getlargest(int numbers[]){
//     int largest =Integer.MIN_VALUE;
//     for(int i=0;i<numbers.length;i++){
//         if(largest<numbers[i]){
//             largest=numbers[i];
//         }
//     }
//     return largest;
// }

// public static void main(String args[]){
//     int numbers[] ={1,2,4,6,8,10,25,7};

//     System.out.println("largest value is " + getlargest(numbers));
// }

//
// SMALLESt VaLUE.
// public static int getsmallest(int numbers[]){
//     int smallest =Integer.MAX_VALUE;
//     for(int i=0;i<numbers.length;i++){
//         if(smallest>numbers[i]){
//             smallest=numbers[i];
//         }
//     }
//     return smallest;
// }

// public static void main(String args[]){
//     int numbers[] ={1,2,4,6,8,10,25,7};

//     System.out.println("smallest value is " + getsmallest(numbers));
// }

//
//
//BINARY SEARCH .
// public static int binarysearch(int numbers[], int key){
//     int start = 0;
//     int end = numbers.length -1;
//     while(start<=end){
//         int mid =((start+end)/2);
//          //comparison
//          if(numbers[mid]==key){
//             return mid;
//          }
//          if(numbers[mid]<key){
//             start=mid+1;
//          }
//          else{
//             end=mid-1;
//          }
//     }
//     return -1;
// }

// public static void main(String args[]){
// int numbers[]= {2,4,6,8,10,12,14};
// int key=4;
// System.out.println("index for key is : " + binarysearch(numbers,key));

// }

//
//
// Reverse an Array;
// public static void reverse(int numbers[]){
//     int first=0,last=numbers.length-1;

//     while(first<last){
//         //swap
//         int temp = numbers[last];
//         numbers[last]=numbers[first];
//         numbers[first]=temp;

//         first++;
//         last--;
//     }
// }
// public static void main(String args[]){
//     int numbers[]= {2,4,6,8,10};
//      reverse(numbers);
//       System.out.print("Reversed array: ");
//         for (int i = 0; i < numbers.length; i++) {
//             System.out.print(numbers[i] + " ");
//         }
// }


//
//
// Pairs in an array
// public static void printArrays(int numbers[]){
//     int tp=0;
//     for(int i=0;i<numbers.length;i++){
//         int curr=numbers[i];
//         for(int j=i+1;j<numbers.length;j++){
//             System.out.print("(" +curr+ "," +numbers[j]+ ")");
//             tp++;
//         }
//         System.out.println();
//     }
//     System.out.println("totsalpair=" + tp);
// }
// public static void main(String arg[]){
//     int numbers[]={2,4,6,8,10};
//     printArrays(numbers);

// }


//
//
//Print subarray:
// public static void printsubarrays(int numbers[]){
//     int ts=0;
//     for(int i=0;i<numbers.length;i++){
//         int start=i;
//         for (int j=i;j<numbers.length;j++) {
//             int end=j;  
//             for(int k=start;k<=end ;k++){
//                 System.out.print(numbers[k] +" ");
//                 ts++;
//             }
//             System.out.println();
//         }
//         System.out.println();

//     }
//     System.out.println("total subarry=" + ts);
// }
// public static void main(String arg[]){
//     int numbers[]={2,4,6,8,10};
//     printsubarrays(numbers);

// }

//
//
//
//MAX subarray(brute force)
// public static void maxsubarraysum(int numbers[]){
//     int currsum = 0;
//     int maxsum=Integer.MIN_VALUE;

//     for(int i=0;i<numbers.length;i++){
//         int start=i;
//         for(int j=i;j<numbers.length;j++){
//             int end=j;
//             currsum=0;
//             for(int k=start;k<=end;k++){
//                 currsum+=numbers[k];
                
//             }
//             System.out.println(currsum);
//             if(maxsum<currsum){
//                 maxsum=currsum;
//             }
//         }
//     }
//     System.out.println("maxsum=" +maxsum);
// }
// public static void main(String arg[] ){
//     int numbers[] = {1,-2,6,-1,3};
//     maxsubarraysum(numbers);
// }
//
//
////
//Max Subarray sum (prefix array);
// public static void maxsubarraysum(int numbers[]){
//     int currsum=0;
//     int maxsum=Integer.MIN_VALUE;
//     int prefix[]= new int[numbers.length];
//     prefix[0] = numbers[0];

//     //Calculate prefix array 
//     for(int i=1; i<prefix.length ; i++){
//         prefix[i]= prefix[i-1]+numbers[i];
//     }
//     for(int i=0; i< numbers.length;i++){
//         int start = i;
//         for(int j=i; j<numbers.length; j++){
//             int end = j;
//             currsum =start==0? prefix[end]:prefix[end]-prefix[start-i];
//             if(maxsum<currsum){
//                 maxsum=currsum;
//             }
//         }
//     }
//     System.out.println("max sum=" + maxsum);
// }
// public static void main(String arg[]){
//     int numbers[] = {1,-2,6,-1,3};
//     maxsubarraysum(numbers);
// }

//

//

//MAX Subaraysum( by KADANE'S)
// public static void kadanes(int numbers[]){
//     int ms = Integer.MIN_VALUE;
//     int cs=0;
//     for(int i=0;i<numbers.length ; i++){
//         cs= cs + numbers[i];
//         if (cs<0){
//             cs=0;
//         }
//         ms=Math.max(cs,ms);
//     }
//     System.out.println("our max subarrar sum is= " +ms);
// }

// public static void main(String args[]){
//     int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
//     kadanes(numbers);
// }



//
//
//
// A. Trapping rainwater 
public static int trappedRainWater(int height[]){
    int n = height.length;

    //calculate left max boundary
    int leftmax[] = new int[n];
    leftmax[0]= height[0];
    for(int i=1;i<n;i++){
        leftmax[i] = Math.max(height[i],leftmax[i-1]);
    }
    //calculate right max boundry 
    int rightmax[] = new int[n];
    rightmax[n-1] = height[n-1];
    for(int i=n-2; i>=0 ; i--){
        rightmax[i] = Math.max(height[i],rightmax[i+1]);
    }
    int trappedwater = 0;
    
    //loop
    for(int i = 0;i<n; i++){
        int waterlevel =Math.min(leftmax[i],rightmax[i]);

    
        trappedwater += waterlevel - height[i];    
    }
    return trappedwater;



}
public static void main(String arg[]){
    int height[] = {4,2,0,6,3,2,5};
    System.out.println(trappedRainWater(height));
}


//

//
//
//BUY and SELL STOCKS
// public static int buyandsellstocks(int prices[]){
//     int buyprice=Integer.MAX_VALUE;
//     int maxprofit = 0 ;
    
//     for(int i=0; i<prices.length ; i++){
//         if(buyprice <prices[i]){
//             int profit = prices[i]-buyprice;
//             maxprofit = Math.max(maxprofit,profit);
//         }else{
//             buyprice = prices[i];
//         }
    
        
//     }
//     return maxprofit;
// }
// public static void main(String args[]){
//     int prices[] = {7,1,5,3,6,4};

//     System.out.println(buyandsellstocks(prices));
// }
 }


