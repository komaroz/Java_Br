package ua.stqa.pft.addressbook.appmanager;


import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class AppcationManager {
  FirefoxDriver wd;

  private SessionHelper sessionHelper;
  private NavigationHelper navigationHelper;
  private GroupsHelper groupsHelper;

  public void init() {
    System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.11.1-win64\\geckodriver.exe");
    wd = new FirefoxDriver();
    wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    wd.get("http://localhost/addressbook/group.php");
    groupsHelper = new GroupsHelper(wd);
    navigationHelper = new NavigationHelper(wd);
    sessionHelper = new SessionHelper(wd);
    sessionHelper.login("admin", "secret");
  }

    public void stop() {
    wd.quit();
  }

  public GroupsHelper getGroupsHelper() {
    return groupsHelper;
  }

  public NavigationHelper getNavigationHelper() {
    return navigationHelper;
  }
}
