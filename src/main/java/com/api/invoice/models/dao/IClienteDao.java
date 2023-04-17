package com.api.invoice.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.api.invoice.models.entities.Cliente;

public interface IClienteDao extends CrudRepository<Cliente,Long> {

	
	
}
