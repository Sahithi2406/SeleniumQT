package pck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Array {
	WebDriver d;
	
	@BeforeMethod
	 public void Up() {
		 System.setProperty("webdriver.gecko.driver","C:\\Drivers\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		   d=new FirefoxDriver();
	 }
	@Test
	public void Fb() {
		d.get("https://www.facebook.com/signup");
		Select Day=new Select(d.findElement(By.id("day")));
		String a[]=new String[31];
		
	for(int i=0;i<=a.length-1;i++) {	
		Day.selectByIndex(i);
		String b=Day.getFirstSelectedOption().getText();
		a[i]=b;
		
		System.out.println("value:"+a[i]);
	}
	
	//System.out.println(a[]);	
	}

	 @AfterTest
	  public void Down() {
		  d.quit();
		  
	  }

}
