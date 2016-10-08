import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.util.ArrayList;
import java.util.List;

public class DrawGraphics {
	List<BouncingBox> shapes = new ArrayList<BouncingBox>();
    
    /** Initializes this class for drawing. */
    public DrawGraphics() {
    	shapes.add(new BouncingBox(200, 50, Color.RED));
    	shapes.add(new BouncingBox(100, 0, Color.BLUE));
    	shapes.add(new BouncingBox(100, 50, Color.GREEN));
    	shapes.get(0).setMovementVector(1, 0);
    	shapes.get(1).setMovementVector(-1, 1);
    	shapes.get(2).setMovementVector(0, 4);
    }

    /** Draw the contents of the window on surface. Called 20 times per second. */
    public void draw(Graphics surface) {
    	//surface.drawLine(50, 50, 250, 250);
        for (int i = 0; i < shapes.size(); i++) {
        	shapes.get(i).draw(surface);
        }
        surface.setColor(Color.BLACK);
        surface.drawOval(50,50,100,100);
        surface.setColor(Color.GREEN);
        surface.fillOval(50,50,100,100);
        
        Polygon s = new Polygon();
        for (int i = 0; i < 360; i++) {
          double t = i / 360.0;
          s.addPoint((int) (200 + 50 * t * Math.cos(8 * t * Math.PI)),
              (int) (200 + 50 * t * Math.sin(8 * t * Math.PI)));
        }
        surface.setColor(Color.ORANGE);
        surface.drawPolygon(s);
    }
} 