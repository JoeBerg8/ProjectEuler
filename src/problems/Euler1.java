package problems;

/* Multiples of 3 and 5 -Problem 1
 +
 +If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 
 Find the sum of all the multiples of 3 or 5 below 1000.
 
 @author Joe Berg
 */
 public class Euler1 {
 	public void calculate() {
 		int totalSum = sum1() + sum2() + sum3() - sum4();
 		System.out.println(totalSum);
 	}
 	
 	private int sum1() { //leftovers from changing 1000 to 990
 		int sum1 = 993 + 995 + 996 + 999;
 		
 		return sum1;
 	}
 	
 	private int sum2() { //multiples of 3
 		int mult3 = 330;
 		int num = mult3 * (990 + 3) / 2;
 		int sum2 = num;
 		
 		return sum2;
 	}
 	
 	private int sum3() { //multiples of 5
 		int mult5 = 198;
 		int num = mult5 * (990 + 5) / 2;
 		int sum3 = num;
 		
 		return sum3;
 	}
 	
 	private int sum4() { //multiples of 15 that need to be removed from sum 1, 2, 3.
 		int mult15 = 66;
 		int num = mult15 * (990 + 15) / 2;
 		int sum4 = num;
 		
 		return sum4;
 	}
 }
