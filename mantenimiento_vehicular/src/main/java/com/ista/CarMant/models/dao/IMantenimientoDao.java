package com.ista.CarMant.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.ista.CarMant.models.entity.Mantenimientos;

public interface IMantenimientoDao extends CrudRepository<Mantenimientos, Long>{

}
