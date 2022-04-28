package edu.curso.java;

public class ProductoConcreto extends Producto {

	public ProductoConcreto(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}
	
	public ProductoConcreto(String nombre, Double precioInicial) {
		super(nombre, precioInicial);
	}


	@Override
	public Double calcularPrecioFinal() {
		// TODO Auto-generated method stub
		return getPrecioInicial();
	}

}
