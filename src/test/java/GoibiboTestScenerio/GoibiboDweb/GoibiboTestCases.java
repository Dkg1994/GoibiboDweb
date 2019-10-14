package GoibiboTestScenerio.GoibiboDweb;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class GoibiboTestCases {
	
	WebDriver driver;
	
    JavascriptExecutor js = (JavascriptExecutor) driver;

	@BeforeMethod
	
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver","D:\\Eclips backup\\Jar Files for use in selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com");
	}
	
	
	
	

	@Test(priority=1)
	
	public void VerifySigninTest() throws InterruptedException {
		
	       driver.findElement(By.id("get_sign_in")).click();
	        driver.switchTo().frame("authiframe");
	       driver.findElement(By.id("authMobile")).sendKeys("8858558819");
	       driver.findElement(By.xpath("//*[@id=\"mobileSubmitBtn\"]")).click();
	       driver.findElement(By.id("authCredentialPassword")).sendKeys("8858558819");
	       driver.findElement(By.xpath("//*[@id=\"passwordEyeMobilePassword\"]")).click();
	       driver.findElement(By.id("authCredentialPasswordSignInBtn")).click();
	       Assert.assertEquals("Enter 4- Digit Code", "https://goibibo.ibcdn.com/styleguide/images/goLogo.png");
}
	
	
	@Test(priority=2)
	
	public void VerifyDomesticFlightTest() throws InterruptedException {
		
driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/ul/li[1]/a/i")).click();
                     Thread.sleep(2000);
 WebElement listbox = driver.findElement(By.xpath("//input[@id='gosuggest_inputSrc']"));
 					listbox.sendKeys("D");
 				   Thread.sleep(3000);
 			        driver.findElement(By.id("react-autosuggest-1-suggestion--0")).click();
 			        Thread.sleep(3000);
 			        driver.findElement(By.xpath("//*[@id=\"gosuggest_inputDest\"]")).sendKeys("Mum");
 			        Thread.sleep(3000);
 			        driver.findElement(By.id("react-autosuggest-1-suggestion--0")).click();
// 			        To click on date picker
    driver.findElement(By.xpath("//*[@id=\"searchWidgetCommon\"]/div[1]/div[1]/div[1]/div/div[5]/div/div/div[1]/span")).click(); 
    Thread.sleep(1000);
    //  To select date
  driver.findElement(By.xpath("//div[@id='fare_20191130']")).click();
 
//  To click on search button
  Thread.sleep(1000);
  driver.findElement(By.xpath("//*[@id=\"gi_search_btn\"]")).click();
 Thread.sleep(5000);

//js.executeScript("window.scrollBy(0,350)");


//Thread.sleep(2000);
//Click on Air-india from airline filter
driver.findElement(By.xpath("//div[@id='IndiGo']//span[contains(@class,'checkmark dIF alignItemsCenter justifyCenter')]")).click();
Thread.sleep(9000);

//To click on book button
driver.findElement(By.xpath("//input[@class='button fr fltbook fb widthF105 fb quicks']")).click();
Thread.sleep(5000);

//To click on Baggage & fare rule button on review page
driver.findElement(By.linkText("Baggage and Fare Rules")).click();
Thread.sleep(2000);

//Click on Fare Rule from popup
driver.findElement(By.linkText("Fare Rules")).click();
Thread.sleep(1000);

//Close Baggage & fare popup window
driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[2]/div/div[1]/div[1]/div[3]/div[2]/div/a")).click();
Thread.sleep(1000);

//Select Mr. from trveller details
WebElement option = driver.findElement(By.xpath("//*[@id=\"Adulttitle1\"]"));
option.sendKeys(Keys.DOWN);
option.sendKeys(Keys.ENTER);
Thread.sleep(1000);

//Input First name
driver.findElement(By.xpath("//*[@id=\"AdultfirstName1\"]")).sendKeys("Devendra");
Thread.sleep(1000);

//Input Last Name
driver.findElement(By.xpath("//*[@id=\"AdultlastName1\"]")).sendKeys("Gupta");
Thread.sleep(1000);

//Input Email Id
driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("testnoc009@gmail.com");
Thread.sleep(1000);

//Input Mobile No.
driver.findElement(By.xpath("//*[@id=\"mobile\"]")).sendKeys("9999999999");
Thread.sleep(5000);

//Click on Proceed to Payment button
driver.findElement(By.xpath("//*[@id=\"travellerForm\"]/div[2]/button")).click();
Thread.sleep(10000);

//Click on Net banking option
driver.findElement(By.xpath("//*[@id=\"nb\"]")).click();
Thread.sleep(2000);

//Click on bank which we want to test
driver.findElement(By.xpath("//*[@id=\"selectedBank\"]/option[4]")).click();
Thread.sleep(2000);

//Click on paynow button
driver.findElement(By.xpath("//*[@id=\"nbPayNow\"]/div/button")).click();
Thread.sleep(4000);
}
     
	
	
	
      
	@Test(priority=3)
        public void verifyDomHotelTest() throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/ul/li[2]/a/i")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("gosuggest_inputL")).sendKeys("Fatehabad");
		Thread.sleep(4000);
		
		 driver.findElement(By.id("react-autosuggest-1-suggestion--1")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"Home\"]/div[3]/div[1]/div/div[1]/div[3]/div/div[3]/div/button")).click();
	


