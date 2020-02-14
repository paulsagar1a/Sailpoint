package com.iiq.util;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
public class DemoUtil {
	public static void main(String[] args) {
		Logger log = Logger.getLogger("file");
		log.setLevel(Level.TRACE);
		// TODO Auto-generated method stub
		System.out.println("---Hello DemoIdentityIQ!!!");
	}

}
