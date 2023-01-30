package products;

import model.MyProduct;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;
@WebService(name="portTypeName",
        portName = "portNameTest",
        serviceName = "MyProductsService",
        targetNamespace = "www.hicode.net")
public interface MyProductCatalogInterface {
    @WebMethod(action = "fetch_product_categories",
            operationName = "fetchProductCategories")
    List<String> getProductCategories();

    @WebMethod
    List<String> getProducts(String category);

    @WebMethod
    boolean addProduct(String category, String product);

    @WebMethod
    List<MyProduct> getMyProducts(String category);
}