//Scroll Down on Selected hotels
	Thread.sleep(2000);
	WebElement Element = driver.findElement(By.linkText("The Ganga"));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView();", Element);
	Thread.sleep(7000);

	driver.findElement(By.xpath("//p[contains(text(),'The Ganga')]")).click();
	Thread.sleep(5000);

//------------------------------ To Switch in other Tab---------------------------

	ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(tabs.get(1));


//-------------------------------Click on Book Now Button------------------------
	Thread.sleep(3000);
	driver.findElement(By.linkText("Book Now")).click();
	Thread.sleep(2000);

	driver.findElement(By.linkText("Booking & Cancellation Policy")).click();
	Thread.sleep(1500);

	driver.findElement(By.xpath("//*[@id=\"go_cp_popCont\"]/div/a")).click();
	Thread.sleep(2000);

	driver.findElement(By.xpath("//*[@id=\"choose\"]/option[1]")).click();
	Thread.sleep(1000);

	driver.findElement(By.xpath("//*[@id=\"firstname1\"]")).sendKeys("Test");
	Thread.sleep(1000);

	driver.findElement(By.id("lastname1")).sendKeys("Bookings");
	Thread.sleep(1000);

	driver.findElement(By.id("email")).sendKeys("testnoc009@gmail.com");
	Thread.sleep(1000);

	driver.findElement(By.xpath("//*[@id=\"mobile\"]")).sendKeys("9999999999");
	Thread.sleep(2000);

	driver.findElement(By.xpath("//*[@id=\"travellerForm\"]/div[14]/div[2]")).click();
	Thread.sleep(35000);

	driver.findElement(By.xpath("//*[@id=\"nb\"]/div[1]/div[1]/div[2]")).click();
	Thread.sleep(1000);

	driver.findElement(By.xpath("//*[@id=\"selectedBank\"]/option[7]")).click();
	

	driver.findElement(By.xpath("//*[@id=\"nbPayNow\"]/div/button")).click();

		
	}
        
       
	@Test(priority=4)
	
	public void VerifyInternationalHotelTest() throws InterruptedException {
		

	driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/ul/li[2]/a/i")).click();
	Thread.sleep(3000);
		
	driver.findElement(By.xpath("//*[@id=\"gosuggest_inputL\"]")).sendKeys("Dubai");
		
		
		
	 driver.findElement(By.id("react-autosuggest-1-suggestion--0")).click();
	 Thread.sleep(2000);
	
	driver.findElement(By.xpath("//*[@id=\"Home\"]/div[3]/div[1]/div/div[1]/div[3]/div/div[3]/div/button")).click();
	
	
	driver.findElement(By.xpath("//span[@class='width100 fl txtCenter ico16 greyDr fb padB5'][contains(text(),'goStays')]")).click();
	Thread.sleep(3000);
	
	JavascriptExecutor jsx = (JavascriptExecutor)driver;
	jsx.executeScript("window.scrollBy(0,450)", "");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//section[1]//div[1]//div[2]//div[2]//div[3]//button[1]")).click();
	Thread.sleep(2000);	
//------------------------------ To Switch in other Tab---------------------------

	
	ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(tabs.get(1));

//	  -------------------------------Click on Book Now Button------------------------
	    Thread.sleep(3000);
	  
	  
	  driver.findElement(By.linkText("Book Now")).click();
	  Thread.sleep(2000);
	  
	  driver.findElement(By.linkText("Booking & Cancellation Policy")).click();
	   Thread.sleep(1500);
	  
	  driver.findElement(By.xpath("//*[@id=\"go_cp_popCont\"]/div/a")).click();
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("//*[@id=\"choose\"]/option[1]")).click();
	   Thread.sleep(1000);
	  
	  driver.findElement(By.xpath("//*[@id=\"firstname1\"]")).sendKeys("Test");
	 Thread.sleep(1000);
	  
	  driver.findElement(By.id("lastname1")).sendKeys("Bookings");
	  Thread.sleep(1000);
	  
	  driver.findElement(By.id("email")).sendKeys("testnoc009@gmail.com");
	  Thread.sleep(1000);
	  
	  driver.findElement(By.xpath("//*[@id=\"mobile\"]")).sendKeys("9999999999");
	  Thread.sleep(2000);
	  
