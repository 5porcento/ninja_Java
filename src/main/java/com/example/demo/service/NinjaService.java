package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Ninja;
import com.example.demo.repository.NinjaRepository;

@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;

    NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    public List<Ninja> listNinjas(){
        return ninjaRepository.findAll();
    }

    public Ninja createNinja(Ninja ninja){
        return ninjaRepository.save(ninja);
    }
    
    public Ninja getNinjaById(Long Id){
        Optional <Ninja> ninjaId = ninjaRepository.findById(Id);
        return ninjaId.orElse(null);
    }

    public void deleteNinja(Long id){
        ninjaRepository.deleteById(id);
    }

    public Ninja updateNinja(Long id,Ninja ninja){
        if(ninjaRepository.existsById(id)){
            ninja.setId(id);
            return ninjaRepository.save(ninja);
        }
        return null;
    }

}
