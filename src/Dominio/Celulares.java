package Dominio;

public class Celulares {
	private String marca;
	private String compania;
	private float precio;
	private int stock;
	
	public Celulares(String marca, String compania, float precio, int stock) {
		super();
		this.marca = marca;
		this.compania = compania;
		this.precio = precio;
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Celulares [marca=" + marca + ", compania=" + compania + ", precio=" + precio + ", stock=" + stock + "]";
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCompania() {
		return compania;
	}

	public void setCompania(String compania) {
		this.compania = compania;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public void setModelo(String string) {
		// TODO Auto-generated method stub
		
	}

	
	

	
	
	
	
	
	
	
	
	
	
	
	

}
