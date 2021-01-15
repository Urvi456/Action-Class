package com.classes360;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionEx {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver81.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/AdminLTE/index.html");
		Actions builder=new Actions(driver);
		WebElement userName=driver.findElement(By.xpath("//*[@id=\"email\"]"));
		Action seriesofaction=builder.moveToElement(userName).click().keyDown(userName, Keys.SHIFT).sendKeys(userName, "javabykiran").doubleClick(userName).contextClick().build();
		seriesofaction.perform();
		
	}
}
