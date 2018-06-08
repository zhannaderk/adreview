package co.inventorsoft.adreviews.tests;

import co.inventorsoft.adreviews.pages.*;
import co.inventorsoft.adreviews.utils.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NegativeLoginTest extends BaseTest {

   private LoginPage loginfalse;

    @BeforeClass
    public void init() {
        loginfalse = new LoginPage(driver);

    }

    @Test
    public void canNotLoginWithInvalidEmail(){
        actions.login("", "maksg123");
        loginfalse.waitForLoginPage();
        Assert.assertTrue(loginfalse.signInButtonIsDisplayed(), "Sign in button is not displayed");
    }
}
