package com.curso.springboot.apirest.springbootapirest.models.services;

import java.util.List;
import com.curso.springboot.apirest.springbootapirest.models.entity.Cliente;

public interface IClienteService {
    
    List<Cliente> findAll();
    
    public Cliente findById(Long id);

    public Cliente save(Cliente cliente);

    public void delete (Long id);
}
