/*
    * The code used in this class will presume that
    * if the user has two street addresses they're still in the same zip-
    * code. Although this is improbable it makes it easier.
 */
package Arbeidskrav001;

public class Address {
    private String street1, street2, city, state, zip;

    public Address(String street1, String street2, String zip, String city, String state) {
        this.street1 = street1;
        this.street2 = street2;
        this.zip = zip;
        this.city = city;
        this.state = state;
    }

    public Address(String street1, String zip, String city, String state) {
        this.street1 = street1;
        this.zip = zip;
        this.city = city;
        this.state = state;
    }

    public String toString() {
        if (street2 != null) {
            return street1 + ", " + zip + " " + city + ", " + state;
        } else {
            return street1 + "\n" + street2 + ", " + zip + " " + city + ", " + state;
        }
    }
}
