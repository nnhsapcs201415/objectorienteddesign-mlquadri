import java.awt.geom.Point2D;
import java.awt.Graphics2D;
import java.awt.Color;
/**
 * Write a description of abstract class DrawingShape here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class DrawingShape
{
    Point2D.Double center;
    double radius;
    Color color;
    DrawingShape(Point2D.Double center, double radius, Color color)  
    {
        this.center=center;
        this.radius=radius;
        this.color=color;
    }
    public Point2D.Double getCenter()
    {
        return center;
    }
    public double getRadius()
    {
        return radius;
    }
    public void move(double x, double y)
    {
        center.setLocation(x, y);
    }
    public void setRadius(double r)
    {
        radius=r;
    }
    public abstract boolean isInside(Point2D.Double point);
    public abstract void draw(Graphics2D g2, boolean filled);
}
