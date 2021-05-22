package com.RMICalculator;

import java.rmi.*;
import java.rmi.server.*;

public class CalculatorRemoteImpl extends UnicastRemoteObject implements CalculatorRemote{
	public CalculatorRemoteImpl() throws Exception{
		
	}
	
	public int add(int a, int b) throws RemoteException{
		System.out.println("Addition of " + a + " and " + b + " = " + (a+b));
		return a+b;		
	}
	public int substract(int a, int b) throws RemoteException{
		System.out.println("Substraction of " + a + " and " + b + " = " + (a-b));
		return a-b;
	}
	public int multiply(int a, int b) throws RemoteException{
		System.out.println("Multiplication of " + a + " and " + b + " = " + (a*b));
		return a*b;
	}
	public int divide(int a, int b) throws RemoteException{
		System.out.println("Addition of " + a + " and " + b + " = " + (a/b));
		return a/b;
	}
}


// Eligibility for present class to expose in the network