package com.curso.springboot.apirest.springbootapirest.models.services;

import org.springframework.beans.factory.annotation.Autowired;
import com.curso.springboot.apirest.springbootapirest.models.dao.IClienteDAO;
import com.curso.springboot.apirest.springbootapirest.models.entity.Cliente;
import java.util.List;

public class ClienteServiceImpl implements IClienteService{
    
    @Autowired
    private IClienteDAO clienteDao;
    @Override
    public List<Cliente> findAll(){
        return null;
    }
}
