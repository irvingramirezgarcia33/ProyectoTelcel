package logicaMetodo;

import java.util.ArrayList;


import java.util.List;


import Dominio.Celulares;
import Interface.Metodos;
import Interface.Metodos2;

public class Implementacion implements Metodos, Metodos2 {

	private List<Celulares> lista = new ArrayList<Celulares>();

// Validar Que la marca no se repita 	

	@Override
	public void guardar(Celulares celular) {
		// TODO Auto-generated method stub

		// ciclo
		// if cndicional
		// bandera 

		boolean bandera = false;

		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getMarca().equalsIgnoreCase(celular.getMarca())) {
				// que ese registro ya existe esa marca de celular 
				System.out.println("No se puede guardar");
				bandera = true;
				break;
			}
		}
		if (bandera == false) {
			lista.add(celular);
			System.out.println("Guardado con exito");
		}
	}

	@Override
	public List<Celulares> mostrar() {
		// TODO Auto-generated method stub
		return lista;
	}

	@Override
	public Celulares buscar(int indice) {
		// TODO Auto-generated method stub
		return lista.get(indice);
	}

	@Override
	public void editar(int indice, Celulares celular) {
		// TODO Auto-generated method stub
		lista.set(indice, celular);
	}

	@Override
	public void eliminar(int indice) {
		// TODO Auto-generated method stub
		lista.remove(indice);
	}

	@Override
	public Celulares buscarXmarca(String marca) {
		// TODO Auto-generated method stub
		Celulares celular = null;

		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getMarca().equalsIgnoreCase(marca)) {
				celular = lista.get(i);
				System.out.println("Se encontro la marca" + celular);
			}
		}

		return celular;

	}

	@Override
	public void buscarXcompania(String compania) {
		// TODO Auto-generated method stub
		Celulares celular = null;
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getCompania().equalsIgnoreCase(compania)) {
				celular = lista.get(i);
				System.out.println("Se encontro la compania" + celular);
			}
		}
	}

	@Override
	public float calculoInvert() {
		// TODO Auto-generated method stub
		float dineroInvertido = 0;
		for (int i = 0; i < lista.size(); i++) {
		dineroInvertido += lista.get(i).getPrecio() * lista.get(i).getStock();	
		System.out.println("Dinero   invertido  " + dineroInvertido);
		}
		return dineroInvertido;
	}

	public void editarXmarca1(String celularEnco) {
		// TODO Auto-generated method stub	
         for (int i = 0; i < lista.size(); i++) {
             Celulares celular = lista.get(i);
             if (celular.getMarca().equalsIgnoreCase(celularEnco)) {
                
                 celular.setModelo("Nuevo Modelo");
                 celular.setPrecio(5000);
                 lista.set(i, celular); 
                 System.out.println("Celular editado: " + celular);
                 return;
             }
         }
         System.out.println("No se encontró un celular con la marca " + celularEnco);

		
	}

	@Override
	public void eliminarXmarca(String marca) {
		// TODO Auto-generated method stub
        lista.remove(marca);
	}

	@Override
	public void editarXmarca(Celulares celularEnco) {
		// TODO Auto-generated method stub
        for (int i = 0; i < lista.size(); i++) {
            Celulares celular = null;
			if (lista.get(i).getMarca().equalsIgnoreCase(celular.getMarca())) {
                lista.set(i, celular);
                break;
            }
        }
    }
	
	@Override
	public void editarXmarca(String marca) {
		// TODO Auto-generated method stub
		
	}

}
