package org.example;

import org.openqa.selenium.By;

public class GuestUserCheckout extends Utils {
    Loadprop loadprop = new Loadprop();

    private By _category = By.xpath("/html/body/div[6]/div[2]/ul[1]/li[5]/a");
    private By _clickOnProduct = By.xpath("/html/body/div[6]/div[3]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div[2]/h2/a");
    private By _clickonAddtocartButton = By.xpath("//*[@id=\"product-details-form\"]/div/div[1]/div[2]/div[7]");
    private By _selectShopCart = By.xpath("//*[@id=\"topcartlink\"]/a/span[1]");


    public void enterDetailsForCheckout() {


        try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace(); }

        // CLICK ON BOOK CATEGORY
        clickonElements(_category);

        try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace(); }

        // CLICK ON PRODUCT FIRST PRIZE PIES
         clickonElements(_clickOnProduct);

        // CLICK ON ADD TO CART BUTTON
        clickOnElement(_clickonAddtocartButton);

        // CLICK ON SELECT ON SHOPPING CART BUTTON
        clickOnElement(_selectShopCart);

        try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace(); }


        }
    }


















