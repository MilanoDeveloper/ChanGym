package com.changym.demo.dto;

import java.io.Serializable;
import java.util.Date;

import com.changym.demo.enums.Modality;

import org.springframework.stereotype.Indexed;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
@AllArgsConstructor
public class FitnessCoachDTO implements Serializable{
    private static final long serialVersionUID = 1L;

    private Long id;
    private Date workingDays;
    private Modality modality;
}
