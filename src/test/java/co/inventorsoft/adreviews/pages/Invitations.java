package co.inventorsoft.adreviews.pages;

import co.inventorsoft.adreviews.utils.Util;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Invitations {

    private WebDriver webDriver;
    @FindBy (css = "#content > div.px-0.px-md-4 > h2")
    private WebElement invitationsheader;
    @FindBy(id = "selectTemplateButton")
    private WebElement selecttemplatelink;
    @FindBy(className = "modal-content half-gray")
    private WebElement selecttemplatemodal;
    @FindBy(id = "sendTest")
    private WebElement sendtestinvitationlink;

    public Invitations(WebDriver driver, LeftSideBar leftSideBar) {
        this.webDriver = driver;
        PageFactory.initElements(driver, this);
    }


    public void clickSelectTemplate() {
        selecttemplatelink.click();
        Util.wait10SecondsForVisibilityOf(webDriver, selecttemplatemodal);
    }

    public boolean invitationModalIsDisplayed() {
        return selecttemplatemodal.isDisplayed();
    }


    public boolean isDisplayedInvitationsHeader() {

        return invitationsheader.isDisplayed();
    }

    public void waitForInvitations() {
        Util.wait10SecondsForVisibilityOf(webDriver, invitationsheader);
    }

    public String getInvitationsText() {
        return invitationsheader.getText();
    }
    }
