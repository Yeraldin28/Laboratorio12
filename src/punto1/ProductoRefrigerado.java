/*
 * NOMBRE DEL PROGRAMA: ALMACÉN DE ALIMENTOS
 * DESCRIPCIÓN: El programa almacena alimentos de distintos tipos y los muestra por consola
 * AUTOR: Andrés Felipe Pulido Suárez
 * FECHA: Febrero 4 de 2022
 * VERSIÓN: 0.1
 */

package punto1;

import java.util.ArrayList;

public class ProductoRefrigerado extends Producto {

	// Se declaran los atributos propios de esta clase
	private int codigoSupervision;

	// Se declara el constructor que hereda los atributos del padre
	ProductoRefrigerado(int anioCaducidad, int mesCaducidad, int diaCaducidad, int lote, String tipo,
			int codigoSupervision) {
		super(anioCaducidad, mesCaducidad, diaCaducidad, lote, tipo);
		this.codigoSupervision = codigoSupervision;
	}

	// Getters y setters de las variables privadas
	public int getCodigoSupervision() {
		return codigoSupervision;
	}

	public void setCodigoSupervision(int codigoSupervision) {
		this.codigoSupervision = codigoSupervision;
	}

	// Método para mostrar los datos del objeto
	public void mostrar(ArrayList<ProductoRefrigerado> pRefrigerado, int indice) {
		for (int i = 0; i < pRefrigerado.size(); i++) {
			System.out.printf("\t|%3d.|%-7d|%-2d/%-2d/%-4d|%-10.10s|%-10s|%-15.10s|%-21d|%-26.15s|%n", i + indice,
					pRefrigerado.get(i).getLote(), pRefrigerado.get(i).getDiaCaducidad(),
					pRefrigerado.get(i).getMesCaducidad(), pRefrigerado.get(i).getAnioCaducidad(),
					pRefrigerado.get(i).tipo, "N/A", "N/A", pRefrigerado.get(i).getCodigoSupervision(), "N/A");
		}
	}
}