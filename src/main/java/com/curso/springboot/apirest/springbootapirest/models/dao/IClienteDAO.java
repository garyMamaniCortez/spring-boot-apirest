package com.curso.springboot.apirest.springbootapirest.models.dao;

import org.springframework.data.repository.CrudRepository;
import com.curso.springboot.apirest.springbootapirest.models.entity.Cliente;

public interface IClienteDAO extends CrudRepository<Cliente, Long>{
    //@Query(HQL)
}
