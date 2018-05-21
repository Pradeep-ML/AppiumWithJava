package dC_Appium;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Android_PhoneLookp {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("platformName", "Android");
		caps.setCapability("deviceConnectUsername", "pradeep@ml.com");
		caps.setCapability("deviceConnectApikey", "207a13f6-6be1-4cb7-b761-a69f7e5d6a66");
		caps.setCapability("deviceConnectDevice", "49b82db4-7ceb-4d4f-9040-31691a944daa");
		caps.setCapability("appPackage", "com.android.controls");
		caps.setCapability("appActivity", "com.android.controls.SplashScreen");
		//caps.setCapability("browserName", "Chrome");
		caps.setCapability("newCommandTimeout","120");
		
		AppiumDriver driver = new AppiumDriver (new URL("http://10.4.6.32/Appium"),caps);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElementById("com.android.controls:id/usernameEditText").sendKeys("mobilelabs");
		driver.findElementById("com.android.controls:id/passwordEditText").sendKeys("demo");
		driver.findElementById("com.android.controls:id/loginButton").click();
		
		driver.findElementById("com.android.controls:id/searchSpinner").click();
		driver.findElementByXPath("//android.widget.CheckedTextView[@text=\"Any\"]").click();
		driver.findElementByXPath("//android.widget.CheckBox[@text=\"iOS\"]").click();
		driver.findElementByXPath("//android.widget.CheckBox[@text=\"BlackBerry\"]").click();
		driver.findElementByXPath("//android.widget.CheckBox[@text=\"Windows\"]").click();
		driver.findElementByXPath("//android.widget.Button[@text=\"SEARCH\"]").click();
		
		driver.quit();
		
	}

}
