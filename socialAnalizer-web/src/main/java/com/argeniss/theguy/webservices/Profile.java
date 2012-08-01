package com.argeniss.theguy.webservices;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService()
public class Profile {

	@WebMethod()
	public String sayHello(String name) {
	    System.out.println("Hello: " + name);
	    return "Hello " + name + "!";
	}
}
