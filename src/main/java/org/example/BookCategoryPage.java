package org.example;

import org.openqa.selenium.By;

public class BookCategoryPage
{
    public class categoryPge extends Utils{
        //SELECTING BOOK CATEGORY
        private By _Bookcategory = By.linkText("Books");

        // SELECTING FIRST PRODUCT TO COMPARE
        private By _comparefirstProducts = By.xpath("return AjaxCart.addproducttocomparelist(\"/compareproducts/add/37\"),!1");

        // SELECTING SECOND PRODUCT TO COMPARE
        private By _compareSecondProduct = By.xpath("return AjaxCart.addproducttocomparelist(\"/compareproducts/add/38\"),!1");

        //COMPARE PRODUCT MESSAGE DISPLAYED
        private By _Comparepproducts = By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[1]/h1");

        public void selectProductsToCompare()
        {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clickonElements(_Bookcategory);
            clickonElements(_comparefirstProducts);
            waitUntilClickable(_comparefirstProducts,10);
            clickonElements(_Bookcategory);
            clickonElements(_compareSecondProduct);
            waitUntilClickable(_compareSecondProduct,10);
            clickonElements(_Comparepproducts);

        }





    }


}
