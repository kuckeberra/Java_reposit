package ru.stqa.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.addressbook.model.ContactData;

public class ContactHelper extends HelperBase{

  public ContactHelper(WebDriver wd) {
    super(wd);
  }

  public void submitContactCreation() {
    click(By.xpath("(//input[@name='submit'])[2]"));
  }

  public void fillContactForm(ContactData contactData) {

    type(By.name("firstname"),contactData.getFirstName());
    type(By.name("lastname"),contactData.getSecondName());
    type(By.name("mobile"),contactData.getPhone());
    type(By.name("email"),contactData.getEmail());
  }

  public void addNewContact() {
    click(By.linkText("add new"));
  }
}
