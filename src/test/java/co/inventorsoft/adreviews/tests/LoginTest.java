package co.inventorsoft.adreviews.tests;

import co.inventorsoft.adreviews.pages.Dashboard;
import co.inventorsoft.adreviews.pages.LeftSideBar;
import co.inventorsoft.adreviews.utils.AuthenticatedBaseTest;
import co.inventorsoft.adreviews.utils.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.Assert;

public class LoginTest extends AuthenticatedBaseTest {

    private Dashboard dashboard = null;
    private LeftSideBar leftSideBar = null;

    @BeforeClass
    public void init() {
        leftSideBar = new LeftSideBar(driver);
        dashboard = new Dashboard(driver, leftSideBar);
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("This will execute before every Method");
    }

    @Test(priority = -1)
    public void loginTest() {
        Assert.assertTrue(dashboard.isDisplayedDashboardHeader(), "Header is not displayed");
    }

    @Test
    public void checkDashboard() {
        leftSideBar.clickDashboard();
        dashboard.waitForDashboard();
        Assert.assertNotNull (dashboard.getDashboardText(), "Welcome Text is not displayed");
    }

    @Test
    public void checkInvitations() {
        leftSideBar.clickInvitations();
        dashboard.waitForInvitations();
        Assert.assertTrue(dashboard.isDisplayedInvitationsHeader(), "Invitaions Header is not displayed");
        Assert.assertEquals("Invitations", dashboard.getInvitationsText(), "Invitations Text is not displayed");
        }


    @Test
    public void checkServiceReview() {
        leftSideBar.clickServiceReview();
        dashboard.waitForServiceReview();
        Assert.assertTrue(dashboard.isDisplayedServicereviewHeader(), "Review Header is not displayed");
        Assert.assertEquals("Service Reviews", dashboard.getReviewText(), "Service Review Text is not displayed");
    }

    @Test
    public void checkIntegration() {
        leftSideBar.clickIntegration();
        dashboard.waitForIntegration();
        Assert.assertTrue(dashboard.isDisplayedIntegrationHeader(), "Integration Header is not displayed");
        Assert.assertEquals("Integration", dashboard.getIntegrationText(), "Integration Text is not displayed");
    }

    @Test
    public void checkProfile() {
        leftSideBar.clickProfile();
        dashboard.waitForCompanyProfile();
        Assert.assertTrue(dashboard.isDisplayedCompanyProfileHeader(), "Profile Header is not displayed");
        Assert.assertEquals("Company Profile", dashboard.getProfileText(), "Company Profile Text is not displayed");
    }

    @Test(priority = 6)
    public void checkPublicProfile() {
        leftSideBar.clickPublicProfile();
        dashboard.waitForPublicProfile();
        Assert.assertTrue(dashboard.isDisplayedPublicProfileHeader(), "Public Profile Header is not displayed");
    }




}
