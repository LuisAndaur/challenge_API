package com.challenge.challenge_API.controllers;

import com.challenge.challenge_API.domain.Localidad;
import com.challenge.challenge_API.domain.Provincia;
import com.challenge.challenge_API.handlers.RestResponseEntityHandler;
import com.challenge.challenge_API.interfaces.ILocalidadService;
import com.challenge.challenge_API.interfaces.IProvinciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/db")
public class DBRestController {

    private final IProvinciaService _provinciaService;
    private final ILocalidadService _localidadService;

    @Autowired
    public DBRestController(IProvinciaService provinciaService, ILocalidadService localidadService) {
        this._provinciaService = provinciaService;
        this._localidadService = localidadService;
    }

    @GetMapping("/provincia")
    public ResponseEntity<?> getAllProvincias(){
        long startTime = System.nanoTime();
        List<Provincia> provincias = _provinciaService.getAll();
        long estimatedTime = System.nanoTime() - startTime;

        return RestResponseEntityHandler.generateResponse("Operación exitosa!", HttpStatus.OK, provincias, "Datos desde DB => ", estimatedTime);
    }

    @GetMapping("/localidad")
    public ResponseEntity<?> getAllLocalidad(){
        long startTime = System.nanoTime();
        List<Localidad> localidades = _localidadService.getAll();
        long estimatedTime = System.nanoTime() - startTime;

        return RestResponseEntityHandler.generateResponse("Operación exitosa!", HttpStatus.OK, localidades, "Datos desde DB => ", estimatedTime);
    }
}
