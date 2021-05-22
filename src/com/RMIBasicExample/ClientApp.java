package com.RMIBasicExample;

import java.rmi.*;
public class ClientApp{
	public static void main(String[] args) throws Exception{
		HelloRemote hr = (HelloRemote)Naming.lookup("hello");
		String data = hr.sayHello("Pravin");
		System.out.println(data);
	}
}