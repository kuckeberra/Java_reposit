package ru.stqa.addressbook.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBaseContacts {

  protected final ApplicationManagerContact appl = new ApplicationManagerContact();

  @BeforeMethod(alwaysRun = true)
  public void setUp() throws Exception {
    appl.init();
  }

  @AfterMethod(alwaysRun = true)
  public void tearDown() throws Exception {
    appl.stop();
  }

}
