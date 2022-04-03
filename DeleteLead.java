package week6.day2;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class DeleteLead extends CommonSteps {

		@Test(dataProvider="fetchdata")
		public void delete(String phno) throws InterruptedException {
	
			driver.findElement(By.linkText("Find Leads")).click();
			driver.findElement(By.xpath("//span[text()='Phone']")).click();
			driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phno);
			driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			Thread.sleep(2000);
			String leadID = driver.findElement(By.xpath("(//div[contains(text(),'Lead ID')]/following::table/tbody/tr/td[1]/div/a)[1]")).getText();
			driver.findElement(By.xpath("(//div[contains(text(),'Lead ID')]/following::table/tbody/tr/td[1]/div/a)[1]")).click();
			driver.findElement(By.linkText("Delete")).click();
			driver.findElement(By.linkText("Find Leads")).click();
			driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
			driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			
			String text = driver.findElement(By.className("x-paging-info")).getText();
			if (text.equals("No records to display")) {
				System.out.println("Text matched");
			} else {
				System.out.println("Text not matched");
			}
			
		}
		
		@BeforeClass
		public void callFile() {
			filename = "data2";
		}
	}
