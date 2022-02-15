package Test;

import Pages.SignUp;
import TestBase.Base;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.IOException;

public class SignupTest extends Base {
    SignUp s;
    public SignupTest()
    {
        super();
    }
    @BeforeSuite
    public void launch() throws IOException
    {
        initialization();
        s = new SignUp(driver);
    }
    @Test
    public void signTest() throws IOException, InterruptedException
    {
        s.signup12();
    }
}