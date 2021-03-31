package com.tdgames.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tdgames.entity.Productos;

@Repository
public interface ProductosRepository extends JpaRepository<Productos, Integer>{

}
