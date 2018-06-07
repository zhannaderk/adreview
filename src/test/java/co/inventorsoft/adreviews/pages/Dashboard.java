package co.inventorsoft.adreviews.pages;

import co.inventorsoft.adreviews.utils.Util;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard {

    private WebDriver webDriver;
    private LeftSideBar leftSideBar;

    @FindBy (xpath = "//*[@id=\"content\"]/div[1]")
    private WebElement dashboardheader;

    @FindBy (css = "#content > div.px-0.px-md-4 > div > h1")
    private WebElement servicereviewheader;

    @FindBy(css = "#content > div.px-0.px-md-4 > h1")
    private WebElement integrationheader;

    @FindBy (css = "#content > div.px-0.px-md-4 > h1")
    private WebElement companyrpofileheder;
    @FindBy (className = "company-name")
    private WebElement publicprofileheader;

    public Dashboard (WebDriver driver, LeftSideBar leftSideBar) {
        this.webDriver = driver;
        this.leftSideBar = leftSideBar;
        PageFactory.initElements(driver, this);
    }
    
    public boolean isDisplayedDashboardHeader() {

        return dashboardheader.isDisplayed();
    }



    public boolean isDisplayedServicereviewHeader() {

        return servicereviewheader.isDisplayed();
    }

    public boolean isDisplayedIntegrationHeader() {

        return integrationheader.isDisplayed();
    }

    public boolean isDisplayedCompanyProfileHeader() {
        return companyrpofileheder.isDisplayed();
    }

    public boolean isDisplayedPublicProfileHeader() {

        return publicprofileheader.isDisplayed();
    }

    public String getDashboardText() {
        return dashboardheader.getText();
    }


    public String getReviewText() {
        return servicereviewheader.getText();
    }

    public String getIntegrationText() {
        return integrationheader.getText();
    }

    public String getProfileText() {
        return companyrpofileheder.getText();
    }

    public LeftSideBar getLeftSideBar() {
        return leftSideBar;
    }

    public void waitForDashboard() {
        Util.wait10SecondsForVisibilityOf(webDriver, dashboardheader);
    }




    public void waitForServiceReview() {
        Util.wait10SecondsForVisibilityOf(webDriver, servicereviewheader);
    }

    public void waitForIntegration() {
        Util.wait10SecondsForVisibilityOf(webDriver, integrationheader);
    }

    public void waitForCompanyProfile() {
        Util.wait10SecondsForVisibilityOf(webDriver, companyrpofileheder);
    }

    public void waitForPublicProfile() {
        Util.wait10SecondsForVisibilityOf(webDriver, publicprofileheader);
    }
}


