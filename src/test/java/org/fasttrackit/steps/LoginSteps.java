package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrackit.pages.AccountPage;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.LoginPage;
import org.junit.Assert;

public class LoginSteps extends BaseSteps {



    @Step
    public void navigateToLoginPage() {
        homePage.open();
        homePage.clickOnAccountButton();
        homePage.clickOnLoginLink();
    }

    @Step
    public void typeUserEmail(String email) {
        loginPage.setEmailField(email);
    }

    @Step
    public void typePassword(String password) {
        loginPage.setPasswordField(password);
    }

    @Step
    public void clickLogin() {
        loginPage.clickLoginButton();
    }

    @Step
    public void userIsLoggedIn(String userName) {
//        Assert.assertTrue(accountPage.isWelcomeText(userName));
//        Assert.assertEquals("Hello, " + userName + "!", accountPage.getWelcomeText());
//         accountPage.userIsLoggedIn(userName);


        //Assert.assertTrue(accountPage.isWelcomeText(userName));
        //Assert.assertEquals("| Welcome " + userName + " !", accountPage.getWelcomeText());
        accountPage.userIsLoggedIn(userName);
    }

        @Step
        public void userNotLoggedInEmail(String errorMessage) {
        Assert.assertEquals("ERROR: Invalid username. Lost your password?", accountPage.getErrorMessage());
        }

        @Step
        public void userNotLoggedInPassword(String errorMessage) {
        Assert.assertEquals("ERROR: The password you entered for the email address simina.dranca@yahoo.com is incorrect. Lost your password?", accountPage.getErrorMessage());
        }

        @Step
        public void userNotLoggedInNoEmail(String errorMessage){
        Assert.assertEquals("Error: Username is required.", accountPage.getErrorMessage());
        }

    @Step
    public void userNotLoggedInNoPassword(String errorMessage){
        Assert.assertEquals("ERROR: The password field is empty.", accountPage.getErrorMessage());
    }




    @Step
    public void doLogin(String email, String pass){
        navigateToLoginPage();
        typeUserEmail(email);
        typePassword(pass);
        clickLogin();
    }
}
