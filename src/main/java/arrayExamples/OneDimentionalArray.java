package arrayExamples;

public class OneDimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Month_days[];

		Month_days = new int[12]; // Single Dimensional Array Declaration

		int Month[] = new int[2]; // Another way of initializing array

		Month_days[0] = 1;

		Month_days[1] = 2;

		Month_days[3] = 3;

		Month_days[4] = 4;
		
		Month[1] = 123333;

		for (int i = 0; i < Month_days.length; i++) {

			System.out.println("Length is " + Month_days[i]);

		}

		System.out.printf("+++++++++++++++++++++++++++++++++++++++++++++");

		for (int i : Month_days) {

			System.out.println("Length was " + Month_days[i]);

		}

	}

}
