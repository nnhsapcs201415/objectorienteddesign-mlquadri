import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.awt.Graphics2D;
import java.awt.Color;
/**
 * Write a description of class Circle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Circle extends DrawingShape
{
    Ellipse2D.Double circle;
    /**
     * Default constructor for objects of class Circle
     */
    public Circle(Point2D.Double center, double radius, Color color)  
    {
        super(center,radius, color);
        circle=new Ellipse2D.Double(
            super.getCenter().getX()+super.getRadius(),
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
        circle=new Ellipse2D.Double(
            super.getCenter().getX()+super.getRadius(),
            super.getCenter().getY()+super.getRadius(),
            2*super.getRadius(),
            2*super.getRadius());
    }
    public void setRadius(double r)
    {
        super.setRadius(r);
    }
    public boolean isInside(Point2D.Double point)
    {
        return circle.contains(point);
    }
    public void draw(Graphics2D g2, boolean filled)
    {
        g2.draw(circle);
        if(filled == true)
        {
            g2.setColor(Color.RED);
            g2.fill(circle);
        }
    }
}
