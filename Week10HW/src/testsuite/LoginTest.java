package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

//Write down the following test into ‘LoginTest’ class
//1. userShouldNavigateToLoginPageSuccessfully
//
//        * click on the ‘Login’ link
//        * Verify the text ‘Welcome, Please Sign
//
//        In!’
//        2. userShouldLoginSuccessfullyWithValidCredentials
//
//        * click on the ‘Login’ link
//        * Enter valid username
//        * Enter valid password
//        * Click on ‘LOGIN’ button
//        * Verify the ‘Log out’ text is display
//
//        3. verifyTheErrorMessage
//
//        * click on the ‘Login’ link
//        * Enter invalid username
//        * Enter invalid password
//        * Click on Login button
//        * Verify the error message ‘Login was unsuccessful.
//        Please correct the errors and try again. No customer account found’
public class LoginTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";
    @Before
    public void setup() {openBrowser(baseUrl);}
    @Test
    public void test1(){
        WebElement loginButton=driver.findElement(By.linkText("Log in"));
        loginButton.click();
//        WebElement   Varifytext =driver.findElement(By.linkText("Welcome, Please Sign In!"));
    WebElement varifytext = driver.findElement(By.xpath("//div[@class = 'page-title']/h1"));

    }
      @Test
        public void login(){
          WebElement loginButton=driver.findElement(By.linkText("Log in"));
          loginButton.click();

        WebElement useremailid = driver.findElement(By.id("Email"));
        useremailid.sendKeys("kruti.brahmbhatt1234@gmail.com");

        WebElement userPassword = driver.findElement(By.id("Password"));
        userPassword.sendKeys("565678");

       WebElement login = driver.findElement(By.xpath("//button[@class='button-1 login-button']"));
       login.click();
    }
    @Test
    public void varifyerrormessage(){
        WebElement loginButton=driver.findElement(By.linkText("Log in"));
        loginButton.click();

        WebElement Wrongemailid = driver.findElement(By.id("Email"));
        Wrongemailid.sendKeys("krt@gmail.com");

        WebElement Wrongpassword = driver.findElement(By.id("Password"));
        Wrongpassword.sendKeys("1234512345");

//        WebElement login=driver.findElement(By.tagName("submit"));
//        login.click(); this does not work
     WebElement login = driver.findElement(By.xpath("//button[@class='button-1 login-button']"));
     login.click();

     WebElement errormsg = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']"));
    }
   @After
   public void tearDown(){ closeBrowser();
}

}

