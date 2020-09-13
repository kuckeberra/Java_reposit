package com.example.tests;

import org.testng.annotations.*;
import ru.stqa.addressbook.tests.TestBase;

public class GroupDeletionTest extends TestBase {

  @Test
  public void testGroupDeletion() throws Exception {
   applicationManager.gotoGroupPage();
    applicationManager.selectGroup();
    applicationManager.deleteGroup();
   applicationManager.gotoGroupPage();
  }


}
