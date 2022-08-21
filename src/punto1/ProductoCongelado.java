/*
 * NOMBRE DEL PROGRAMA: ALMACÉN DE ALIMENTOS
 * DESCRIPCIÓN: El programa almacena alimentos de distintos tipos y los muestra por consola
 * AUTOR: Andrés Felipe Pulido Suárez
 * FECHA: Febrero 4 de 2022
 * VERSIÓN: 0.1
 */

package punto1;

import java.util.ArrayList;

public class ProductoCongelado extends Producto {

	// Se declara un atributo propio de esta clase
	private int temperaturaCongelacion;

	// Se declara el constructor que hereda los atributos del padre
	ProductoCongelado(int anioCaducidad, int mesCaducidad, int diaCaducidad, int lote, String tipo,
			int temperaturaCongelacion) {
		super(anioCaducidad, mesCaducidad, diaCaducidad, lote, tipo);
		this.temperaturaCongelacion = temperaturaCongelacion;
	}

	// Getters y setters de las variables privadas
	public int getTemperaturaCongelacion() {
		return temperaturaCongelacion;
	}

	public void setTemperaturaCongelacion(int temperaturaCongelacion) {
		this.temperaturaCongelacion = temperaturaCongelacion;
	}

	public void mostrar(ArrayList<ProductoCongelado> pCongelado, int indice) {
		for (int i = 0; i < pCongelado.size(); i++) {
			System.out.printf("\t|%3d.|%-7d|%-2d/%-2d/%-4d|%-10.10s|%-10s|%-15.10s|%-21s|%-26d|%n", i + indice,
					pCongelado.get(i).getLote(), pCongelado.get(i).getDiaCaducidad(),
					pCongelado.get(i).getMesCaducidad(), pCongelado.get(i).getAnioCaducidad(), pCongelado.get(i).tipo,
					"N/A", "N/A", "N/A", pCongelado.get(i).getTemperaturaCongelacion());
		}
	}

}