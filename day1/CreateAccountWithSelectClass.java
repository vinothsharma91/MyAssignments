package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountWithSelectClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("VSE");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		WebElement element = driver.findElement(By.name("industryEnumId"));
		Select select = new Select(element);
		select.selectByContainsVisibleText("Computer Software");
		WebElement element1 = driver.findElement(By.name("ownershipEnumId"));
		Select select1 = new Select(element1);
		select1.selectByContainsVisibleText("S-Corporation");
		WebElement element2 = driver.findElement(By.id("dataSourceId"));
		Select select2 = new Select(element2);
		select2.selectByValue("LEAD_EMPLOYEE");
		WebElement element3 = driver.findElement(By.name("marketingCampaignId"));
		Select select3 = new Select(element3);
		select3.selectByIndex(6);
		WebElement element4 = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select select4 = new Select(element4);
		select4.selectByValue("TX");
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println(driver.getTitle());
		driver.close();
		
	}

}
