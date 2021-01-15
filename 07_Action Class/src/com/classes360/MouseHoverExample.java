package com.classes360;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverExample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver81.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		//Mouse on "Women link"
		Actions act=new Actions(driver);
		By testlink=By.className("desktop-main");
		WebElement test=driver.findElement(testlink);
		act.moveToElement(test).build().perform();
		//Click on Western wear link
		driver.findElement(By.className("desktop-categoryName")).click();
		//click on the categories -Dresses and jumpsuit
		driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[2]/div/div/div/div/li[2]/ul/li[2]/a")).click();
		//Move hover to first dress
		Actions sel=new Actions(driver);
		sel.moveToElement(driver.findElement(By.xpath("//*[@id=\"desktopSearchResults\"]/div[2]/section/ul/li[1]/a/div[2]"))).click();
		//Click on to add to bag
		driver.findElement(By.xpath("//*[@id=\"mountRoot\"]/div/div/div/main/div[2]/div[2]/div[3]/div/div[1]")).click();
		//select size 
		driver.findElement(By.xpath("//*[@id=\"sizeButtonsContainer\"]/div[2]/div[4]/div[1]/button/p")).click();
		//go to add bag and see your selected product
		driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/div[2]/a[2]/span[3]"));
		//close current window 
		driver.close();
		
		
		
		
	}
}
