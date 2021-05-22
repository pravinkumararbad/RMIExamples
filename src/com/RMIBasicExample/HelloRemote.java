package com.RMIBasicExample;

import java.rmi.*;

public interface HelloRemote extends Remote{
	public String sayHello(String name) throws RemoteException;
}