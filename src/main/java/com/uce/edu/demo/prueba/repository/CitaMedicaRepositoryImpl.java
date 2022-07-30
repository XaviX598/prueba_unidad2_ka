package com.uce.edu.demo.prueba.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.prueba.repository.modelo.CitaMedica;
import com.uce.edu.demo.prueba.repository.modelo.CitaMedicaSencilla;

@Repository
@Transactional
public class CitaMedicaRepositoryImpl implements ICitaMedicaRepository{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(CitaMedica citaMedica) {
		// TODO Auto-generated method stub
		this.entityManager.persist(citaMedica);
	}

	@Override
	public void actualziar(CitaMedica citaMedica) {
		// TODO Auto-generated method stub
		this.entityManager.merge(citaMedica);
	}

	@Override
	public List<CitaMedicaSencilla> reporte(LocalDateTime fechaCita, BigDecimal costo) {
		// TODO Auto-generated method stub
		TypedQuery<CitaMedicaSencilla> miTyped = this.entityManager.createQuery("SELECT NEW com.uce.edu.demo.prueba.repository.modelo.CitaMedicaSencilla(c.numero, c.fechaCita, c.costoCita, c.fechaControl) FROM CitaMedica c WHERE c.fechaCita >= :datoFechaCita AND c.costo >= :datoCostoCita", CitaMedicaSencilla.class );
		miTyped.setParameter("datoFechaCita", fechaCita);
		miTyped.setParameter("datoCostoCita", costo);
		return miTyped.getResultList();
	}
	
	

}
