package com.ista.CarMant.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.ista.CarMant.models.entity.Vehiculo;

public interface IVehiculoDao extends CrudRepository<Vehiculo, Long>{

}
