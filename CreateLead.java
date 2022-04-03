package week6.day2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class CreateLead extends CommonSteps{
	@BeforeClass
	public void callFile() {
		filename = "sampledata";
	}
	
	@Test(dataProvider="fetchdata")
	public void createlead(String cname,String fname,String lname)  {
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
	driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("99");
	driver.findElement(By.name("submitButton")).click();
		
	}
	
	@DataProvider(indices=0)
	public String[][] fetchdata() throws IOException {
		return ReadCellValue.exceldata(filename);
		
	}
//		return ReadCellValue.exceldata();
//		String[][] data = new String[2][3]; // 2 rows 3 columns
//		data[0][0]="TestLeaf";
//		data[0][1]="Pavithra";
//		data[0][2]="Nagesh";
//		
//		data[1][0]="TestLeaf";
//		data[1][1]="Keerthana";
//		data[1][2]="Mano";

	}

