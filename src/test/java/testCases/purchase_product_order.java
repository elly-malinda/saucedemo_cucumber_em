package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.*;
import testBase.BaseClass;

public class purchase_product_order extends BaseClass {
    @Test (priority =3)
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
        Assert.assertEquals(productsPage, true, "Products Page Displayed");

        pp.SelectFirstItem();
        pp.SelectSecondItem();
        pp.ViewCart();

        CartPage cp = new CartPage(driver);
        boolean cartPage = cp.CartPageDisplayed();
        Assert.assertEquals(cartPage, true, "Your Cart Displayed");
        cp.ClickChekout();
        CheckoutInfoPage cip = new CheckoutInfoPage(driver);
        boolean checkoutPage = cip.CheckoutInfoDisplayed();
        Assert.assertEquals(checkoutPage, true, "Checkout Page displayed");
        cip.EnterCheckoutInfo("Jacob", "Mare", "2011");
        cip.ClickContinue();
        OverViewPage ovp = new OverViewPage(driver);
        boolean overViewPage = ovp.OverViewDisplayed();
        Assert.assertEquals(overViewPage, true, "Overview Page displayed");
        ovp.ClickFinish();
        OrderConfirmationPage ocp = new OrderConfirmationPage(driver);
        boolean ordrConfPage = ocp.OrderConfirmation();
        Assert.assertEquals(ordrConfPage, true, "Overview Page displayed");
        String strConf = ocp.OrderConfirmationText();
        Assert.assertEquals(strConf,"Thank you for your order!");
        ocp.ClickBackHome();
    }


}
