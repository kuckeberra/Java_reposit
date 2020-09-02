package ru.stqa.addressbook;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class GroupDeletionTest extends TestBase {


  @Test
  public void testGroupDeletion() throws Exception {
   gotoGroupPage();
    selectGroup();
    deleteSelectedGroups();
    returnToGroupPage();

  }

  private void gotoGroupPage() {
  }

  private void selectGroup() {
    wd.findElement(By.linkText("groups")).click();
  }


}
