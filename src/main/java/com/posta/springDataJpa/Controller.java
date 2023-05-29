package com.posta.springDataJpa;

import Entidades.Cita;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class Controller {

    private final CitaRepository citaRepository;

    @Autowired
    public Controller(CitaRepository citaRepository){
        this.citaRepository=citaRepository;
    }

    @GetMapping("get")
    public List<Cita> getAll (){
        return citaRepository.findAll();
    }
}
