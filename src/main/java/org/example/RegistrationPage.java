package org.example;

import org.openqa.selenium.By;

public class RegistrationPage extends Utils
{
  //ENTER FIRST NAME
   private By _firstName = By.id("FirstName");

 //ENTER LAST NAME
   private By _lastName = By.id("LastName");

  //ENTER EMAIL ADDRESS
   private By _email = By.id("Email");

 // ENTER PASSWORD
   private By _password = By.id("Password");

 // ENTER CONFIRM PASSWORD
   private By _confirmPassword = By.id("ConfirmPassword");

 // CLICK ON REGISTER BUTTON
   private By _registerButton = By.id("register-button");

 // TYPE FIRST NAME
   private String firstName = "Rajesh"+timestamp;

 // TYPE LAST NAME
   private String lastName = "Khanna"+timestamp;

 // TIMESTAMP METHOD FOR REUSE EMAIL
   private static String timestamp = timestamp();

// ASSERT FOR REGISTER MESSAGE
   public void verifyUserIsOnRegisterPage(){
      assertURL("register");
    }


  public void userEnterRegistrationDetails()
  {
      try {
          Thread.sleep(2000);
      } catch (InterruptedException e) {
          e.printStackTrace();
      }
      sendText(_firstName, firstName);
          sendText(_lastName, lastName);
          sendText(_email, "manish"+timestamp+"@yahoo.com");
          sendText(_password, "maniashah");
          sendText(_confirmPassword, "maniashah");
          clickonElements(_registerButton);


   }
}
