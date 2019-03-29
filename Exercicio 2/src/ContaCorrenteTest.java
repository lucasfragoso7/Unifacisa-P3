import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class ContaCorrenteTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		
	}
	@Test
	void testSaldoInfuficienteException() {

		ContaCorrente cc = new ContaCorrente(100.0, 0.0, 300.0);

		Assertions.assertThrows(SaldoInsuficienteExcecao.class, () -> {
			cc.sacar(10);
			;
		});

	}
	

	@Test
	void testSacarValorNegativoException() {

		ContaCorrente cc = new ContaCorrente(100.0, 100.0, 300.0);

		Assertions.assertThrows(Exception.class, () -> {
			cc.sacar(-10.0);
			;
		});

	}
	@Test
	void testSacarValorNuloException() {

		ContaCorrente cc = new ContaCorrente(100.0, 100.0, 300.0);

		Assertions.assertThrows(Exception.class, () -> {
			cc.sacar(-10.0);
			;
		});

	}

		@Test
	void testDepositarValorNegativoException() {

		ContaCorrente cc = new ContaCorrente(100.0, 100.0, 300.0);

		Assertions.assertThrows(Exception.class, () -> {
			cc.depositar(-10.0);
			;
		});

	}
		@Test
	void testDepositarValorNuloException() {

		ContaCorrente cc = new ContaCorrente(100.0, 100.0, 300.0);

		Assertions.assertThrows(Exception.class, () -> {
			cc.depositar(0.0);
			;
		});

	}

	@Test
	void testSetValorLimiteNegativoException() {

		ContaCorrente cc = new ContaCorrente(100.0, 100.0, 300.0);

		Assertions.assertThrows(Exception.class, () -> {
			cc.setValorLimite(-10.0);
			;
		});

	}

}
