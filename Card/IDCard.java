/**
 * Write a description of class IDCard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class IDCard extends Card
{
    /** description of instance variable x (add comment for each instance variable) */
    private String idNumber;

    /**
     * Default constructor for objects of class IDCard
     */
    public IDCard(String n, String id)
    {
        super(n);
        idNumber = id;
    }

    public String format()
    { 
        return super.format() + "\nID Number: " + idNumber;
    }

    public String toString()
    {
        return "IDCard[Name="+super.getName()+ "] [idNumber="+idNumber+"]";
    }
    
    public boolean equals(Object otherObject)
    {
        if(this.getClass()==otherObject.getClass())
        {
            IDCard other=(IDCard)();
        }
        return false;
    }

}