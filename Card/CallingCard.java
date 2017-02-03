/**
 * Write a description of class CallingCard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CallingCard extends Card
{
    private int cardNumber;
    private int pinNumber;

    /**
     * Default constructor for objects of class CallingCard
     */
    public CallingCard(String n, int cardNum, int pinNum)
    {
        super(n);
        cardNumber = cardNum;
        pinNumber = pinNum;
    }

    public String format()
    {
        return super.format() + "\nCard Number: " + cardNumber + "\nPin Number: " + pinNumber;
    }

    public String toString()
    {
        return "Calling Card[Name=" + super.getName() + "] [cardNumber=" + cardNumber + " [pinNumber=" + pinNumber + "]";
    }
}
