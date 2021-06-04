package com.valdemar.prueba.controller;

import com.valdemar.prueba.JsonUtil;
import com.valdemar.prueba.entity.Cliente;
import com.valdemar.prueba.repository.ClienteRepository;
import com.valdemar.prueba.service.ClienteService;
import com.valdemar.prueba.service.impl.ClienteServiceImpl;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;


import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;



import static org.mockito.BDDMockito.given;


@ExtendWith(MockitoExtension.class)
public class ClienteControllerTest {

    @Autowired
    private MockMvc mvc;


    @MockBean
    private ClienteServiceImpl service;

    @Autowired
    private JacksonTester<Cliente> jsonSuperHero;


    @Test
    public void crearCliente() throws Exception{
        System.out.println("allalalla");
        given(service.findByByEmail("jgutierrez@gmail.com"))
                .willReturn(new Cliente("jgutierrez@gmail.com"));
        System.out.println("allalalla");

        // when
        MockHttpServletResponse response = mvc.perform(
                get("/api/v1/295")
                        .accept(MediaType.APPLICATION_JSON))
                .andReturn().getResponse();

        // then
        assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());
        assertThat(response.getContentAsString()).isEqualTo(
                jsonSuperHero.write(new Cliente("jgutierrez@gmail.com")).getJson()
        );

    }



}