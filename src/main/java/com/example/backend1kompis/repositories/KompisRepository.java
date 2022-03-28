package com.example.backend1kompis.repositories;

import com.example.backend1kompis.Kompis;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface KompisRepository extends
        CrudRepository<Kompis, Long> {

    List<Kompis> findByName(String name);

    List<Kompis> findByAddress(String address);

    List<Kompis> findByNameAndAddress(String name, String address);


}
