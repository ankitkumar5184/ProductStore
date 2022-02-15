package Pages;

import TestBase.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtoCart extends Base
{
    public static WebDriver driver;

    @FindBy(id="itemc")
    WebElement laptop;

    @FindBy(linkText = "Sony vaio i5")
    WebElement vivo;

    @FindBy(xpath = "//*[@id=\"tbodyid\"]/div[2]/div/a")
    WebElement Cart;

    @FindBy(id="cartur")
    WebElement cartadd;

    public AddtoCart(WebDriver driver)
    {
        this.driver =driver;
        PageFactory.initElements(driver, this);
    }
    public void cart()
    {
        laptop.click();
        vivo.click();
        Cart.click();
        cartadd.click();
    }
}
