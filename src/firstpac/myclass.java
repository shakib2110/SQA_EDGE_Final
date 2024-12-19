package firstpac;

import java.time.Duration;
//import utils.ExcelReader;
//import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class myclass {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait letswait = new WebDriverWait(driver, Duration.ofSeconds(60));
		
		//Inputs as array:
//		String[][] testData = {
                //{"TestOrg1", "John", "Doe", "test01@yopmail.com", "User01", "testdom", "Password123@", "Password123@"},
//                {"TestOrg2", "Alice", "Smith", "alice.smith@test.com", "User02", "testdom", "Password456@", "Password456@"},
//                {"TestOrg3", "Bob", "Williams", "bob.williams@test.com", "User03", "testdom", "Password789@", "Password789@"}
//        };

		//String filePath = "C:\\Personal Files\\RegistrationData.xlsx";
		//List<String[]> testData = ExcelReader.readExcel(filePath, "Sheet1");

		//for (String[] data : testData) {
			// This is the first call to the page
			String baseUrl = "https://stage-carelogix.de/sing-in";
			driver.get(baseUrl);

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				System.out.println("First page");
			}
			
			letswait.until(ExpectedConditions.visibilityOfElementLocated(By.className("ant-btn")));


			// In this we goto sign-up page by using link and clicking the "Create Account"
			// button
			String cracUrl = "https://stage-carelogix.de/sing-up";
			driver.get(cracUrl);

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			letswait.until(ExpectedConditions.visibilityOfElementLocated(By.className("ant-btn")));

			// Here we declare the necessary fields to give input

			// Organization Name
			WebElement org_name = driver.findElement(By.id("name"));
			// First Name
			WebElement fname = driver.findElement(By.id("first_name"));
			// Last Name
			WebElement lname = driver.findElement(By.id("last_name"));
			// Email
			WebElement email = driver.findElement(By.id("email"));
			// User Name
			WebElement username = driver.findElement(By.id("username"));
			// Sub Domain
			WebElement sub_dom = driver.findElement(By.id("domain"));
			// Password
			WebElement pass = driver.findElement(By.id("password"));
			// Confirm Password
			WebElement con_pass = driver.findElement(By.id("confirm_password"));
			// Sign-Up button
			WebElement signup = driver.findElement(By.className("ant-btn"));
			
			org_name.sendKeys("TestnameA");
			fname.sendKeys("FirstTestA");
			lname.sendKeys("LastTestA");
			email.sendKeys("test01@yopmail.com");
			sub_dom.sendKeys("CarelogixA");
			username.sendKeys("Tester01A");
			pass.sendKeys("Password#1233");
			con_pass.sendKeys("Password#1233");

//			org_name.sendKeys(data[0]);
//			fname.sendKeys(data[1]);
//			lname.sendKeys(data[2]);
//			email.sendKeys(data[3]);
//			sub_dom.sendKeys(data[5]);
//			username.sendKeys(data[4]);
//			pass.sendKeys(data[6]);
//			con_pass.sendKeys(data[7]);
			signup.click();

			try {
				Thread.sleep(20000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
			//sub_dom.sendKeys(data[4]);
				System.out.println("Done!!");
			}
			
//			System.out.println("Test case executed for:");
//			System.out.println("Email: " + data[3]);
//			System.out.println("Username: " + data[4]);
//			System.out.println();
            //driver.manage().deleteAllCookies();
		}

		// close Fire fox
		// driver.close();
//	}

}