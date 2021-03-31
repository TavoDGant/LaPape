package com.tdgames.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.tdgames.entity.Productos;
import com.tdgames.repository.ProductosRepository;

@Service
public class ProductosServicios {

	@Autowired
	ProductosRepository repository;
	
	public ResponseEntity<String> saveProducto(Productos producto){
		try {
			repository.save(producto);
			return new ResponseEntity<String>("Agregado correctamente", HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>("Error al guardar", HttpStatus.BAD_REQUEST);
		}
	}
	
	public List<Productos> showProductos(){
		return repository.findAll();
	}
	
	public String deleteProducto(Integer id) {
		if(repository.findById(id)!=null) {
			repository.deleteById(id);
			return ""+HttpStatus.OK;
		}else {
			return ""+HttpStatus.BAD_REQUEST;
		}
	}
	
	public String updateProducto(Productos producto) {
		repository.save(producto);
		return ""+HttpStatus.OK;
	}
}
