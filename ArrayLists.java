import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args){

       ArrayList<Integer> numbers = new ArrayList<Integer>();
       numbers.add(1);
       numbers.add(2);
       numbers.add(4);
       System.out.println(numbers);

       //get element kon elementy kaha hai ex iska op 4

       System.out.println(numbers.get(2));

       // add elemet at a specific index   yani jaha chawo waha add kar sakty ho kuch bhi us position par
       numbers.add(1,9);
       System.out.println(numbers);


       // set element  - mtlb value ko replace kar deta uske jagha par ye daal deta hai  op= [1,9,4]
       numbers.set(1,9);
       System.out.println(numbers);

       // size of the list mtlb kitna size hai isme op is 4

      System.out.println(numbers.size());

      // loop 
      for(int i=0; i<numbers.size();i++){
        System.out.print(numbers.get(i)+ ", ");
      }

      // sort the number mtlb 1924= 1249
      Collections.sort(numbers);
      System.out.println(numbers);
   

      // delect in position ele
      numbers.remove(0);                                                   
      System.out.println(numbers);



    }
    
}
