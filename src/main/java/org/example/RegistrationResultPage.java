package org.example;


import org.openqa.selenium.By;

public class RegistrationResultPage extends Utils
{
     private By _registerSuccessNessage = By.xpath("//div[@class=\"result\"]");
     String expected = "your registration completed";

     public void verifyUserSeeRegisterationSuccessMessage() {


     }
}
