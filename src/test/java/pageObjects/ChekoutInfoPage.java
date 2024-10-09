package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ChekoutInfoPage {

    private WebDriver driver;

    @FindBy(how = How.XPATH, using = "//span[@class='title']")
    private WebElement lblChekoutInfoTitle;

    @FindBy(how = How.XPATH, using = "//input[@id='first-name']")
    private WebElement txtFirstName;

    @FindBy(how = How.XPATH, using = "//input[@id='last-name']")
    private WebElement txtLastName;

    @FindBy(how = How.XPATH, using = "//input[@id='postal-code']")
    private WebElement txtPostalCode;

    @FindBy(how = How.XPATH, using = "//button[@id='cancel']")
    private WebElement btnCancel;

    @FindBy(how = How.XPATH, using = "//input[@id='continue']")
    private WebElement btnContinue;

    public ChekoutInfoPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void EnterCheckoutInfo(String f_name, String l_name, String p_code)
    {
        //Populate Shipping details
        txtFirstName.sendKeys(f_name);
        txtLastName.sendKeys(l_name);
        txtPostalCode.sendKeys(p_code);
    }


    public void ClickContinue()
    {
        btnContinue.click();
    }

    public String getPageHeader()
    {
        return lblChekoutInfoTitle.getText();
    }


}
