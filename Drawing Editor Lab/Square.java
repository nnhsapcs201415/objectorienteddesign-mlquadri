import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.awt.Graphics2D;
import java.awt.Color;
/**
 * Write a description of class Square here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Square extends DrawingShape
{
    Rectangle2D.Double square;
    /**
     * Default constructor for objects of class Square
     */
    public Square(Point2D.Double center, double radius, Color color)
    {
        super(center,radius, color);
        square = new Rectangle2D.Double(super.getCenter().getX()+super.getRadius(),
            super.getCenter().getY()+super.getRadius(),
            2*super.getRadius(),
            2*super.getRadius());
    }
    public Point2D.Double getCenter()
    {
        return super.getCenter();
    }
    public double getRadius()
    {
        return super.getRadius();
    }
    public void move(double x, double y)
    {
        super.move(x, y);
        square = new Rectangle2D.Double(1,1,2,2);
        
        //super.getCenter().getX()+super.getRadius(),
        //    super.getCenter().getY()+super.getRadius(),
        //    2*super.getRadius(),
        //    2*super.getRadius());
       
    }
    public void setRadius(double r)
    {
        super.setRadius(r);
    }
    public boolean isInside(Point2D.Double point)
    {
        return square.contains(point);
    }
    public void draw(Graphics2D g2, boolean filled)
    {
        g2.draw(square);
        if(filled == true)
        {
            g2.setColor(Color.RED);
            g2.fill(square);
        }
    }
}
