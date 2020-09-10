package ru.stqa.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import ru.stqa.addressbook.model.GroupData;

public class HelperBase {
  public WebDriver wd;

  public HelperBase(WebDriver wd) {
    this.wd = wd;
  }

  protected void click() {
    click(By.name("submit"));
  }

  protected void click(By locator) {
    wd.findElement(locator).click();
  }

  protected void type(GroupData groupData, By name) {
    type(name, groupData.getName());
  }

  protected void type(By name, String text) {
    click(name);
    wd.findElement(name).clear();
    wd.findElement(name).sendKeys(text);
  }
  public boolean isAlertPresent() {
    try {
      wd.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }
}
