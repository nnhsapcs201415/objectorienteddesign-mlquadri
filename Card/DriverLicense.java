import java.util.GregorianCalendar;
/**
 * Write a description of class DriverLicense here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DriverLicense extends Card
{
    /** description of instance variable x (add comment for each instance variable) */
    private int expYear;

    /**
     * Default constructor for objects of class DriverLicense
     */
    public DriverLicense(String n, int expirationYear)
    {
        super(n);
        expYear = expirationYear;
    }

    public String format()
    {
        return super.format() + "\nExpiration Year: " + expYear;
    }

    public boolean isExpired()
    {
        GregorianCalendar calendar = new GregorianCalendar();
        if(expYear>=calendar.get(calendar.YEAR))
        {
            return true;
        }else{
            return false;
        }
    }

    public String toString()
    {
        return "Driver License[Name="+super.getName()+"] [expYear="+expYear+"]";
    }
}
