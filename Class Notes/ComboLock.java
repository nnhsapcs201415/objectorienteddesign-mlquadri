/**
 * Write a description of class ComboLock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ComboLock
{
   int num1,  num2, num3, value;
   boolean open;
   
    public ComboLock( int secret1, int secret2, int secret3 )
   {
        num1=secret1;
        num2=secret2;
        num3=secret3;
        value=0;
   }
   public void reset()
   {
       value=0;
   }
   public void turnLeft( int ticks )
   {
       value+=ticks;
       testvalue()
   }
   public void turnRight( int ticks )
   {
       value+=ticks;
       testvalue()
   }
   public int testvalue()
    {
        if()
        {
        }
    }
    public boolean open()
   {
       if(open==true)
       {
           return true;
       }else{
           return false;
       }
   }
}