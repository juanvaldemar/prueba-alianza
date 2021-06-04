package com.valdemar.prueba.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Cliente implements Serializable {

    @GeneratedValue(strategy= GenerationType.AUTO)
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "share_key")
    private String share_key;

    @Column(name = "bussiness_id")
    private String bussiness_id;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private int phone;

    @Column(name = "data_added")
    private Date data_added = new Date();

    @Column(name = "start_date")
    private Date start_date;

    @Column(name = "end_date")
    private Date end_date;


    public Cliente(String share_key, String bussiness_id, String email, int phone) {
        this.share_key = share_key;
        this.bussiness_id = bussiness_id;
        this.email = email;
        this.phone = phone;
    }

    public Cliente(String email) {
        this.email = email;
    }
}
