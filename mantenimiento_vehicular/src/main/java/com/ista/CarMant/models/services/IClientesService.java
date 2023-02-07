package com.ista.CarMant.models.services;

import java.util.List;

import com.ista.CarMant.models.entity.Clientes;

public interface IClientesService {

	public List<Clientes> finAll();

	public Clientes save(Clientes cliente);

	public Clientes FindById(Long id);

	public void delete(Long id);

}
