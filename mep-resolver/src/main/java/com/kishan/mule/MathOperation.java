package com.kishan.mule;

public class MathOperation {

	public String power(String value){
		return String.valueOf(Math.pow(Double.valueOf(value),2));
	}
	
	public String squareRoot(String value) {
        return String.valueOf(Math.sqrt(Double.valueOf(value)));
	}

}
