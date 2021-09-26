import Base.BaseTest;
import Pages.GittigidiyorBasketPage;
import Pages.GittigidiyorLoginPage;
import Pages.GittigidiyorMainPage;
import Pages.GittigidiyorSearchPage;
import org.junit.Test;

public class GittigidiyorTest extends BaseTest {

    GittigidiyorMainPage gittigidiyorMainPage = new GittigidiyorMainPage();
    GittigidiyorSearchPage gittigidiyorSearchPage = new GittigidiyorSearchPage();
    GittigidiyorLoginPage gittigidiyorLoginPage = new GittigidiyorLoginPage();
    GittigidiyorBasketPage gittigidiyorBasketPage = new GittigidiyorBasketPage();

    @Test
    public void ilkTest() throws InterruptedException {
        gittigidiyorMainPage.anasayfaKontrolu();
        //loginSayfasınaGiris();
        //gittigidiyorLoginPage.loginOl();
        gittigidiyorMainPage.aramaYap().sonrakiSayfayaGec().ikinciSayfaKontrolu();
        gittigidiyorSearchPage.selectRandomProduct().sepeteEkle().fiyatKarsilastir();
        gittigidiyorBasketPage.urunAdetDegistir().urunAdediDogrulama().urunSil();

    }

}