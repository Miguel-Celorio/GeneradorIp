package generador;

import java.util.Random;

public class GeneradorIp {
	public int generarNumero(int min, int max) {
		Random r = new Random();
		return r.nextInt(max - min) + min;
	}
	
	public String generarIp() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(generarNumero(0, 255));
		for (int i = 0; i < 3; i++) {
			sb.append(".");
			sb.append(generarNumero(0, 255));
		}
		
		
		return sb.toString();
	}
}
