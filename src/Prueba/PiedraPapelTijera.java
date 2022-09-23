package Prueba;

public class PiedraPapelTijera {

	public void seleccionarGanador(String partidaUno[], String partidaDos[], String partidaTres[]) {
		int jugadorUno = 0;
		int jugadorDos = 0;
		
		for(int i = 0 ; i <= 1 ; i ++) {
			if(partidaUno[i] == "R") {
				
			}
		}
		
		
	}
	
	
	public static void main(String args[]) {
		PiedraPapelTijera juego = new PiedraPapelTijera();
		String partidaUno[] = {"R","T"};
		String partidaDos[] = {"T","R"};
		String partidaTres[] = {"P","T"};
		juego.seleccionarGanador(partidaUno, partidaDos, partidaTres);
		
	}

}