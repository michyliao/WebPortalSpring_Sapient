package org.services.daos;

import java.io.Serializable;
import java.util.List;

import org.services.entities.Address;
import org.services.ifaces.MyDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

@Component
public class AddressDao implements MyDao<Address> {

	@Autowired
	private HibernateTemplate template;

	public Object add(Address object) {
		Object key = template.save(object);

		return key;
	}

	public Address find(Serializable key) {
		String sql = "select  *from Donor where donorId=?";

		Address address = (Address) template.find(sql, key);
		return address;
	}

	public List<Address> findAll() {
		String sql = "Select * from Donor";
		List<Address> list = (List<Address>) template.find(sql);
		return list;
	}

}
