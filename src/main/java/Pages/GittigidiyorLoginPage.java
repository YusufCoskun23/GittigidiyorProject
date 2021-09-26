package Pages;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GittigidiyorLoginPage extends BaseTest {


    By inputEpostaGirisi = By.id("L-UserNameField");
    By inputSifreGirisi = By.id("L-PasswordField");
    By btnGirisYap = By.id("gg-login-enter");
    By btnBeniHatirla = By.xpath("//label[contains(text(),'Beni hatırla')]");


    public GittigidiyorLoginPage loginOl() {
        driver.findElement(inputEpostaGirisi).sendKeys("yusuftest23@gmail.com");
        driver.findElement(inputSifreGirisi).sendKeys("*********");
        driver.findElement(btnGirisYap).click();

        return this;
    }

}
