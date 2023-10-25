package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class LoginPage {
    @FindBy(id = "logout")
    WebElement btn_logout;

    WebDriver driver;
}
