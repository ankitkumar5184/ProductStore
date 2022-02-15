package Pages;

import TestBase.Base;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class SignIn extends Base
{
    public static Properties prop;
    public static WebDriver driver;

    @FindBy(linkText = "Log in")
    WebElement signin;

    @FindBy(id = "loginusername")
    WebElement username;

    @FindBy(id = "loginpassword")
    WebElement loginpass;

    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement signpage;

    public SignIn(WebDriver driver)
    {
        this.driver =driver;
        PageFactory.initElements(driver, this);
    }
    public void signPage() throws IOException
    {
        String path = System.getProperty("user.dir");
        FileInputStream fis = new FileInputStream(path + "//Data//ProductStore.xls");
        HSSFWorkbook wb = new HSSFWorkbook(fis);
        HSSFSheet sheet = wb.getSheetAt(0);
        String uname = sheet.getRow(1).getCell(0).getStringCellValue();
        String pass = sheet.getRow(1).getCell(1).getStringCellValue();

        signin.click();
        username.sendKeys(uname);
        loginpass.sendKeys(pass);
        signpage.click();
    }
}