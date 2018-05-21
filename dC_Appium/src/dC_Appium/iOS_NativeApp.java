package dC_Appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

public class iOS_NativeApp {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("platformName", "iOS");
		caps.setCapability("automationName", "XCUITest");
		caps.setCapability("deviceConnectUsername", "pradeep@ml.com");
		caps.setCapability("deviceConnectApikey", "a44e5ace-a973-4252-8f32-bd5c01f773ae");
		caps.setCapability("deviceConnectDevice", "79273239-4733-4ddd-bf3f-6fb84c4dda8c");
		caps.setCapability("bundleId", "com.mobilelabs.PhoneLookup-cal");
		caps.setCapability("newCommandTimeout","120");
		
		AppiumDriver driver = new AppiumDriver (new URL("http://10.4.5.18/Appium"),caps);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElementByXPath("//XCUIElementTypeTextField[@name=\"UsernameTextField\"]").sendKeys("mobilelabs");
		driver.findElementByXPath("//XCUIElementTypeSecureTextField[@name=\"PasswordTextField\"]").sendKeys("demo");
		driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Done\"]").click();
		driver.findElementByXPath("//XCUIElementTypeButton[@name=\"SignInButton\"]").click();
		
		Thread.sleep(2000);
		
		driver.findElementByXPath("//XCUIElementTypeSwitch[@name=\"Android\"]").click();
		driver.findElementByXPath("//XCUIElementTypeSwitch[@name=\"Blackberry\"]").click();
		driver.findElementByXPath("//XCUIElementTypeSwitch[@name=\"Windows\"]").click();
		driver.findElementByXPath("(//XCUIElementTypeButton[@name=\"Search\"])[1]").click();
		Thread.sleep(1000);
		
		driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Search\"]").click();
		driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Controls\"]").click();
		driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Search\"]").click();
		driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Logout\"]").click();
		Thread.sleep(1000);
			

	}

}
