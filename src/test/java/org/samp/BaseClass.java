package org.samp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.pom.LoginPage;

public class BaseClass  {
	//public static WebDriver driver;
	public static WebDriver driver;
	public static void browserLaunch(String value) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\Eclipse_64 bit (1)\\eclipse\\BrowserLaunch\\drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get(value);
		driver.manage().window().maximize();

	}
	public WebElement locators(String Locators,String Value) {
		if (Locators.equals("id")) {
			WebElement element = driver.findElement(By.id(Value));
			return element;

			
		} else {
			Locators.equals("name");
			WebElement element = driver.findElement(By.name(Value));
			return element;
	

		}


	}
public static void enterText(WebElement element,String Value) {
	element.sendKeys(Value);

}
public static void click(WebElement element) {
	element.click();

}
}
