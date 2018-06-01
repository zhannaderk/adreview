package co.inventorsoft.adreviews.pages;

import co.inventorsoft.adreviews.utils.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver webDriver;
    private By emailInput = By.id("email");
    private By passInput = By.id("password");
    private By loginBtn = By.id ("sign-btn");

    public LoginPage(WebDriver webDriver) {

        this.webDriver = webDriver;
    }

    public void open() {

        webDriver.get(Properties.getBaseUrl());
    }

    public void fillEmailInput(String email) {

        webDriver.findElement(emailInput).sendKeys(email);
    }

    public void fillPasswordInput(String password) {

        webDriver.findElement(passInput).sendKeys(password);
    }

    public void clickLoginButton() {

        webDriver.findElement(loginBtn).click();
    }
}
