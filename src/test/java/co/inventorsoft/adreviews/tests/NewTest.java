package co.inventorsoft.adreviews.tests;

import co.inventorsoft.adreviews.utils.BaseTest;
import co.inventorsoft.adreviews.utils.GeneralActions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.IOException;

public class NewTest extends BaseTest {

    @Test
    public void test1() throws Exception {
        actions.loginDefault();
    }
}
