package com.mavenproject;

import java.text.DateFormatSymbols;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mavenproject.BrowserLaunch;;

public class HelperJava {
	static WebDriver driver = null;
	public static WebDriver launchbrowser(String btype) {
		
		String projectpath = System.getProperty("user.dir");
		if (btype.equals("Chrome")){
			String driverpath = projectpath+""+"/src/main/resources/ChromeDriver/chromedriver.exe"; 
			System.setProperty("webdriver.chrome.driver", driverpath);
			driver = new ChromeDriver();
				/*Set<String> winIDs = driver.getWindowHandles();
				System.out.println("Total Windows" + winIDs.size());
				Iterator<String> it = winIDs.iterator();
				System.out.println(it.next());*/
				driver.get("https://www.rediff.com/");
				/*System.out.println("============");
				winIDs = driver.getWindowHandles();
				System.out.println("Total Windows" + winIDs.size());
					it = winIDs.iterator();
						String mainwin = it.next();
						String fwin = it.next();
						String swin = it.next();
						String twin = it.next();
						System.out.println(mainwin);
						System.out.println(fwin);
							driver.switchTo().window(fwin);
							driver.close();
							System.out.println(swin);
							driver.switchTo().window(swin);
							driver.close();
							System.out.println(twin);
							driver.switchTo().window(twin);
							driver.close();
							driver.switchTo().window(mainwin);*/
							driver.manage().window().maximize();
			/*System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY,"C://chrome.log");*/
		}
		else {
			System.out.println("different drowser");
		}
		return driver;
		
	}
	
	public static List<WebElement> listofautosuggestion(By suggestiontxt, String txt,
		String city_name, By d) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver,60);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(d));
		/*driver.findElement(d).sendKeys(txt);*/
		element.sendKeys(txt);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		List<WebElement> autosuggestions = driver.findElements(suggestiontxt);
		for (WebElement autosuggestion : autosuggestions) {
			System.out.println(autosuggestion.getText());
			if (autosuggestion.getText().contains(city_name)) {
				System.out.println("Equal");
				autosuggestion.click();
				break;
			} else {
				System.out.println("Not Equal");
			}
		}
		
		return autosuggestions;
	}
	
	public static List<WebElement> tocityautosuggest (By suggtext,String citytext,
			String tocitytxt,By tocity) throws InterruptedException{
		WebDriverWait wat = new WebDriverWait(driver,60);
		WebElement elemt = wat.until(ExpectedConditions.visibilityOfElementLocated(tocity));
		/*driver.findElement(tocity).sendKeys(citytext);*/
		
		elemt.sendKeys(citytext);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<WebElement> citylist = driver.findElements(suggtext);
			for(WebElement suggest : citylist){
				System.out.println(suggest.getText());
				if (suggest.getText().contains("Delhi")) {
					System.out.println("Equal");
					suggest.click();
					break;
				}
				else {
					System.out.println("Not Equal");
				}
				
			}
			return citylist;
	}
	
	public static void selectCalDate(By calndElemnt,String tripdate) throws Exception{
		/*driver.findElement(By.xpath("(//*[@for='departure'])")).click();*/
		driver.findElement(calndElemnt).click();
		// String tripdate="07-26-2019";
		System.out.println(tripdate);
		String[] mondyyr = tripdate.split("/");
		System.out.println(mondyyr[0]);
		int tripMon=Integer.parseInt(mondyyr[0]);
		String months = HelperJava.getMonthForInt(tripMon);
		System.out.println(months);
		months = months + " "+ mondyyr[1];
		
		
		 
		 String month = driver.findElement(By.xpath("//*[@role='heading']")).getText();
		 System.out.println(month);
		 String[] arra =month.split(" ");
		 System.out.println(arra[0]);
		 String nextmonth = driver.findElement(By.xpath("(//*[@role='heading'])[2]")).getText();
		 System.out.println(nextmonth);
		 String[] arr = nextmonth.split(" ");
		 System.out.println(arr[0]);
		 System.out.println(arr[1]);
		 
		 
		 String currentMon = arr[0];
		 int currentMonNum = 0;
		 if(currentMon.equalsIgnoreCase("Jan")){
				currentMonNum=1;

				}
				else if(currentMon.equalsIgnoreCase("Feb")){
				currentMonNum=2;

				}
				else if(currentMon.equalsIgnoreCase("Mar")){
				currentMonNum=3;

				}
				else if(currentMon.equalsIgnoreCase("Apr")){
				currentMonNum=4;

				}
				else if(currentMon.equalsIgnoreCase("May")){
				currentMonNum=5;

				}
				else if(currentMon.equalsIgnoreCase("June")){
				currentMonNum=6;

				}
				else if(currentMon.equalsIgnoreCase("July")){
				currentMonNum=7;
				months = "Jul";

				}
				else if(currentMon.equalsIgnoreCase("Aug")){
				currentMonNum=8;

				}
				else if(currentMon.equalsIgnoreCase("Sep")){
				currentMonNum=9;

				}
				else if(currentMon.equalsIgnoreCase("Oct")){
				currentMonNum=10;

				}
				else if(currentMon.equalsIgnoreCase("Nov")){
				currentMonNum=11;

				}
				else if(currentMon.equalsIgnoreCase("Dec")){
				currentMonNum=12;

				}
		 
		 
		 
		 for (int i=0;i<=tripMon-currentMonNum;i++) {
			 driver.findElement(By.xpath("//*[@aria-label='Next Month']")).click();
		 }
		 /*if (month.equals("July") || nextmonth.equals("July")){
				HelperJava.driver.findElement(By.xpath("//*[@aria-label='Next Month']")).click();
			}*/

		 
		  
		}
		
	
	public static void MouseOver(By d,By lst) {
		WebElement ele = driver.findElement(d);
			
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
		
	
		
		List<WebElement> links = driver.findElements(By.xpath("//div[@id = 'nav-al-wishlist']//a"));
		for (int i=0;i<=links.size();i++){
			System.out.println(links.get(i).getText());
			if (links.get(i).getText().equals("Baby Registry")){
				links.get(i).click();
				break;
			}
		}
	}

	public static String getMonthForInt(int m) {
	    String month = "invalid";
	    DateFormatSymbols dfs = new DateFormatSymbols();
	    String[] months = dfs.getMonths();
	    if (m >= 0 && m <= 11 ) {
	        month = months[m-1];
	    }
	    return month;
	}
	
	public static WebElement windowhandle(By wndname, String elname){
		WebElement element = driver.findElement(wndname);
		element.click();
		
		if (elname.equalsIgnoreCase("clkproceed")){
			Alert al = driver.switchTo().alert();
			al.accept();
			driver.switchTo().defaultContent();
		}
		LogEntries logs = driver.manage().logs().get("browser");

		for(LogEntry logValue : logs) {
			
			System.out.println(logValue.getMessage());
			
		}
		return element;
	}
	
}

