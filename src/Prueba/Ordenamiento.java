package Prueba;

import javax.swing.JOptionPane;

public class Ordenamiento {
	
	public void ordenarArray(int arreglo[], String criterioOrdenamiento) {
		
		if(criterioOrdenamiento.equalsIgnoreCase("Menor a mayor")) {
			ordenarMenorMayor(arreglo);	
		} else {
			ordenarMayorMenor(arreglo);
		}
	}
	
	public void ordenarMenorMayor(int arreglo[]) {
		int cambios = 0;
		boolean recorrido = true;
		while(recorrido) {
			for(byte i = 0 ; i < arreglo.length - 1 ; i++) {
				if(arreglo[i] > arreglo[i+1]) {
					int auxiliar = arreglo[i];
					arreglo[i] = arreglo[i+1];
					arreglo[i+1] = auxiliar;
					cambios++;
				}	
			}
			if(cambios == 0) {
				recorrido = false;
			}
			cambios = 0;
		}
		for(byte j = 0 ; j < arreglo.length ; j++) {
			System.out.println(arreglo[j]);
		}
	}
	
	
	public void ordenarMayorMenor(int arreglo[]) {
		int cambios = 0;
		boolean recorrido = true;
		while(recorrido) {
			for(byte i = 0 ; i < arreglo.length - 1 ; i++) {
				if(arreglo[i] < arreglo[i+1]) {
					int auxiliar = arreglo[i];
					arreglo[i] = arreglo[i+1];
					arreglo[i+1] = auxiliar;
					cambios++;
				}	
			}
			if(cambios == 0) {
				recorrido = false;
			}
			cambios = 0;
		}
		for(byte j = 0 ; j < arreglo.length ; j++) {
			System.out.println(arreglo[j]);
		}		
	}

	
	
	public static void main(String args[]) {
		Ordenamiento ordenamiento = new Ordenamiento();
		int arr[] = {6,5,4,3,2,1};
		String ordenar = JOptionPane.showInputDialog("Digite criterio de ordenamiento");
		ordenamiento.ordenarArray(arr, ordenar);
	}

}
