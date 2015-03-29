package org.kelly_ann;

import javax.xml.ws.Endpoint;

// The purpose of this class is to deploy the web service so that it is available via my web browser without 
// me having to continually redeploy the application in my web container/application server (i.e. GlassFish, Tomcat, Jboss, etc.)
// how is this done? - the "Metro" library is really the one doing the work behind the scenes not the app server.
// "Metro" is a bundled library with the app server.
// Note: you know that it is using the "Metro" library vs. another lib b/c the comment at the very top of the WSDL says 
// "Published by ... Metro ..."

// limitations to this approach is that it is single-threaded; it can be made multi-threaded though.
// it is an approach used for Development scenario and is not recommended for a Production scenario.

public class TestMartPublisher {

	public static void main(String[] args) {
		// make sure to use a diff port than the ones your current app server(s) use.
		// also in the Console view make sure to stop the process so that the Endpoint thread stops publishing.
		// (this will automatically happen when you close Eclipse IDE)
		Endpoint.publish("http://localhost:1234/productcatalog", new ProductCatalog());
		
	}

}
