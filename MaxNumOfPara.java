package com.bridgelabz;

public class MaxNumOfPara<T extends Comparable<T>> {
	T [] multiple;

	public MaxNumOfPara(T [] multiple) {
		this.multiple = multiple;
	}

	public T maximum() {
		return MaxNumOfPara.maximum(multiple);
	}

	public static <T extends Comparable<T>> T maximum(T []multiple) {
		final int  ZERO = 0;
		for (int i = ZERO; i < multiple.length; i++) {
			for (int j = i; j < multiple.length; j++) {
				if (multiple[i].compareTo(multiple[j]) < 0) {
					T temp = multiple[i];
					multiple[i] = multiple[j];
					multiple[j] = temp;
				}
			}
		}
		return multiple[0];
	}

	public static void main(String[] args) {
		Integer [] multiString = {01, 23, 89, 36, 45};
		int maxValue = new MaxNumOfPara<Integer>(multiString).maximum();
		System.out.println("the maximum value of arry "+maxValue);
	}

}
