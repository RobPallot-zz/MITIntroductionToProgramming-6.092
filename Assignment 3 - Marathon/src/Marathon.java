
public class Marathon {

	public static void main(String[] arguments) {
		
		String[] names = { "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", "Emma", "John", "James",
				"Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate" };
		int[] times = { 341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265 };
				
		System.out.println("The fastest runner is " + names[getFastestTime(times)] + " with a time of " + times[getFastestTime(times)]);
		System.out.println("The second fastest runner is " + names[getSecondFastestTime(times)] + " with a time of " + times[getSecondFastestTime(times)]);
	}
	
	public static int getFastestTime(int[] fastTimes){
		int highest = 0;
		for (int i = 0; i < fastTimes.length; i++) {
			if (fastTimes[i] > fastTimes[highest]) highest = i;
		}
		return highest;
	}
	
	public static int getSecondFastestTime(int[] fastTimes){
		int fastestIndex = getFastestTime(fastTimes);
		int secondHighest = 0;
		for (int i = 0; i < fastTimes.length; i++) {
			if (i != fastestIndex) if (fastTimes[i] > fastTimes[secondHighest]) secondHighest = i;		
		}
		return secondHighest;
	}
}
