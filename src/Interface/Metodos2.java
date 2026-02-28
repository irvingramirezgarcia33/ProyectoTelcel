package Interface;

import java.util.List;

import Dominio.Celulares;

public interface Metodos2 {
	
    //Sintaxis para un metodo 	
	////[modificador] [tipoRetorno] nombreMetodo([parámetros]) {
    // Cuerpo del método (lo que hace)
    //  return [valor]; // (Opcional si no es void)

	
	public Celulares buscarXmarca(String marca);
	
	public void buscarXcompania(String compania);
	
    public float calculoInvert();  //
	
    public void editarXmarca(String marca);
    
	public void eliminarXmarca(String marca);


	

}
