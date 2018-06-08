package co.inventorsoft.adreviews.tests;


import co.inventorsoft.adreviews.pages.InvitationsPage;
import co.inventorsoft.adreviews.pages.LeftSideBar;
import co.inventorsoft.adreviews.utils.AuthenticatedBaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.Assert;

public class InvitationSending extends AuthenticatedBaseTest {

    private InvitationsPage invitations;
    private LeftSideBar leftSideBar;

    @BeforeClass
    public void init() {
        this.leftSideBar = new LeftSideBar(driver);
        this.invitations = new InvitationsPage(driver, this.leftSideBar);
    }

    @Test
    public void checkTestInvitation() {
        this.leftSideBar.clickInvitations();
        this.invitations.waitForInvitations();
        this.invitations.clickSelectTemplate();
        Assert.assertTrue(this.invitations.invitationModalIsDisplayed(), "Invitation modal is not displayed");

    }

}
