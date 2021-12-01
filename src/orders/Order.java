package orders;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.Date;

@XmlRootElement
@XmlType(propOrder = {"orderNr", "productCode","quantity", "description","salesPrice","customer","orderDate"})
public class Order {

    private int orderNr;
    private String productCode;
    private int quantity;
    private String description;
    private int salesPrice;
    private Customer customer;
    private Date orderDate;

    public Order(){

    }

    public Order(int orderNr, String productCode, int quantity, String description, int salesPrice, Customer customer, Date orderDate) {
        this.orderNr = orderNr;
        this.productCode = productCode;
        this.quantity = quantity;
        this.description = description;
        this.salesPrice = salesPrice;
        this.customer = customer;
        this.orderDate = orderDate;
    }

    public int getOrderNr() {
        return orderNr;
    }

    public void setOrderNr(int orderNr) {
        this.orderNr = orderNr;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(int salesPrice) {
        this.salesPrice = salesPrice;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
}
