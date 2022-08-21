/*
 * NOMBRE DEL PROGRAMA: ALMACÉN DE ALIMENTOS
 * DESCRIPCIÓN: El programa almacena alimentos de distintos tipos y los muestra por consola
 * AUTOR: Andrés Felipe Pulido Suárez
 * FECHA: Febrero 4 de 2022
 * VERSIÓN: 0.1
 */

package punto1;

import java.util.ArrayList;

public class ProductoFresco extends Producto {

	// Se declaran los atributos propios de esta clase
	private int anioEnvasado;
	private int mesEnvasado;
	private int diaEnvasado;
	private String paisOrigen;

	// Se declara el constructor que hereda los atributos del padre
	ProductoFresco(int anioCaducidad, int mesCaducidad, int diaCaducidad, int lote, String tipo, int anioEnvasado,
			int mesEnvasado, int diaEnvasado, String paisOrigen) {
		super(anioCaducidad, mesCaducidad, diaCaducidad, lote, tipo);
		this.anioEnvasado = anioEnvasado;
		this.mesEnvasado = mesEnvasado;
		this.diaEnvasado = diaEnvasado;
		this.paisOrigen = paisOrigen;
	}

	// Getter y setters de las variables privadas
	public int getAnioEnvasado() {
		return anioEnvasado;
	}

	public void setAnioEnvasado(int anioEnvasado) {
		this.anioEnvasado = anioEnvasado;
	}

	public int getMesEnvasado() {
		return mesEnvasado;
	}

	public void setMesEnvasado(int mesEnvasado) {
		this.mesEnvasado = mesEnvasado;
	}

	public int getDiaEnvasado() {
		return diaEnvasado;
	}

	public void setDiaEnvasado(int diaEnvasado) {
		this.diaEnvasado = diaEnvasado;
	}

	public String getPaisOrigen() {
		return paisOrigen;
	}

	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}

	// Método para mostrar los datos del objeto
	public void mostrar(ArrayList<ProductoFresco> pFresco, int indice) {
		for (int i = 0; i < pFresco.size(); i++) {
			System.out.printf("\t|%3d.|%-7d|%-2d/%-2d/%-4d|%-10s|%-2d/%-2d/%-4d|%-15.10s|%-21.15s|%-26.15s|%n",
					i + indice, pFresco.get(i).getLote(), pFresco.get(i).getDiaCaducidad(),
					pFresco.get(i).getMesCaducidad(), pFresco.get(i).getAnioCaducidad(), pFresco.get(i).tipo,
					pFresco.get(i).getDiaEnvasado(), pFresco.get(i).getMesEnvasado(), pFresco.get(i).getAnioEnvasado(),
					pFresco.get(i).getPaisOrigen(), "N/A", "N/A");
		}
	}
}