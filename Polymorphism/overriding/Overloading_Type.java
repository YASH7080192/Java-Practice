public class Overloading_Type{
    long sums(int no1,int no2){
        return (no1*no2);
    }
    long sums(int no1,long no2){
        return (no1+no2);
    }
    long sums(long no1, int no2){
        return (no1/no2);
    }
    long sums(long no1,long no2){
        return (no1-no2);
    }
    public static void main(String[] args) {
        Overloading_Type ob= new Overloading_Type();
        int x=5;
        long y=10;
        System.out.println(ob.sums(x,y));
        System.out.println(ob.sums(5,y));
        System.out.println(ob.sums(5,0));
        System.out.println(ob.sums(y,80));
        System.out.println(ob.sums(y,y));
    }
}