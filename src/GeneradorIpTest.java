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
		boolean flag = true;
		for (int i = 0; i < 1000; i++){
			String ip = g.generarIp();
			if(!(ip.charAt(0) != 0 && ip.charAt(ip.length()-1) != 0)){
				flag = false;
				break;
			}
		}

		assertTrue(flag);
	}
}
