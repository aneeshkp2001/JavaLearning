package learning;

import java.util.Scanner;

public class IfCondition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();
		if( n % 5 == 0 ){
		System.out.println("Number is divisible by 5");
		}
		else {
		System.out.println("Num is not divisible by 5");
		}
	}
}
