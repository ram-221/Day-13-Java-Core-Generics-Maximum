package com.bridgelabz;
import java.util.Scanner;

public class FindFloatMax {

	private static void compareTo(Float n1, Float n2, Float n3) {
		Float max = n1;

		if(n2.compareTo(max) > 0) {
			max = n2;
		}
			if(n3.compareTo(max) > 0) {
				max = n3;
			System.out.println("The maximum number is :"+max);
		}
	}
	public static void main(String[] args) {

		Float a, b, c;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of a :");
		a = s.nextFloat();
		System.out.println("Enter the value of b :");
		b = s.nextFloat();
		System.out.println("Enter the value of c :");
		c = s.nextFloat();
		s.close();
		compareTo(a, b, c);
	}



}
