package Tests;

import java.io.File;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class AppiumTest {
	//WebDriver driver;
	static AppiumDriver<MobileElement> driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			test();
		}
		catch(Exception e) {
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	public static void test() throws Exception {
		
		File app = new File("G:\\Appium\\appiumtests\\Amazon\\Amazon Shopping UPI Money Transfer Bill Payment_v20.14.0.300_apkpure.com.apk");

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "POCO F1");
		cap.setCapability("udid", "bcb0d23f");
		cap.setCapability("platformName", "Android");
		cap.setCapability("app", app.getAbsolutePath());
		cap.setCapability("platformVersion", "9 PKQ1.180729.001");
		//cap.setCapability("appPackage", "com.amazon.mShop.android.shopping");
		//cap.setCapability("appActivity", "com.amazon.mShop.splashscreen.StartupActivity");
		cap.setCapability("automatorName", "UiAutomator2");
		cap.setCapability("noSign", "true");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(url, cap);
		
		System.out.println("Application started....");
	}

}
