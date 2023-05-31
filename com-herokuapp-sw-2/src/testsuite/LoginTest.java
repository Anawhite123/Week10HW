package testsuite;

import Browsefactory.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

//3. Write down the following test into ‘LoginTest’ class
//1. userSholdLoginSuccessfullyWithValidCredentials
//
//        * Enter “tomsmith” username
//        * Enter “SuperSecretPassword!” password
//
//        * Click on ‘LOGIN’ button
//        * Verify the text “Secure Area”
//        2. verifyTheUsernameErrorMessage
//        * Enter “tomsmith1” username
//        * Enter “SuperSecretPassword!” password
//        * Click on ‘LOGIN’ button
//        * Verify the error message “Your username
//
//        is invalid!”
//        3. verifyThePasswordErrorMessage
//        * Enter “tomsmith” username
//        * Enter “SuperSecretPassword” password
//        * Click on ‘LOGIN’ button
//        * Verify the error message “Your password
//
//        is invalid!”
public class LoginTest extends BaseTest {
    String Baseurl = "http://the-internet.herokuapp.com/login";

    @Before
    public void setup(){
        openBrowser(Baseurl);
    }
    @Test
    public void loginSuccessful(){
        WebElement loginusername = driver.findElement(By.id("username"));
        loginusername.sendKeys("tomsmith");

        WebElement Password = driver.findElement(By.id("password"));
        Password.sendKeys("SuperSecretPassword!");

        WebElement login= driver.findElement(By.xpath("//button[@class='radius']/i[1]"));
        login.click();

        WebElement Verifysecurearea=driver.findElement(By.xpath("//h4[@class='subheader']"));
    }

    @Test
    public void invalidusername (){
        WebElement invalidname = driver.findElement(By.xpath("//input[@name='username']"));
        invalidname.sendKeys("tomsmith1");
        WebElement Password = driver.findElement(By.id("password"));
        Password.sendKeys("SuperSecretPassword!");
        WebElement login= driver.findElement(By.xpath("//button[@class='radius']/i[1]"));
        login.click();
        WebElement errormsg = driver.findElement(By.xpath("//div[@class='flash error']"));
    }
    @Test
public void invalidpassword(){
        WebElement username1 = driver.findElement(By.xpath("//input[@id='username']"));
        username1.sendKeys("tomsmith");
        WebElement invalidpassword = driver.findElement(By.xpath("//input[@id='password']"));
        invalidpassword.sendKeys("SuperSecretPassword");
        WebElement login= driver.findElement(By.xpath("//button[@class='radius']/i[1]"));
        login.click();
        WebElement verifyText = driver.findElement(By.xpath("//div[@id ='flash']"));
}

@After
    public void closeBrowser(){
        driver.quit();

}
}

