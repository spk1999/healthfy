package com.healthfy.sujan.healthfy.model;


import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class UserModel {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private String id;
    @Column(name = "fname")
    private String fname;

    @Column(name = "lame")
    private String lname;


    @Column(name = "username")
    private String username;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;
    @Column(name = "confirmPassword")
    private String confirmPassword;


}
