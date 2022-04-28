package edu.curso.java;

import java.util.ArrayList;

public class Combo extends Producto {
	

	public Combo(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	private ArrayList<Producto> productos = new ArrayList<Producto>();
	private Double descuento = 0.0;
	
	public Double getDescuento() {
		return descuento;
	}

	public void setDescuento(Double descuento) {
		this.descuento = descuento;
	}

	public ArrayList<Producto> getProductos() {
		return productos;
	}

	public void agregarProductoAlCombo(Producto producto) {
		productos.add(producto);
	}


	@Override
	public Double calcularPrecioFinal() {
		Double total =  0.0;
		for (Producto producto : productos) {
			total = total + producto.calcularPrecioFinal();
		}
		return total - descuento;// TODO Auto-generated method stub
	}
	
}
