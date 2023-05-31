package testsuite;

//4. Write down the following test into ‘ForgotPasswordTest’
//class
//1. userShouldNavigateToForgotPasswordPageSuccessfully
//        * click on the ‘Forgot your password’ link
//        * Verify the text ‘Forgot Your Password?’


import browserfactory1.Baseclass;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Forgotpassword extends Baseclass {

    String baseurl = "https://opensource-demo.orangehrmlive.com/";


    @Before
    public void setup() {
        openBrowser(baseurl);

        }

        @Test
    public void password(){
            WebElement passwordText=driver.findElement(By.xpath("//div[@class='orangehrm-login-forgot']"));
            passwordText.click();
        }
        @After
    public void close(){
        closeBrowser();
        }
   }




















