package Stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PlaceOrderTask {
	 WebDriver driver = new ChromeDriver();
	 
	
	//For Search Single Item ********
	
	@Given("User is on Home Page")
	public void user_is_on_home_page() {
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println("User is on home page " + title);
	
		
	   // throw new io.cucumber.java.PendingException();
	}
	@When("User Search an Item {string}")
	public void user_search_an_item(String string) {
		//WebElement Searchbox = driver.findElement(By.name("search")).sendKeys("Macbook Air");
		
		driver.findElement(By.name("search")).sendKeys("Macbook Air");
		driver.findElement(By.name("search")).sendKeys(Keys.ENTER);
		//driver.findElement(By.xpath("//*[@id=\"search\"]/span/button")).click();
		
	
		System.out.println("User get Macbook in results list");
		

		
		//driver.findElements(((WebElement) By.name("search")).sendKeys("Macbook Air");
	    //throw new io.cucumber.java.PendingException();
	}
	@Then("Item must be listed")
	public void item_must_be_listed() {
		//WebElement Searchresult = driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div/div/div[2]/div[1]/h4/a"));
		//Searchresult.getText();
		//System.out.println(Searchresult);
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div/div/div[2]/div[1]/h4/a"));
		System.out.println(driver.getTitle());
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	    
	}
// For "Add Item to cart" .......
	
	@Given("User should be on Search Result page")
	public void user_should_be_on_search_result_page() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		//WebElement SearchPage = driver.findElement(By.xpath("*[@id=\"content\"]/h1"));
		//SearchPage.getText();
		//System.out.println(SearchPage);  
		
		driver.findElement(By.xpath("*[@id=\"content\"]/h1"));
		System.out.println(driver.getTitle());
		
	}
	@When("User add item to cart")
	public void user_add_item_to_cart() {
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div/div/div[2]/div[2]/button[1]")).click();
		//Addcart.click();
		
		//.hidden-xs hidden-sm hidden-md
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	@Then("Item must be added")
	public void item_must_be_added() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		//WebElement Addcart2 = driver.findElement(By.xpath("*[@id=\"cart-total\"]"));
		//Addcart2.click();
		//*[@id="cart-total"]
		driver.findElement(By.xpath("//*[@id=\"cart\"]/button")).click();
	}
	
	//For "Checkout Order" ******
	
	@When("User do Checkout")
	public void user_do_checkout() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		//*[@id="top-links"]/ul/li[5]/a/span
		//WebElement Checkout = driver.findElement(By.xpath("*[@id=\"top-links\"]/ul/li[5]/a/span"));
		//Checkout.click();
	
		driver.findElement(By.xpath("*[@id=\"top-links\"]/ul/li[5]/a/span")).click();
		System.out.println("User is on checkoutpage");
	}
	@Then("Should navigate to Checkout page")
	public void should_navigate_to_checkout_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println(driver.getTitle());
		driver.quit();
	}
   
	}
