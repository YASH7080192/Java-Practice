

import java.util.*;

public class Calculatetota {
   public static void main(String[] args) {

    
    ArrayList<Integer>marks= new ArrayList<>();
    marks.add(23);
    marks.add(45);
    marks.add(35);
    marks.add(24);

  int adds = 0;
  
  for (int i=0;i<marks.size();i++) {
    adds=adds + marks.get(i);
  }
  System.out.println("marks: "+ marks);
  System.out.println("Total: "+ adds);
  } 
}