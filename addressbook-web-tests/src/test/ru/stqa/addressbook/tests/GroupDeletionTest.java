package ru.stqa.addressbook.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class GroupDeletionTest extends TestBase {


  @Test
  public void testGroupDeletion() throws Exception {
   gotoGroupPage();
    selectGroup();
    app.deleteSelectedGroups();
    app.returnToGroupPage();

  }

  private void gotoGroupPage() {
  }

  private void selectGroup() {
    app.wd.findElement(By.linkText("groups")).click();
  }


}
