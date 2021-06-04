package com.valdemar.prueba.controller;

import com.valdemar.prueba.entity.Cliente;
import com.valdemar.prueba.service.impl.ClienteServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1")
public class ClienteController {

    private static final Logger log = LoggerFactory.getLogger(ClienteController.class);


    @Autowired
    private ClienteServiceImpl clienteService;


    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/cliente", method = RequestMethod.POST, produces = "application/json; charset=UTF-8")
    public Cliente saveCliente(@RequestBody Cliente request) {

        Cliente response = new Cliente();

        try {
            response = clienteService.save(request);
            log.info("Guardando la información del cliente");

        } catch (Exception e) {
            log.error("Error al guardar el cliente: "+e.getMessage());
            System.out.println("Error saveCliente Controller: "+ e);
        }

        return response;
    }


    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/cliente", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
    public List<Cliente> listClientes() {

        List<Cliente> response = new ArrayList<Cliente>();

        try {
            response = clienteService.findAll();
            log.info("Listando la información de los clientes");

        } catch (Exception e) {
            log.error("Error al listar a los clientes: "+e.getMessage());
            System.out.println("Error listClientes Controller: "+ e);

        }

        return response;
    }


}



























