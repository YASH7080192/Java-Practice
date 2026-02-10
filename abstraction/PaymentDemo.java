package abstraction;

public class PaymentDemo {

    public static void main (String []args)
{
    Payment p;
    p= new UpiPayment();
    p.pay();
    p.pay();

    p= new UpiPayment();
    p.pay();
    p.pay();
}    
}
