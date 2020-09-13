package ru.stqa.addressbook.model;

public class ContactData {
  private final String firstName;
  private final String secondName;
  private final String phone;
  private final String email;

  public ContactData(String firstName, String secondName, String phone, String email) {
    this.firstName = firstName;
    this.secondName = secondName;
    this.phone = phone;
    this.email = email;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getSecondName() {
    return secondName;
  }

  public String getPhone() {
    return phone;
  }

  public String getEmail() {
    return email;
  }
}
