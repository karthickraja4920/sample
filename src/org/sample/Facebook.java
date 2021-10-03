package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\day3 task2\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
	    WebElement create = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
	    create.click();
	    
	    Thread.sleep(4000);
	    WebElement fName = driver.findElement(By.xpath("//input[@name='firstname']"));
	    fName.sendKeys("KARTHICK");
	}
}
