package ua.stqa.pft.addressbook.tests;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ua.stqa.pft.addressbook.appmanager.AppcationManager;

public class TestBase {

  public final AppcationManager app = new AppcationManager();

  @BeforeMethod
  public void setUp() throws Exception {
    app.init();
  }

  @AfterMethod
  public void tearDown() {
    app.stop();
  }

}
