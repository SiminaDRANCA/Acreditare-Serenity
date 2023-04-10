package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ShopPage extends BasePage {

    @FindBy (css=".search-field")
    private WebElementFacade searchform;

    @FindBy(css = ".fa-search")
    private WebElementFacade searchButton;

    public void searchForKeyword(String value) {
        typeInto(searchform, value);

    }

    public void clickOnSearchButton(){
        clickOn(searchButton);
    }
}

