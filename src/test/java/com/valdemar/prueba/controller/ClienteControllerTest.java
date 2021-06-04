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
import org.springframework.util.ResourceUtils;
import org.springframework.util.StreamUtils;


import java.io.FileInputStream;
import java.nio.charset.Charset;

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
        String mockPhoneNum = "534*******";
        final FileInputStream fileInputStream = new FileInputStream(ResourceUtils.getFile("classpath:response_http200.json"));
        final String staticResponse = StreamUtils.copyToString(fileInputStream, Charset.defaultCharset());


    }



}