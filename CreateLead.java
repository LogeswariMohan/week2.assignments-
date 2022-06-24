package week2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
//		1. Launch URL "http://leaftaps.com/opentaps/control/login"
		driver.get("http://leaftaps.com/opentaps/control/main");
		
//		2. Enter UserName and Password Using Id Locator
		WebElement usernameElement = driver.findElement(By.id("username"));
		usernameElement.sendKeys("Demosalesmanager");
		WebElement passwordElement = driver.findElement(By.id("password"));
		passwordElement.sendKeys("crmsfa");  
		
//		  3. Click on Login Button using Class Locator
		WebElement loginbutton = driver.findElement(By.className("decorativeSubmit"));
		loginbutton.click();
		
//		  4. Click on CRM/SFA Link
		WebElement crmsfaElement = driver.findElement(By.linkText("CRM/SFA"));
		crmsfaElement.click(); 
		
//		  5. Click on Leads Button
		WebElement leadElement = driver.findElement(By.linkText("Leads"));
		leadElement.click();
		
//		  6. Click on Create Lead 
		WebElement createleadElement = driver.findElement(By.linkText("Create Lead"));
		createleadElement.click();
		
//		  7. Enter CompanyName Field Using id Locator
		WebElement companyNameElement = driver.findElement(By.id("createLeadForm_companyName"));
		companyNameElement.sendKeys("GLUM Technolgies");
		
//		  8. Enter FirstName Field Using id Locator
		WebElement firstnameElement = driver.findElement(By.id("createLeadForm_firstName"));
		firstnameElement.sendKeys("Logeswari"); 
		
//		  9. Enter LastName Field Using id Locator
		WebElement lastnameElement = driver.findElement(By.id("createLeadForm_lastName"));
		lastnameElement.sendKeys("Mohan");
		
		
//		  10. Enter FirstName(Local) Field Using id Locator
		WebElement firsttNameLocalElement = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		firsttNameLocalElement.sendKeys("Logi");
		
		
//		  11. Enter Department Field Using any Locator of Your Choice
		WebElement departmentElement = driver.findElement(By.className("inputBox"));
		departmentElement.sendKeys("EIE");
		
//		  12. Enter Description Field Using any Locator of your choice 
		WebElement descriptionElement = driver.findElement(By.name("description"));
		descriptionElement.sendKeys("I am budding tester");
		
//		  13. Enter your email in the E-mail address Field using the locator of your choice
		WebElement emailAddressElement = driver.findElement(By.id("createLeadForm_primaryEmail"));
		emailAddressElement.sendKeys("testleaf2022@gmail.com");
		
//		  14. Select State/Province as NewYork Using Visible Text
		WebElement stateProvinceElement = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select sp = new Select(stateProvinceElement);
		sp.selectByVisibleText("New York");
		
//		  15. Click on Create Button
		WebElement createButttonElement = driver.findElement(By.className("smallSubmit"));
		createButttonElement.click();
		
//        16. Get the Title of Resulting Page. refer the video  using driver.getTitle()
		String title = driver.getTitle();
		 System.out.println(title);
		
	}

}
