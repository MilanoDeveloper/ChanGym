package com.changym.demo.dto;

import java.io.Serializable;
import java.util.Date;

import com.changym.demo.enums.Modality;

public class FitnessCoachDTO implements Serializable{
    
    private Long id;
    private String name;
    private int age;
    private Date workingDays;
    private Modality modality;
}
