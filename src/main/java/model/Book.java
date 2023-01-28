package model;

public class Book {
    private String DNSI;
    private String name;

    public Book() {
    }

    public Book(String DNSI, String name) {
        this.DNSI = DNSI;
        this.name = name;
    }

    public String getDNSI() {
        return DNSI;
    }

    public void setDNSI(String DNSI) {
        this.DNSI = DNSI;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
