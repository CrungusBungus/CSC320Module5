import java.util.Scanner;
public class Program {
	public static void main(String[] args) {
		String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};
		float[] temps = {32,34,41,47,57,65,70,68,60,49,38,31};
		
		boolean menu = true;
		
		while (menu == true) {
			System.out.println("-------------------------------------------------");
			System.out.println("Enter the month you want to see the temperature of");
			System.out.println("Or enter 'Year' to see the data for the whole year");
			System.out.println("Or enter 'Exit' to exit the program");
			System.out.println("-------------------------------------------------");
			
			Scanner i = new Scanner(System.in);
			String input = i.nextLine();
			
			if (input.equals("Year")) {
				float min = 9999;
				float max = -9999;
				float total = 0;
				for (int m = 0; m < 12; m++) {
					System.out.println(months[m] + " average: " + temps[m]);
					total += temps[m];
					if (temps[m] < min) {
						min = temps[m];
					} else if (temps[m] > max) {
						max = temps[m];
					}
				}
				System.out.println("Year average: " + total/12);
				System.out.println("Year lowest: " + min);
				System.out.println("Year highest: " + max);
			} else if (input.equals("Exit")) {
				System.out.println("Exiting program");
				menu = false;
			} else {
				for (int m = 0; m < 12; m++) {
					if (input.equals(months[m])) {
						System.out.println(input + " average: " + temps[m]);
					}
				}
			}
		}
	}
}