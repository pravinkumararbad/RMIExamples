package com.RMICalculator;

import java.rmi.*;

public interface CalculatorRemote extends Remote{
	public int add(int a, int b) throws RemoteException;
	public int substract(int a, int b) throws RemoteException;
	public int multiply(int a, int b) throws RemoteException;
	public int divide(int a, int b) throws RemoteException;
}