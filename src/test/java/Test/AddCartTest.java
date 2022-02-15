package Test;

import Pages.AddtoCart;
import TestBase.Base;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.IOException;

public class AddCartTest extends Base
{
    AddtoCart add;
    public AddCartTest()
    {
        super();
    }
    @BeforeSuite
    public void addcart() throws IOException
    {
        initialization();
        add = new AddtoCart(driver);
    }
    @Test
    public void cart2()
    {
        add.cart();
    }
}
