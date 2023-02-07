package com.ista.CarMant.models.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


@Entity
@Table(name = "vehiculo", uniqueConstraints = {@UniqueConstraint(columnNames = {"id_cliente","matricula_vehiculo"})})
public class Vehiculo implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Long id_cliente;
	
	private String marca_vehiculo;
	private String modelo_vehiculo;
	private String color_vehiculo;
	@Column(unique = true)
	private String matricula_vehiculo;
	
	private int kilometraje_vehiculo;
	
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name="id_vehiculo")
	private List<Mantenimientos> mantenimiento;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(Long id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getMarca_vehiculo() {
		return marca_vehiculo;
	}

	public void setMarca_vehiculo(String marca_vehiculo) {
		this.marca_vehiculo = marca_vehiculo;
	}

	public String getModelo_vehiculo() {
		return modelo_vehiculo;
	}

	public void setModelo_vehiculo(String modelo_vehiculo) {
		this.modelo_vehiculo = modelo_vehiculo;
	}

	public String getColor_vehiculo() {
		return color_vehiculo;
	}

	public void setColor_vehiculo(String color_vehiculo) {
		this.color_vehiculo = color_vehiculo;
	}

	public int getKilometraje_vehiculo() {
		return kilometraje_vehiculo;
	}

	public void setKilometraje_vehiculo(int kilometraje_vehiculo) {
		this.kilometraje_vehiculo = kilometraje_vehiculo;
	}

	public String getMatricula_vehiculo() {
		return matricula_vehiculo;
	}

	public void setMatricula_vehiculo(String matricula_vehiculo) {
		this.matricula_vehiculo = matricula_vehiculo;
	}

}
