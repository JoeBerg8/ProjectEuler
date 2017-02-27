package problems;

import java.util.ArrayList;

/*
 * Largest prime factor
Problem 3
The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?

@author Joe Berg
 */
public class Euler3 {

	public static void main(String[] args) {
		ArrayList<Integer> primesList = new ArrayList<>();		
		int n = 13915;
		boolean[] isPrime = new boolean[n+1];
		for (int i = 2; i <= n; i++) {
			isPrime[i] = true;
		}
		for (int factor = 2; factor*factor <= n; factor++) {
			if (isPrime[factor]) {
				for (int j = factor; factor*j <= n; j++) {
					isPrime[factor*j] = false;
				}
			}
			
		}
		int primes = 0;
		
		for (int i = 2; i <= n; i++) {
			if (isPrime[i]) primes++;
		}
		System.out.println("Number of primes <= " + n + " is " + primes);
	}
}