package ru.stqa.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.addressbook.model.ContactData;

public class ContactCreationTest extends TestBaseForContact{

  @Test
  public void testUntitledTestCase() throws Exception {
    createNewContact();
    fillContactForm(new ContactData("Maria", "Ogorodnikova", "8887766", "masha@yahoo.com"));
    submitNewContact();
    returnHome();

  }

}
