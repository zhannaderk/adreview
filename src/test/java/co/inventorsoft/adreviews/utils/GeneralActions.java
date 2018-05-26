package co.inventorsoft.adreviews.utils;

import co.inventorsoft.adreviews.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Contains main script actions that may be used in scripts.
 */
public class GeneralActions {

    private WebDriver driver;
    private WebDriverWait wait;

    public GeneralActions(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 30);
    }

    /**
     * Logs in to Admin Panel.
     *
     * @param login
     * @param password
     */
        public void login(String login, String password) {
        LoginPage LoginPage = new LoginPage(driver);
        LoginPage.open();
        LoginPage.fillEmailInput(login);
        LoginPage.fillPasswordInput(password);
        LoginPage.clickLoginButton();
        //MainPage mainPage = new MainPage(driver);
        //wait.until(ExpectedConditions.visibilityOf(driver.findElement(mainPage.getImgLogo())));
    }


    /**
     * Waits until page loader disappears from the page
     */
    public void waitForContentLoad() {
        // TODO implement generic method to wait until page content is loaded

        // wait.until(...);
        // ...
    }
}