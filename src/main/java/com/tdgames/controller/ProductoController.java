package com.tdgames.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tdgames.entity.Productos;
import com.tdgames.service.ProductosServicios;

@RestController
public class ProductoController {

	@Autowired
	ProductosServicios servicios;
	
	@GetMapping("/productos")
	public List<Productos> listarProductos() {
		return servicios.showProductos();
	}
	
	@PostMapping("/agregar")
	public void agregarProducto(@RequestBody Productos producto) {
		servicios.saveProducto(producto);
	}
}
