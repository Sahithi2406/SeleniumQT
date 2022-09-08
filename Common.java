package mouseevents;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Common {
	
	WebDriver d;
	@Parameters("browser")
	@BeforeMethod
	public void setUp(String browser)
	{
		// Launch the browser
		if(browser.equals("FF"))
		{
			d=new FirefoxDriver();
		}
		else if(browser.equals("GC"))
		{
			d=new ChromeDriver();
		}
		else if(browser.equals("Edge"))
		{
			d=new EdgeDriver();
		}
		
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		d.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
		d.manage().deleteAllCookies();
		
		
	}
    @AfterMethod
    public void tearDown()
    {
		// Close the browser
		d.quit();
    }

}
