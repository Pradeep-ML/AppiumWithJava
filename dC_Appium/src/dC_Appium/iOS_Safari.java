package dC_Appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.*;
public class iOS_Safari {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("platformName", "iOS");
		caps.setCapability("automationName", "XCUITest");
		caps.setCapability("deviceConnectUsername", "pradeep@ml.com");
		caps.setCapability("deviceConnectApikey", "a44e5ace-a973-4252-8f32-bd5c01f773ae");
		caps.setCapability("deviceConnectDevice", "79273239-4733-4ddd-bf3f-6fb84c4dda8c");
		caps.setCapability("browserName", "Safari");
		caps.setCapability("newCommandTimeout","120");
		
		AppiumDriver driver = new AppiumDriver (new URL("http://10.4.5.18/Appium"),caps);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.navigate().to("http://qa-content.mobilelabsinc.net/ml.html");
		Thread.sleep(4000);
		driver.findElementByXPath("//BUTTON[@id=\"button-id\"]").click();
		driver.findElementByXPath("//INPUT[@id=\"dinos-id\"]").click();
		driver.findElementByXPath("//A[text()=\"Mobile Labs Inc\"]").click();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.quit();
	}

}
