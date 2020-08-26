package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import io.appium.java_client.MobileElement;

public class AmazonPage {
	
	WebDriver driver;

	public static By searchBox = By.xpath("//android.view.View[@content-desc='Clear search keywords']");
	public static By goButton = By.className("android.view.View");
	public static By price = By.xpath("//span[@class='a-price-whole']");
	//public static By horizontalView = By.xpath("//ol[@class='a-carousel']");
	//public static By hv1 = By.xpath("//div[@class='s-include-content-margin s-border-bottom s-border-top-overlap']");
	public static By freedel = By.xpath("//span[@aria-label='FREE Delivery by Amazon']");
	public static By nxtbtn = By.xpath("//a[@class='a-link-normal a-carousel-goto-nextpage s-carousel-button']");
	

    public AmazonPage(WebDriver driver){

        this.driver = driver;
    }
    
public void mobileSearch() {
		
		MobileElement ele = (MobileElement) driver.findElement(By.className("android.view.View"));
		ele.sendKeys("iphone");
	}

}
