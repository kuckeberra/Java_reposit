package com.example.tests;

import org.testng.annotations.*;
import ru.stqa.addressbook.model.ContactData;
import ru.stqa.addressbook.tests.TestBaseContacts;

public class ContactCreationTest extends TestBaseContacts {

  @Test
  public void testContactCreation() throws Exception {
    appl.getContactHelper().addContact();
    appl.getContactHelper().fillContactForm(new ContactData("Maria", "Ogorodnikova", "8887766", "ogorodnikovam@yahoo.com"));
    appl.getContactHelper().submitContactCreation();
  }


}
