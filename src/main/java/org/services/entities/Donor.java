package org.services.entities;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Donor {

	private long donorId;
	private long handPhone;
	private String donorName;
	private String email;

	private Address address;

	static Logger log = Logger.getLogger("WebPortal");

	public Donor() {
		super();
		log.debug("Donor Instance Created");
	}

	public Donor(long donorId, long handPhone, String donorName, String email, Address address) {
		super();
		this.donorId = donorId;
		this.handPhone = handPhone;
		this.donorName = donorName;
		this.email = email;
		this.address = address;

		log.debug("Donor Instance With Contructor Values Created");
	}

	public long getDonorId() {
		return donorId;
	}

	public void setDonorId(long donorId) {
		this.donorId = donorId;
	}

	public long getHandPhone() {
		return handPhone;
	}

	public void setHandPhone(long handPhone) {
		this.handPhone = handPhone;
	}

	public String getDonorName() {
		return donorName;
	}

	public void setDonorName(String donorName) {
		this.donorName = donorName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Donor [donorId=" + donorId + ", handPhone=" + handPhone + ", donorName=" + donorName + ", email="
				+ email + ", address=" + address + "]";
	}

}
