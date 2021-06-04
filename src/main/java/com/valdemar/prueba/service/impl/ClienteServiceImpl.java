package com.valdemar.prueba.service.impl;

import com.valdemar.prueba.entity.Cliente;
import com.valdemar.prueba.repository.ClienteRepository;
import com.valdemar.prueba.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {
    
    @Autowired
    private ClienteRepository clienteRepository;
    
    @Override
    public Cliente save(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    }

    @Override
    public List<Cliente> findByShare_key(String share_key) {
        return null;
    }
}
