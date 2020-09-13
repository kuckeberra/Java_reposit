package com.example.tests;

import org.testng.annotations.*;
import ru.stqa.addressbook.tests.TestBase;

public class GroupDeletionTest extends TestBase {

  @Test
  public void testGroupDeletion() throws Exception {
   applicationManager.getNavigationHelper().gotoGroupPage();
    applicationManager.getGroupHelper().selectGroup();
    applicationManager.getGroupHelper().deleteGroup();
   applicationManager.getNavigationHelper().gotoGroupPage();
  }


}
