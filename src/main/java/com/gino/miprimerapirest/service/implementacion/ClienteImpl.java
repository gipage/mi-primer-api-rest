package com.gino.miprimerapirest.service.implementacion;

import com.gino.miprimerapirest.model.dao.ClienteDAO;
import com.gino.miprimerapirest.model.entity.Cliente;
import com.gino.miprimerapirest.service.ICliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//Logica de negocio
@Service
public class ClienteImpl implements ICliente {
    /*inyeccion de dependencia:Indicar a Spring
    que debe proporcionar una instancia de la clase ClienteDAO
    y asignarla automáticamente al campo clientedao
    */
    @Autowired
    private ClienteDAO clientedao;
    @Transactional
    @Override
    public Cliente save(Cliente cliente) {
        return clientedao.save(cliente); //metodo de crudRepository
    }
    @Transactional(readOnly = true)
    @Override
    public Cliente foundById(int id) {
        return clientedao.findById(id).orElse(null);
    }

    @Override
    public void delete(Cliente cliente) {
        clientedao.delete(cliente);

    }
}
