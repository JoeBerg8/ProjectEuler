package problems;

public class Euler4 {

	public static void main(String[] args) {
		int max = 100001;
		for (int i = 999; i >= 100; i--) {
			if (max >= i * 999) {
				break;
			}
			for (int j = 999; j >= i; j--) {
				int product = i * j;
				if (max < product && isPalindrome(product)) {
					max = product;
				}
			}
		}
		System.out.println(max);
	}
	
	public static boolean isPalindrome(int n) {
		int palindrome = n;
		int reverse = 0;

		while (palindrome != 0) {
			int remainder = palindrome % 10;
			reverse = reverse * 10 + remainder;
			palindrome = palindrome / 10;
		}
		if (n == reverse) {
			return true;
		}
		
		return false;
	}
}
