package Pages;

import Base.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.sql.SQLOutput;

public class GittigidiyorBasketPage extends BaseTest {

    By urunSayisiArtir = By.cssSelector("div[class='number-selection gg-form-item']>div[class='gg-input gg-input-select ']>select>option[value='2']");
    By urunSayisi = By.cssSelector("[class='amount']");
    By urunSil = By.cssSelector("[class='gg-icon gg-icon-bin-medium']");

    public GittigidiyorBasketPage urunAdetDegistir() throws InterruptedException {
        driver.findElement(urunSayisiArtir).click();
        Thread.sleep(3000);
        return this;

    }

    public GittigidiyorBasketPage urunAdediDogrulama() {
        String urunAdet = driver.findElement(urunSayisi).getAttribute("value");
        Assert.assertEquals(urunAdet, "2");
        log.info("ürün sayısı kontrolü başarılı");
        return this;

    }

    public GittigidiyorBasketPage urunSil() {
        driver.findElement(urunSil).click();
        log.info("ürün başarıyla silindi");
        return this;

    }


}
