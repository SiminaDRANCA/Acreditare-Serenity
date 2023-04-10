package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class SearchResultsPage extends BasePage {

    @FindBy(css = "h3 ")
    private List<WebElementFacade> listOfResults;

    @FindBy(css = "[data-product_sku]")
    private WebElementFacade addToCartButton;

    @FindBy(css = ".view-cart")
    private WebElementFacade viewCartButton;

    public boolean isProductInList(String productName){
        for (WebElementFacade element : listOfResults){
            if (element.getText().equalsIgnoreCase(productName)){
                return true;

            }
        }
        return false;
    }

    public void clickOnAddToCart(){
        clickOn(addToCartButton);
            }
    public void clickOnViewCartButton(){
        clickOn(viewCartButton);
    }
}
