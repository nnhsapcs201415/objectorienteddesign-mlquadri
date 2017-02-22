import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.geom.Ellipse2D;
/**
 * Write a program that allows the user to specify a circle with two mouse presses,
 * the first one on the center and the second on a point on the periphery. Hint: In the
 * mouse press handler, you must keep track of whether you already received the cen-
 * ter point in a previous mouse press.
 */
public class CircleComponent extends JComponent
{
    private int[] x= new int[2];
    private int[] y= new int[2];
    private boolean print1;
    private boolean print2;
    private int radius;
    private int centerx;
    private int centery;
    private Ellipse2D.Double circle;
    public CircleComponent()
    {
    }

    public void setXY1(int inx, int iny)
    {
        centerx = inx;
        centery = iny;
        print1=true;
    }

    public void setXY2(int inx, int iny)
    {
        x[1]=inx;
        y[1]=iny;
    }
    
    public void setRadius(int inradius)
    {
        radius=inradius;
    }
    
    public void setCircle()
    {   
        x[0]=centerx-radius;
        y[0]=centery-radius;
        /*
         * (x[0],y[0])     x[1]
         *            #  #  #  #  #
         *            #           #
         *      Y[1]  #     *     #
         *            #     (cen) #
         *            #  #  #  #  #
         */
        circle=new Ellipse2D.Double(x[0],y[0],(2*radius),(2*radius) );
        
        print2=true;
    }

    public void clear()
    {
        for(int i=0; i<2; i++)
        {
            x[i]=0;
            y[i]=0;
        }
        print1=false;
        print2=false;
    }

    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        if(print1==true)
        {
            g2.drawLine(centerx, centery, centerx, centery);
        }if(print2==true)
        {
            g2.draw(circle);
        }
        repaint();
    }
}