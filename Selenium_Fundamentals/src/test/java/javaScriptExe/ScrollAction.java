package javaScriptExe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollAction {
	
	@Test
	public void verifyPageFeatures() throws Exception{

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement element = driver.findElement(By.xpath("//a[contains(text(),'About Selenium')]"));
		
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//js.executeScript("location.reload()");
		//js.executeScript("alert('hello world');");
		//js.executeScript("window.scrollTo(0,100)");
		//js.executeScript("arguments[0].scrollIntoView(true);", element);
		//js.executeScript("arguments[0].click();", element);
		
		String atr = element.getAttribute("href");

		System.out.println(atr);
		
		//Assert.assertEquals(element.getCssValue("color"), "#43b02a!important");
		
		System.out.println(element.getCssValue("border-bottom"));

	}
}
