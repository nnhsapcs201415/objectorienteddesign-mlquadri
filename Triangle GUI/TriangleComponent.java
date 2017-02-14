import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
/**
 * This component displays a triangle that can be moved.
 * AND
 * Write a program that allows the user to specify a circle with two mouse presses,
 * the first one on the center and the second on a point on the periphery. Hint: In the
 * mouse press handler, you must keep track of whether you already received the cen-
 * ter point in a previous mouse press.
 */

public class TriangleComponent extends JComponent
{
    private int[] x= new int[3];
    private int[] y= new int[3];
    private boolean print1;
    private boolean print2;
    private boolean print3;
    public TriangleComponent()
    {

    }

    public void setXY1(int inx, int iny)
    {
        x[0]=inx;
        y[0]=iny;
        print1=true;
    }

    public void setXY2(int inx, int iny)
    {
        x[1]=inx;
        y[1]=iny;
        print2=true;
    }

    public void setXY3(int inx, int iny)
    {
        x[2]=inx;
        y[2]=iny;
        print3=true;
    }

    public void clear()
    {
        for(int i=0; i<3; i++)
        {
            x[i]=0;
            y[i]=0;
        }
        print1=false;
        print2=false;
        print3=false;
    }

    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        if(print1==true)
        {
            g2.drawLine(x[0], y[0], x[0], y[0]);
        }if(print2==true)
        {
            g2.drawLine(x[0], y[0], x[1], y[1]);
        }if(print3==true)
        {
            g2.drawLine(x[1], y[1], x[2], y[2]);
            g2.drawLine(x[0], y[0], x[2], y[2]);
        }
        repaint();
    }
}
