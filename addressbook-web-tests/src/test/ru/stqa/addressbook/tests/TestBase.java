package ru.stqa.addressbook.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.stqa.addressbook.appmanager.ApplicationManager;
import ru.stqa.addressbook.model.ContactData;

public class TestBase {

  public final ApplicationManager applicationManager = new ApplicationManager();
  private WebDriver wd;

  @BeforeMethod(alwaysRun = true)
  public void setUp() throws Exception {
    applicationManager.init();
  }

  @AfterMethod(alwaysRun = true)
  public void tearDown() throws Exception {
    applicationManager.stop();
  }

  public ApplicationManager getApplicationManager() {
    return applicationManager;
  }
}
