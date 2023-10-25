import io.cucumber.java.After;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    WebDriver driver;

    @Given("Open browser")
    public void iOpenBrowser() {
        final String dir = System.getProperty("user.dir");
        System.out.println("current dir = " + dir);
        System.setProperty("webdriver.chrome.driver", dir + "/driver/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @And("Open website Saucedemo")
    public void openWebsiteSaucedemo() throws InterruptedException {
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(1000);
    }

    @When("^User enters (.*) and (.*)$")
    public void user_enters_username_and_password(String username, String password) throws InterruptedException  {
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		Thread.sleep(2000);
	}

    @And("User click on login")
    public void user_is_navigated_to_the_home_page()  {
        driver.findElement(By.id("login-button")).click();
    }

    @When("^User type username as (.*)$")
    public void User_type_username_as(String username){
        driver.findElement(By.id("user-name")).sendKeys(username);
    }

    @And("^User type password as (.*)$")
    public void User_type_password_as(String password){
        driver.findElement(By.id("password")).sendKeys(password);
    }

    @Then("User should see Error")
    public void user_should_see() throws InterruptedException {

		Thread.sleep(2000);
		driver.close();
		driver.quit();
    }

    @And("User Add To Cart")
    public void user_add_to_cart() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
    }

    @And("User view cart")
    public void user_view_cart() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.id("shopping_cart_container")).click();
    }

    @And("User checkout")
    public void user_checkout() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.id("checkout")).click();
    }

    @Then("^User type firstname as (.*)$")
    public void User_type_firstname_as(String firstname) throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.id("first-name")).sendKeys(firstname);
    }

    @And("^User type lastname as (.*)$")
    public void User_type_lastname_as(String lastname) throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.id("last-name")).sendKeys(lastname);
    }

    @And("^User type ZIP as (.*)$")
    public void User_type_zip_as(String zip) throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.id("postal-code")).sendKeys(zip);
    }

    @Then("User click on continue")
    public void user_click_continue() throws InterruptedException {
        driver.findElement(By.id("continue")).click();
        Thread.sleep(4000);
        driver.findElement(By.id("finish")).click();
        Thread.sleep(3000);

    }

    @And("User back to home")
    public void user_back_home() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.id("back-to-products")).click();
    }

    @Then("Close")
    public void close() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }
}
