import javax.swing.JColorChooser;
import java.awt.geom.Point2D;
import java.awt.Graphics2D;
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
    DrawingShape[] shapes=new DrawingShape[1];
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
        shapes[0] = new Circle(center, radius, color);
    }
    public void addSquare(Point2D.Double center, double radius, Color color)
    {
        shapes[1] = new Square(center, radius, color);
    }
    public void paintComponent(Graphics2D g2)
    {
        for(DrawingShape shape:shapes)
        {
            shape.draw(g2, true);
        }
    }
}
