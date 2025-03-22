package wee2day2;

import java.util.concurrent.TimeUnit;

import org.bouncycastle.oer.its.ieee1609dot2.basetypes.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[1]")).click();
		driver.findElement(By.xpath("//span[text()='Ajax']")).click();
		WebElement message = driver.findElement(By.xpath("//span[text()='Ajax']"));
		System.out.println(message.getText());
		driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[3]")).click();
		driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[8]")).click();
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		WebElement message1 = driver.findElement(By.xpath("//span[text()='Disabled']"));
		System.out.println(message1.getText());
		driver.findElement(By.className("ui-selectcheckboxmenu-trigger ui-state-default ui-corner-right")).click();
		driver.findElement(By.xpath("//input[@value='Miami']")).click();
		driver.close();
	}

}
