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

import com.ista.CarMant.models.entity.Mantenimientos;
import com.ista.CarMant.models.services.IMantenimientoService;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api")
public class MantenimientoRestController {
	
	@Autowired
	private IMantenimientoService Mantenimientoservice;

	// listar todos los Mantenimientos
	@GetMapping("/mantenimientos")
	public List<Mantenimientos> index() {
		return Mantenimientoservice.finAll();
	}

	// buscar un Mantenimientos por id
	@GetMapping("/mantenimientos/{id}")
	public Mantenimientos show(@PathVariable Long id) {
		return Mantenimientoservice.FindById(id);
	}

	// Guardar un Mantenimientos
	@PostMapping("/mantenimientos")
	@ResponseStatus(HttpStatus.CREATED)
	public Mantenimientos create(@RequestBody Mantenimientos mantenimientos) {
		return Mantenimientoservice.save(mantenimientos);
	}

	// Editar un Mantenimientos
	@PutMapping("/mantenimientos/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Mantenimientos update(@RequestBody Mantenimientos mantenimientos, @PathVariable Long id) {
		Mantenimientos mantenimientoActual = Mantenimientoservice.FindById(id);
		mantenimientoActual.setDescripcion_reparacion(mantenimientos.getDescripcion_reparacion());
		mantenimientoActual.setFecha_entrada(mantenimientos.getFecha_entrada());
		mantenimientoActual.setFecha_salida(mantenimientos.getFecha_salida());
		mantenimientoActual.setHoras_mantenimiento(mantenimientos.getHoras_mantenimiento());

		return Mantenimientoservice.save(mantenimientoActual);
	}

	// eliminar un Mantenimientos
	@DeleteMapping("/mantenimientos/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		Mantenimientoservice.delete(id);
	}

}
