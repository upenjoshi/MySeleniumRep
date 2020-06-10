package com.mavenproject;

import org.openqa.selenium.By;

public class WinsandFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelperJava.launchbrowser("Chrome");
		By signin = By.xpath("//a[text()='Sign in']");
		By proceed = By.xpath("//input[@name='proceed']");
		String name = "clkproceed";
		
		HelperJava.windowhandle(signin,"");
		HelperJava.windowhandle(proceed, name);
		
	}

}
