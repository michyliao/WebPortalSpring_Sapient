package org.services.daos;

import java.io.Serializable;
import java.util.List;

import org.services.entities.Donor;
import org.services.entities.Project;
import org.services.ifaces.MyDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

@Component
public class ProjectDao implements MyDao<Project> {

	@Autowired
	private HibernateTemplate template;

	public Object add(Project object) {
		Object key = template.save(object);

		return key;
	}

	public Project find(Serializable key) {
		String sql = "select  *from Project where projectId=?";

		Project project = (Project) template.find(sql, key);
		return project;
	}

	public List<Project> findAll() {
		String sql = "Select * from Project";
		List<Project> list = (List<Project>) template.find(sql);
		return list;
	}

}
