package com.example.tests;

import org.testng.annotations.*;
import ru.stqa.addressbook.model.GroupData;
import ru.stqa.addressbook.tests.TestBase;

public class GroupCreationTest extends TestBase {


  @Test
  public void testGroupCreation() throws Exception {

    applicationManager.getNavigationHelper().gotoGroupPage();
    applicationManager.getGroupHelper().initGroupCreation();
    applicationManager.getGroupHelper().fillGroupForm(new GroupData("test1", "test2", "test3"));
    applicationManager.getGroupHelper().submitGroupCreation();
    applicationManager.getNavigationHelper().gotoGroupPage();

  }

}
