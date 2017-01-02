package ua.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ua.stqa.pft.addressbook.model.GroupData;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() {
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupsHelper().initGroupCreation();
    app.getGroupsHelper().fillGroupForm(new GroupData("Test1", "Test2", "Test3"));
    app.getGroupsHelper().submitGroupCreation();
    app.getGroupsHelper().returnToGroupPage();

  }

}
