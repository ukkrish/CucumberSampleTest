package grp.stepdfns;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Created by krish on 20/01/2018.
 */
public class testweblogin {

    WebDriver driver;

    @Given("^User opens webpage$")
    public void user_opens_webpage() throws Throwable {
        System.out.println("I am in GIVEN ...... ");

        System.setProperty("webdriver.chrome.driver","/Users/krish/Downloads/ChromeDriverLatest/chromedriver");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars");
        WebDriver driver = new ChromeDriver(options);

        driver.get("http://www.gmail.com");

        //        driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(1000);
        
        driver.findElement(By.id("identifierId")).clear();
        driver.findElement(By.id("identifierId")).sendKeys("Contactkrishnag@gmail.com");
        driver.findElement(By.id("identifierId")).sendKeys(Keys.ENTER);
      //  driver.findElement(By.className("RveJvd snByac")).click();
        Thread.sleep(1000);

        driver.findElement(By.name("password")).sendKeys("lonelyplanet");
        Thread.sleep(2000);
        driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);

        if (driver.getTitle().equals("Account Recovery Options")) {
            System.out.println("Password entered");

        }
        driver.quit();

    }

    @When("^User enters valid username and password and clicks on login button$")
    public void user_enters_valid_username_and_password_and_clicks_on_login_button() throws Throwable {

        System.out.println("I am in WHEN");

    }

    @Then("^email inbox is shown$")
    public void email_inbox_is_shown() throws Throwable {

        System.out.println("I am in Then ...... ");

    }


}
