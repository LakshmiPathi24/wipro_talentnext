package java_fundamentals;

import java.util.*;

public class Arrays_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int sum = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		double average = (double) sum / n;
		System.out.println("Sum = " + sum);
		System.out.println("Average = " + average);
	}
}