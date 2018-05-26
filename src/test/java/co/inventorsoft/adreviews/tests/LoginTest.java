package co.inventorsoft.adreviews.tests;

import co.inventorsoft.adreviews.pages.Dashboard;
import co.inventorsoft.adreviews.utils.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.Assert;

public class LoginTest extends BaseTest {

    private Dashboard dashboard = null;

    @BeforeClass
    public void init() {
        dashboard = new Dashboard(driver);
    }

    @DataProvider
    public Object[][] getLoginData() {
        return new String[][]{
                {"satelite2042@gmail.com", "maksg123"}
        };
    }

    @Test(dataProvider = "getLoginData")
    public void login(String login, String password) {
        driver.manage().window().fullscreen();
        actions.login(login, password);
        Assert.assertTrue(dashboard.isDisplayedDashboardHeader(), "Header is not displayed");

    }

    @Test(dependsOnMethods = "login")
    public void checkInvitations() {
        dashboard.clickInvitations();
        Assert.assertTrue(dashboard.isTitleDisplayed(), "Title is not displayed");
        Assert.assertEquals("Invitations", dashboard.getTitleText(), "Invitations is not displayed");
        }

    @Test(dependsOnMethods = {"login", "checkInvitations"})
    public void checkDashboard() {
        dashboard.clickDashboard();
        Assert.assertTrue(dashboard.isTitleDisplayed(), "Title is not displayed");
    }

    @Test(dependsOnMethods = "login")
    public void checkServiceReview() {
        dashboard.clickServiceReview();
        Assert.assertTrue(dashboard.isTitleDisplayed(), "Title is not displayed");
        Assert.assertEquals("Service Reviews", dashboard.getTitleText(), "Service Review is not displayed");
    }

    @Test(dependsOnMethods = "login")
    public void checkIntegration() {
        dashboard.clickIntegration();
        Assert.assertTrue(dashboard.isTitleDisplayed(), "Title is not displayed");
        Assert.assertEquals("Integration", dashboard.getTitleText(), "Integration is not displayed");
    }

    @Test(dependsOnMethods = "login")
    public void checkProfile() {
        dashboard.clickProfile();
        Assert.assertTrue(dashboard.isTitleDisplayed(), "Title is not displayed");
        Assert.assertEquals("Company Profile", dashboard.getTitleText(), "Company Profile is not displayed");
    }
    @Test(dependsOnMethods = "login")
    public void checkPublicProfile() {
        Dashboard dashboard = new Dashboard(driver);
        dashboard.clickPublicProfile();
        Assert.assertTrue(dashboard.isDisplayedPublicProfile(), "Company title is not displayed");

    }
}
