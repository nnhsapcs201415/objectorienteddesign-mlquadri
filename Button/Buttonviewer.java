import java.awt.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
/**
 * Write a description of class Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Buttonviewer
{
    private static final int FRAME_WIDTH = 100;
    private static final int FRAME_HIGHT = 60;
    public static void main(String[] args)
    {
        //1: define and setup UI components
        JFrame frame = new JFrame();
        JButton button = new Jbutton("Click me!");
        frame.add(button);
        
        //2: Lisner object
        ActionListener listener = new ClickListener();
        
        //3: register listener with components that generat events
        button.addActionListener(listener);
        
        //4: Configure Frame
        frame.setSize(FRAME_WIDTH, FRAME_HIGHT);
        frame.setDefultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(True);
    }
}
