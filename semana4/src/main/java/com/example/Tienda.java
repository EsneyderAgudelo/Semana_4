package com.example;

import java.util.ArrayList;

public class Tienda {
  private ArrayList<Producto> productos;

  public Tienda() {
    productos = new ArrayList<>();
  }

  public void agregarProducto(Producto producto) {
    productos.add(producto);
  }

  public Producto buscarProductoPorNombre(String nombre) {
    for (Producto producto : productos) {
      if (nombre.equals(producto.getNombre())) {
        return producto;
      }
    }
    return null;
  }

  public double calcularValorTotalInventario() {
    double precioTotalInventario = 0;
    for (Producto producto : productos) {
      precioTotalInventario += producto.calcularPrecioTotal();
    }
    return precioTotalInventario;
  }

  public void mostrarProductosConStockBajo(int limite) {
    for (Producto producto : productos) {
      boolean esMenorStock = producto.getStock() <= limite;
      if (esMenorStock) {
        producto.mostrarInformacion();
      }
    }
  }
}
