package com.uce.edu.demo.prueba.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public interface IGestorCitaService {
	
	public void agendar(String numeroTurno, LocalDateTime fechaCita, BigDecimal costoCita, String lugarCita, String cedulaDoctor, String cedulaPaciente);
	
	public void actualizar(String numeroTurno, String diagnostico, String receta, LocalDateTime fechaControl);
	
	
	

}
