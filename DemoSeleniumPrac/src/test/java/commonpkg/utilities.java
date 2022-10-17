package commonpkg;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.junit.AfterClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;


import io.github.bonigarcia.wdm.WebDriverManager;

public class utilities {
	public WebDriver driver;
	@Parameters({"browser","website"})

  
  @BeforeClass
  public void Ibrowsers(String NameOfBrowser,String wb) {
		if(NameOfBrowser.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get(wb);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}else if(NameOfBrowser.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.get(wb);//if pizzahut change url
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}

	}

	@AfterClass
	public void afterClass() throws IOException {
		screenshot();
	}
	 public  void screenshot() throws IOException {
		 String rf = System.getProperty("user.dir");//any other want ur project
		 System.out.println(rf);
			Date ab = new Date();
			System.out.println(ab);
			String files=ab.toString().replace(" ", "_").replace(":", "_");
			System.out.println(files);
			File ama=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(ama, new File(rf+"\\Pictures\\"+files+"Home1.jpg"));
		}
 
  
}