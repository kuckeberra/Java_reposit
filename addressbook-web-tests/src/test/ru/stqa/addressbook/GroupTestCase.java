package ru.stqa.addressbook;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class GroupTestCase extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {
    gotoGroupPage("groups");
    initGroupCreation();
    fillGroupForm(new GroupData("test1", "test2", "test3"));
    submitGroupCreation();
    returnToGroupPage();
    wd.findElement(By.linkText("Logout")).click();
  }


}

