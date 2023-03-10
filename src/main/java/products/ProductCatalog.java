package products;

import model.Book;
import model.Product;
import service.ProductCatalogService;
import service.impl.BookServiceImpl;
import service.impl.ProductServiceImpl;

import javax.jws.WebMethod;
import javax.jws.WebService;

import java.util.Arrays;
import java.util.List;
/*
@WebService(endpointInterface = "service.ProductCatalogService"
        ,portName = "TestMartCatalogPort"
        ,serviceName = "myProductService")

 */
@WebService(name="NAME",
            portName = "portNameTest",
            serviceName = "serviceNameTest",
            targetNamespace = "www.hicode.net")
public class ProductCatalog implements ProductCatalogService {

    ProductServiceImpl productService = new ProductServiceImpl();
    BookServiceImpl bookService = new BookServiceImpl();

    public ProductCatalog() {
    }

    @WebMethod(exclude = true)
    public List<String> excludeWebService() {
        return Arrays.asList("Hello", "world");
    }
    @Override
    @WebMethod(action = "fetch_product_categories",
               operationName = "fetchProductCategories")
    public List<String> getProductCategories(){
        System.out.println("getProductCategories");
        return productService.getProductCategories();
    }

    @Override
    @WebMethod
    public List<String> getProducts(String category){
        return productService.getProduct(category);
    }

    @Override
    @WebMethod
    public boolean addProduct(String category, String product){
        return productService.addProduct(category,product);
    }

    @Override
    @WebMethod
    public Book bookIsAvailable(Book book){
        return bookService.bookIsAvailable(book);
    }

    @Override
    @WebMethod
    public List<Product> getProductV2(String category){
        return productService.getProductsV2(category);
    }
}
