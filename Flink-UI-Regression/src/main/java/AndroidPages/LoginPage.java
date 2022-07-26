package AndroidPages;

import com.shaft.gui.element.TouchActions;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private AndroidDriver driver;


    public LoginPage(AndroidDriver driver) {
        this.driver = driver;
    }

    private By createAccountPageTitle = AppiumBy.xpath("//*[contains(@resource-id, 'label_title')]");
    private By AlreadyHaveAccountLoginLink = AppiumBy.id("button_login");
    private By loginButton = AppiumBy.xpath("//*[contains(@resource-id, 'button_login')]");
    private By emailInput = AppiumBy.xpath("//*[contains(@resource-id, 'text_field_email')]");
    private By passInputField = AppiumBy.xpath("//*[contains(@resource-id, 'text_field_password')]");
    private By forgotPasswordLink = AppiumBy.xpath("//*[contains(@resource-id, 'textview_forgot_password')]");
    private By resetPasswordEmailField = AppiumBy.id("text_field_email");
    private By sendInstructionCTA = AppiumBy.id("cta");

    public LoginPage User(String UserEmail, String UserPassword) {
        new TouchActions(driver).performElementAction()
                .click(AlreadyHaveAccountLoginLink)
                //.click(loginButton)
                .typeAppend(emailInput, UserEmail)
                .typeAppend(passInputField, UserPassword)
                .click(loginButton);

        return this;
    }

    public LoginPage forgotPassword(String UserEmail) {
        new TouchActions(driver).performElementAction()
                .click(AlreadyHaveAccountLoginLink)
                .click(loginButton)
                .click(forgotPasswordLink)
                .typeAppend(resetPasswordEmailField, UserEmail)
                .click(sendInstructionCTA);

        return this;
    }
}
