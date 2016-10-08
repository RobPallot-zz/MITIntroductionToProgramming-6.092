import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
	ArrayList<StraightMover> straightMover = new ArrayList<>();
	ArrayList<Bouncer> bouncer = new ArrayList<>();
	
	Bouncer movingSquare;
	Bouncer movingCircle;
	Bouncer movingRectangle;
	
	StraightMover straightSquare;
	StraightMover straightCircle;
	StraightMover straightRectangle;
	
	Rectangle square;
	Circle circle;
	Rectangle rectangle;

	/** Initializes this class for drawing. */
	public DrawGraphics() {
		square = new Rectangle(20, 20, Color.RED);
		rectangle = new Rectangle(15, 50, Color.BLUE);
		circle = new Circle(20, 20, Color.GREEN);
		
		
		movingSquare = new Bouncer(100, 170, square);
		movingSquare.setMovementVector(3, 3);
		movingCircle = new Bouncer(50, 120, circle);
		movingCircle.setMovementVector(-5, 1);
		movingRectangle = new Bouncer(10, 50, rectangle);
		movingRectangle.setMovementVector(-1, -1);
		
		straightSquare = new StraightMover(100, 100, square);
		straightCircle = new StraightMover(200, 200, circle);
		straightRectangle = new StraightMover(150, 50, rectangle);
		
		bouncer.add(movingSquare);
		bouncer.add(movingCircle);
		bouncer.add(movingRectangle);
		
		straightMover.add(straightSquare);
		straightMover.add(straightCircle);
		straightMover.add(straightRectangle);
	}

	/** Draw the contents of the window on surface. */
	public void draw(Graphics surface) {
		for (int i = 0; i < bouncer.size(); i++) {
			bouncer.get(i).draw(surface);
		}
		for (int i = 0; i < straightMover.size(); i++) {
			straightMover.get(i).draw(surface);
		}
	}
}
