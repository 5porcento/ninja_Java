package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Ninja;
import com.example.demo.service.NinjaService;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping("/ninja")
public class NinjaController {

    private NinjaService ninjaService;

    NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping
    public List<Ninja> list() {
        return ninjaService.listNinjas();
    }

    @GetMapping("/{id}")
    public Ninja getNinjaId(@PathVariable Long id) {
        return ninjaService.getNinjaById(id);
    }

    @PostMapping
    public Ninja create(Ninja ninja) {
        return ninjaService.createNinja(ninja);
    }

    @DeleteMapping("/{id}")
    public String deleteNinja(@PathVariable Long id){
        ninjaService.deleteNinja(id);
        return "Ninja Deletado";
    }
    
}
