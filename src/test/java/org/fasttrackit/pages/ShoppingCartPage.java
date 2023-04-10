package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ShoppingCartPage extends BasePage {

    @FindBy(css = "td:nth-of-type(3)")
    private WebElementFacade productName;

   public String isProductInShoppingCart(){
       return productName.getText();
   }

        }

