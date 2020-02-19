package org.example;

import org.junit.Test;
import org.openqa.selenium.By;

public class TestSuite extends BaseTest
{
    HomePage homePage = new HomePage();

    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationResultPage registrationResultPage = new RegistrationResultPage();

    @Test
        public void userSouldCompareProductsSuccessfully(){


    }



        @Test

        public void UserShouldBeAbleToRegisterSuccessfully()
        {
            homePage.clickonRegisterButton();
           registrationPage.verifyUserIsOnRegisterPage();

           registrationPage.userEnterRegistrationDetails();

           registrationResultPage.verifyUserSeeRegisterationSuccessMessage();

        }

        @Test

      public void userShouldBeAbleToCompareTwoDifferentProductSuccessfully(){

            browserSelector.setUpBrowser();


        }










    }

