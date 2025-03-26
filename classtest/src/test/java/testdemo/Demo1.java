package testdemo;

import java.time.Duration;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
	public static void main(String[] args) {
		
		WebDriver chromedriver = new ChromeDriver();	
		chromedriver.get("https://bstackdemo.com/signin");
		
		chromedriver.manage().window().maximize();
		WebElement dropdown = chromedriver.findElement(By.xpath("//*[@id=\"username\"]/div/div[2]/div"));
		dropdown.click();
		WebElement userNameSelect=chromedriver.findElement(By.xpath("//div[text()='demouser']"));
		userNameSelect.click();
		WebElement passdropdown = chromedriver.findElement(By.id("password"));
		passdropdown.click();
		WebElement password = chromedriver.findElement(By.xpath("//div[text()='testingisfun99']"));
		password.click();
		chromedriver.findElement(By.id("login-btn")).click();
		
		chromedriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		chromedriver.findElement(By.xpath("//*[@id=\"3\"]/div[4]")).click();
		chromedriver.findElement(By.xpath("//*[@id=\"7\"]/div[4]")).click();
		chromedriver.findElement(By.xpath("//*[text()='Checkout']")).click();
		
		chromedriver.findElement(By.id("firstNameInput")).sendKeys("sdfd");
		chromedriver.findElement(By.id("lastNameInput")).sendKeys("qeww");
		chromedriver.findElement(By.id("addressLine1Input")).sendKeys("dsfasfe");
		chromedriver.findElement(By.id("provinceInput")).sendKeys("georgia");
		chromedriver.findElement(By.id("postCodeInput")).sendKeys("234");
		chromedriver.findElement(By.id("checkout-shipping-continue")).click();

		

}
}