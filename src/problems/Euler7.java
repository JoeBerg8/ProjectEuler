package problems;

import java.util.ArrayList;
import java.util.Scanner;

public class Euler7 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = in.nextInt();
		Euler7 prime = new Euler7();
		prime.primes(n);
		
	}

	public void primes(int n) {
		ArrayList<Integer> nums = new ArrayList<>();
		boolean[] primes = new boolean[n + 1];
		for (int i = 2; i < primes.length; i++) {
			primes[i] = true;
		}
		int num = 2;
		while (true) {
			for (int i = 2;; i++) {
				int multiple = num * i;
				if (multiple > n) {
					break;
				} else {
					primes[multiple] = false;
				}
			}
			boolean nextNumFound = false;
			for (int i = num + 1; i < n + 1; i++) {
				if (primes[i]) {
					num = i;
					nextNumFound = true;
					break;
				}
			}
			if (!nextNumFound) {
				break;
			}
		}
		for (int i = 0; i < primes.length; i++) {
			if (primes[i]) {
				System.out.println(i);				
			}
		}
	}
}
