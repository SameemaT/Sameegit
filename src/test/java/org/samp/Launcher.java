package org.samp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.pom.LoginPage;

public class Launcher extends BaseClass {
	
	public static void main(String[] args) {
	browserLaunch("https://adactinhotelapp.com/");
	LoginPage a=new LoginPage();
WebElement txtUserName = driver.findElement(By.id("username"));
txtUserName.sendKeys("SameemaT");
WebElement txtPassword = driver.findElement(By.name("password"));
txtPassword.sendKeys("Baby@2020");
WebElement btnLogin = driver.findElement(By.id("login"));
btnLogin.click();

	}

}
