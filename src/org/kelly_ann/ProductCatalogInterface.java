package org.kelly_ann;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import org.kelly_ann.model.Product;

// this is the Service Endpoint Interface (SEI)

// note the annotations belong in the INTERFACE vs. in the classes. even though they can be put into the class.
// it is another way of de-coupling the wsdl from our actual implementation.

@WebService(name="TestMartCatalog", targetNamespace="http://kelly-ann.org")
public interface ProductCatalogInterface {
	
	@WebMethod(action="fetch_categories", operationName="fetchCategories")
	public abstract List<String> getProductCategories();

	@WebMethod
	public abstract List<String> getProducts(String category);

	@WebMethod
	public abstract boolean addProduct(String category, String product);

	@WebMethod
	@WebResult(name="Product")
	public abstract List<Product> getProductsv2(String category);

}
