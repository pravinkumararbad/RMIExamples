package com.RMICalculator;

import java.rmi.*;

class CalculatorRegistry{
	public static void main(String[] args) throws Exception{
		CalculatorRemote cr = new CalculatorRemoteImpl();
		Naming.bind("cal", cr);
		System.out.println("Calculator Remote Object is binded in RMI registry with logical name cal");
	}
}