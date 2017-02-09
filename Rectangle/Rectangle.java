/**
 * The java.awt.Rectangle class of the standard Java library does not supply a method
 * to compute the area or perimeter of a rectangle. Provide a subclass BetterRectangle of
 * the Rectangle class that has getPerimeter and getArea methods. Do not add any instance
 * variables. In the constructor, call the setLocation and setSize methods of the Rectangle
 * class. Provide a program that tests the methods that you supplied.
 * 
 * @author (Mlquadri) 
 * @version (2-3-17)
 */
public class Rectangle
{
    private int hight;
    private int width;
    /**
     * Default constructor for objects of class Rectangle
     */
    public Rectangle(int inHight,int inWidth)
    {
        hight=inHight;
        width=inWidth;
    }
}
