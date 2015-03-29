package org.kelly_ann.model;

// JAXB annotations
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlElement;

// JAXB annotations --> Why called JAXB? - stands for Java Architecture for XML Binding (JAXB).
@XmlRootElement(name="Product")
@XmlType(propOrder={"price", "sku", "name"})
public class Product {
	
	private String name;
	private String sku;
	private double price;
	
	// ** constructors **
	// NOTE! this no-arg constructor is needed so that JAXB can instantiate an empty Product object that 
	// it will add to if XML to Java conversion is requested.
	public Product() {
		
	}
	
	public Product(String name, String sku, double price) {
		this.name = name;
		this.price = price;
		this.sku = sku;
	}
	
	// ** methods **
	@XmlElement(name="ProductName")
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSku() {
		return sku;
	}
	
	public void setSku(String sku) {
		this.sku = sku;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
}
