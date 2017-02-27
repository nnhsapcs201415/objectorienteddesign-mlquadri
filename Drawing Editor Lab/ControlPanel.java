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
        
        BorderLayout grid= new BorderLayout();
        JButton Color = new JButton("Pick Color");
        canvas.add(Color);
        JButton Circle = new JButton("Add Circle");
        canvas.add(Circle);
        JButton Square = new JButton("Add Square");
        canvas.add(Square);
        canvas.setSize(100, 100);
        //
        // ... create and add buttons and selected color panel
        //
        
    }

    //
    // ... create inner class that implements the ActionListener interface to respond to button clicks
    //
}