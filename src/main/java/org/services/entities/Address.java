package org.services.entities;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class Address {

	private long addressId;
	private String addressLine1;
	private String addressLine2;
	private String cityName;
	private long pinCode;
	
	static Logger log = Logger.getLogger("WebPortal");

	public Address() {
		super();
		
		log.debug("Address Instance Created");
	}

	public Address(String addressLine1, String addressLine2, String cityName, long pinCode, long addressId) {
		super();
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.cityName = cityName;
		this.pinCode = pinCode;
		this.addressId = addressId;
		
		log.debug("Address Instance Created with Constructor Values");
	}

	public long getAddressId() {
		return addressId;
	}

	public void setAddressId(long addressId) {
		this.addressId = addressId;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public long getPinCode() {
		return pinCode;
	}

	public void setPinCode(long pinCode) {
		this.pinCode = pinCode;
	}

	@Override
	public String toString() {
		return "Address [addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2 + ", cityName=" + cityName
				+ ", pinCode=" + pinCode + "]";
	}

}
