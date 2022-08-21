/*
 * NOMBRE DEL PROGRAMA: ALMACÉN DE ALIMENTOS
 * DESCRIPCIÓN: El programa almacena alimentos de distintos tipos y los muestra por consola
 * AUTOR: Andrés Felipe Pulido Suárez
 * FECHA: Febrero 4 de 2022
 * VERSIÓN: 0.1
 */

package punto1;

public class Producto {

	// Se declaran los atributos de la clase
	private int anioCaducidad;
	private int mesCaducidad;
	private int diaCaducidad;
	private int lote;
	public String tipo;

	// Se declara el método constructor por defecto
	public Producto() {

	}

	// Se declara el método constructor con parámetros
	Producto(int anioCaducidad, int mesCaducidad, int diaCaducidad, int lote, String tipo) {
		this.anioCaducidad = anioCaducidad;
		this.mesCaducidad = mesCaducidad;
		this.diaCaducidad = diaCaducidad;
		this.lote = lote;
		this.tipo = tipo;
	}

	// Getters y setters de las variables privadas
	public int getAnioCaducidad() {
		return anioCaducidad;
	}

	public void setAnioCaducidad(int anioCaducidad) {
		this.anioCaducidad = anioCaducidad;
	}

	public int getMesCaducidad() {
		return mesCaducidad;
	}

	public void setMesCaducidad(int mesCaducidad) {
		this.mesCaducidad = mesCaducidad;
	}

	public int getDiaCaducidad() {
		return diaCaducidad;
	}

	public void setDiaCaducidad(int diaCaducidad) {
		this.diaCaducidad = diaCaducidad;
	}

	public int getLote() {
		return lote;
	}

	public void setLote(int lote) {
		this.lote = lote;
	}

}