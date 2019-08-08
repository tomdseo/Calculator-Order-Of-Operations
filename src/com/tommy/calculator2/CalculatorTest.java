package com.tommy.calculator2;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator calculation1 = new Calculator();
		calculation1.performOperation(10.5);
		calculation1.performOperation("+");
		calculation1.performOperation(5.2);
		calculation1.performOperation("*");
		calculation1.performOperation(10);
		calculation1.performOperation("!");
		System.out.println(calculation1.getResults());
	}

}