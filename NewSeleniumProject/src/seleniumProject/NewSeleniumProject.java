package seleniumProject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewSeleniumProject {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		// declaration and instantiation of objects/variables
		System.setProperty("webdriver.chrome.driver", "D://chromedriver_win32/chromedriver.exe");
		//WebDriver driver = new FirefoxDriver();
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		//System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        String baseUrl = "https://www.google.com";
        String expectedTitle = "Google";
        String actualTitle = "";
        
        
        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);
        
        // get the actual value of the title
        actualTitle = driver.getTitle();
       // driver.manage().window().maximize();
        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!!!"+actualTitle);
        } else {
            System.out.println("Test Failed");
        }
        driver.get("file:///D:/submitresume.html");
        
        WebElement clickupload = driver.findElement(By.xpath("//input[@name=\"uploadResume\"]"));
        clickupload.click();
        Thread.sleep(3000);
        Runtime.getRuntime().exec("D:\\AutoIT\\uploadfile.exe");
        
        Thread.sleep(5000);
      //input[@name="uploadResume"]
       //driver.findElement(By.id(""));
        //close Fire fox
        driver.close();
        //driver.get("file:///D:/submitresume.html");
        //driver.close();
    }
}


