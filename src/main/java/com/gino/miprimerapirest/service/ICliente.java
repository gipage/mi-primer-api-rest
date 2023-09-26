package com.gino.miprimerapirest.service;

import com.gino.miprimerapirest.model.entity.Cliente;

public interface ICliente {
Cliente save(Cliente cliente);
Cliente foundById(int id);
void delete(Cliente cliente); //podria pasarle solo el id xd
}
