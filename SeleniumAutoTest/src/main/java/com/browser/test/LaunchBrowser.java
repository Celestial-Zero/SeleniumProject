package com.browser.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\exam\\Desktop\\SDM\\WebDrivers\\Firefox\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//driver.get("https://www.google.co.in/");
		//System.out.println(driver.getTitle());
		//Thread.sleep(2000);
		driver.get("https://www.instagram.com");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("itz_himanshu6302");
		driver.findElement(By.name("password")).sendKeys("himanshu@884756");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("\\button[@class=' _acan _acap _acas _aj1- _ap30']")).click();
		
		driver.findElement(By.cssSelector("div[class='x9f619 xjbqb8w x78zum5 x168nmei x13lgxp2 x5pf9jr xo71vjh x1n2onr6 x1plvlek xryxfnj x1c4vz4f x2lah0s xdt5ytf xqjyukv x1qjc9v5 x1oa3qoh x1nhvcw1']")).click();
		
	}

}
