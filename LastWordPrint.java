public class LastWordPrint {
    public static void main(String[] args){
        String a= "jai shree ram";
        String[] words = a.split(" ");
        System.out.println(words[words.length - 1]);
    }
}
