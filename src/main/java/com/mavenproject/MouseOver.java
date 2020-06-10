package com.mavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MouseOver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelperJava.launchbrowser("Chrome");
		
		By signin = By.xpath("//*[@data-nav-role='signin']");
		By reglist = By.xpath("//div[@id = 'nav-al-wishlist']//a");
		HelperJava.MouseOver(signin,reglist);
		
	}
	
	

}
