package Prueba;

public class Ordenamiento {
	
	public void ordenarArray(int arreglo[], String criterioOrdenamiento) {
		System.out.println(arreglo.length);
		int arregloAuxiliar[] = {0,0,0};
		
		if(criterioOrdenamiento.equals("Menor a mayor")) {
			for(int i = 0 ; i < arreglo.length ; i++) {
				for (int j = 0 ; j < arregloAuxiliar.length ; j++) {
					if(arreglo[i] > arregloAuxiliar[j]) {
						arreglo[i] = arregloAuxiliar[j];
					}
				}
				
			}
		} else {
			
		}
	}
	
	
	public static void main(String args[]) {
		Ordenamiento ordenamiento = new Ordenamiento();
		int arr[] = {3,2,1};
		ordenamiento.ordenarArray(arr, "Menor a mayor");
	}

}
