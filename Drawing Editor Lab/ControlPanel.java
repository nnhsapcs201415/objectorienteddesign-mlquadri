import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
/**
 * The panel that contains the controls and indicators for the drawing editor
 * 
 * @author gcschmit
 * @version 23 June 2015
 */
public class ControlPanel extends JPanel
{
    //
    // .. add additional instance variables
    //
    private DrawingPanel canvas;

    /**
     * Constructor for objects of class ControlPanel
     */
    public ControlPanel( DrawingPanel canvas)
    {
        this.canvas = canvas;

        JButton color = new JButton("Pick Color");
        add(color);
        JButton circle = new JButton("Add Circle");
        add(circle);
        JButton square = new JButton("Add Square");
        add(square);

        ActionListener listener = new ActionListenerClass();
        color.addActionListener(listener);
        circle.addActionListener(listener);
        square.addActionListener(listener);

        //
        // ... create and add buttons and selected color panel
        //

    }

    //
    // ... create inner class that implements the ActionListener interface to respond to button clicks
    //
    public class ActionListenerClass implements ActionListener
    {
        /**
         * Default constructor for objects of class Circle
         */
        public ActionListenerClass()
        {
        }
        public void actionPerformed(ActionEvent event)
        {
            if( event.getActionCommand().equals("Pick Color") )
            {
                canvas.pickColor();
            }else if(event.getActionCommand().equals("Add Circle")){
                //canvas.addCircle();
            }else{
                //canvas.addSquare();
            }
        }
    }
}