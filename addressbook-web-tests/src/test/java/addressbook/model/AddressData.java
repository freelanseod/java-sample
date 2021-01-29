package addressbook.model;

import java.util.Objects;

public class AddressData {
    private int id = Integer.MAX_VALUE;
    private String firstname;
    private String middlename;
    private String lastname;
    private String nickname;
    private String company;

//    public AddressData(String firstname, String middlename, String lastname, String nickname, String company) {
//        this.id =
//        this.firstname = firstname;
//        this.middlename = middlename;
//        this.lastname = lastname;
//        this.nickname = nickname;
//        this.company = company;
//    }
//
//    public AddressData(String firstname, String lastname) {
//        this.id = Integer.MAX_VALUE;
//        this.firstname = firstname;
//        this.lastname = lastname;
//    }
//
//    public AddressData(int id, String firstname, String lastname) {
//        this.id = id;
//        this.firstname = firstname;
//        this.lastname = lastname;
//    }

    public String getFirstname() {
        return firstname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public String getNickname() {
        return nickname;
    }

    public String getCompany() {
        return company;
    }

    public int getId() {
        return id;
    }

    public AddressData withId(int id) {
        this.id = id;
        return this;
    }

    public AddressData withFirstname(String firstname) {
        this.firstname = firstname;
        return this;
    }

    public AddressData withMiddlename(String middlename) {
        this.middlename = middlename;
        return this;
    }

    public AddressData withLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    public AddressData withNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }

    public AddressData withCompany(String company) {
        this.company = company;
        return this;
    }

    @Override
    public String toString() {
        return "AddressData{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddressData that = (AddressData) o;
        return Objects.equals(firstname, that.firstname) && Objects.equals(lastname, that.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname);
    }

}
