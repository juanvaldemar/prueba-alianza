package com.valdemar.prueba.service;

import com.valdemar.prueba.entity.Cliente;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ClienteService {

    Cliente save(Cliente cliente);

    List<Cliente> findAll();


    Cliente findByByEmail(String email);

}
