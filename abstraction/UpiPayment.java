package abstraction;

public class  UpiPayment implements Payment {
    
    @Override
    public void pay()

{
    System.out.println("payment done via Card");
}
}