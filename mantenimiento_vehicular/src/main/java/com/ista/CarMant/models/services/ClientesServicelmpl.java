package com.ista.CarMant.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.CarMant.models.dao.IClientesDao;
import com.ista.CarMant.models.entity.Clientes;

@Service
public class ClientesServicelmpl implements IClientesService{

	@Autowired
	private IClientesDao ClienteDao;
	@Override
	@Transactional (readOnly = true)
	public List<Clientes> finAll() {
		return (List<Clientes>) ClienteDao.findAll();
	}
	
	@Override
	@Transactional
	public Clientes save(Clientes cliente) {
		// TODO Auto-generated method stub
		return ClienteDao.save(cliente);
	}
	
	@Override
	@Transactional (readOnly= true)
	public Clientes FindById(Long id) {
		// TODO Auto-generated method stub
		return ClienteDao.findById(id).orElse(null);
	}
	
	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		ClienteDao.deleteById(id);
	}
	
}
