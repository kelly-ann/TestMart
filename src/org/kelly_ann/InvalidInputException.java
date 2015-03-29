package org.kelly_ann;



@SuppressWarnings("serial")
public class InvalidInputException extends Exception {
	
	private String errorDetails;
	
	public InvalidInputException(String reason, String errorDetails) {
		super(reason); // will be passed by the parent exception
		this.errorDetails = errorDetails;
	}
	
	public String getFaultInfo() {
		return errorDetails;		
	}
	
}
