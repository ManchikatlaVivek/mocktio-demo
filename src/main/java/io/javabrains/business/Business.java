package io.javabrains.business;

import java.util.List;

import io.javabrains.data.BusinessData;

public class Business {

	private BusinessData businessData;

	public BusinessData getBusinessData() {
		return businessData;
	}

	public void setBusinessData(BusinessData businessData) {
		this.businessData = businessData;
	}
	
	public List<String> getResults(){
		return businessData.getList();
	}
	
}
