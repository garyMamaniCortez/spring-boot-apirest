package com.curso.springboot.apirest.springbootapirest.models.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.curso.springboot.apirest.springbootapirest.models.dao.IClienteDAO;
import com.curso.springboot.apirest.springbootapirest.models.entity.Cliente;
import java.util.List;

@Service
public class ClienteServiceImpl implements IClienteService{
    
    @Autowired
    private IClienteDAO clienteDao;
    @Override
    @Transactional(readOnly=true)
    public List<Cliente> findAll(){
        return (List<Cliente>) clienteDao.findAll();
    }
}
