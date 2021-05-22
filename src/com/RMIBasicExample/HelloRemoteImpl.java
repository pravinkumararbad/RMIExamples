package com.RMIBasicExample;

import java.rmi.server.*;
import java.rmi.*;

public class HelloRemoteImpl extends UnicastRemoteObject implements HelloRemote{
	public HelloRemoteImpl() throws RemoteException{
		
	}
	public String sayHello(String name)throws RemoteException{
		return "Hello " + name + "!";
	}
}