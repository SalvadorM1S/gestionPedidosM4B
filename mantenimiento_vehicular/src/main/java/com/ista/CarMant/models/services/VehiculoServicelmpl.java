package com.ista.CarMant.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.CarMant.models.dao.IVehiculoDao;
import com.ista.CarMant.models.entity.Vehiculo;

@Service
public class VehiculoServicelmpl implements IVehiculoService{

	@Autowired
	private IVehiculoDao VehiculoDao;
	@Override
	@Transactional (readOnly = true)
	public List<Vehiculo> finAll() {
		return (List<Vehiculo>) VehiculoDao.findAll();
	}
	
	@Override
	@Transactional
	public Vehiculo save(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		return VehiculoDao.save(vehiculo);
	}
	
	@Override
	@Transactional (readOnly= true)
	public Vehiculo FindById(Long id) {
		// TODO Auto-generated method stub
		return VehiculoDao.findById(id).orElse(null);
	}
	
	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		VehiculoDao.deleteById(id);
	}
	
}

