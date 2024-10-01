package com.hotel.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotel.entity.Hospede;

public interface HospedeRepository extends JpaRepository<Hospede,Long> {
		//Query Method
		List<Hospede>findByNome(String nome);

	}
