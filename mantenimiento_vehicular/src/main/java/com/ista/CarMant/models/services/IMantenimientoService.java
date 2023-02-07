package com.ista.CarMant.models.services;

import java.util.List;

import com.ista.CarMant.models.entity.Mantenimientos;

public interface IMantenimientoService {
	
	public List<Mantenimientos> finAll();

	public Mantenimientos save(Mantenimientos mantenimiento);

	public Mantenimientos FindById(Long id);

	public void delete(Long id);
}
