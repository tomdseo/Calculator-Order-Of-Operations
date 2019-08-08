package com.tommy.calculator2;
import java.util.ArrayList;

class Calculator implements java.io.Serializable {
	ArrayList<String> list = new ArrayList<String>();
	private String firstOperandString;
	private String secondOperandString;
	private double firstOperandDouble;
	private double secondOperandDouble;
	private double result;

	
	public void performOperation(double number) {
		//Converts double to string
		String numberAsString = Double.toString(number);
		list.add(numberAsString);
	}
	
	public void performOperation(String operator) {
		if(operator == "*" || operator == "/" || operator == "+" || operator == "-") {
		list.add(operator);
		}
	}
	
	public double getResults() {
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i) == "*" || list.get(i) == "/") {
				if(list.get(i) == "*") {
					this.firstOperandString = list.get(i-1);
					this.secondOperandString = list.get(i+1);
					this.firstOperandDouble = Double.valueOf(firstOperandString);
					this.secondOperandDouble = Double.valueOf(secondOperandString);
					double temp = firstOperandDouble * secondOperandDouble;
					String tempString = Double.toString(temp);
					list.set(i-1, tempString);
					list.remove(i);
					list.remove(i);
					i = 0;
				}
				else if(list.get(i) == "/") {
					this.firstOperandString = list.get(i-1);
					this.secondOperandString = list.get(i+1);
					this.firstOperandDouble = Double.valueOf(firstOperandString);
					this.secondOperandDouble = Double.valueOf(secondOperandString);
					double temp = firstOperandDouble / secondOperandDouble;
					String tempString = Double.toString(temp);
					list.set(i-1, tempString);
					list.remove(i);
					list.remove(i);
					i = 0;
				}
			}
		}
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i) == "+" || list.get(i) == "-") {
				if(list.get(i) == "+") {
					this.firstOperandString = list.get(i-1);
					this.secondOperandString = list.get(i+1);
					this.firstOperandDouble = Double.valueOf(firstOperandString);
					this.secondOperandDouble = Double.valueOf(secondOperandString);
					double temp = firstOperandDouble + secondOperandDouble;
					String tempString = Double.toString(temp);
					list.set(i-1, tempString);
					list.remove(i);
					list.remove(i);
					i = 0;
				}
				else if(list.get(i) == "-") {
					this.firstOperandString = list.get(i-1);
					this.secondOperandString = list.get(i+1);
					this.firstOperandDouble = Double.valueOf(firstOperandString);
					this.secondOperandDouble = Double.valueOf(secondOperandString);
					double temp = firstOperandDouble - secondOperandDouble;
					String tempString = Double.toString(temp);
					list.set(i-1, tempString);
					list.remove(i);
					list.remove(i);
					i = 0;
				}
			}
		}
		for(String num : list) {
			this.result = Double.valueOf(num);
		}
	return result;
	}
	
}