package Featurefile;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
	public static WebDriver driver;
	@Given("^user open TestMeApp$")
	public void  useropenTestMeApp() {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
	}
	@When("^user click on signup$")
	public void  userclickonsignup() {
		driver.findElement(By.xpath("//a[@href='RegisterUser.htm']")).click();

		
	}
	@And("enter username as \"([^\"]*)\"$")
	public void  enterusername(String uname){
		driver.findElement(By.id("userName")).sendKeys(uname);
	}
	
	@And("^enter firstname as \"([^\"*])\"$")
	public void   enterfirstname(String firstname){
		driver.findElement(By.id("firstName")).sendKeys(firstname);
	}
	
	@And("^enter lastname as \"([^\"*])\"$")
	public void   enterlastname(String lastname){
		driver.findElement(By.id("lastName")).sendKeys(lastname);
	}
	@And("^enter password as \"([^\"*])\"$")
	public void   enterPassword(String pass){
		driver.findElement(By.id("password")).sendKeys(pass);
	}

	@And("^enter confirm password as \"([^\"*])\"$")
	public void  enterconfirmPassword(String confirmpass){
		driver.findElement(By.name("confirmPassword")).sendKeys(confirmpass);
	}
	@And("^Select gender as \"([^\"*])\"$")
	public void  selectgender(String gender){
	if(gender.equalsIgnoreCase("male")) {
		driver.findElement(By.xpath("//input[@value='Male']")).click();
	}
	else if(gender.equalsIgnoreCase("female")) {
		driver.findElement(By.xpath("//input[@value='Female']")).click();
	}
	}

	@And("^enter email as \"([^\"*])\"$")
      public void  enteremail(String email){
      driver.findElement(By.id("emailAddress")).sendKeys(email);


}
      @And("^enter mobile no as \"([^\"*])\"$")
      public void  enteremobileno(String mobileno){
      driver.findElement(By.id("mobileNumber")).sendKeys(mobileno);
}
      @And("^enter dob as \"([^\"*])\"$")
      public void  enteredob(String dob){
      driver.findElement(By.name("dob")).sendKeys(dob);
}
      
      @And("^enter address as \"([^\"*])\"$")
      public void  enteraddress(String address){
      driver.findElement(By.id("address")).sendKeys(address);

}
      @And("^enter answer as \"([^\"*])\"$")
  	public void  enteranswer(String ans){
  	 driver.findElement(By.id("answer")).sendKeys(ans);
    
}
      @Then("^user click Register$")
      public void userclickregister() {
    	  driver.findElement(By.xpath("//input[@value=''Submit]")).click();
      }
      @Given("^users open TestMeApp$")
      public void  usersopenTestMeApp() {
  		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
  		driver=new ChromeDriver();
  		driver.get("http://10.232.237.143:443/TestMeApp/");
  		driver.manage().window().maximize();
  		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
  	}
      
     @When("^user click signin$")
      public void Whenuserclicksignin() {
    	  driver.findElement(By.xpath("//a[@href='login.htm']")).click();
      }
      @And("^user enter credential as$")
      public void userentercredentialas(DataTable dt) {
    	  List<String> cred=dt.asList(String.class);
    	  driver.findElement(By.name("userName")).sendKeys(cred.get(0));
    	  driver.findElement(By.name("password")).sendKeys(cred.get(1));
    	  driver.findElement(By.name("Login")).click();
      }
      
      @And ("^search the product$")
      public void searchtheproduct() {
    	  driver.findElement(By.name("products")).sendKeys("Head");
      }
      
      @And("^click on find details$")
      public void clickonfinddetails() {
    	  driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
      }
      @Then("^click on add to cart$")
      public void clickonaddtocart() {
    	  driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
      }
}

