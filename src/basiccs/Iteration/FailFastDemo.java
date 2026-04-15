package src.basiccs.Iteration;

import java.util.Iterator;

public class FailFastDemo {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);


        Iterator<Integer> it = numbers.iterator();
        while(it.hasNext()){
            Integer number = it.next();
            if(number == 20){
                it.remove();
            }
        }

    }
    
}
