public class Strings {

    // Strings letters print question.
    public static void printLetters(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }


    //Palindrome ques.
    public static boolean isPalindrome(String str){

        int n = str.length();
        for(int i=0; i<n/2; i++){
            if(str.charAt(i) != str.charAt(n-i-1))
            //not a palindrome

            return false;
        }

        return true;
    }

    // shortest path of given dirn

    public static float getShortPath(String path){
        int x = 0;
        int y = 0;

        for(int i=0; i<path.length(); i++){

            char dir = path.charAt(i);
            //north
            if(dir =='N'){ 
                y++;
            }
            //south
            else if(dir=='S'){
                y--;
            }
            // East
            else if(dir=='E'){
                x++;
            }
            //west
            else{
                x--;
            }
        }

        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2+Y2);

    }

    //Substring

    public static String subString(String str, int si, int ei){
        String substr = "";
        for (int i=si; i<ei; i++){
            substr += str.charAt(i);
        }
        return substr;
    }

    // Q.4 For a given String convert eaach the first letter of each wors to uppercase .
    public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1; i<str.length(); i++){
            if(str.charAt(i)== ' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));

            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    // String compression ques.// also solve this question by using stringbuilder form.
    public static String compress(String str){   //O(n)
        String newStr = "";

        for(int i=0; i<str.length(); i++){
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if(count > 1){
                newStr += count.toString();

            }
        }
        return newStr;
    }
    
    public static void main(String args[]) {

        // Strings are iMMutable 

        // Scanner sc  =  new Scanner(System.in);
        // String name = sc.nextLine();  // nextLine for full name or paragraph
        // System.out.println(name);


        // String fullName = "Tony Stark";
        // System.out.println(fullName.length());

        // Concateantion
        // String firstName = "Aman";
        // String lastName = "Sahu"; 
        // String fullName = firstName + " " + lastName;
        // printLetters(fullName);

        //
        // String str = "racecar";
        // System.out.println(isPalindrome(str));


        // 
        // String path = "WNEENESENNN";
        // System.out.println(getShortPath(path));

        // 
       // String str = "HelloWorld";
       // System.out.println(str.substring(0,6));   // already exist in java.
       //System.out.println(subString(str,0,4));


       // Qestion. largestt string 

    //    String fruits[] =  {"apple","mango","banana"};
    //    String largest = fruits[0];
    //    for(int i=1; i<fruits.length; i++){
    //     if(largest.compareTo(fruits[i]) < 0){
    //         largest = fruits[i];
    //     }
    //    }
    //    System.out.println(largest);


    // StrinBuilder

    // StringBuilder sb = new StringBuilder("");
    // for(char ch='a'; ch<='z'; ch++){
    //     sb.append(ch);
    // }

    // System.out.println(sb);
    // System.out.println(sb.length());


    //
    // String str = "hi, i am aman sahu";
    // System.out.println(toUpperCase(str));


        // compression
       String str = "aaabbcccccdd";
       System.out.println(compress(str));
    }
}
