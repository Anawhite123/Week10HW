package Testsuites;

import BrowserFactory.BaseClass;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

//1. userShouldNavigateToLoginPageSuccessfully
//
//        * click on the ‘Sign In’ link
//        * Verify the text ‘Welcome Back!’
//
//        2. verifyTheErrorMessage
//
//        * click on the ‘Sign In’ link
//        * Enter invalid username
//        * Enter invalid password
//        * Click on Login button
//        * Verify the error message ‘Invalid email
//
//        or password.’
public class LoginTest extends BaseClass {
    String Baseurl = "https://courses.ultimateqa.com/";
    @Before
    public void setup(){
        openBrowser(Baseurl);
    }
    @Test
    public void login(){
        WebElement signin = driver.findElement(By.xpath("//li[@class='header__nav-item header__nav-sign-in']"));
        signin.click();
        WebElement invalidusername = driver.findElement(By.id("user[email]"));
        invalidusername.sendKeys("abcd@gmail.com");
        WebElement invalidpassword = driver.findElement(By.id("user[password]"));
        invalidpassword.sendKeys("12345678");
        WebElement clickbuttons = driver.findElement(By.xpath("//button[@type='submit']"));
        clickbuttons.click();
        WebElement ErrorMessage =driver.findElement(By.xpath("//li[@class='form-error__list-item']"));

    }
    @After
    public void closeurl(){
        driver.quit();
    }

}
