package orders;

import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = {"customerNr", "street", "town", "name", "postCode"})
public class Customer {

    private int customerNr;
    private String street;
    private String town;
    private String name;
    private String postCode;



    public  Customer(){

    }

    public Customer(int customerNr, String street, String town, String name, String postCode) {
        this.customerNr = customerNr;
        this.street = street;
        this.town = town;
        this.name = name;
        this.postCode = postCode;
    }

    public int getCustomerNr() {
        return customerNr;
    }

    public void setCustomerNr(int customerNr) {
        this.customerNr = customerNr;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }
}
