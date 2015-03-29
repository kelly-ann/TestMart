package org.kelly_ann.business;

import java.util.ArrayList;
import java.util.List;

import org.kelly_ann.model.Product;

public class ProductServiceImpl {
	List<String> bookList = new ArrayList<>();
	List<String> musicList = new ArrayList<>();
	List<String> moviesList = new ArrayList<>();
	
	public ProductServiceImpl() {
		bookList.add("Inferno");
		bookList.add("JoyLand");
		bookList.add("The Game of Thrones");
		
		musicList.add("Random Access Memories");
		musicList.add("Night Visions");
		musicList.add("Unorthodox Jukebox");
		
		moviesList.add("Oz the Great and Powerful");
		moviesList.add("Despicable Me");
		moviesList.add("Star Trek Into Darkness");
	}
	
	public List<String> getProductCategories() {
		List<String> categories = new ArrayList<>();
		categories.add("Books");
		categories.add("Music");
		categories.add("Movies");
		return categories;
	}
	
	public List<String> getProducts(String category) {
		switch(category.toLowerCase()) {
			case "books":
				return bookList;
			case "music":
				return musicList;
			case "movies":
				return moviesList;
		}
		return null;
	}
	
	public boolean addProduct(String category, String product) {
		switch(category.toLowerCase()) {
			case "books":
				bookList.add(product);
				break;
			case "music":
				musicList.add(product);
				break;
			case "movies":
				moviesList.add(product);
				break;
			default:
				return false;
		}
		return true;
	}

	public List<Product> getProductsv2(String category) {
		List<Product> productList = new ArrayList<>();
		productList.add(new Product("Java Brains Book", "1234", 999999.99));
		productList.add(new Product("Another Book", "ABC", 12.50));
		return productList;
	}
}

