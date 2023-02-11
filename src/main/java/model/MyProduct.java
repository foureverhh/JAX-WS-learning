package model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "Product")
@XmlType(propOrder = {"price", "sku", "name"})
public class MyProduct {
    private String name;
    private String sku;
    private double price;

    public MyProduct() {
    }

    public MyProduct(String name, String sku, double price) {
        this.name = name;
        this.sku = sku;
        this.price = price;
    }
    @XmlElement(name="productName")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }
    @XmlElement(defaultValue = "1.0", name = "purchasePrice")
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
