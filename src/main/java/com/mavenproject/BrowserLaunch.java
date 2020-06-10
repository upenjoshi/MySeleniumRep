package com.mavenproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.agent.builder.AgentBuilder.InitializationStrategy.SelfInjection.Split;

public class BrowserLaunch {
	/*static WebDriver driver = null;*/

	public static void main(String[] args) throws InterruptedException {
		
		HelperJava.launchbrowser("Chrome");
			
		/*By city = By.xpath("//*[@id='fromCity']");
		By tocity = By.xpath("//*[@id='toCity']");
		By lstcity = By.xpath("//*[@role='option']");
		
		
		HelperJava.listofautosuggestion(lstcity,"Pu","Pune",city);
		HelperJava.tocityautosuggest(lstcity, "Del", "Delhi", tocity);
		
		
		 String trpdate = "07/04/2020";
		 By clndElemnt = By.xpath(("//*[@for='departure']"));
		 try {
			HelperJava.selectCalDate(clndElemnt,trpdate);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		 
		 
		 
		 
		 

	}

}

/*String month = HelperJava.driver.findElement(By.xpath("//*[@role='heading']")).getText();
System.out.println(month);
String[] arra =month.split(" ");
System.out.println(arra[0]);
String nextmonth = HelperJava.driver.findElement(By.xpath("(//*[@role='heading'])[2]")).getText();
System.out.println(nextmonth);
String[] arr = nextmonth.split(" ");
System.out.println(arr[0]);

if (month.equals("July") || nextmonth.equals("July")){
	HelperJava.driver.findElement(By.xpath("//*[@aria-label='Next Month']")).click();
}
		

driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Upen");
driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("joshi");
driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("2406879721");
driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Test!23");
getvalue.selectByIndex(2);
getvalue.selectByValue("10");
getvalue.selectByVisibleText("Jun");*/