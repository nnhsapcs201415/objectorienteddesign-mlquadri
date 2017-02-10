import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
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

    JFrame frame;
    JPanel panel;
    
    JButton buttonA ;
    JButton buttonB;
    JLable label;
    public Buttonviewer()
    {
        //1: define and setup UI components
        frame = new JFrame();
        panel = new JPanel();
        
        buttonA = new JButton("A");
        panel.add(buttonA);
        
        buttonB = new JButton("B");
        panel.add(buttonB);
        
        label=new JLable("no button clicked");
        panel.add(label);
        
        frame.add(panel);
        
        //2: Lisner object
        ActionListener listener = new ClickListener();
        
        //3: register listener with components that generat events
        {
            public void actionPerformed(ActionEvent event)
            {
            label.setText("Button "+event.getActionCommand()+" clicked was clicked");
           }
        };
        buttonA.addActionListener(listener);
        buttonB.addActionListener(listener);
        
        //4: Configure Frame
        frame.setSize(FRAME_WIDTH, FRAME_HIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}