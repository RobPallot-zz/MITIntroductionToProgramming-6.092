public class PayCalculator {
	
	
	public static void main(String[] args) {
					
		double[] e1 = {7.5, 35};
		double[] e2 = {8.2, 47};
		double[] e3 = {10, 73};
		
		if (calculatePay(e1)!= 0) System.out.println(calculatePay(e1));
		if (calculatePay(e2)!= 0) System.out.println(calculatePay(e2));
		if (calculatePay(e3)!= 0) System.out.println(calculatePay(e3));
	}

	public static double calculatePay(double[] employee){
		if (employee[0] < 8.00) {
			System.out.println("Error. Employee base pay is below minimum wage.");
			return 0;
		}		
		return employee[0]*employee[1];
	}
	
}
