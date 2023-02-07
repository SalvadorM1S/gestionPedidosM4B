package com.ista.CarMant.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.ista.CarMant.models.entity.Clientes;

public interface IClientesDao extends CrudRepository<Clientes, Long>{

}
