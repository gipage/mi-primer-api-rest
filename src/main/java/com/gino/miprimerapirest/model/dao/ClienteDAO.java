package com.gino.miprimerapirest.model.dao;

import ch.qos.logback.core.net.server.Client;
import com.gino.miprimerapirest.model.entity.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

//es extends pq hereda la funcionalidad de Spring data JPA CRUDRepository también
public interface ClienteDAO extends CrudRepository<Cliente,Integer> {
}
