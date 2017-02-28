import javax.swing.JFrame;
import java.awt.BorderLayout;
/**
 * The window for the drawing editor.
 * 
 * @author gcschmit
 * @version 23 June 2015
 */
public class DrawingEditorFrame extends JFrame
{
    /**
     * Default constructor for objects of class DrawingEditor
     */
    public DrawingEditorFrame()
    {
        this.setTitle( "Drawing Editor" );
        this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        
        DrawingPanel canvas = new DrawingPanel();
        ControlPanel controls = new ControlPanel( canvas );
        
        // add the canvas and controls panels to the frame
        // read the BorderLayout class documentation for specifics
        BorderLayout grid= new BorderLayout();
        add(controls, grid.SOUTH);
        add(canvas, grid.WEST);
        setSize(100, 100);
        //
        // ... insert code here
        //
        
        this.pack();
        this.setVisible( true );
    }
    public static void main( String[] args )
    {
       DrawingEditorFrame drawingEditor = new DrawingEditorFrame();
    }
}
