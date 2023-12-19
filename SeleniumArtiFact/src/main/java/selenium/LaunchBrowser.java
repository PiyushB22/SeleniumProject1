package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.drive", "C:\\Users\\Piyush\\Desktop\\LaunchBroweser\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		Thread.sleep(1000);
		driver.findElement(By.name("search_query")).sendKeys("Rockstar nadan parinde");
		Thread.sleep(1000);
		driver.findElement(By.id("search-icon-legacy")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("title-wrapper")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("guide-icon")).click();
		Thread.sleep(1000);
		//driver.findElement(By.className("yt-spec-touch-feedback-shape__fill")).click();
	//	driver.findElement(By.className("style-scope yt-icon")).click();
	    Thread.sleep(1000);
	    
		
	}

}
