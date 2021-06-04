package com.valdemar.prueba.service;

import com.valdemar.prueba.entity.Cliente;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClienteService {

    Cliente save(Cliente cliente);

    List<Cliente> findAll();

    List<Cliente> findByShare_key(String share_key);


}
