package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utils {
    private By _registerlink = new By.ByXPath("//a[text()='Register']");

    public void clickonRegisterButton() {
        clickonElements(_registerlink);
    }

}
