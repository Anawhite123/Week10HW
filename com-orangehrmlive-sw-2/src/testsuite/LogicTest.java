package testsuite;

import browserfactory1.Baseclass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

//1. userSholdLoginSuccessfullyWithValidCredentials
//
//        * Enter “Admin” username
//        * Enter “admin123 password
//        * Click on ‘LOGIN’ button
//        * Verify the ‘Welcome’ text is display
public class LogicTest extends Baseclass {
    String baseurl ="https://opensource-demo.orangehrmlive.com/";
    @Before public void setup() {

        openBrowser(baseurl);}
    @Test
    public void Login(){
        WebElement enterusername = driver.findElement(By.xpath("//input[@name='username']"));
        enterusername.sendKeys("Admin");
        WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("admin123");
        WebElement loginbutton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginbutton.click();

    }

public void Close(){
     closeBrowser();
}


}
