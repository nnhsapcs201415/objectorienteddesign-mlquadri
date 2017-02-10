import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * avtion Listener that prints buton
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClickListener implements ActionListener
{
    /**
     * Default constructor for objects of class ClickListener
     */
    public ClickListener() 
    {
        
    }

    public void actionPerformed(ActionEvent event)
    {
        System.out.println("Button "+event.getActionCommand()+" clicked was clicked");
    }
}
