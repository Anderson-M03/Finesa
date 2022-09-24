package Prueba;

import javax.swing.JOptionPane;

public class PiedraPapelTijera {

	public void seleccionarGanador(String partidaUno[], String partidaDos[], String partidaTres[]) {
		int puntosJ1 = 0;
		int puntosJ2 = 0;
		int empates = 0;
		
		for(byte i = 0 ; i < partidaUno.length - 1 ; i++) {
			if((partidaUno[i].equals("R") && partidaUno[i+1].equals("T")) ||
			   (partidaUno[i].equals("P") && partidaUno[i+1].equals("R")) ||
			   (partidaUno[i].equals("T") && partidaUno[i+1].equals("P"))) {
				puntosJ1++;
			} else if((partidaUno[i].equals("T") && partidaUno[i+1].equals("R")) ||
					   (partidaUno[i].equals("R") && partidaUno[i+1].equals("P")) ||
					   (partidaUno[i].equals("P") && partidaUno[i+1].equals("T"))) {
				puntosJ2++;
			} else {
				empates++;
			}
		}
		
		for(byte i = 0 ; i < partidaDos.length - 1 ; i++) {
			if((partidaDos[i].equals("R") && partidaDos[i+1].equals("T")) ||
			   (partidaDos[i].equals("P") && partidaDos[i+1].equals("R")) ||
			   (partidaDos[i].equals("T") && partidaDos[i+1].equals("P"))) {
				puntosJ1++;
			} else if((partidaDos[i].equals("T") && partidaDos[i+1].equals("R")) ||
					   (partidaDos[i].equals("R") && partidaDos[i+1].equals("P")) ||
					   (partidaDos[i].equals("P") && partidaDos[i+1].equals("T"))) {
				puntosJ2++;
			} else {
				empates++;
			}
		}
		
		for(byte i = 0 ; i < partidaTres.length - 1 ; i++) {
			if((partidaTres[i].equals("R") && partidaTres[i+1].equals("T")) ||
			   (partidaTres[i].equals("P") && partidaTres[i+1].equals("R")) ||
			   (partidaTres[i].equals("T") && partidaTres[i+1].equals("P"))) {
				puntosJ1++;
			} else if((partidaTres[i].equals("T") && partidaTres[i+1].equals("R")) ||
					  (partidaTres[i].equals("R") && partidaTres[i+1].equals("P")) ||
					  (partidaTres[i].equals("P") && partidaTres[i+1].equals("T"))) {
				puntosJ2++;
			} else {
				empates++;
			}
		}
		System.out.println("-------Resultados------");
		System.out.println("Jugador 1: " + puntosJ1 + "\n" +
		                   "Jugador 2: " + puntosJ2 + "\n" +
				           "Empates: " + empates);

		if(puntosJ1 > puntosJ2) {
			JOptionPane.showMessageDialog(null, "Jugador 1 ganador");
		} else if (puntosJ2 > puntosJ1) {
			JOptionPane.showMessageDialog(null, "Jugador 2 ganador");
		} else {
			JOptionPane.showMessageDialog(null, "Empate");
		}
	}
	
	
	public static void main(String args[]) {
		PiedraPapelTijera juego = new PiedraPapelTijera();
		String partidaUno[] = {"R","R"};
		String partidaDos[] = {"T","T"};
		String partidaTres[] = {"P","P"};
		juego.seleccionarGanador(partidaUno, partidaDos, partidaTres);
		
	}

}