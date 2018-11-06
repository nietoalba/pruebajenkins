package PruebaJenkins.PruebaJenkins;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     * 
     * 
     */
	
	private WebDriver driver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();
	  private int valor=0;
	  private String retorno="inicio retorno",retorno1="inicio retorno1";
	
	  public void setUp() throws Exception {
		  
			//System.setProperty("webdriver.chrome.driver", "C:\\_ej_ico_0\\Selenium 22_10_2018\\chromedriver.exe");
		  	
		 //System.setProperty("webdriver.chrome.driver","chromedriver");
		// System.setProperty("webdriver.chrome.driver","$JENKINS_HOME\chromedriver");
		 
		
		 //headless chrome
		 ChromeOptions options = new ChromeOptions();
	        options.addArguments("headless");
	      //  options.addArguments("window-size=1200x600");
	        options.addArguments("--no-sandbox");
	        options.addArguments("--disable-dev-shm-usage");
	        
		    driver = new ChromeDriver(options);
		    baseUrl = "https://www.ico.es/";
		    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		    
		    
	        

	   
	  }
	  
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
	
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

   
    	  
	  public void test1() throws Exception {
	    
		  driver.get("https://www.google.es/");
		  driver.findElement(By.id("lst-ib")).click();
		  driver.findElement(By.id("lst-ib")).clear();
		  driver.findElement(By.id("lst-ib")).sendKeys("calculadora");
		  driver.findElement(By.id("lst-ib")).sendKeys(Keys.ENTER);
		  driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='CE'])[1]/following::span[1]")).click();
		  driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='='])[1]/following::span[1]")).click();
		  driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='CE'])[1]/following::span[2]")).click();
		  driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='.'])[1]/following::span[1]")).click();
		  driver.findElement(By.id("cwos")).click();  
		  System.out.println(driver.findElement(By.id("cwos")).getText());
		  retorno=driver.findElement(By.id("cwos")).getText();
		  valor=Integer.parseInt(retorno);
		  assertTrue(valor==15);
		  //driver.quit();
	 
	  }
	 
	  /*
	  public void test2() throws Exception {
		    		 
		  assertTrue(true);
	 
	  }
	  public void test3() throws Exception {
 		 
		  assertTrue(true);
	 
	  }
	  public void test4() throws Exception {
 		 
		  assertTrue(true);
	 
	  }
	  public void test5() throws Exception {
 		 
		  assertTrue(true);
	 
	  }*/
}
	  

    
    

