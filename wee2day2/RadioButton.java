package wee2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//span[@class='ui-radiobutton-icon ui-icon ui-icon-blank ui-c'])[9]")).click();
		driver.findElement(By.xpath("(//span[@class='ui-radiobutton-icon ui-icon ui-icon-blank ui-c'])[14]")).click();
		WebElement ele=driver.findElement(By.xpath("(//label[text()='Safari'])[2]"));
		System.out.println("Default raadio button is: "+ ele.getText());
		WebElement ele1 =driver.findElement(By.xpath("//label[text()='21-40 Years']"));
		System.out.println("Age group is:"+ ele1.getText());
	}

}
