package ru.stqa.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.addressbook.model.ContactData;

public class ContactCreationTest extends TestBaseForContact{

  @Test
  public void testUntitledTestCase() throws Exception {
    getNewContact();
    FillContactForm();
    SubmitNewContact();
    ReturnHome();

  }

  private void ReturnHome() {
    app.returnHome();
  }

  private void SubmitNewContact() {
    app.submitNewContact();
  }

  private void FillContactForm() {
    app.fillContactForm(new ContactData("Maria", "Ogorodnikova", "8887766", "masha@yahoo.com"));
  }

  private void getNewContact() {
    app.createNewContact();
  }

}
