
// atm machine ::
import java.io.*;

class c1 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int money, t = 0, l = 0, b = 0, k = 0, j = 0, m = 0, n = 0, i = 0;

		int a[] = new int[7];

		// how many currencies are present in the atm

		System.out.println("Enter how many currency notes you have put in ATM:");
		System.out.println("Please Input: 1st 2000 notes 2nd 500 notes 3rd 200 notes");
		System.out.println("4th 100 notes 5th 50 notes 6th 20 notes 7th 10 notes ");

		for (i = 0; i < 7; i++) {
			a[i] = Integer.parseInt(br.readLine());
		}

		int rs2000 = 2000 * a[0];

		int rs500 = 500 * a[1];

		int rs200 = 200 * a[2];

		int rs100 = 100 * a[3];

		int rs50 = 50 * a[4];

		int rs20 = 20 * a[5];

		int rs10 = 10 * a[6];

		System.out.println();

		System.out.println("Press 1 press 2");
		System.out.println("Enter the amount you want to withdraw:");
		money = Integer.parseInt(br.readLine()); // the amount need to withdraw from the bank via ATM

		while (money != 0) {
			if (rs2000 >= 2000 && money >= 2000) {
				rs2000 = rs2000 - 2000;
				money = money - 2000;
				t = t + 1;
			}

			else if (money >= 500 && rs500 >= 500) {
				money = money - 500;
				rs500 = rs500 - 500;
				k = k + 1;
			}

			else if (money >= 200 && rs200 >= 200) {
				money = money - 200;
				rs200 = rs200 - 200;
				b = b + 1;
			}

			else if (money >= 100 && rs100 >= 100) {
				money = money - 100;
				rs100 = rs100 - 100;
				l = l + 1;
			}

			else if (money >= 50 && rs50 >= 50) {
				money = money - 50;
				rs50 = rs50 - 50;
				j = j + 1;
			}

			else if (money >= 20 && rs20 >= 20) {
				money = money - 20;
				rs20 = rs20 - 20;
				m = m + 1;
			}

			else if (money >= 10 && rs10 >= 10) {
				money = money - 10;
				rs10 = rs10 - 10;
				n = n + 1;
			}

			else {
				System.out.println("Invalid Input");
				break;
			}

		}

		if (rs2000 == 0) {
			System.out.println("there would be" + " " + t + " " + "number of 2000 notes");
		} else {
			System.out.println("there would be" + " " + t + " " + "number of 2000 notes");
		}

		if (rs500 == 0) {
			System.out.println("there would be" + " " + k + " " + "number of 500 notes");
		} else {
			System.out.println("there would be" + " " + k + " " + "number of 500 notes");
		}

		if (rs200 == 0) {
			System.out.println("there would be" + " " + b + " " + "number of 200 notes");
		} else {
			System.out.println("there would be" + " " + b + " " + "number of 200 notes");
		}

		if (rs100 == 0) {
			System.out.println("there would be" + " " + l + " " + "number of 100 notes");
		} else {
			System.out.println("there would be" + " " + l + " " + "number of 100 notes");
		}

		if (rs50 == 0) {
			System.out.println("there would be" + " " + j + " " + "number of 50 notes");
		} else {
			System.out.println("there would be" + " " + j + " " + "number of 50 notes");
		}

		if (rs20 == 0) {
			System.out.println("there would be" + " " + m + " " + "number of 20 notes");
		} else {
			System.out.println("there would be" + " " + m + " " + "number of 20 notes");
		}

		if (rs10 == 0) {
			System.out.println("there would be" + " " + n + " " + "number of 10 notes");
		} else {
			System.out.println("there would be" + " " + n + " " + "number of 10 notes");
		}

	}
}