/*
 * NOMBRE DEL PROGRAMA: ALMACÉN DE ALIMENTOS
 * DESCRIPCIÓN: El programa almacena alimentos de distintos tipos y los muestra por consola
 * AUTOR: Andrés Felipe Pulido Suárez
 * FECHA: Febrero 4 de 2022
 * VERSIÓN: 0.1
 */
package punto1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class TestHerencia {

	public static void main(String arg[]) throws IOException {

		System.out.print("\n\n\tESTE PROGRAMA ADMINISTRA EL ALMACENAMIENTO DE TRES TIPOS DE ALIMENTOS");

		// Se declara un objeto que realiza la lectura de datos
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		// Se introduce en ciclo para que el usuario elija si quiere volver a usar el
		// programa
		int repetir = 1;

		do {

			// Se declaran las variables a usar
			ArrayList<ProductoFresco> pFresco = new ArrayList<ProductoFresco>();
			ArrayList<ProductoRefrigerado> pRefrigerado = new ArrayList<ProductoRefrigerado>();
			ArrayList<ProductoCongelado> pCongelado = new ArrayList<ProductoCongelado>();
			int nDeProcutos, anioCaducidad = 0, mesCaducidad = 1, diaCaducidad = 1, tipoProducto = 1, lote = 0,
					anioEnvasado = 0, mesEnvasado = 1, diaEnvasado = 1, codigoSupervision = 0,
					temperaturaCongelacion = 0;
			String tipo = "", paisOrigen = "";

			// Se le pregunta al usuario cuantos productos va a escribir
			System.out.print("\n\n\tIngresa el número de productos que quieres escribir: ");
			nDeProcutos = Integer.parseInt(in.readLine());

			if (nDeProcutos <= 0) {
				while (nDeProcutos <= 0) {
					System.out.print("\n\tEscribe un número que sea mayor o igual que cero: ");
					nDeProcutos = Integer.parseInt(in.readLine());
				}
			}

			// Se introduce en un ciclo donde va introciendo los productos
			for (int i = 0; i < nDeProcutos; i++) {

				// Se le preguntan los datos principales de cada producto
				System.out.print("\n\n\tIngresa la información del producto N°" + (i + 1));

				System.out.print("\n\n\tFecha de caducidad: \n\n");

				do {
					System.out.print((anioCaducidad >= 0) ? "\tAño: " : "\n\tIngresa un número valido: ");
					anioCaducidad = Integer.parseInt(in.readLine());
				} while (anioCaducidad < 0);

				do {
					System.out.print(
							(mesCaducidad >= 1 && mesCaducidad <= 12) ? "\tMes: " : "\n\tIngresa un número valido: ");
					mesCaducidad = Integer.parseInt(in.readLine());
				} while (mesCaducidad < 1 || mesCaducidad > 12);

				do {
					System.out.print(
							(diaCaducidad >= 1 && diaCaducidad <= 31) ? "\tDía: " : "\n\tIngresa un número valido: ");
					diaCaducidad = Integer.parseInt(in.readLine());
				} while (diaCaducidad < 1 || diaCaducidad > 31);

				do {
					System.out.print((lote >= 0) ? "\tLote: " : "\n\tIngresa un número valido: ");
					lote = Integer.parseInt(in.readLine());
				} while (lote < 0);

				do {
					System.out.print((tipoProducto >= 1 && tipoProducto <= 3)
							? "\tTipo de producto: 1. Fresco     2. Refrigerado    3. Congelado\n\tDecisión: "
							: "\n\tIngresa un número valido: ");
					tipoProducto = Integer.parseInt(in.readLine());

				} while (tipoProducto < 1 || tipoProducto > 3);
				switch (tipoProducto) {
				case 1:
					tipo = "Fresco";
					break;
				case 2:
					tipo = "Refrigerado";
					break;
				case 3:
					tipo = "Congelado";
					break;
				}

				// Dependiendo del tipo de producto se declara un objeto y se introduce en un
				// arrayList
				switch (tipoProducto) {
				case 1:

					// Se preguntan los datos especificos de cada producto
					System.out.print("\n\n\tFecha de envasado: \n\n");

					do {
						System.out.print((anioEnvasado >= 0 && anioEnvasado <= 2022) ? "\tAño: "
								: "\n\tIngresa un número valido: ");
						anioEnvasado = Integer.parseInt(in.readLine());
					} while (anioEnvasado < 0 || anioEnvasado > 2022);

					do {
						System.out.print(
								(mesEnvasado >= 1 && mesEnvasado <= 12) ? "\tMes: " : "\n\tIngresa un número valido: ");
						mesEnvasado = Integer.parseInt(in.readLine());
					} while (mesEnvasado < 1 || mesEnvasado > 12);

					do {
						System.out.print(
								(diaEnvasado >= 1 && diaEnvasado <= 31) ? "\tDía: " : "\n\tIngresa un número valido: ");
						diaEnvasado = Integer.parseInt(in.readLine());
					} while (diaEnvasado < 1 || diaEnvasado > 31);

					System.out.print("\tPaís de Origen: ");
					paisOrigen = in.readLine();

					// Se crea un objeto con los datos y se agrega al arrayList
					ProductoFresco fresco = new ProductoFresco(anioCaducidad, mesCaducidad, diaCaducidad, lote, tipo,
							anioEnvasado, mesEnvasado, diaEnvasado, paisOrigen);
					pFresco.add(fresco);
					break;
				case 2:

					// Se preguntan los datos especificos de cada producto
					do {
						System.out.print((codigoSupervision >= 0) ? "\tCódigo de supervisón: "
								: "\n\tIngresa un número valido: ");
						codigoSupervision = Integer.parseInt(in.readLine());
					} while (codigoSupervision < 0);

					// Se crea un objeto con los datos y se agrega al arrayList
					ProductoRefrigerado refrigerado = new ProductoRefrigerado(anioCaducidad, mesCaducidad, diaCaducidad,
							lote, tipo, codigoSupervision);
					pRefrigerado.add(refrigerado);

					break;

				case 3:

					// Se preguntan los datos especificos de cada producto
					System.out.print("\n\tTemperatura de congelación: ");
					temperaturaCongelacion = Integer.parseInt(in.readLine());

					// Se crea un objeto con los datos y se agrega al arrayList
					ProductoCongelado congelado = new ProductoCongelado(anioCaducidad, mesCaducidad, diaCaducidad, lote,
							tipo, temperaturaCongelacion);
					pCongelado.add(congelado);
					break;
				}

			}

			ProductoFresco productoFresco = new ProductoFresco(anioCaducidad, mesCaducidad, diaCaducidad, lote, tipo,
					anioEnvasado, mesEnvasado, diaEnvasado, paisOrigen);
			ProductoRefrigerado productoRefrigerado = new ProductoRefrigerado(anioCaducidad, mesCaducidad, diaCaducidad,
					lote, tipo, codigoSupervision);
			ProductoCongelado productoCongelado = new ProductoCongelado(anioCaducidad, mesCaducidad, diaCaducidad, lote,
					tipo, temperaturaCongelacion);

			// Salida por pantalla de cada array
			System.out.print(
					"\n\n\t_______________________________________________________________________________________________________________\n");
			System.out.printf("\t|%-3s|%-7s|%-10s|%-10s|%-10s|%-15s|%-15s|%-19s|", "    ", "Lote", "Caducidad", "Tipo",
					"Envasado", "País de origen", "Código de supervisión", "Temperatura de congelación");
			System.out.print(
					"\n\t|____|_______|__________|__________|__________|_______________|_____________________|__________________________|\n");

			productoFresco.mostrar(pFresco, 1);
			productoRefrigerado.mostrar(pRefrigerado, pFresco.size() + 1);
			productoCongelado.mostrar(pCongelado, pFresco.size() + pRefrigerado.size() + 1);

			System.out.print(
					"\t|______________________________________________________________________________________________________________|\n");
			do {
				System.out.print((repetir >= 1 && repetir <= 2)
						? "\n\n\t¿Quieres volver a usar el programa? \n\n\t1. Si\n\t2. No\n\n\tDecisión: "
						: "\n\n\tIngresa un número valido: ");
				repetir = Integer.parseInt(in.readLine());

			} while (repetir < 1 || repetir > 2);
		} while (repetir == 1);
		System.out.println("\n\n\t\tGRACIAS POR USAR ESTE PROGRAMA\n");

	}
}
