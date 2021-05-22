package com.RMIBasicExample;

import java.rmi.*;

class HelloRegistry{
	public static void main(String[] args) throws Exception {
		HelloRemote hr = new HelloRemoteImpl();
		Naming.bind("hello", hr);
		System.out.println("HelloRemote object is binded in RMIRegistry with a perticular logical name hello");
	}
}