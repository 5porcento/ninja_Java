package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Ninja;

@Repository
public interface NinjaRepository extends JpaRepository<Ninja,Long>{

}
