package wee2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//button[@role='button'])[1]")).click();
		System.out.println(driver.getTitle());
		driver.navigate().back();
		WebElement dis = driver.findElement(By.xpath("//button[@disabled='disabled']"));
		System.out.println(dis.getText());
		WebElement loc =driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[3]"));
		System.out.println("Position of submit button is:"+loc.getLocation());
		WebElement colo =driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[4]"));
		System.out.println("Background colour of save button is: "+colo.getCssValue("background-color"));
		WebElement hw = driver.findElement(By.xpath("(//button[@role='button'])[5]"));
		Dimension size = hw.getSize();
		int width = size.getWidth();
		int height = size.getHeight();
		System.out.println("submit Button width: " + width);
		System.out.println("submit Button height: " + height);
		driver.quit();

	}

}
