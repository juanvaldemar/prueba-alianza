package com.valdemar.prueba.repository;

import com.valdemar.prueba.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface ClienteRepository extends JpaRepository<Cliente,Integer> {

}
