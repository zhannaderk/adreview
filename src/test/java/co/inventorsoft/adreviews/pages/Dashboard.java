package co.inventorsoft.adreviews.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dashboard {

    private WebDriver webDriver;
    private By header = By.xpath("//*[@id=\"content\"]/div[1]");
    private By invititem = By.partialLinkText("Invitations");
    private By title = By.cssSelector("#content > div.px-0.px-md-4 > h1");
    private By servicitem = By.partialLinkText("Service Reviews");
    private By itegritem = By.partialLinkText("Integration");
    private By profileitem = By.partialLinkText("Company Profile");
    private By publicpritem = By.partialLinkText("Public profile");
    private By publicprofile = By.className("company-name");
    private By dashboarditem = By.partialLinkText("Dashboard");



    public Dashboard (WebDriver driver) {
        this.webDriver = driver;
    }
    
    public boolean isDisplayedDashboardHeader() {
        return webDriver.findElement(header).isDisplayed();
    }

    public boolean isTitleDisplayed() {
        return webDriver.findElement(title).isDisplayed();
    }

    public String getTitleText() {
        WebElement element = webDriver.findElement(title);
        return element.getText();
    }

    public void clickDashboard() {
        webDriver.findElement(dashboarditem).click();
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(title));
    }

    public void clickInvitations() {
        webDriver.findElement(invititem).click();
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(title));
    }

    public void clickServiceReview() {
        webDriver.findElement(servicitem).click();
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(title));
    }


   public void clickIntegration() {
        webDriver.findElement(itegritem).click();
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(title));
    }


    public void clickProfile() {
        webDriver.findElement(profileitem).click();
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(title));
    }


    public void clickPublicProfile() {
        webDriver.findElement(publicpritem).click();
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(publicprofile));
    }

    public boolean isDisplayedPublicProfile() {
        return webDriver.findElement(publicprofile).isDisplayed();
    }
}


