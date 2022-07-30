package com.uce.edu.demo.prueba.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.prueba.repository.modelo.CitaMedica;
import com.uce.edu.demo.prueba.repository.modelo.CitaMedicaSencilla;

public interface ICitaMedicaRepository {

	public void insertar(CitaMedica citaMedica);
	
	public void actualziar(CitaMedica citaMedica);
	
	public List<CitaMedicaSencilla> reporte(LocalDateTime fechaCita, BigDecimal costo);
}
