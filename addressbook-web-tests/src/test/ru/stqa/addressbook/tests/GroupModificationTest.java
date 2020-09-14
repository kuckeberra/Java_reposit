package ru.stqa.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.addressbook.model.GroupData;

public class GroupModificationTest extends TestBase {

  @Test
 public void testGroupModification() {
    applicationManager.getNavigationHelper().gotoGroupPage();
    applicationManager.getGroupHelper().selectGroup();
    applicationManager.getGroupHelper().initGroupModification();
    applicationManager.getGroupHelper().fillGroupForm(new GroupData("test1", "test2","test3"));
applicationManager.getGroupHelper().submitGroupModification();
    applicationManager.getNavigationHelper().gotoGroupPage();
  }
}
