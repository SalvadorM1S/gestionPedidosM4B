package com.ista.CarMant.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ista.CarMant.models.entity.Clientes;
import com.ista.CarMant.models.services.IClientesService;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api")
public class ClientesRestController {

	@Autowired
	private IClientesService clienteservice;

	// listar todos los clientes
	@GetMapping("/clientes")
	public List<Clientes> index() {
		return clienteservice.finAll();
	}

	// buscar un cliente por id
	@GetMapping("/clientes/{id}")
	public Clientes show(@PathVariable Long id) {
		return clienteservice.FindById(id);
	}

	// Guardar un cliente
	@PostMapping("/clientes")
	@ResponseStatus(HttpStatus.CREATED)
	public Clientes create(@RequestBody Clientes cliente) {
		return clienteservice.save(cliente);
	}
/*
	// Editar un cliente
	@PutMapping("/clientes/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Clientes update(@RequestBody Clientes cliente, @PathVariable Long id) {
		Clientes clienteActual = clienteservice.FindById(id);
		clienteActual.setApellido_cliente(cliente.getApellido_cliente());
		clienteActual.setNombre_cliente(cliente.getNombre_cliente());
		clienteActual.setCelular_cliente(cliente.getCelular_cliente());
		clienteActual.setDireccion_cliente(cliente.getDireccion_cliente());
		clienteActual.setTelefono_cliente(cliente.getTelefono_cliente());

		return clienteservice.save(clienteActual);
	}*/

	// eliminar un cliente
	@DeleteMapping("/clientes/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		clienteservice.delete(id);
	}

}
