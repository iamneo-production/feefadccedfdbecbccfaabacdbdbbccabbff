package stepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;





class OpenGoogleDefinitions
{

    WebDriver Driver;
    private final Logger logger = LoggerFactory
            .getLogger(newuser_StepDefinitions.class);


    @Given("^user on the user registration page$")
    public void Setup()
    {
        WebDriverManager.chromedriver().setup();
        Driver=new ChromeDriver();
        Driver.get("https://www.google.com/aclk?sa=l&ai=DChcSEwj61pnn_v_8AhULMSsKHXOzCpUYABAAGgJzZg&sig=AOD64_09wu1CmKVSAOWwQdnCTDG-62t4xg&q&adurl&ved=2ahUKEwjYu5Tn_v_8AhXnZWwGHfMCAH0Q0Qx6BAgIEAE");
        logger.info("Page for Facebook had Navigated");
        Driver.findElement(By.xpath("//*[@id="u_0_b_5q"]")).sendKeys("ABC");
        Driver.findElement(By.xpath("//*[@id="u_0_d_89"]")).sendKeys("XYZ");
        logger.info("User enter the Valid UserName");

    }
    @And("^valid e-mail address$")
    public void mail() {
        Driver.findElement(By.xpath("//*[@id="u_0_g_iL"]")).sendKeys("test@test.com");
        logger.info("E-mail has been Entered and validate");
    }
    @And("^valid password$")
    public void mailpassword() {
        Driver.findElement(By.xpath("//*[@id="password_step_input"]")).sendKeys("Password@123");
        logger.info("E-mail Password  has been Entered and validate");
    }
    @And("^valid Birth-date$")
    public void dob() {
        Select date = new Select(Driver.findElement(By.xpath("//*[@id="day"]")));
        date.selectByVisibleText("1");
        Select month = new Select(Driver.findElement(By.xpath("//*[@id="month"]")));
        month.selectByVisibleText("1");
        Select year = new Select(Driver.findElement(By.xpath("//*[@id="year"]")));
        year.selectByVisibleText("2001");
        logger.info("Birth Date has been validate");
    }
    @And("^valid Gender$")
    public void Gender() {
        Driver.findElement(By.xpath("//*[@id="u_0_o_tb"]/span[2]/label"]")).click();
        logger.info("Gender has been Entered and validate");
    }
    @Then("^user registration should be successful $")
    public void validate() {
        Driver.findElement(By.xpath("//*[@id="u_0_s_+5"]")).click();
        logger.info("User registration should be successful");

    }


}





