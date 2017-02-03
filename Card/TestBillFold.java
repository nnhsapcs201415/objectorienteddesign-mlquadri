/**
 * Write a description of class TestBillFold here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestBillFold
{
    static public void main(String args[])
    {
        Card card1= new IDCard("name", "12434");
        Card card2=new DriverLicense("John", 2000);
        Card card3=new CallingCard("ABC", 8987, 3456);
        BillFold test=new BillFold(card1, card2, card3);
        System.out.println(test.formatCards());
        System.out.println(test.getExpiredCardCount());
        System.out.println(card1.toString());
        System.out.println(card2.toString());
        System.out.println(card3.toString());
        System.out.println(test.toString());
    }
}