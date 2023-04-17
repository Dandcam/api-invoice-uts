package com.api.invoice.models.services;

import java.util.List;

import com.api.invoice.models.entities.Cliente;

public interface IClienteService {
	
	public List<Cliente>findAll();
	public Cliente findById (long id);
	public Cliente save (Cliente cliente);
	public void delete (Cliente cliente);	

}
