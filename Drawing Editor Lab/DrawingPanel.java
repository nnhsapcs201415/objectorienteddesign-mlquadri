import java.awt.geom.Rectangle2D;
import javax.swing.JColorChooser;
import java.util.ArrayList;
import java.awt.geom.Point2D;
import java.awt.Graphics2D;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Color;
/**
 * The panel in which draws all of the shapes in the drawing editor
 * 
 * @author gcschmit
 * @version 23 June 2015
 */
public class DrawingPanel extends JPanel
{
    Color fillColor;
    ArrayList<DrawingShape> shapes=new ArrayList<DrawingShape>();
    
    /**
     * Default constructor for objects of class DrawingPanel
     */
    public DrawingPanel()
    {
         
    }
    public Dimension getPreferredSize()
    {
        return new Dimension(50, 50);
    }
    /**
     * Invoked when the "Pick Color" button is clicked. Displays a JColorChooser and sets the
     *  selected color as the new fill color. Leaves the fill color unchanged if the user clicks
     *  "Cancel"
     *
     */
    public void pickColor()
    {
        Color selectedColor = JColorChooser.showDialog( this, "select the fill color", this.fillColor );
        if( selectedColor != null )
        {
            this.fillColor = selectedColor;
        }
    }
    public Color getColor()
    {
        return fillColor;
    }
    public void addCircle(Point2D.Double center, double radius, Color color)
    {
        shapes.add( new Circle(center, radius, getColor()) );
        repaint();
    }
    public void addSquare(Point2D.Double center, double radius, Color color)
    {
        shapes.add( new Square(center, radius, getColor()) );
        repaint();
    }
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        for(int i = 0; i<0; i++)
        {
            ( shapes.get(i) ).draw(g2, true);
        }
    }
}
