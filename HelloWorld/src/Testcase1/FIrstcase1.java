package Testcase1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FIrstcase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/mac/eclipse-workspace/HelloWorld/Driver/chromedriver");  
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/watch?v=IsPtBQiAz_g");
	}

}
