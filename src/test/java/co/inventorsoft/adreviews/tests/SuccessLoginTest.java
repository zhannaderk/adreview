package co.inventorsoft.adreviews.tests;

import co.inventorsoft.adreviews.pages.DashboardPage;
import co.inventorsoft.adreviews.pages.LoginPage;
import co.inventorsoft.adreviews.utils.AuthenticatedBaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.io.IOException;

public class SuccessLoginTest extends AuthenticatedBaseTest {

    private DashboardPage dashboard;
    private LoginPage loginpage;

    @BeforeClass
    public void init() {
        dashboard = new DashboardPage(driver);
        loginpage = new LoginPage(driver);
    }

    @Test (priority = -1)
    public void canLogin() throws Exception {
        actions.loginDefault();
        Assert.assertTrue(dashboard.isDisplayedDashboardHeader(), "Dashboard is not displayed");
    }




}
