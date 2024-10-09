package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.ProductsPage;
import testBase.BaseClass;

public class purchase_product_order extends BaseClass {
    @Test
    public void order_products_items()
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
