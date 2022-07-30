package com.uce.edu.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.uce.edu.demo.prueba.repository.modelo.CitaMedica;
import com.uce.edu.demo.prueba.repository.modelo.CitaMedicaSencilla;
import com.uce.edu.demo.prueba.repository.modelo.Doctor;
import com.uce.edu.demo.prueba.repository.modelo.Paciente;
import com.uce.edu.demo.prueba.service.ICitaMedicaService;
import com.uce.edu.demo.prueba.service.IDoctorService;
import com.uce.edu.demo.prueba.service.IGestorCitaService;
import com.uce.edu.demo.prueba.service.IPacienteService;

@SpringBootApplication
public class PruebaU2KaApplication implements CommandLineRunner {
	
	private static final Logger log = Logger.getRootLogger();
	
	@Autowired
	private IDoctorService iDoctorService;
	
	@Autowired
	private IPacienteService iPacienteService;
	
	@Autowired
	private IGestorCitaService iGestorCitaService;
	
	@Autowired
	private ICitaMedicaService iCitaMedicaService;

	public static void main(String[] args) {
		SpringApplication.run(PruebaU2KaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		//ingreso de 2 Doctores
		Doctor doc = new Doctor();
		doc.setNombre("Xavier");
		doc.setApellido("Aguilar");
		doc.setCedula("17245456");
		doc.setFechaNacimiento(LocalDateTime.of(1990, 5, 8, 12, 0));
		doc.setNumeroConsultorio("14D");
		doc.setSalario(new BigDecimal(4000));
		doc.setTitulo("Nefrologo");
		
		//this.iDoctorService.insertar(doc);
		
		Doctor doc1 = new Doctor();
		doc1.setNombre("Pedro");
		doc1.setApellido("Pablo");
		doc1.setCedula("54561651");
		doc1.setFechaNacimiento(LocalDateTime.of(1980, 3, 4, 3, 0));
		doc1.setNumeroConsultorio("3B");
		doc1.setSalario(new BigDecimal(3500));
		doc1.setTitulo("Medico General");
		
		this.iDoctorService.insertar(doc1);
		
		//ingresar 2 pacientes
		Paciente pac = new Paciente();
		pac.setNombre("Domenica");
		pac.setApellido("Albuja");
		pac.setCedula("15641651");
		pac.setCodigoIess("1234444");
		pac.setEstatura("180 cm");
		pac.setFechaNacimiento(LocalDateTime.of(2000, 2, 6, 8, 0));
		pac.setGenero("F");
		pac.setPeso("66 kg");
		
		//this.iPacienteService.insertar(pac);
		
		Paciente pac1 = new Paciente();
		pac1.setNombre("David");
		pac1.setApellido("Velasco");
		pac1.setCedula("789454");
		pac1.setCodigoIess("32322");
		pac1.setEstatura("160 cm");
		pac1.setFechaNacimiento(LocalDateTime.of(2002, 4, 12, 6, 0));
		pac1.setGenero("M");
		pac1.setPeso("80 kg");
		
		//this.iPacienteService.insertar(pac1);
		
		//agendar cita
		//this.iGestorCitaService.agendar("12", LocalDateTime.now(), new BigDecimal(30), "El centro", "15641561561", "789454");
		
		//actualizar cita medica
		//this.iGestorCitaService.actualizar("12", "Dolor de garganta, posible caso de COVID", "Paracetamol", LocalDateTime.now());
		
//		List<CitaMedicaSencilla> listaCitas = this.iCitaMedicaService.reporte(LocalDateTime.of(2022, 07, 29, 18, 0), new BigDecimal(20));
//		for(CitaMedicaSencilla cita : listaCitas) {
//			log.info("Las citas son: "+cita);
//		}
		
	}

}
