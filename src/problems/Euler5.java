package problems;

/*
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */

public class Euler5 {

	public static void main(String[] args) {
		System.out.println(calculate());

	}

	public static long calculate() {
		long start = 2520;
		boolean found = false;
		while (!found) {
			start += 2520;
			boolean divides = true;
			for (int j = 11; j <= 20; j++) {
				if (start % j != 0) {
					divides = false;
					break;
				} else {

				}
			}
			if (divides) {
				found = true;
			}
		}
		return start;
	}
}
