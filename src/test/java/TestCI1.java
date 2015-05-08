package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCI1 {
	 public static void main(String[] args) throws Exception {
		/* FF */
		WebDriver driver = new FirefoxDriver();
		
	    //Navigate to URl
	    driver.navigate().to("http://dev08-web-mcg.demandware.net");
	    System.out.println("Navigate to URl");
	    Thread.sleep(5000);
	    
	    //Clear Searchbox
	    driver.findElement(By.id("q")).clear();
	    System.out.println("Clear Searchbox");
	    
	    //Search item
	    //driver.findElement(By.id("q")).sendKeys("STY761");
	    driver.findElement(By.id("q")).sendKeys("YDS037");
	    System.out.println("Searched item");
	    Thread.sleep(5000);
	    
	    //Click Search
	    driver.findElement(By.id("search_button")).click();
	    System.out.println("Clicked Search");
	    Thread.sleep(5000);
	    
	    //Click the zoom button
	    driver.findElement(By.xpath("/html/body/div[2]/div/div/div[3]/div/div/div/div/div[2]/a/span/img")).click();   
	    System.out.println("Clicked on the zoom button");
	    Thread.sleep(5000);
	   
	    //Verify element present
	    /*if (driver.findElement(By.xpath("/html/body/div[79]/div/div[2]/div[2]/div/div/ul/li[2]/a/img")).isEnabled()){
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		} */
	   String src = driver.findElement(By.xpath("/html/body/div[79]/div/div[2]/div[2]/div/div/ul/li/a/img")).getAttribute("src");
	   System.out.println(src);
	  
		
	    Thread.sleep(5000);
		
	    //Close the browser
	    driver.quit();
	}
}

