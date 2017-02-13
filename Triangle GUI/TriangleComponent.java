import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
/**
 * This component displays a rectangle that can be moved.
 */

public class TriangleComponent extends JComponent
{
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private int x3;
    private int y3;

    private Rectangle box;
    public TriangleComponent()
    {
        
    }
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        g2.draw(box);
    }
}
