
public class GravityCalculator {

	public static void main(String[] args) {
		double gravity = -9.81; //approximation of gravitational constant of earth
		double initialVelocity = 0.0;
		double fallingTime = 10.0;
		double initialPosition = 0.0;
		double finalPosition = 0.0;
		
		finalPosition = calculateDistance(gravity, fallingTime, initialVelocity, initialPosition);
		
		System.out.println("The object\'s position after " + fallingTime + " seconds is " + finalPosition + "m.");
	}

	private static double calculateDistance(double a, double t, double vi, double xi) {
		double x;
		
		x = (0.5*a*(t*t)) + (vi * t) + (xi);
				
		return x;
	}
}
