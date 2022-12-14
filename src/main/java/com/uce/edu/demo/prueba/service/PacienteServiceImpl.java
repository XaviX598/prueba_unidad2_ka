
package com.uce.edu.demo.prueba.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.prueba.repository.IPacienteRepository;
import com.uce.edu.demo.prueba.repository.modelo.Paciente;

@Service
public class PacienteServiceImpl implements IPacienteService{
	
	@Autowired
	private IPacienteRepository iPacienteRepository;

	@Override
	public void insertar(Paciente paciente) {
		// TODO Auto-generated method stub
		this.iPacienteRepository.insertar(paciente);
	}

	@Override
	public void actualizar(Paciente paciente) {
		// TODO Auto-generated method stub
		this.iPacienteRepository.actualizar(paciente);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.iPacienteRepository.eliminar(id);
	}

	@Override
	public Paciente buscarId(Integer id) {
		// TODO Auto-generated method stub
		return this.iPacienteRepository.buscarId(id);
	}

	@Override
	public Paciente buscarCedula(String cedula) {
		// TODO Auto-generated method stub
		return this.iPacienteRepository.buscarCedula(cedula);
	}
	
	
	

}
