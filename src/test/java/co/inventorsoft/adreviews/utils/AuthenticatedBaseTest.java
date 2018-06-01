package co.inventorsoft.adreviews.utils;

import lombok.Value;
import org.testng.annotations.*;

public class AuthenticatedBaseTest extends BaseTest {

    protected LoginData userCredentials() {
        return new LoginData("satelite2042@gmail.com", "maksg123");
    }

    @BeforeClass
    public void login() {
        System.out.println("Authenticating user ...");
        driver.manage().window().fullscreen();
        LoginData credentials = userCredentials();
        actions.login(credentials.username, credentials.password);
        System.out.println("User authenticated successfully ...");
    }

    public class LoginData {
        private String username;
        private String password;

        public LoginData(String username, String password) {
            this.username = username;
            this.password = password;
        }
    }
}
