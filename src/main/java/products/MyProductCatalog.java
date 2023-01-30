package products;

import model.MyProduct;
import service.impl.ProductServiceImpl;

import javax.jws.WebService;
import java.util.List;


@WebService(endpointInterface = "products.MyProductCatalogInterface")
public class MyProductCatalog implements MyProductCatalogInterface {

    ProductServiceImpl productService = new ProductServiceImpl();

    public MyProductCatalog() {
    }

    @Override
    public List<String> getProductCategories(){
        System.out.println("getProductCategories");
        return productService.getProductCategories();
    }

    @Override
    public List<String> getProducts(String category){
        return productService.getProduct(category);
    }


    @Override
    public boolean addProduct(String category, String product){
        return productService.addProduct(category,product);
    }


    @Override
    public List<MyProduct> getMyProducts(String category){
        return productService.getMyProducts(category);
    }
}
