import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();



        //for add element in list

        list.add(1); //O(1)
        list.add(2);
        list.add(3);


        System.out.println(list);

//Get Operation // O(1)
    //    int element = list.get(2);
    //    System.out.println(element);

    


    //Delete  //O(n)
    // list.remove(2);
    // System.out.println(list);

    //set 
    // list.set(2,10);
    // System.out.println(list);


    // contains 
    System.out.println(list.contains(1));
    System.out.println(list.contains(11));
    



    }
    
}
