package model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "ProductInfo")
@XmlType(propOrder={"price","regNum","name"})
public class Product {

    private String name;
    private String regNum;
    private double price;

    public Product() {
    }

    public Product(String name, String regNum, double price) {
        this.name = name;
        this.regNum = regNum;
        this.price = price;
    }
    @XmlElement(name="ProductName")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(name = "RegistrationNumber")
    public String getRegNum() {
        return regNum;
    }

    public void setRegNum(String regNum) {
        this.regNum = regNum;
    }

    @XmlElement(name = "price")
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
