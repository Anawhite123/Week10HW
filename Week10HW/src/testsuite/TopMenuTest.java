package testsuite;

//1. userShouldNavigateToComputerPageSuccessfully

//        * click on the ‘Computers’ Tab
//        * Verify the text ‘Computers’
//
//        2. userShouldNavigateToElectronicsPageSuccessfully
//
//        * click on the ‘Electronics’ Tab
//        * Verify the text ‘Electronics’
//
//        3. userShouldNavigateToApparelPageSuccessfully
//
//        * click on the ‘Apparel’ Tab
//        * Verify the text ‘Apparel’
//
//        4.
//        userShouldNavigateToDigitalDownloadsPageSuccessfully
//        * click on the ‘Digital downloads’ Tab
//        * Verify the text ‘Digital downloads’
//        5. userShouldNavigateToBooksPageSuccessfully
//
//        * click on the ‘Books’ Tab
//        * Verify the text ‘Books’
//
//        6. userShouldNavigateToJewelryPageSuccessfully
//
//        * click on the ‘Jewelry’ Tab
//        * Verify the text ‘Jewelry’
//
//        7. userShouldNavigateToGiftCardsPageSuccessfully
//
//        * click on the ‘Gift Cards’ Tab
//        * Verify the text ‘Gift Cards’

import browserfactory.BaseTest;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";
    @Before
    public void setup() {
        openBrowser(baseUrl);
    }
    @Test
    public void computerpage() {
//        WebElement computerpagenavigation = driver.findElement(By.name("Computers "));
//        computerpagenavigation.click();
        WebElement computernavigation = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[1]"));
        computernavigation.click();
    }
    @Test
    public void electronicpage() {
        WebElement electronicpagenavigation = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[2]"));
        electronicpagenavigation.click();

    }
@Test
    public void Apparelpage() {
        WebElement Apparelpagenavigation = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[3]"));
        Apparelpagenavigation.click();
    }
    @Test
    public void Digitalpage() {
        WebElement Digitalpagenavigation = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[4]"));
        Digitalpagenavigation.click();
    }
    @Test
    public void Bookspage() {
        WebElement Bookspagenavigation = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[5]"));
        Bookspagenavigation.click();
    }
    @Test
    public void jewelrypage() {
        WebElement jewelrypagenavigation = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[6]"));
        jewelrypagenavigation.click();
    }
    @Test
    public void Giftcardpage() {
        WebElement Giftcaedpagenavigation = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li[7]"));
        Giftcaedpagenavigation.click();
    }

}