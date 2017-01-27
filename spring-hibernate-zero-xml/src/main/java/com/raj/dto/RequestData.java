package com.raj.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RequestData {

	EmpDto requestData;
	
	@JsonProperty(required = true)
	public EmpDto getRequestData() {
		return requestData;
	}

	public void setRequestData(EmpDto requestData) {
		this.requestData = requestData;
	} 
	
}
