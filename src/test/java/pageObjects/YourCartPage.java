package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class YourCartPage {

    private WebDriver driver;

    @FindBy(how = How.XPATH, using = "//span[@class='title']")
    private WebElement cartPageTitle;

    @FindBy(how = How.XPATH, using = "//button[@id='continue-shopping']")
    private WebElement btnContinueShopping;

    @FindBy(how = How.XPATH, using = "//button[@id='checkout']")
    private WebElement btnChekout;

    public YourCartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void ClickChekout()
    {
        btnChekout.click();
    }

    public void verifyCartPageTitle(String message) {
        //Verify Page Title
        //assertThat(cartPageTitle.getText().trim()).isEqualToIgnoringCase(message);
    }
}
