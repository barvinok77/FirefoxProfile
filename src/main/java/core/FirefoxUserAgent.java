package core;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FirefoxUserAgent {

	public static void main(String[] args) throws InterruptedException {
		
		String url = "http://facebook.com";
		String userAgent = "Mozilla/5.0 (iPhone; CPU OS 10_1_1 like Mac OS X) AppleWebKit/602.2.14 "
				+ "(KHTML, like Gecko) Version/10.0 Mobile/14B100 Safari/602.1";
		//String userAgent = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:49.0) Gecko/20100101 Firefox/49.0";
		
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("general.useragent.override", userAgent);;
		WebDriver driver = new FirefoxDriver(profile);
		
		driver.get(url);
		Object output = ((JavascriptExecutor) driver).executeScript("return navigator.userAgent;");
		System.out.println(output.toString());
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(1000);
		driver.quit();
	}
}
