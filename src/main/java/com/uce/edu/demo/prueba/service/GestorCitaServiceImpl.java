package com.uce.edu.demo.prueba.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.prueba.repository.modelo.CitaMedica;
import com.uce.edu.demo.prueba.repository.modelo.CitaMedicaSencilla;
import com.uce.edu.demo.prueba.repository.modelo.Doctor;
import com.uce.edu.demo.prueba.repository.modelo.Paciente;

@Service
public class GestorCitaServiceImpl implements IGestorCitaService{
	
	@Autowired
	private IDoctorService iDoctorService;
	
	@Autowired
	private IPacienteService iPacienteService;
	
	@Autowired
	private ICitaMedicaService iCitaMedicaService;

	@Override
	public void agendar(String numeroTurno, LocalDateTime fechaCita, BigDecimal costoCita, String lugarCita,
			String cedulaDoctor, String cedulaPaciente) {
		// TODO Auto-generated method stub
		
		CitaMedica c = new CitaMedica();
		c.setNumero(numeroTurno);
		c.setFechaCita(fechaCita);
		c.setCostoCita(costoCita);
		c.setLugarCita(lugarCita);
		//voy a buscar el doctor por cedula la cual se ingresa en el main
		Doctor d = this.iDoctorService.buscarCedula(cedulaDoctor);
		c.setDoctor(d);
		Paciente p = this.iPacienteService.buscarCedula(cedulaPaciente);
		c.setPaciente(p);
		
		this.iCitaMedicaService.insertar(c);
		
	}

	@Override
	public void actualizar(String numeroTurno, String diagnostico, String receta, LocalDateTime fechaControl) {
		// TODO Auto-generated method stub
		CitaMedica c = new CitaMedica();
		c.setNumero(numeroTurno);
		c.setDiagnostico(diagnostico);
		c.setReceta(receta);
		c.setFechaControl(fechaControl);
		this.iCitaMedicaService.actualziar(c);
	}

	

}
