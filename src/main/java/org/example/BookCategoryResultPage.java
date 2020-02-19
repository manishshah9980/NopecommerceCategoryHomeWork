package org.example;

import org.openqa.selenium.By;

public class BookCategoryResultPage extends Utils
{
    private By _comparisionResults = By.xpath("");
    String expected = "Compare products";

    public void userShouldSeeComparisionResult(){

     //   waitforElementsisPresent(_comparisionResults,10);
        assertTextMessage("Compare products not successfull",expected,_comparisionResults);
    }

}
