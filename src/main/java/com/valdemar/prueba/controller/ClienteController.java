package com.valdemar.prueba.controller;

import com.valdemar.prueba.entity.Cliente;
import com.valdemar.prueba.service.impl.ClienteServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<Cliente> saveCliente(@RequestBody Cliente request) {

        Cliente response = new Cliente();
        HttpStatus httpStatus = null;

        try {
            response = clienteService.save(request);
            log.info("Guardando la información del cliente");
            httpStatus = HttpStatus.OK;
        } catch (Exception e) {
            log.error("Error al guardar el cliente: "+e.getMessage());
            System.out.println("Error saveCliente Controller: "+ e);
            httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
        }

        return ResponseEntity.status(httpStatus).body(response);
    }


    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/cliente", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
    public ResponseEntity<List<Cliente>> listClientes() {

        List<Cliente> response = new ArrayList<Cliente>();
        HttpStatus httpStatus = null;

        try {
            response = clienteService.findAll();
            log.info("Listando la información de los clientes");
            httpStatus = HttpStatus.OK;

        } catch (Exception e) {
            log.error("Error al listar a los clientes: "+e.getMessage());
            System.out.println("Error listClientes Controller: "+ e);
            httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;


        }

        return ResponseEntity.status(httpStatus).body(response);

    }


}



























