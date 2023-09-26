package com.gino.miprimerapirest.controller;

import com.gino.miprimerapirest.model.entity.Cliente;
import com.gino.miprimerapirest.service.ICliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class ClienteController {
    @Autowired
    private ICliente clienteService;

    @PostMapping("cliente")
    public Cliente create(@RequestBody Cliente cliente){
        return clienteService.save(cliente);
    }
    @PutMapping("cliente")
    public Cliente update(@RequestBody Cliente cliente){
        return clienteService.save(cliente); //no es un update solo guarda el cliente en la bd
    }
    @DeleteMapping("cliente/{id}")
    public void delete(@PathVariable int id){
       clienteService.delete(clienteService.foundById(id));
    }
    @GetMapping("cliente/{id}")
    public Cliente showById(@PathVariable int id){
        return clienteService.foundById(id);
    }
}
