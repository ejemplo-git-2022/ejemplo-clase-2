package edu.curso.java;

public abstract class Producto {
	private String nombre;
	private Double precioInicial;
	
	public Producto(String nombre) {
		this.nombre = nombre;
	}

	public Producto(String nombre, Double precioInicial) {
		this.nombre = nombre;
		this.precioInicial = precioInicial;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Double getPrecioInicial() {
		return precioInicial;
	}
	public void setPrecioInicial(Double precioInicial) {
		this.precioInicial = precioInicial;
	}
	
	public abstract Double calcularPrecioFinal();

}
