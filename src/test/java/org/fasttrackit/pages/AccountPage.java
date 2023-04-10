package org.fasttrackit.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends BasePage{

    @FindBy(css = ".welcome-user")
    private WebElementFacade welcomeTextElement;

    @FindBy(css=".woocommerce-error")
    private WebElementFacade errorMessageElement;

    public boolean isWelcomeText(String userName) {
        return welcomeTextElement.containsOnlyText("| Welcome " + userName + " !");

    }

    public String getWelcomeText(){
        return welcomeTextElement.getText();
    }

    public void userIsLoggedIn(String userName){
        welcomeTextElement.shouldContainOnlyText("| Welcome " + userName + " !");
    }

    public String getErrorMessage(){
        return errorMessageElement.getText();
    }

    public void usersEmailInvalid(String errorMessage){
        errorMessageElement.shouldContainOnlyText("ERROR: Invalid username. Lost your password?");

    }

    public void usersPasswordInvalid (String errorMessage){
        errorMessageElement.shouldContainOnlyText("ERROR: The password you entered for the email address simina.dranca@yahoo.com is incorrect. Lost your password?");
    }

    public void noEmailLogin (String errorMessage){
        errorMessageElement.shouldContainOnlyText("Error: Username is required.");
    }

    public void noPasswordLogin (String errorMessage){
        errorMessageElement.shouldContainOnlyText("ERROR: The password field is empty.");
    }
}
