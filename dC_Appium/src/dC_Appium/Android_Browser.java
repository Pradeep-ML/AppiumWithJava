package dC_Appium;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;

public class Android_Browser {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("platformName", "Android");
		caps.setCapability("deviceConnectUsername", "pradeep@ml.com");
		caps.setCapability("deviceConnectApikey", "207a13f6-6be1-4cb7-b761-a69f7e5d6a66");
		caps.setCapability("deviceConnectDevice", "49b82db4-7ceb-4d4f-9040-31691a944daa");
		caps.setCapability("browserName", "Chrome");
		caps.setCapability("newCommandTimeout","120");
		
		AppiumDriver driver = new AppiumDriver (new URL("http://10.4.6.32/Appium"),caps);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.navigate().to("http://qa-content.mobilelabsinc.net/ml.html");
		driver.findElementByXPath("//BUTTON[@id=\"button-id\"]").click();
		driver.findElementByXPath("//INPUT[@id=\"dinos-id\"]").click();
		driver.findElementByXPath("//A[text()=\"Mobile Labs Inc\"]").click();
		driver.navigate().back();
		driver.quit();

	}

}
