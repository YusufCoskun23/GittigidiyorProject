package Pages;

import Base.BaseTest;
import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;

import static Base.BaseTest.driver;

public class GittigidiyorSearchPage extends BaseTest {
    String fiyat;
    String ikinciFiyat;
    By urunSec = By.cssSelector("div[class='sc-1favwb2-0 bTbNwr']>ul>li");
    By sepeteEkle = By.xpath("//*[@id=\"add-to-basket\"]");
    By cerezKapa = By.cssSelector("[class='policy-alert-v2-close policy-alert-v2-close-action']");
    By ilkFiyat = By.id("sp-price-lowPrice");
    By sepetim = By.xpath("//span[contains(text(),'Sepetim')]");
    By sepettekiFiyat = By.cssSelector("[class='total-price']");


    public GittigidiyorSearchPage selectRandomProduct() {

        List<WebElement> allProducts = driver.findElements(urunSec);
        Random rand = new Random();
        int randomProduct = rand.nextInt(allProducts.size());
        allProducts.get(randomProduct).click();
        return this;
    }

    public GittigidiyorSearchPage sepeteEkle() throws InterruptedException {

        driver.findElement(cerezKapa).click();
        Thread.sleep(3000);
        driver.findElement(sepeteEkle).click();
        Thread.sleep(3000);

        return this;
    }

    public GittigidiyorSearchPage fiyatKarsilastir() {

        fiyat = driver.findElement(ilkFiyat).getText();
        driver.findElement(sepetim).click();
        ikinciFiyat = driver.findElement(sepettekiFiyat).getText();
        Assert.assertEquals(fiyat, ikinciFiyat);
        log.info("Fiyat Kontrolü Basarili");

        return this;
    }
}
