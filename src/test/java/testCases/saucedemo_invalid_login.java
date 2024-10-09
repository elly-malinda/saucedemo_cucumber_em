package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class saucedemo_invalid_login extends BaseClass {
@Test(priority = 2)
    public void unauthoised_user_not_authenticated()
    {
        LoginPage lp = new LoginPage(driver);
        boolean pageHeader = lp.HomePageDisplayed();
        //Verify Landing Page
        Assert.assertEquals(pageHeader, true, "Login Successful");

        lp.enterLoginCredentials("locked_out_user","secret_sauce");
        lp.ClickLoginButton();

        boolean loginErr = lp.LoginErrorDisplayed();
        //Verify Landing Page
        Assert.assertEquals(loginErr, true, "Login Failed");
    }
}
