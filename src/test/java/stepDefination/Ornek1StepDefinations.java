package stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.Ornek1Pages;
import utilities.ConfigReader;
import utilities.Driver;

public class Ornek1StepDefinations {

Ornek1Pages ornek1Pages=new Ornek1Pages();
Actions actions=new Actions(Driver.getDriver());
    @Given("kullanici {string} anasayfasinda")
    public void kullanici_anasayfasinda(String automationUrl) {
        Driver.getDriver().get(ConfigReader.getProperty("automationUrl"));
    }
    @Given("kullanici user sign in linkine tiklar")
    public void kullanici_user_sign_in_linkine_tiklar() {
        ornek1Pages.signinButon.click();

    }
    @Given("kullanici user Create and account bölümüne email adresi girer")
    public void kullanici_user_create_and_account_bölümüne_email_adresi_girer() {
        ornek1Pages.emailgirisi.sendKeys("aaaaa12345@gmail.com");

    }
    @Given("kullanici Create an Account butonuna basar")
    public void kullanici_create_an_account_butonuna_basar() {
        ornek1Pages.hesapAcButonu.click();

    }
    @Given("kullanici user kisisel bilgilerini ve iletisim bilgilerini girer")
    public void kullanici_user_kisisel_bilgilerini_ve_iletisim_bilgilerini_girer() {
        ornek1Pages.cinsiyetSec.click();
        ornek1Pages.isimKutusu.sendKeys("Ahmet");

        actions     .sendKeys(Keys.TAB)
                .sendKeys("yoldas"+Keys.TAB)
                        .sendKeys(Keys.TAB)
                        .sendKeys("a125B"+Keys.TAB) //pasword
                        .sendKeys("15" + Keys.TAB)
                        .sendKeys("June"+Keys.TAB)
                        .sendKeys("2022"+Keys.TAB)
                        .sendKeys(Keys.TAB)
                        .sendKeys(Keys.TAB)
                        .sendKeys("Ahmet"+Keys.TAB) // your adress
                        .sendKeys("yoldas"+Keys.TAB)
                        .sendKeys("satılırAS"+Keys.TAB)
                        .sendKeys("akıcılar caddesi 425112 satılırAS")
                        .sendKeys(Keys.TAB)
                        .sendKeys(Keys.TAB)
                        .sendKeys("newyork"+Keys.TAB) //city
                        .sendKeys(Keys.TAB)
                        .sendKeys("42365"+Keys.TAB)
                        .sendKeys("United States")
                        .sendKeys(Keys.TAB)
                        .sendKeys(Keys.TAB)
                        .sendKeys("+491253248"+Keys.TAB)// ev tlf
                        .sendKeys("+1792589542"+Keys.TAB)
                        .sendKeys("iyi adress"+Keys.TAB).perform();
    }
    @Given("kullanici user Register butonuna basar")
    public void kullanici_user_register_butonuna_basar() {
        ornek1Pages.registerButonu.click();

    }
    @Then("kullanici hesap olustugunu dogrular")
    public void kullanici_hesap_olustugunu_dogrular() {

    }

}
