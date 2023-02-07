package com.ista.CarMant.models.services;

import java.util.List;

import com.ista.CarMant.models.entity.Vehiculo;

public interface IVehiculoService {

	public List<Vehiculo> finAll();

	public Vehiculo save(Vehiculo vehiculo);

	public Vehiculo FindById(Long id);

	public void delete(Long id);
	
}
