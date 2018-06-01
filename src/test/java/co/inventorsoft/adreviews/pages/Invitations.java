package co.inventorsoft.adreviews.pages;

import co.inventorsoft.adreviews.utils.Util;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Invitations {

    private WebDriver webDriver;
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
}
