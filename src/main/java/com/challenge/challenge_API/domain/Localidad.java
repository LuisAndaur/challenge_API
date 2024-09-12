package com.challenge.challenge_API.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Localidad {
    private Integer id;
    private Short provincia_id;
    private String nombre;
    private Integer codigopostal;
}
