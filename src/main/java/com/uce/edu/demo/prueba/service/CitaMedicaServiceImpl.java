package com.uce.edu.demo.prueba.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.prueba.repository.ICitaMedicaRepository;
import com.uce.edu.demo.prueba.repository.modelo.CitaMedica;
import com.uce.edu.demo.prueba.repository.modelo.CitaMedicaSencilla;

@Service
public class CitaMedicaServiceImpl implements ICitaMedicaService

{
	
	@Autowired
	private ICitaMedicaRepository iCitaMedicaRepository;

	@Override
	public void insertar(CitaMedica citaMedica) {
		// TODO Auto-generated method stub
		this.iCitaMedicaRepository.insertar(citaMedica);
	}

	@Override
	public void actualziar(CitaMedica citaMedica) {
		// TODO Auto-generated method stub
		this.iCitaMedicaRepository.actualziar(citaMedica);
	}

	@Override
	public List<CitaMedicaSencilla> reporte(LocalDateTime fechaCita, BigDecimal costo) {
		// TODO Auto-generated method stub
		return this.iCitaMedicaRepository.reporte(fechaCita, costo);
	}

}
