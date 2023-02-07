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

import com.ista.CarMant.models.entity.Vehiculo;
import com.ista.CarMant.models.services.IVehiculoService;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api")
public class VehiculoRestController {

	@Autowired
	private IVehiculoService vehiculoservice;

	// listar todos los vehiculo
	@GetMapping("/vehiculo")
	public List<Vehiculo> index() {
		return vehiculoservice.finAll();
	}

	// buscar un vehiculo por id
	@GetMapping("/vehiculo/{id}")
	public Vehiculo show(@PathVariable Long id) {
		return vehiculoservice.FindById(id);
	}

	// Guardar un Vehiculo
	@PostMapping("/vehiculo")
	@ResponseStatus(HttpStatus.CREATED)
	public Vehiculo create(@RequestBody Vehiculo vehiculo) {
		return vehiculoservice.save(vehiculo);
	}

	// Editar un vehiculo
	@PutMapping("/vehiculo/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Vehiculo update(@RequestBody Vehiculo vehiculo, @PathVariable Long id) {
		Vehiculo vehiculoActual = vehiculoservice.FindById(id);
		vehiculoActual.setKilometraje_vehiculo(vehiculo.getKilometraje_vehiculo());
		vehiculoActual.setColor_vehiculo(vehiculo.getColor_vehiculo());
		vehiculoActual.setMarca_vehiculo(vehiculo.getMarca_vehiculo());
		vehiculoActual.setMatricula_vehiculo(vehiculo.getMatricula_vehiculo());
		vehiculoActual.setModelo_vehiculo(vehiculo.getModelo_vehiculo());

		return vehiculoservice.save(vehiculoActual);
	}

	// eliminar un vehiculo
	@DeleteMapping("/vehiculo/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		vehiculoservice.delete(id);
	}

}
