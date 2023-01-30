package service.impl;

import model.MyProduct;
import model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class ProductServiceImpl {
    List<String> bookList = new ArrayList<>();
    List<String> musicList = new ArrayList<>();
    List<String> movieList = new ArrayList<>();

    public ProductServiceImpl() {
      bookList.add("book1");
      bookList.add("book2");
      bookList.add("book3");

      musicList.add("music1");
      musicList.add("music2");
      musicList.add("music3");

      movieList.add("movie1");
      movieList.add("movie2");
      movieList.add("movie3");
    }

    public List<String> getProductCategories() {
        List<String> categories = new ArrayList<>();
        categories.add("Books");
        categories.add("Music");
        categories.add("Movies");
        return categories;
    }

    public List<String> getProduct(String category) {
        switch (category.toLowerCase()){
            case "books":
                return bookList;
            case "music":
                return musicList;
            case "movies":
                return movieList;
            default:
                return null;
        }
    }

    public boolean addProduct(String category,String newProduct){
       List<String> products = getProduct(category);
       if(products == null)
           return false;
       products.add(newProduct);
       return true;
    }

    public List<Product> getProductsV2(String category){
        List<Product> products = new ArrayList<>();
        products.add(new Product("Java Brains Book","1234",9999.99));
        products.add(new Product("Another Book","ABC",12.50));
        return products;
    }

    public List<MyProduct> getMyProducts(String category) {

        List<MyProduct> books = new ArrayList<>();
        books.add(new MyProduct("Java","123",1));
        books.add(new MyProduct("C#","234",2));
        books.add(new MyProduct("JavaScript","456",3));
        books.add(new MyProduct("TypeScript","567",4));
        switch (category) {
            case "books":
                return books;
            default:
                return new ArrayList<>();
        }
    }
}
