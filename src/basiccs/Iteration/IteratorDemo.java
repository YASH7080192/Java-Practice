package src.basiccs.Iteration;

public class IteratorDemo {
    public static void main(String[] args){
        Iterator<String> it = names.iterator();
        while(it.hasNext()){
            String name = it.next();
            System.out.println("Elements: " + name);
        }

    }
    
}
