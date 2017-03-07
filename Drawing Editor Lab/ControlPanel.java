import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;
import java.awt.BorderLayout;
import java.awt.geom.Point2D;
import java.awt.Graphics2D;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
/**
 * The panel that contains the controls and indicators for the drawing editor
 * 
 * @author gcschmit
 * @version 23 June 2015
 */
public class ControlPanel extends JPanel
{
    private DrawingPanel canvas;
    private final Point2D.Double CENTER = new Point2D.Double(0,0);
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
                canvas.addCircle(CENTER,1,canvas.getColor());
            }else{
                canvas.addSquare(CENTER,1,canvas.getColor());
            }
        }
    }
}