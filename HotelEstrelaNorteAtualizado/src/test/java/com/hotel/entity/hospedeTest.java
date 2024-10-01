package com.hotel.entity;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.hotel.entity.Hospede;

class hospedeTest {

	private Hospede hospede;

	@BeforeEach
	void setUp() {
		// Arrange
		hospede = new Hospede(1L, "Lemuel Freitas", "freitas@gmail.com", "(00)000000");
	}

	@Test
	@DisplayName("Testando o getter e setter do campo ID")
	void testId() {
		// Act
		hospede.setId(2L);
		// Assert
		assertEquals(2L, hospede.getId());
	}

	@Test
	@DisplayName("Testando o getter e setter do campo nome")
	void testNome() {
		// Act
		hospede.setNome("fausto");
		// Assert
		assertEquals("fausto", hospede.getNome());
	}

	@Test
	@DisplayName("Testando o getter e setter do campo email")
	void testEmail() {
		// Act
		hospede.setEmail("ZFreitas@gmail.com");
		// Assert
		assertEquals("ZFreitas@gmail.com", hospede.getEmail());
	}

	@Test
	@DisplayName("Testando o getter e setter do campo telefone")
	void testTelefone() {
		// Act
		hospede.setTelefone("(15)996677425");
		// Assert
		assertEquals("(15)996677425", hospede.getTelefone());
	}

	@Test
	@DisplayName("Testando o construtor com todos os argumentos")
	void testConstructorAll() {
		// Act
		Hospede novoHospede = new Hospede(3L, "luis", "(15)998745217", "luis@gmail.com");
		// Assertion
		assertAll("novoHospede", () -> assertEquals(3L, novoHospede.getId(), "Error ID"),
				() -> assertEquals("luis", novoHospede.getNome(), "Error nome"),
				() -> assertEquals("(15)998745217", novoHospede.getTelefone(), "Error telefone"),
				() -> assertEquals("luis@gmail.com", novoHospede.getEmail(), "Error email"));
				

	}
}