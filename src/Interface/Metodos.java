package Interface;

import java.util.List;

import Dominio.Celulares;

public interface Metodos {

	// procedimiento del crud basico 
	public void guardar(Celulares celular);

	public List<Celulares> mostrar();

	public Celulares buscar(int indice);

	public void editar(int indice, Celulares celular);

	public void eliminar(int indice);

	void editarXmarca(Celulares celularEnco);

	

	
	
}
