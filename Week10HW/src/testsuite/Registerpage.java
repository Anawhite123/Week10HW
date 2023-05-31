package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//1. userShouldNavigateToRegisterPageSuccessfully
//
//        * click on the ‘Register’ link
//        * Verify the text ‘Register’
//
//        2. userSholdRegisterAccountSuccessfully
//
//        * click on the ‘Register’ link
//        * Select gender radio button
//        * Enter First name
//        * Enter Last name
//        * Select Day Month and Year
//        * Enter Email address
//        * Enter Password
//        * Enter Confirm password
//        * Click on REGISTER button
//
//        * Verify the text 'Your registration completed'

public class Registerpage extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void test1(){
        openBrowser(baseUrl);
    }
    @Test
    public void register(){
        WebElement registername= driver.findElement(By.xpath("//div[@class='header-links']/ul[1]/li[1]"));
        registername.click();

    }
    @Test
    public void registerTextVeryfication(){
        WebElement registertext = driver.findElement(By.partialLinkText("Register"));
        registertext.click();
    }
@Test
    public void Registeraccount(){

    WebElement registertext = driver.findElement(By.partialLinkText("Register"));
    registertext.click();
        WebElement selectgenderbutton = driver.findElement(By.xpath("//div[@class='inputs']/div[1]/span[2]"));
        selectgenderbutton.click();
        WebElement Entername= driver.findElement(By.xpath("//input[@id='FirstName']"));
        Entername.sendKeys("karen");

    WebElement Lastname= driver.findElement(By.xpath("//input[@id='LastName']"));
    Lastname.sendKeys("Shah");

    WebElement dateofbirth = driver.findElement(By.xpath("//div[@class='date-picker-wrapper']"));
    WebElement Dayofbirth= driver.findElement(By.xpath("//div[@class='date-picker-wrapper']/select[1]"));
    Dayofbirth.sendKeys("1");
    WebElement Monthofbirth= driver.findElement(By.xpath("//div[@class='date-picker-wrapper']/select[2]"));
    Monthofbirth.sendKeys("April");
    WebElement yearofbirth= driver.findElement(By.xpath("//div[@class='date-picker-wrapper']/select[3]"));
    yearofbirth.sendKeys("2002");
    WebElement Email= driver.findElement(By.xpath("//div[@class='form-fields']/div[5]/input[1]"));
    Email.sendKeys("kruti.5555brahmbhatt@gmail.com");
    WebElement password =driver.findElement(By.xpath("//input[@id='Password']"));//use of input method X path
    password.sendKeys("12312367");
    WebElement confirmpassword =driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));//use of input method X path
    confirmpassword.sendKeys("12312367");
    WebElement clickonregisterbutton =driver.findElement(By.xpath("//div[@class='buttons']"));
    clickonregisterbutton.click();
    WebElement verifyText=driver.findElement(By.xpath("//div[@class='result']"));
}
@After
    public void CloseBrowser(){
        closeBrowser();

    }

}
