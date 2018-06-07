package co.inventorsoft.adreviews.tests;


import co.inventorsoft.adreviews.pages.Invitations;
import co.inventorsoft.adreviews.pages.LeftSideBar;
import co.inventorsoft.adreviews.utils.AuthenticatedBaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;

public class InvitationSending extends AuthenticatedBaseTest {

    private Invitations invitations;
    private LeftSideBar leftSideBar;

    @BeforeClass
    public void init() {
        LeftSideBar leftSideBar = new LeftSideBar(driver);
        invitations = new Invitations(driver, leftSideBar);
    }

    @Test
    public void checkTestInvitation() {
        leftSideBar.clickInvitations();
        invitations.waitForInvitations();
        invitations.clickSelectTemplate();
        Assert.assertTrue(invitations.invitationModalIsDisplayed(), "Invitation modal is not displayed");

    }

}
