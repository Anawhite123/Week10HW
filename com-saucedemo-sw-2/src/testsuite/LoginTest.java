package testsuite;
//1. userSholdLoginSuccessfullyWithValid
//        Credentials
//
//        * Enter “standard_user” username
//        * Enter “secret_sauce” password
//        * Click on ‘LOGIN’ button
//        * Verify the text “PRODUCTS”
//
//        2. verifyThatSixProductsAreDisplayedOnPage
//
//        * Enter “standard_user” username
//        * Enter “secret_sauce” password
//        * Click on ‘LOGIN’ button
//
//        * Verify that six products are displayed
//
//        on page

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    // css selector----"tagname[attribute='value']"
    static String Baseurl ="https://www.saucedemo.com/";

    @Before
    public void setup(){
        openBrowser(Baseurl);

    }
    @Test
    public void login(){
        WebElement username = driver.findElement(By.cssSelector("input[id='user-name']"));
        username.sendKeys("standard_user");
        WebElement password = driver.findElement(By.cssSelector("input[name='password']"));
        password.sendKeys("secret_sauce");
        WebElement loginButton = driver.findElement(By.cssSelector("input[id='login-button']"));
        loginButton.click();
        WebElement VerifyText = driver.findElement(By.xpath("//span[@class='title']"));
        WebElement Backpack =driver.findElement(By.xpath("//div[@class='inventory_list']/div[1]/div[2]/div[1]/a[1]"));
        String actualbackpackText = Backpack.getText();
        System.out.println("1st product  :"+actualbackpackText);
        String expectedbagpack ="Sauce Labs Backpack";
        Assert.assertEquals("verify name",actualbackpackText,expectedbagpack);
        WebElement BikeLight =driver.findElement(By.id("item_0_title_link"));
        String actualBikeLight =BikeLight.getText();
        System.out.println("2nd product  :"+actualBikeLight);
        String expectedBikeLight ="Sauce Labs Bike Light";
        Assert.assertEquals("verify product:",expectedBikeLight,actualBikeLight);
        WebElement Tshirt =driver.findElement(By.xpath("//div[@class='inventory_list']/div[3]"));
        WebElement Jacket =driver.findElement(By.xpath("//div[@class='inventory_list']/div[4]"));
        WebElement Onesie =driver.findElement(By.xpath("//div[@class='inventory_list']/div[5]"));
        WebElement Shirt=driver.findElement(By.xpath("//div[@class='inventory_list']/div[6]"));


    }
    @After
    public void close(){
        closeBrowser();
    }


}
