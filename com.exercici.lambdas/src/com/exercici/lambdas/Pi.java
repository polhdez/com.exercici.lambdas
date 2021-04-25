package com.exercici.lambdas;

public class Pi {
	public void getPiValue() {
		PiInterface piInterface = () -> { return 3.1415; };
		piInterface.getPiValue();
	}
}