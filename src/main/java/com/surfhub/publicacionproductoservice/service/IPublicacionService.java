package com.surfhub.publicacionproductoservice.service;

import com.surfhub.publicacionproductoservice.dto.Publicacion;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface IPublicacionService extends CrudRepository<Publicacion, Integer> {
//    Optional<Publicacion> findById(String id);
}
