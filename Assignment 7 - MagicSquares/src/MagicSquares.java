import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MagicSquares {
	public static boolean testMagic(String pathName) throws FileNotFoundException {
		// Open file
		BufferedReader reader = new BufferedReader(new FileReader(pathName));

		boolean isMagic = true;
		int lastSum = -1;

		// Iterate through each number in line
		String line;
		try {
			while ((line = reader.readLine()) != null) {
				// sum each row using tab as delimiter. 
				String[] parts = line.split("\t");
				int sum = 0;
				for (String part : parts) {
					sum += Integer.parseInt(part);
					
				}
				//System.out.println(sum);

				if (lastSum == -1) {
					lastSum = sum;
				} else if (lastSum != sum) {
					isMagic = false;
					break;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return isMagic;
	}

	public static void main(String[] args) throws IOException {
		String[] fileNames = { "bin/Mercury.txt", "bin/Luna.txt" };
		for (String fileName : fileNames) {
			System.out.println(fileName.substring(4) + " is magic? " + testMagic(fileName));
		}
	}
}