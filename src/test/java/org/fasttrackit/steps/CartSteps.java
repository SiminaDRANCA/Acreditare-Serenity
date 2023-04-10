package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrackit.pages.*;
import org.junit.Assert;

public class CartSteps extends BaseSteps{

    public AccountPage accountPage;
    public HomePage homePage;
    public LoginPage loginPage;
    public ShopPage shopPage;
    public SearchResultsPage searchResultsPage;
    public ShoppingCartPage shoppingCartPage;


    @Step
    public void navigateToShop() {
        homePage.open();
        homePage.clickOnShopMenuButton();
    }

   @Step
   public void searchForKeyword(String value) {
       shopPage.searchForKeyword(value);
       shopPage.clickOnSearchButton();
   }


   @Step
   public void isProductinList(String value){
           searchResultsPage.isProductInList(value);
       }

       @Step
    public void addToCart(){
        searchResultsPage.clickOnAddToCart();
       }

    public void viewCart(){
        searchResultsPage.clickOnViewCartButton();
    }

    @Step
    public void productIsInShoppingCart(String item){
            Assert.assertEquals(item, shoppingCartPage.isProductInShoppingCart());

    }
   }



