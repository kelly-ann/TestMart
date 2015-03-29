package org.kelly_ann;

import java.util.List;

import javax.jws.WebService;

import org.kelly_ann.business.ProductServiceImpl;
import org.kelly_ann.model.Product;


/** How the WSDL is auto-generated:
* When the @WebService is seen a the class level it creates a <service> and a <port> in the WSDL.
* The port has bindings that tell how the service will get called (e.g. via the http protocol).
* Inside the port it will create <operation>'s for each method marked with the @WebMethod tag.
* The method name will be the same as the operation name.
* Regardless of whether the method takes input args or not it will create 2 <message>'s (i.e. 1 for 
* the input and 1 for the output) for each method.
* Finally, each message will have <types> defined based on the input (args) or the output (return type).
* These <types> are defined in a linked schema file (via an <import>) or within the wsdl itself based on the 
* "@SOAPBinding" annotation's "style" property being set to "Style.DOCUMENT" (for more complex types that 
* may be nested within a class or "Style.RPC" (for simpler types).
**/

// need to give it the fully qualified name of the endpointInterface
// note!  the portname and the serviceName must be listed in the implementation class not in the service endpoint interface.
@WebService(endpointInterface="org.kelly_ann.ProductCatalogInterface", portName="TestMartCatalogPort", 
			serviceName="TestMartCatalogService")
public class ProductCatalog implements ProductCatalogInterface {
	
	ProductServiceImpl productService = new ProductServiceImpl();
	
	// the @WebMethod tag below is unnecessary b/s once you create the @WebService tag, Java assumes that  
	// all public methods need to be an operation on the webservice.
	
	/* (non-Javadoc)
	 * @see org.kelly_ann.ProductCatalogInterface#getProductCategories()
	 */
	@Override
	public List<String> getProductCategories() {
		return productService.getProductCategories();
	}
	
	/* (non-Javadoc)
	 * @see org.kelly_ann.ProductCatalogInterface#getProducts(java.lang.String)
	 */
	@Override
	public List<String>	getProducts(String category) {
		return productService.getProducts(category);
	}
	
	/* (non-Javadoc)
	 * @see org.kelly_ann.ProductCatalogInterface#addProduct(java.lang.String, java.lang.String)
	 */
	@Override
	public boolean addProduct(String category, String product) {
		return productService.addProduct(category, product);
	}
	
	/* (non-Javadoc)
	 * @see org.kelly_ann.ProductCatalogInterface#getProductsv2(java.lang.String)
	 */
	@Override
	public List<Product> getProductsv2(String category) {
		return productService.getProductsv2(category);
	}
}
