package Seleniumautomation;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class automationpractice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//filling form
		/*driver.findElement(By.id("name")).sendKeys("Raj");
		driver.findElement(By.id("email")).sendKeys("raj123@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("9513579874");
		driver.findElement(By.id("textarea")).sendKeys("234/fjkhgdfkjer");
		
		//clicking radio button
		driver.findElement(By.id("male")).click();
		System.out.println(driver.findElement(By.id("male")).isSelected()); //it will return true or false
		System.out.println(driver.findElements(By.xpath("//input[@type='radio']")).size()); // return size of radio button in a page
		*/
		
		//clicking single check box
		//driver.findElement(By.id("monday")).click();
		
		//clicking all the checkbox
		//List<WebElement> chkboxs=driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
		
		//method1
		/*for(int i=0;i<chkboxs.size();i++) {		
				chkboxs.get(i).click();
		 }	
		 */   	
		//method2
		/*int size=chkboxs.size();
		for(int i=0;i<size;i++) {
			chkboxs.get(i).click();
		}
		*/
		//method3
		/*for(WebElement CB:chkboxs) {
			CB.click();
		}
		*/
		//clicking based on my choices
		/*for(WebElement CB:chkboxs) {
			String chkboxsname=CB.getAttribute("id");
			if(chkboxsname.equals("monday") || chkboxsname.equals("tuesday"))
			{
				CB.click();
			}
		*/
		
		/*driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		*/
	

}
}
