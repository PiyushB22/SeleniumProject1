package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.drive", "C:\\\\Users\\\\Piyush\\\\Desktop\\\\LaunchBroweser\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
	    dr.get("https://www.flipkart.com/");
	    Thread.sleep(1000);
	    dr.findElement(By.className("_30XB9F")).click();
	    Thread.sleep(1000);
	    //dr.findElement(By.className("uiU-ZX")).click(); 
	    dr.findElement(By.className("Pke_EE")).sendKeys("Acer Aspire7 Laptop");
	    Thread.sleep(1000);
	    dr.findElement(By.className("_2iLD__")).click();
	    Thread.sleep(1000);
	    dr.findElement(By.className("_4rR01T")).click();
	    Thread.sleep(1000);
	    dr.findElement(By.className("_2KpZ6l _2U9uOA _3v1-ww")).click();
	}

}
