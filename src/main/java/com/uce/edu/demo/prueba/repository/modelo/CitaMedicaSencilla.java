package com.uce.edu.demo.prueba.repository.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class CitaMedicaSencilla implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String numero;
	
	private LocalDateTime fechaControl;
	
	private LocalDateTime fechaCita;
	
	private BigDecimal costoCita;
	
	public CitaMedicaSencilla() {
		// TODO Auto-generated constructor stub
	}

	public CitaMedicaSencilla(String numeroCita, LocalDateTime fechaControl, LocalDateTime fechaCita,
			BigDecimal costoCita) {
		
		this.numero = numeroCita;
		this.fechaControl = fechaControl;
		this.fechaCita = fechaCita;
		this.costoCita = costoCita;
	}
	//set y get
	public String getNumeroCita() {
		return numero;
	}

	public void setNumeroCita(String numeroCita) {
		this.numero = numeroCita;
	}

	public LocalDateTime getFechaControl() {
		return fechaControl;
	}

	public void setFechaControl(LocalDateTime fechaControl) {
		this.fechaControl = fechaControl;
	}

	public LocalDateTime getFechaCita() {
		return fechaCita;
	}

	public void setFechaCita(LocalDateTime fechaCita) {
		this.fechaCita = fechaCita;
	}

	public BigDecimal getCostoCita() {
		return costoCita;
	}

	public void setCostoCita(BigDecimal costoCita) {
		this.costoCita = costoCita;
	}
	
	
	
	

}
