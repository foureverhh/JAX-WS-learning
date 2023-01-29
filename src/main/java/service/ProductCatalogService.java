package service;

import model.Book;
import model.Product;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;
@WebService//(name="TestMartCatalog",targetNamespace = "www.hicode.net")
public interface ProductCatalogService {
    @WebMethod(action = "fetch_categories", operationName = "fetchCategories")
    List<String> getProductCategories();

    @WebMethod(exclude = false)
    List<String> getProducts(String category);

    @WebMethod(exclude = false)
    boolean addProduct(String category, String product);

    @WebMethod(exclude = false)
    Book bookIsAvailable(Book book);

    @WebMethod
    List<Product> getProductV2(String category);
}
