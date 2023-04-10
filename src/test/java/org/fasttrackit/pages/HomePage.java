package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa5.fasttrackit.org:8008/")
public class HomePage extends BasePage {


    @FindBy(css = ".login-woocommerce")
    private WebElementFacade loginLink;

    @FindBy(css= "[class='account']")
    private WebElementFacade accountButton;

    @FindBy(css=".menu-item-70")
    private WebElementFacade myAccountMenuButton;

    @FindBy(css=".menu-item-71")
    private WebElementFacade checkOutMenuButton;

    @FindBy(css=".menu-item-72")
    private WebElementFacade cartMenuButton;

    @FindBy(css=".menu-item-73")
    private WebElementFacade shopMenuButton;

    @FindBy(css=".search-field")
    private WebElementFacade searchField;

    @FindBy(css=".fa-search")
    private WebElementFacade searchButton;


    public void clickOnAccountButton(){

        clickOn(accountButton);
    }

    public void clickOnLoginLink()
    {
        clickOn(loginLink);
    }

    public void clickOnMyAccountMenuButton(){
        clickOn(myAccountMenuButton);
    }

    public void clickOnCheckOutMenuButton(){
        clickOn(checkOutMenuButton);
    }

    public void clickOnCartMenuButton(){
        clickOn(cartMenuButton);
    }

    public void clickOnShopMenuButton(){
        clickOn(shopMenuButton);
    }

    public void setSearchField(String value){
        typeInto(searchField, value);
    }

    public void clickSearchButton(){
        clickOn(searchButton);
    }
}
