package edu.curso.java;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		ProductoConcreto producto1 = new ProductoConcreto("Coca cola", 120.0);
		ProductoConcreto producto2 = new ProductoConcreto("Mac Pollo", 180.0);
		ProductoConcreto producto3 = new ProductoConcreto("Mac Papas", 110.0);
		
		Combo combo1 = new Combo("Combo Mac Pollo Feliz");
		combo1.setDescuento(50.0);
		combo1.agregarProductoAlCombo(producto1);
		combo1.agregarProductoAlCombo(producto2);
		combo1.agregarProductoAlCombo(producto3);
		
		System.out.println(combo1.calcularPrecioFinal());
		
	}

}
