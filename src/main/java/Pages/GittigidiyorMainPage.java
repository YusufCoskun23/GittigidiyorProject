package Pages;

import Base.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;

import java.util.List;
import java.util.Random;

public class GittigidiyorMainPage<main> extends BaseTest {
    By kesfetmeyeBak = By.xpath("//h2[contains(text(),'Keşfetmeye Bak')]");
    By ilkGirisButon = By.xpath("//header/div[4]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]");
    By ikinciGirisButon = By.xpath("//*[@id=\"main-header\"]/div[4]/div/div/div[1]/div[3]/div/div[2]/div[2]/div/div/div/a");
    By aramaAlani = By.xpath("//header/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]");
    By btnBul = By.xpath("//header/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/button[1]");
    By btnSonraki = By.xpath("//body/div[@id='__next']/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[4]/nav[1]/ul[1]/li[12]/a[1]");
    By birinciSayfaRenk = By.xpath("//body/div[@id='__next']/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[4]/nav[1]/ul[1]/li[2]/a[1]");
    By ikinciSayfaRenk = By.xpath("//body/div[@id='__next']/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[4]/nav[1]/ul[1]/li[3]/a[1]");
    By ucuncuSayfaRenk = By.xpath("//body/div[@id='__next']/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[4]/nav[1]/ul[1]/li[4]/a[1]");
    By girisYapHover = By.cssSelector("div[class='sc-1nx8ums-0 fQSWwJ']>div>div>div[title='Giriş Yap']");
    By girisYapButon = By.cssSelector("div[data-cy='guest-panel-container']>div>div>a");


    public GittigidiyorMainPage loginSayfasınaGiris() throws InterruptedException {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(girisYapHover)).perform();
        Thread.sleep(5000);
        driver.findElement(girisYapButon).click();
        return this;

    }

    public GittigidiyorMainPage anasayfaKontrolu() {
        String anasayfaElementi = BaseTest.driver.findElement(kesfetmeyeBak).getText();
        Assert.assertEquals(anasayfaElementi, "Keşfetmeye Bak");
        log.info("Anasayfa Kontrolü Başarılı");
        return this;
    }

    public GittigidiyorMainPage aramaYap() {
        driver.findElement(aramaAlani).sendKeys("bilgisayar");
        driver.findElement(btnBul).click();
        return this;
    }

    public GittigidiyorMainPage sonrakiSayfayaGec() {
        driver.findElement(btnSonraki).click();
        return this;
    }

    public GittigidiyorMainPage ikinciSayfaKontrolu() {
        Assert.assertEquals("https://www.gittigidiyor.com/arama/?k=bilgisayar&sf=2", driver.getCurrentUrl());
        log.info("2. sayfa kontrolu basarili");
        return this;
    }


}