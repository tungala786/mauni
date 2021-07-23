package myPack;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Maunika {
@Test
 public static void verifyLogin() {
	System.setProperty("webdriver.chrome.driver",
			"E:\\Softwares\\chrome\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://apps.qaplanet.in/hrm");
	
	//login
	driver.findElement(By.name("txtUserName")).sendKeys("qaplanet2");
	driver.findElement(By.name("txtPassword")).sendKeys("lab2");
	driver.findElement(By.name("Submit")).click();
	
	//page title
	if(driver.getTitle().equals("OrangeHRM")) {
		System.out.println("TC passed");
	}else {
		System.out.println("TC failed");
	}
	
	//click logout 
	driver.findElement(By.linkText("Logout")).click();

	driver.close();
}
@Test
 public static void addEmp() {
	System.out.println("Add emp passed");
}
@Test
 public static void editEmp() {
	System.out.println("Edit emp passed");
}
@Test
 public static void deleteEmp() {
	System.out.println("Delete emp passed");
}
}
