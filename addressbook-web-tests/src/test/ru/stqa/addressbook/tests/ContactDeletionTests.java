package ru.stqa.addressbook.tests;

import org.testng.annotations.Test;

public class ContactDeletionTests extends TestBase {
  @Test
  public void testContactDeletion(){
    applicationManager.getContactHelper().selectContact();
    applicationManager.getContactHelper().deleteContact();
    applicationManager.getContactHelper().submitAlert();
  }
}
