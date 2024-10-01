package com.hotel.entity;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.hotel.entity.Quarto;

class quartoTest {

	private Quarto quarto;

	@BeforeEach
	void setUp() {
		// Arrange
		quarto = new Quarto( 1L, "4", 500D, 4, 4);
	}

	@Test
	@DisplayName("Testando o getter e setter do campo ID")
	void testId() {
		// Act
		quarto.setId(2L);
		// Assert
		assertEquals(2L, quarto.getId());
	}

	@Test
	@DisplayName("Testando o getter e setter do campo andar")
	void testAndar() {
		// Act
		quarto.setAndar(4);
		// Assert
		assertEquals(4, quarto.getAndar());
	}
	@Test
	@DisplayName("Testando o getter e setter do campo numero")
	void testNumero() {
		// Act
		quarto.setNumero(4);
		// Assert
		assertEquals(4, quarto.getNumero());
	}

	@Test
	@DisplayName("Testando o getter e setter do campo capacidade")
	void testCapacidade() {
		// Act
		quarto.setCapacidade("4");
		// Assert
		assertEquals("4", quarto.getCapacidade());
	}

	@Test
	@DisplayName("Testando o getter e setter do campo preco")
	void testPreco() {
		// Act
		quarto.setPreco(600D);
		// Assert
		assertEquals(600, quarto.getPreco());
	}

	@Test
	@DisplayName("Testando o construtor com todos os argumentos")
	void testConstructorAll() {
		// Act
		Quarto novoQuarto = new Quarto( 3L, "5", 600D, 5, 5);
		// Assertion
		assertAll("novoQuarto", () -> assertEquals(3L, novoQuarto.getId(),"Error ID"),
				() -> assertEquals("5", novoQuarto.getCapacidade(),"Error Capacidade"),
				() -> assertEquals(5, novoQuarto.getAndar(),"Error Andar"),
				() -> assertEquals(600, novoQuarto.getPreco(),"Error Preco"),
				() -> assertEquals(5, novoQuarto.getNumero(),"Error Num"));
				

	}
}
