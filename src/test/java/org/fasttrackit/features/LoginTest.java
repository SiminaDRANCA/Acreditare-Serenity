package org.fasttrackit.features;

import org.fasttrackit.steps.LoginSteps;
import org.junit.Test;
import utils.Constants;


public class LoginTest extends BaseTest{



    @Test
    public void validLoginTest() {
        loginSteps.navigateToLoginPage();
        loginSteps.typeUserEmail(Constants.USER_EMAIL);
        loginSteps.typePassword(Constants.USER_PASS);
        loginSteps.clickLogin();
        loginSteps.userIsLoggedIn(Constants.USER_NAME);

    }

    @Test
    public void invalidEmailLoginTest() {
        loginSteps.navigateToLoginPage();
        loginSteps.typeUserEmail("simina.dranca@@yahoo.com");
        loginSteps.typePassword(Constants.USER_PASS);
        loginSteps.clickLogin();
        loginSteps.userNotLoggedInEmail("ERROR: Invalid username. Lost your password?");

    }

    @Test
    public void invalidPasswordLoginTest() {
        loginSteps.navigateToLoginPage();
        loginSteps.typeUserEmail(Constants.USER_EMAIL);
        loginSteps.typePassword("Simina..2021");
        loginSteps.clickLogin();
        loginSteps.userNotLoggedInPassword("ERROR: The password you entered for the email address simina.dranca@yahoo.com is incorrect. Lost your password?");
    }

    @Test
    public void noEmailLoginTest() {
        loginSteps.navigateToLoginPage();
        loginSteps.typePassword(Constants.USER_PASS);
        loginSteps.clickLogin();
        loginSteps.userNotLoggedInNoEmail("Error: Username is required.");

    }

    /*public void noPasswordLoginTest() {
        loginSteps.navigateToLoginPage();
        loginSteps.typeUserEmail("simina.dranca@yahoo.com");
        loginSteps.clickLogin();
        loginSteps.userNotLoggedInNoPassword("ERROR: The password field is empty.");

    }*/
}
