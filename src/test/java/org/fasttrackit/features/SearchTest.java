package org.fasttrackit.features;

import org.junit.Test;

public class SearchTest extends BaseTest {

    @Test
    public void searchForProductTest() {
        searchSteps.searchForKeyword("beanie");
        searchSteps.clickSearchIcon();
        searchSteps.verifyProductIsInList("Beanie with Logo");
    }

        @Test
        public void searchForProductTest1(){
            searchSteps.searchForKeyword("Hoodie");
            searchSteps.clickSearchIcon();
            searchSteps.verifyProductIsInList("Hoodie with no Logo");

    }
}
