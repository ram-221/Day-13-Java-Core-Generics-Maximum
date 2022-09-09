package com.bridgelabz;

import java.util.Scanner;

public class FindIntegerMax {

	private static void compareTo(Integer n1, Integer n2, Integer n3) {
		Integer max = n1;

		if(n2.compareTo(max) > 0) {
			max = n2;
		}
		if(n3.compareTo(max) > 0) {
			max = n3;
			System.out.println("The maximum number is :"+max);
		}
	}

	public static void main(String[] args) {

		Integer a, b, c;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of a :");
		a = s.nextInt();
		System.out.println("Enter the value of b :");
		b = s.nextInt();
		System.out.println("Enter the value of c :");
		c = s.nextInt();
		s.close();
		compareTo(a, b, c);
	}
}
