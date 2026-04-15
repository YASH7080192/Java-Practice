package src.basiccs.Iteration;

public class SafeRemovealDemo {
    public static void main(String[] args){
        List<String> items = new ArrayList<>();
        items.add("apple");
        items.add("Bananan");
        items.add("avocado");
        Iterator<String> it = items.iterator();
        while(it.hasNext()){
            String item = it.next();
            if(item.startsWith("A")){
                it.remove();
            }
        }
    }