//	  Condition to find Pan is available 
	  if(driver.findElement(By.xpath("//*[@id=\"customer_pan_no\"]")).isDisplayed())
		  driver.findElement(By.xpath("//*[@id=\"customer_pan_no\"]")).sendKeys("BJSPH8877H");
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("//*[@id=\"travellerForm\"]/div[14]/div[2]")).click();
	  Thread.sleep(25000);
	  
	  driver.findElement(By.xpath("//*[@id=\"nb\"]/div[1]/div[1]/div[2]")).click();
	  Thread.sleep(4000);
	  
	  driver.findElement(By.xpath("//*[@id=\"selectedBank\"]/option[11]")).click();
	
	  
	 
	  
	}
        
       
        @Test(priority=5)
     
        public void VerifyBusTest() throws InterruptedException {
        	
//    		------------------ Click On Bus Icon --------------------------------	
			
    			driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/ul/li[4]/a/i")).click();
    			Thread.sleep(2000);
    			
//    			------------------------------GO To Source point----------------------------------
    			
    			WebElement testDropDown = driver.findElement(By.id("gi_source"));
    			testDropDown.sendKeys("Delhi");
    
    			
    		   driver.findElement(By.xpath("//*[@id=\"gi_source_wrapper\"]/div/ul/li[1]")).click();
    		   Thread.sleep(2000);
    
    		
//    		-----------------------------------------Go to Destination Point-------------------

    WebElement testDrop =	driver.findElement(By.id("gi_destination"));
    testDrop.sendKeys("Agra");
   Thread.sleep(2000);

    		driver.findElement(By.xpath("//*[@id=\"gi_destination_wrapper\"]/div/ul/li[1]")).click();
        	Thread.sleep(1000);

//    		---------------------------------------Select the Date---------------------------------
    		
    		
    	driver.findElement(By.id("gi_onward_text")).click();
    	Thread.sleep(2000);
    		
    	driver.findElement(By.xpath("//*[@id=\"jrdp_start-calen_nextmonth_multi_1\"]")).click();
    	Thread.sleep(2000);
    		
    	driver.findElement(By.xpath("//*[@id=\"jrdp_start-calen_10_30_2019\"]")).click();
    	Thread.sleep(2000);

    	//------------------------------------------Search Button-------------------------------------

    	driver.findElement(By.id("gi_search_btn")).click();
    	Thread.sleep(2000);

    	driver.findElement(By.xpath("//*[@id=\"opliner\"]/span/span")).click();
    	Thread.sleep(2000);

    	driver.findElement(By.xpath("//label[contains(text(),'Northern Travels')]")).click();
    	Thread.sleep(2000);


    	//-------------------------Click On Book button for Selecting the seat-----------------------

    	driver.findElement(By.xpath("//*[@id=\"cp\"]")).click();
    	
    	Thread.sleep(5000);
    	driver.findElement(By.linkText("Cancellation Policy")).click();

    	
    	Thread.sleep(5000);
    	driver.findElement(By.linkText("Seat Layout")).click();
    	
    	driver.findElement(By.className("availableSeat")).click();
    	Thread.sleep(1000);

    	driver.findElement(By.xpath("//option[contains(text(),'Majnu Ka Tila')]")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.id("confirm")).click();
    	
    	
    	driver.findElement(By.linkText("Cancellation Policy")).click();
    	Thread.sleep(1000);

    	driver.findElement(By.xpath("//*[@id=\"go_fareRulespopUp\"]/div/a")).click();
    	Thread.sleep(2500);
    	driver.findElement(By.xpath("//*[@id=\"adultchoose1\"]/option[2]")).click();
    	
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//*[@id=\"adultfirstname1\"]")).sendKeys("Test");

    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//*[@id=\"adultlastname1\"]")).sendKeys("Booking");
    	
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//*[@id=\"adultage1\"]")).sendKeys("25");
    	

    	driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("testnoc009@gmail.com");
    	
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//*[@id=\"mobile\"]")).sendKeys("9999999999");
    	
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//*[@id=\"makePayment\"]")).click();
    	
    	Thread.sleep(11000);
    	driver.findElement(By.xpath("//*[@id=\"nb\"]/div[1]/div[1]/div[2]")).click();
    	
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//option[contains(text(),'AXIS Bank (AXIS)')]")).click();

    	driver.findElement(By.xpath("//*[@id=\"nbPayNow\"]/div/button")).click();
    	Thread.sleep(5000);
        }
     
     
        
        @Test(priority=6)
        
        public void VerifyIRCTCTest() throws InterruptedException {
        	
       	driver.findElement(By.xpath("//span[contains(text(),'IRCTC Trains')]")).click();
        Thread.sleep(2000);	
        	
        driver.findElement(By.xpath("//body[@class='greyBg']/div/div/div/div[@class='homeContainerInner']/div[@class='blueBg homeWidgetWrap posRel']/form[@id='gi_search']/div[@class='formWrap padT15']/div[1]/input[1]")).sendKeys("Delhi");	
        driver.findElement(By.id("react-autosuggest-1-suggestion--0")).click();
	     Thread.sleep(3000);

	    
	     driver.findElement(By.xpath("//div[@class='homeContainerInner']//div[2]//input[1]")).sendKeys("Agra");
	     driver.findElement(By.id("react-autosuggest-1-suggestion--0")).click();
	     Thread.sleep(3000);
	     
	     driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/form[1]/div[1]/div[3]/div[1]/div[1]/div[1]/input[1]")).click();
	     driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
	     driver.findElement(By.xpath("//div[contains(text(),'30')]")).click();
	     
	     Thread.sleep(3000);
	     
	     driver.findElement(By.xpath("//input[@id='gi_search_btn']")).click();
	     
		driver.findElement(By.xpath("//body[@class='greyBg']//div//div//div[1]//section[1]//div[1]//div[5]//div[1]//button[1]")).click();
		Thread.sleep(2000);
	
			
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"exampleInputPassword1\"]")).sendKeys("Devg");
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"irctcPop\"]/div/div/div[1]/div[2]/button")).click();
	
		Thread.sleep(3000);
		driver.findElement(By.xpath("//option[contains(text(),'Male')]")).click();
			
			
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Test");
			
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Age']")).sendKeys("22");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='form-control inputMedium iconImg']")).sendKeys("testnoc009@gmail.com");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='col-md-9 col-sm-9 col-xs-9 marginB10 posRel']//input[@class='form-control inputMedium']")).sendKeys("9999999999");
	
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[2]/form/div[8]/div[2]/input")).click();
		
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@class='button green width90 large']")).click();
		
			
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"irctcPop\"]/div/div/div/div[2]/button")).click();
		
		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@id=\"nb\"]/div[1]")).click();
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"selectedBank\"]/option[2]")).click();
		
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"nbPayNow\"]/div/button")).click();
		
        }
                       
      
        
        @Test(priority=7)
        
        public void VerifyCarTest() throws InterruptedException {
    		
//	        --------------------------------------------- Click on Car Icon-----------------------
	      driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/ul/li[6]/a/i")).click();
	      Thread.sleep(1000);
	//  ----------------------------------------Click on Source Point--------------------------------
	      driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/section/div/section[1]/section/section[2]/section[2]/div[1]/div[1]/div/p")).click();
	      Thread.sleep(1000);
	        
	      driver.findElement(By.xpath("//*[@id=\"gosuggest_inputL\"]")).sendKeys("Delhi");
	   
	      driver.findElement(By.id("react-autosuggest-1-suggestion--0")).click();
		
	//			--------------------------------------Click on Destination Point----------------------------------------
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/section/div/section[1]/section/section[2]/section[2]/div[1]/div[2]/div/p")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"gosuggest_inputL\"]")).sendKeys("Agra");
		
			
		driver.findElement(By.id("react-autosuggest-1-suggestion--0")).click();
		Thread.sleep(500);
