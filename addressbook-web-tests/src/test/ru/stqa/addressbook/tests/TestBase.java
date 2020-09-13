package ru.stqa.addressbook.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.stqa.addressbook.appmanager.ApplicationManager;

public class TestBase {

  public final ApplicationManager applicationManager = new ApplicationManager();

  @BeforeMethod(alwaysRun = true)
  public void setUp() throws Exception {
    applicationManager.init();
  }

  @AfterMethod(alwaysRun = true)
  public void tearDown() throws Exception {
    applicationManager.stop();
  }

}
