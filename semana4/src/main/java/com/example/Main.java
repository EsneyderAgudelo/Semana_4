package com.example;

public class Main {
    public static void main(String[] args) {
        Tienda tienda = new Tienda();

        // Crear productos
        Producto producto1 = new Producto("Camiseta", 15.99, 20);
        Producto producto2 = new Producto("Pantalón", 39.99, 10);
        Producto producto3 = new Producto("Zapatos", 60.99, 5);

        // Agregar productos a la tienda
        tienda.agregarProducto(producto1);
        tienda.agregarProducto(producto2);
        tienda.agregarProducto(producto3);

        // Buscar un producto
        Producto productobuscado = tienda.buscarProductoPorNombre("Camiseta");
        System.out.println("El producto buscado fue: ");
        productobuscado.mostrarInformacion();

        // Mostrar productos con stock bajo
        System.out.println("Los productos con stock bajo son: ");
        tienda.mostrarProductosConStockBajo(5);

        // Calcular valor total del inventario
        double precioTotal = tienda.calcularValorTotalInventario();
        System.out.println("El precio total del inventario es: " + precioTotal);
    }
}