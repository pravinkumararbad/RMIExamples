package com.RMICalculator;

import java.rmi.*;

public class CalculatorApp{
	public static void main(String[] args) throws Exception{
		CalculatorRemote cr = (CalculatorRemote)Naming.lookup("cal");
		cr.add(12,54);
		cr.substract(12,54);
		cr.multiply(12,54);
		cr.divide(4568,54);
	}
}