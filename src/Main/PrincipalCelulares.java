package Main;

import java.util.Scanner;

import Dominio.Celulares;
import logicaMetodo.Implementacion;


public class PrincipalCelulares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //"Declaro una variable Scanner llamada lectura, pero todavía no tiene objeto asignado."
		Scanner lectura = null;
       //declaro mis variables 
		String marca;
		String compania;
		float precio;
		int stock, menuPrinci, indice;
         
		// // Solo declaras la variable, no hay objeto aún (apunta a null)
		Celulares celular;

		
		//Declarar una variable llamada imp de tipo Implementacion (que es una clase).
		//Crear un objeto nuevo de la clase Implementacion con new Implementacion().
		Implementacion imp = new Implementacion();

		
		do {
			System.out.println("MENU PRINCIPAL");
			System.out.println("1---ALTA");
			System.out.println("2---Mostrar");
			System.out.println("3---Buscar");
			System.out.println("4---Editar");
			System.out.println("5---Eliminar");
			System.out.println("6---Buscar por marca");
			System.out.println("7---Buscar por compañia");
			System.out.println("8---Calcular el dinero invertido");
			System.out.println("9---Editar buscando por marca");// Editar el precio
			System.out.println("10---Eliminar buscando por marca");
			System.out.println("11---Salir");

			lectura = new Scanner(System.in);
			menuPrinci = lectura.nextInt();

			switch (menuPrinci) {
			case 1:
				try {

					System.out.println("Ingrese la marca");
					lectura = new Scanner(System.in);
					marca = lectura.nextLine();

					System.out.println("Ingrese la compania");
					lectura = new Scanner(System.in);
					compania = lectura.nextLine();

					System.out.println("Ingrese el precio");
					lectura = new Scanner(System.in);
					precio = lectura.nextInt();

					System.out.println("Ingrese la stock");
					lectura = new Scanner(System.in);
					stock = lectura.nextInt();

					// Crear el objeto con todos lo sparametros 
					celular = new Celulares(marca, compania, precio, stock);

					// Guardar
					imp.guardar(celular);

				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Error al guardar");

				}

				break;

			case 2:
				if (imp.mostrar().size() > 0)
					System.out.println(imp.mostrar());

				else
					System.out.println("No hay registros en la lista");
				break;

			case 3:
				if (imp.mostrar().size() > 0) {
					try {
						System.out.println("Ingrese el indice del registro a buscar");
						lectura = new Scanner(System.in);
						indice = lectura.nextInt();

						// Buscar

						Celulares celularEnco = imp.buscar(indice);
						System.out.println(celularEnco);

					} catch (Exception e) {
						// TODO: handle exception
						System.out.println("No existe ese registro");

					}
				} else
					System.out.println("No hay registros");

				break;

			case 4:

				if (imp.mostrar().size() > 0) {
					try {
						System.out.println("Ingrese el indice del registro a editar");
						lectura = new Scanner(System.in);
						indice = lectura.nextInt();

						// Buscar

						Celulares celularEnco = imp.buscar(indice);
						System.out.println(celularEnco);

						// Editar
						System.out.println("Ingrese la nueva marca");
						lectura = new Scanner(System.in);
						marca = lectura.nextLine();

						// Actualizar objeto
						celularEnco.setMarca(marca);

						// Actualizar lista

						imp.editar(indice, celularEnco);
						System.out.println("edito");

					} catch (Exception e) {
						// TODO: handle exception
						System.out.println("No existe ese registro");

					}
				} else
					System.out.println("No hay registros");
				break;

			case 5:

				try {
					System.out.println("Ingrese el indice");
					lectura = new Scanner(System.in);
					indice = lectura.nextInt();

					// Elimincacion
					imp.eliminar(indice);
					System.out.println("Se elimino");

				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("No existe ese registro");
				}

				break;

			case 6:
				if (imp.mostrar().size() > 0) {
					try {
						System.out.println("Ingrese la marca a buscar ");
						lectura = new Scanner(System.in);
						marca = lectura.nextLine();

						// Buscar

						Celulares celularEnco = imp.buscarXmarca(marca);
						System.out.println(celularEnco);

					} catch (Exception e) {
						// TODO: handle exception
						System.out.println("No existe ese registro");

					}
				} else
					System.out.println("No hay registros");

				break;

			case 7:

				System.out.println("Ingrese la compania a buscar");
				lectura = new Scanner(System.in);
				compania = lectura.nextLine();

				imp.buscarXcompania(compania);

				System.out.println("Se encontro la compañia");
				break;

			case 8:
				System.out.println("Dinero invertido");
				imp.calculoInvert();
				break;

			case 9:
				if (imp.mostrar().size() > 0) {
					try {
						System.out.println("Ingrese la marca del celular a editar precio:");
						lectura = new Scanner(System.in);
						marca = lectura.nextLine();

						Celulares celularEnco = imp.buscarXmarca(marca);
						System.out.println("Celular encontrado: " + celularEnco);

						System.out.println("Ingrese el nuevo precio:");
						lectura = new Scanner(System.in);
						precio = lectura.nextFloat();

						celularEnco.setPrecio(precio);
						imp.editarXmarca(celularEnco);
						System.out.println("Precio actualizado");

					} catch (Exception e) {
						System.out.println("No existe ese registro");
					}
				} else
					System.out.println("No hay registros");
				break;

			case 10:

				if (imp.mostrar().size() > 0) {
					try {
						System.out.println("Ingrese la marca del celular a eliminar:");
						lectura = new Scanner(System.in);
						marca = lectura.nextLine();

						imp.eliminarXmarca(marca);
						System.out.println("Celular eliminado por marca");

					} catch (Exception e) {
						System.out.println("No existe ese registro");
					}
				} else
					System.out.println("No hay registros");
				break;

			case 11:
				System.out.println("Saliendo del sistema... ¡Hasta pronto!");
				break;


			}

		} while (menuPrinci < 11);

	}

}
