package org.services.ifaces;

import java.io.Serializable;
import java.util.List;

public interface MyDao<T> {
	
	public Object add(T object);
	public T find(Serializable key);
	public List<T> findAll();
}
