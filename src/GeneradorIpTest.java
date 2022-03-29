package generador;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GeneradorIpTest {
	GeneradorIp g = new GeneradorIp();

	@Test
	void testGenerarNumero() {
		int numero = g.generarNumero(0, 255);
		assertTrue(numero >= 0 && numero <= 254);
		
		
	}
	
	@Test
	void testGenerarIp() {
		String ip = g.generarIp();
		assertTrue(ip.charAt(0) != 0 && ip.charAt(ip.length()-1) != 0);
	}
}
