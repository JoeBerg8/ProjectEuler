package problems;

public class Euler6 {
	public static void main(String[] args) {
		System.out.println(sumSquare());
		System.out.println(squareSum());

		System.out.println(squareSum() - sumSquare());
	}

	public static long sumSquare() {
		long squareValue;
		long sum = 0;
		for (long i = 0; i <= 100; i++) {
			squareValue = (i * i);
			sum += squareValue;
		}
		return sum;
	}

	public static long squareSum() {
		long sumValue = 0;
		long square = 0;
		for (long i = 0; i <= 100; i++) {
			sumValue += i;
			square = (sumValue * sumValue);
		}

		return square;
	}
}
