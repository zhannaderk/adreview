package co.inventorsoft.adreviews.pages;

import co.inventorsoft.adreviews.utils.Properties;
import co.inventorsoft.adreviews.utils.Util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private WebDriver webDriver;
    @FindBy(id = "email")
    private WebElement emailInput;
    @FindBy(id = "password")
    private WebElement passInput;
    @FindBy (id="sign-btn")
    private WebElement loginBtn;

    public LoginPage(WebDriver driver) {
        this.webDriver = driver;
        PageFactory.initElements(driver, this);
    }

    public void open() {

       webDriver.get(Properties.getBaseUrl());
   }

   public boolean signInButtonIsDisplayed(){
        return loginBtn.isDisplayed();
   }

    public void waitForLoginPage() {

        Util.wait10SecondsForVisibilityOf(webDriver, loginBtn);
    }
   public void fillEmailInput(String email) {

        emailInput.sendKeys(email);
   }

   public void fillPasswordInput(String password) {

       passInput.sendKeys(password);
   }

       public void clickLoginButton() {

           loginBtn.click();
       }

//       public boolean errorInvalidEmailInputIsDisplayed() {
//
//       }
   }
