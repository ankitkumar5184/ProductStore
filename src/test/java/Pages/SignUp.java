package Pages;

import TestBase.Base;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class SignUp extends Base {
    public static Properties prop;
    public static WebDriver driver;

    @FindBy(id = "signin2")
    WebElement Signup;

    @FindBy(id = "sign-username")
    WebElement SignUser;

    @FindBy(id = "sign-password")
    WebElement SignPass;

    @FindBy(xpath = "//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")
    WebElement Signup1;

    @FindBy(xpath = "//button[contains(text(),'Close')])[2]")
    WebElement close;

    public SignUp(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void signup12() throws IOException, InterruptedException
    {
        String path = System.getProperty("user.dir");
        FileInputStream fis = new FileInputStream(path + "//Data//ProductStore.xls");
        HSSFWorkbook wb = new HSSFWorkbook(fis);
        HSSFSheet sheet = wb.getSheetAt(0);
        String uname = sheet.getRow(1).getCell(0).getStringCellValue();
        String pass = sheet.getRow(1).getCell(1).getStringCellValue();
        this.Signup.click();
        this.SignUser.sendKeys(uname);
        this.SignPass.sendKeys(pass);
        this.Signup1.click();
        driver.navigate().refresh();
        //driver.navigate().to(prop.getProperty("url"));
    }
}
