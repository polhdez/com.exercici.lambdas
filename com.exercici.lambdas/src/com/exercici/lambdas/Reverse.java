package com.exercici.lambdas;

public class Reverse {
	public void reverse(String str) {
		ReverseInterface reverseInterface = s -> { return new StringBuilder(s).reverse().toString(); };
		reverseInterface.reverse(str);
	}
}
