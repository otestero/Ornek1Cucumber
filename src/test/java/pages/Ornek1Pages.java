package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class Ornek1Pages {
  public   Ornek1Pages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//div[@class='header_user_info']")
    public WebElement signinButon;

  @FindBy(xpath = "//input[@id='email_create']")
    public WebElement emailgirisi;

  @FindBy(xpath = "//button[@id='SubmitCreate']")
    public  WebElement hesapAcButonu;

  @FindBy(xpath = "//input[@id='id_gender2']")
    public WebElement cinsiyetSec;

  @FindBy(xpath = "//input[@id='customer_firstname']")
    public WebElement isimKutusu;

  @FindBy(xpath = "//button[@id='submitAccount']")
    public WebElement registerButonu;


}
