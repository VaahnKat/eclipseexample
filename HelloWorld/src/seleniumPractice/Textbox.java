package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/mac/eclipse-workspace/HelloWorld/Driver/chromedriver");  
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Edit.html");
		
		WebElement Editbox = driver.findElement(By.id("email"));
		Editbox.sendKeys("test@qa.se");
		
		WebElement appendbox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input"));
		appendbox.sendKeys("myfirst append msg");
		
		WebElement getstringbox = driver.findElement(By.name("username"));
		String value = getstringbox.getAttribute("value");
        System.out.println("the attribute which we got from the website is "+value);
        
        WebElement disabledbox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/div/div/input"));
        	boolean enabled =	disabledbox.isEnabled();
        System.out.println("The box is enabled ???, lets check now.... " + " And The answer is " + enabled);
        WebElement clearbox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div/div/input"));
        clearbox.clear();
	}

}
