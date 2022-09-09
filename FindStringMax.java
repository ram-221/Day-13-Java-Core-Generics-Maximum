package com.bridgelabz;
import java.util.Scanner;

public class FindStringMax {

	private static void compareTo(String s1, String s2, String s3) {
		String max = s1;

		if(s2.compareTo(max) > 0) {
			max = s2;
		}
		if(s3.compareTo(max) > 0) {
			max = s3;
		
		System.out.println("The MaximumString is :"+max);
		}
	}

	public static void main(String[] args) {
		String a, b, c;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string of a :");
		a = s.nextLine();
		System.out.println("Enter the string of b :");
		b = s.nextLine();
		System.out.println("Enter the  of c :");
		c = s.nextLine();
		s.close();
		compareTo(a, b, c);
	}
}
