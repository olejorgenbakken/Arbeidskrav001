/*
    * There's a control for if a person has two registered street addresses.
    * The code used in this class will presume that if the user has two street
    * addresses they're still in the same zip code.
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
        if (street2 == null || street2.length() == 0) {
            return street1 + ", " + zip + " " + city + ", " + state;
        } else {
            return street1 + " / " + street2 + ", " + zip + " " + city + ", " + state;
        }
    }
}
