package com.ista.CarMant.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.CarMant.models.dao.IMantenimientoDao;
import com.ista.CarMant.models.entity.Mantenimientos;

@Service
public class MantenimientoServicelmpl implements IMantenimientoService{

	@Autowired
	private IMantenimientoDao MantenimientoDao;
	@Override
	@Transactional (readOnly = true)
	public List<Mantenimientos> finAll() {
		return (List<Mantenimientos>) MantenimientoDao.findAll();
	}
	
	@Override
	@Transactional
	public Mantenimientos save(Mantenimientos mantenimientos) {
		// TODO Auto-generated method stub
		return MantenimientoDao.save(mantenimientos);
	}
	
	@Override
	@Transactional (readOnly= true)
	public Mantenimientos FindById(Long id) {
		// TODO Auto-generated method stub
		return MantenimientoDao.findById(id).orElse(null);
	}
	
	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		MantenimientoDao.deleteById(id);
	}
	
}