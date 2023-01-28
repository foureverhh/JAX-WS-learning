package prodocts;

import prodocts.ProductCatalog;

import javax.xml.ws.Endpoint;

public class MartPublisher {
    public static void main(String[] args) {

        Endpoint.publish("http://localhost:8087/productCategory",new ProductCatalog());
        System.out.println("hello");
    }
}
