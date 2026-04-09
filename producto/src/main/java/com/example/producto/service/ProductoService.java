package com.example.producto.service;

import com.example.producto.entity.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductoService {
    public List <Producto> listar ();
    public Optional <Producto> buscarPorId (Integer Id);
    public Producto guardar (Producto producto);
    public Producto actualizar(Producto producto);
    public void eliminarPorId(Integer id);



}
