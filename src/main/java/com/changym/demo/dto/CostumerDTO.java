package com.changym.demo.dto;

import java.io.Serializable;

import com.changym.demo.model.User;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
public class CostumerDTO implements Serializable {
    private static final long serialVersionUID  = 1L;

    private Long id;
    private User user;
    private int frequency;
    private String planDate;
    private Boolean allQuestionsAnswered;
}