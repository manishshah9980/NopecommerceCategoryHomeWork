package org.example;

import org.openqa.selenium.By;

public class CurrencyChange extends Utils
{
    private By _currencyChange = By.xpath("//select[@id=\"customerCurrency\"]");

    //select and change currency from us Dollar to Euro
    public void selectCurrencyUsDollarToEuro()
    {
        selectFromDropDownByVisible(_currencyChange,"Euro");}

     //select and change currency from Euro to Us Dollar
    public void selectCurrencyEuroToDollar()
    {
        selectFromDropDownByVisible(_currencyChange,"US Dollar");


    }

}
