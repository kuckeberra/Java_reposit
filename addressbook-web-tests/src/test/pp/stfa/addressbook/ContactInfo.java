package pp.stfa.addressbook;

public class ContactInfo {
  private final String name;
  private final String lastname;
  private final String phone;
  private final String email;

  public ContactInfo(String name, String lastname, String phone, String email) {
    this.name = name;
    this.lastname = lastname;
    this.phone = phone;
    this.email = email;
  }

  public String getName() {
    return name;
  }

  public String getLastname() {
    return lastname;
  }

  public String getPhone() {
    return phone;
  }

  public String getEmail() {
    return email;
  }
}
