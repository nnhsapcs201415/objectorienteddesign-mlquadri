import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
/**
This frame contains a moving rectangle.
 */
public class CircleFrame extends JFrame
{
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 400;
    private int pressed=0;
    private CircleComponent scene;
    int x;
    int y;
    class MousePressListener implements MouseListener
    {
        public void mousePressed(MouseEvent event)
        {
            if (pressed<1)
            {
                x = event.getX();
                y = event.getY();
                repaint();
                scene.setXY1(x, y);
                pressed++;
            }else{
                scene.clear();
                repaint();
                pressed=0;
            } 
        }
        public void mouseReleased(MouseEvent event){
            int x = event.getX();
            int y = event.getY();
            scene.setXY2(x, y);
            repaint();
            scene.setCircle();
        }
        public void mouseDragged(MouseEvent event) {
            int radius= (int) Math.sqrt( Math.pow( (x-event.getX()), 2) + Math.pow( (y-event.getY()),2) );
            scene.setRadius(radius);
        }
        public void mouseClicked(MouseEvent event){}
        public void mouseEntered(MouseEvent event){}
        public void mouseExited(MouseEvent event){}
    }
    public CircleFrame()
    {
        scene = new CircleComponent();
        add(scene);
        MouseListener listener = new MousePressListener();
        scene.addMouseListener(listener);
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }
}