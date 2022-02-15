package Test;

import Pages.SignIn;
import TestBase.Base;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.IOException;

public class SignInTest extends Base
{
    SignIn sh;
    public SignInTest()
    {
        super();
    }

    @BeforeSuite
    public void setup() throws IOException{
        initialization();
        sh = new SignIn(driver);
    }


    @Test
    public void sign() throws IOException
    {
        sh.signPage();
    }
}
