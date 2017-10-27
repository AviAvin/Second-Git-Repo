package LoggingFramework;

import java.util.logging.Logger;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailLogin {
	static WebDriver d;


	public static void main(String[] args) throws InterruptedException {
		
		BasicConfigurator .configure();
		Logger log=	Logger.getLogger("GmailLogin");
		PropertyConfigurator.configure("log4j.properties");
		//open firefox browser
		 d = new FirefoxDriver();
		 
		 log.info("opening browser");
		 //navigate to gmail app
		 d.get("https://accounts.google.com/");
		 d.findElement(By.xpath(".//*[@id='identifierId']")).sendKeys("abinashkate");
		 d.findElement(By.xpath(".//*[@id='identifierNext']/content")).click();
		 Thread.sleep(4000);
		 d.findElement(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("ari");
		 d.findElement(By.xpath(".//*[@id='passwordNext']/content/span")).click();
		 d.close();
		 System.out.println("Gmail");

	}

}
