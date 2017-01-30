/**
 * Write a description of class ComboLock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ComboLock
{
    int num1,  num2, num3, value;
    final int LOW = 0;
    final int TOP = 40;
    boolean open, num1v,  num2v, num3v;
    public ComboLock( int secret1, int secret2, int secret3 )
    {
        num1=secret1;
        num2=secret2;
        num3=secret3;
        value=0;
        testvalue();
    }
    public void reset()
    {
        value=0;
        num1v=false;
        num2v=false;
        num3v=false;
        testvalue();
    }
    public void turnLeft( int ticks )
    {
        value-=ticks;
        if(ticks<LOW)
        {
            ticks+=LOW;
        }
        testvalue();
    }
    public void turnRight( int ticks )
    {
        value+=ticks;
        if(ticks>TOP)
        {
            ticks-=TOP;
        }
        testvalue();
    }public int getValue()
    {
        return value;
    }
    public void testvalue()
    {
        if(num1v==false)
        {
            if (value==num1)
            {
                num1v=true; 
            }else{
                num1v=false;
                num2v=false;
                num3v=false;
            }
        }else if(num2v==false)
        {
            if (value==num2)
            {
                num2v=true; 
            }else{
                num1v=false;
                num2v=false;
                num3v=false;
            }
        }else if(num3v==false)
        {
            if (value==num3)
            {
                num3v=true; 
            }else{
                num1v=false;
                num2v=false;
                num3v=false;
            }
        }else if(num1v==true&& num2v==true&& num3v==true)
        {
            open=true;
        }else{
            num1v=false;
            num2v=false;
            num3v=false;
        }
    }
    public boolean open()
    {
        testvalue();
        if(open==true)
        {
            return true;
        }else{
            return false;
        }
    }
}