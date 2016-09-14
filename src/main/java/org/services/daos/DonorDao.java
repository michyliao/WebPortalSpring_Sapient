package org.services.daos;

import java.io.Serializable;
import java.util.List;

import org.services.entities.Donor;
import org.services.ifaces.MyDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

@Component
public class DonorDao implements MyDao<Donor> {

	@Autowired
	private HibernateTemplate template;

	public Object add(Donor object) {
		Object key = template.save(object);

		return key;
	}

	public Donor find(Serializable key) {
		String sql = "select  *from Donor where donorId=?";

		Donor donor = (Donor) template.find(sql, key);
		return donor;
	}

	public List<Donor> findAll() {
		String sql = "Select * from Donor";
		List<Donor> list = (List<Donor>) template.find(sql);
		return list;
	}

}
