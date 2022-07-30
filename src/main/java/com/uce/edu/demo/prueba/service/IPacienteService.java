package com.uce.edu.demo.prueba.service;

import com.uce.edu.demo.prueba.repository.modelo.Paciente;

public interface IPacienteService {
	
	public void insertar(Paciente paciente);

	public void actualizar(Paciente paciente);

	public void eliminar(Integer id);

	public Paciente buscarId(Integer id);
	
	public Paciente buscarCedula(String cedula);


}
