package com.changym.demo.model;

import java.io.Serializable;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@EntityScan
@Getter
@Setter
@AllArgsConstructor
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;
    private String email;
    private int age;
}