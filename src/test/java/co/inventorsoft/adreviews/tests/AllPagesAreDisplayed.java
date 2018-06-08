package co.inventorsoft.adreviews.tests;

import co.inventorsoft.adreviews.pages.*;
import co.inventorsoft.adreviews.utils.AuthenticatedBaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;

public class AllPagesAreDisplayed extends AuthenticatedBaseTest {

    private DashboardPage dashboard = null;
    private LeftSideBar leftSideBar = null;
    private InvitationsPage invitations;
    private ServiceReviewsPage servicereview;
    private IntegrationPage integration;
    private CompanyProfilePage companyprofile;
    private PublicProfilePage publicprofile;

    @BeforeClass
    public void init() {
        leftSideBar = new LeftSideBar(driver);
        dashboard = new DashboardPage(driver, leftSideBar);
        invitations = new InvitationsPage(driver, leftSideBar);
        servicereview = new ServiceReviewsPage(driver, leftSideBar);
        integration = new IntegrationPage(driver, leftSideBar);
        companyprofile = new CompanyProfilePage(driver, leftSideBar);
        publicprofile = new PublicProfilePage(driver, leftSideBar);

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
        invitations.waitForInvitations();
        Assert.assertTrue(invitations.isDisplayedInvitationsHeader(), "Invitaions Header is not displayed");
        Assert.assertEquals("Invitations", invitations.getInvitationsText(), "InvitationsPage Text is not displayed");
        }

    @Test
    public void checkServiceReview() {
        leftSideBar.clickServiceReview();
        servicereview.waitForServiceReview();
        Assert.assertTrue(servicereview.isDisplayedServicereviewHeader(), "Review Header is not displayed");
        Assert.assertEquals("Service Reviews", servicereview.getReviewText(), "Service Review Text is not displayed");
    }

    @Test
    public void checkIntegration() {
        leftSideBar.clickIntegration();
        integration.waitForIntegration();
        Assert.assertTrue(integration.isDisplayedIntegrationHeader(), "Integration Header is not displayed");
        Assert.assertEquals("Integration", integration.getIntegrationText(), "Integration Text is not displayed");
    }

    @Test
    public void checkProfile() {
        leftSideBar.clickProfile();
        companyprofile.waitForCompanyProfile();
        Assert.assertTrue(companyprofile.isDisplayedCompanyProfileHeader(), "Profile Header is not displayed");
        Assert.assertEquals("Company Profile", companyprofile.getProfileText(), "Company Profile Text is not displayed");
    }

    @Test(priority = 6)
    public void checkPublicProfile() {
        leftSideBar.clickPublicProfile();
        publicprofile.waitForPublicProfile();
        Assert.assertTrue(publicprofile.isDisplayedPublicProfileHeader(), "Public Profile Header is not displayed");
    }




}
