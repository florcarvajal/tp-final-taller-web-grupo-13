package com.tallerwebi.infraestructura.serviciosimpl;


import com.tallerwebi.dominio.entidades.Carrito;
import com.tallerwebi.dominio.entidades.Libro;
import com.tallerwebi.dominio.servicios.CarritoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarritoServiceImpl implements CarritoService {

    private Carrito carrito;

    public CarritoServiceImpl() {
        this.carrito = new Carrito(); // Inicia el carrito
    }

    @Override
    public void agregarLibro(Libro libro) {
        carrito.agregarLibro(libro);
    }

    @Override
    public void eliminarLibro(Libro libro) {
        carrito.eliminarLibro(libro);
    }

    @Override
    public void vaciarCarrito() {
        carrito.vaciarCarrito();
    }

    @Override
    public List<Libro> obtenerLibros() {
        return carrito.obtenerLibros();
    }

    @Override
    public Double calcularTotal() {
        return carrito.calcularTotal();
    }
}