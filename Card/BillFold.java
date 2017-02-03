/**
 * Write a description of class BillFold here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BillFold
{
    private Card card1=null;
    private Card card2=null;
    private Card card3=null;

    /**
     * Default constructor for objects of class BillFold
     */
    public BillFold(Card inputcard1, Card inputcard2, Card inputcard3)
    {
        card1=inputcard1;
        card2=inputcard2;
        card3=inputcard3;
    }

    public void addCard(Card card)
    {
        if(card1==null)
        {
            card1=card;
        }
        else if(card2==null)
        {
            card2=card;
        }
        else if (card3==null)
        {
            card3 = card;
        }
    }

    public String formatCards()
    {
        String str1=card1.format();
        String str2=card2.format();
        String str3=card3.format();
        return str1+"\n"+str2+"\n"+str3;
    }

    public int getExpiredCardCount()
    {
        int count=0;
        if(card1!=null)
        {
            if(!(card1.isExpired()))
            {
                count++;
            }
        }else if(card2!=null)
        {
            if(!card2.isExpired())
            {
                count++;
            }
        }
        else if(card3!=null)
        {
            if(!card3.isExpired())
            {
                count++;
            }
        }
        return count;
    }

    public String toString()
    {
        String str1 = "Card1: "+card1.toString();
        String str2 = "Card2: "+card2.toString();
        String str3 = "Card3: "+card3.toString();
        str1+="\n"+str2+"\n"+str3;
        return str1;
    }

}