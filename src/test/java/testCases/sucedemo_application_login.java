package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.ProductsPage;
import testBase.BaseClass;

public class sucedemo_application_login extends BaseClass {
    @Test(priority =1)
    public void authenticate_valid_user()
    {
        LoginPage lp = new LoginPage(driver);
        boolean pageHeader = lp.HomePageDisplayed();
        //Verify Landing Page
        Assert.assertEquals(pageHeader, true, "Login Successful");

        lp.enterLoginCredentials("standard_user","secret_sauce");
        lp.ClickLoginButton();
        ProductsPage pp = new ProductsPage(driver);
        boolean productsPage = pp.verifyProductPageDisplayed();
        Assert.assertEquals(productsPage, true, "Login Successful");

    }
}
