package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;



@AllArgsConstructor
@Data
public class MessageEntity {
    private Long   id;
    private String name;
    private String email;
    private String message;
    private Data   time;   

}

