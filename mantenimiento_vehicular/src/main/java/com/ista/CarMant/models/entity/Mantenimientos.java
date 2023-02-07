package com.ista.CarMant.models.entity;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

//
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//http://localhost:8080/swagger-ui.html 
//para abrir la interfaz de swagger

@Entity
@Table(name = "mantenimientos", uniqueConstraints = {@UniqueConstraint(columnNames = {"id_vehiculo","id_reparacion"})})
public class Mantenimientos implements Serializable {
//
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_reparacion;
	
	@Column
	private String descripcion_reparacion;

	@Column(name="fecha_entrada")
	@Temporal(TemporalType.DATE)
	private Date fecha_entrada;

	@Column(name="fecha_salida")
	@Temporal(TemporalType.DATE)
	private Date fecha_salida;
	
	private String horas_mantenimiento;

	public Long getId_reparacion() {
		return id_reparacion;
	}

	public void setId_reparacion(Long id_reparacion) {
		this.id_reparacion = id_reparacion;
	}

	public String getDescripcion_reparacion() {
		return descripcion_reparacion;
	}

	public void setDescripcion_reparacion(String descripcion_reparacion) {
		this.descripcion_reparacion = descripcion_reparacion;
	}

	public Date getFecha_entrada() {
		return fecha_entrada;
	}

	public void setFecha_entrada(Date fecha_entrada) {
		this.fecha_entrada = fecha_entrada;
	}

	public Date getFecha_salida() {
		return fecha_salida;
	}

	public void setFecha_salida(Date fecha_salida) {
		this.fecha_salida = fecha_salida;
	}

	public String getHoras_mantenimiento() {
		return horas_mantenimiento;
	}

	public void setHoras_mantenimiento(String horas_mantenimiento) {
		this.horas_mantenimiento = horas_mantenimiento;
	}
	
	
}
