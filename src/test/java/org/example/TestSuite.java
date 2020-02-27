package org.example;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TestSuite extends BaseTest {
    HomePage homePage = new HomePage();
 // OBJECT FOR REGISTRATION PAGE
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationResultPage registrationResultPage = new RegistrationResultPage();


// OBJECT FOR GUEST COMMENT
    GuestComments guestComments = new GuestComments();
    GuestCommentsResults guestCommentsResults = new GuestCommentsResults();


 // OBJECT FOR CURRENCY CHANGE
    CurrencyChange currencyChange = new CurrencyChange();
    CurrencyChangeResultPage currencyChangeResultPage = new CurrencyChangeResultPage();

    GuestUserCheckout guestUserCheckout = new GuestUserCheckout();
        @Test
        // METHOD FOR USER CAN REGISTER SUCCESSFULLY
        public void UserShouldBeAbleToRegisterSuccessfully()
        {
            homePage.clickonRegisterButton();
           registrationPage.verifyUserIsOnRegisterPage();

           registrationPage.userEnterRegistrationDetails();

           registrationResultPage.verifyUserSeeRegisterationSuccessMessage();

        }
          @Test
        // METHOD FOR USER TO ADD COMMENTS
        public void guestUserShouldBeAbletoAddCopmments() {
              guestComments.addComments();

          }

          @Test
          // METHOD FOR USER CAN CHANGE CURRENCY
          public void userShouldBeAbleToChangeCurrency() {
              currencyChange.selectCurrencyUsDollarToEuro();
              currencyChangeResultPage.verifychangeCurrencyChangeUsDollarsToEuro();

              currencyChange.selectCurrencyEuroToDollar();
              currencyChangeResultPage.verifycurrencyChangeEuroToUsDollar();

          }
          @Test
          // METHOD FOR GUEST USER CAN CHECKOUT SUCCESSFULLY
         public void guestUserShouldCheckoutSuccessFully(){

            guestUserCheckout.enterDetailsForCheckout();


        }


          }





