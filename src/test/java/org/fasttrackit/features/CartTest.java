package org.fasttrackit.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.CartSteps;
import org.fasttrackit.steps.LoginSteps;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import utils.Constants;


public class CartTest extends BaseTest{



    @Test
    public void addToCartTest(){
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASS);
        cartSteps.navigateToShop();
        cartSteps.searchForKeyword("beanie");
        cartSteps.isProductinList("Beanie with Logo");
        cartSteps.addToCart();
        cartSteps.viewCart();
        cartSteps.productIsInShoppingCart("Beanie with Logo");




    }
}