//			-----------------------------------------Click On Search Button------------------------------------
				
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/section/div/section[1]/section/section[2]/section[2]/div[3]/button")).click();
		
//			--------------------------------Click on Icon on Review page----------------------
			
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/section/div/section[1]/section/div[2]/div/div/section[1]/div[2]/label/p[1]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/section/div/section[1]/section/div[2]/div/div/section[1]/div[3]/label")).click();
		Thread.sleep(1000);
			
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/section/div/section[1]/section/div[2]/div/div/section[1]/div[1]/label")).click();
		Thread.sleep(1000);
			
//			---------------------------------- Go to  Travellar Details-------------------------
			
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/section/div/section[1]/section/div[2]/div/div/div[2]/section[2]/div[1]/span[2]")).click();
		Thread.sleep(1000);
			
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/section/div/section[1]/section/div[1]/section/section[2]/div/section[1]/div[2]/div/label[1]/span")).click();
		Thread.sleep(1000);
			
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/section/div/section[1]/section/div[1]/section/section[2]/div/section[1]/div[3]/input")).sendKeys("Test");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/section/div/section[1]/section/div[1]/section/section[2]/div/section[2]/div[2]/p/input")).sendKeys("9999999999");
		Thread.sleep(1000);
			
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/section/div/section[1]/section/div[1]/section/section[2]/div/section[2]/div[3]/p/input")).sendKeys("testnoc009@gmail.com");
		Thread.sleep(1000);
			
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/section/div/section[1]/section/div[1]/section/section[2]/div/section[2]/div[5]/p/button")).click();
		Thread.sleep(1000);
			
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/section/div/section[1]/section/div[2]/div/div/section[2]/div[3]/div[2]/p[2]/span")).click();
		Thread.sleep(1000);
			
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/section/div/section[1]/section/div[2]/div/div/div[1]/div/div[3]/span")).click();
		Thread.sleep(1000);
			
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/section/div/section[1]/section/div[3]/div[2]/button")).click();			
		Thread.sleep(6000);

		driver.findElement(By.xpath("//*[@id=\"nb\"]/div[1]/div[1]/div[2]/span")).click();
		
		driver.findElement(By.xpath("//*[@id=\"selectedBank\"]/option[6]")).click();
		Thread.sleep(1000);
			
		driver.findElement(By.xpath("//*[@id=\"nbPayNow\"]/div/button")).click();
		Thread.sleep(2000);
			
        }
        

  
 @AfterMethod
 
 public void teardown() {
	 
	 driver.quit();
 }
  
}
