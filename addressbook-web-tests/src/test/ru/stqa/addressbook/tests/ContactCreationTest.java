package com.example.tests;

import org.testng.annotations.*;
import ru.stqa.addressbook.model.ContactData;
import ru.stqa.addressbook.tests.TestBase;

public class ContactCreationTest extends TestBase {


  @Test
  public void testContactCreation() throws Exception {
    applicationManager.getContactHelper().addNewContact();
    applicationManager.getContactHelper().fillContactForm(new ContactData("Maria", "Ogorodnikova", "8887766", "ogorodnikovam@yahoo.com"));
    applicationManager.getContactHelper().submitContactCreation();
  }

}
