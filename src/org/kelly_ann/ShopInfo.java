package org.kelly_ann;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
//note the standard style is "DOCUMENT" which is for more complex type uses.  
// the "RPC" type is for simpler uses and is more human-readable.
@SOAPBinding(style=Style.DOCUMENT) 
public class ShopInfo {
	
	@WebMethod
	@WebResult(partName="lookupOutput")
	
	// due to the "throws Exception" being added to the declaration a <fault> tag will be added to the generated WSDL.
	public String getShopInfo(@WebParam(partName="lookupInput") String property) throws InvalidInputException {
		String response = null;
		if ("shopName".equals(property)) {
			response = "Test Mart";
		}
		else if ("since".equals(property)) {
			response = "since 2015";
		}
		else {
			throw new InvalidInputException("Invalid Input", property + " is not a valid input.");
		}
		return response;
	}
	
}
