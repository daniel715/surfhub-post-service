package com.surfhub.publicacionproductoservice.controller;


import com.surfhub.publicacionproductoservice.dto.Publicacion;
import com.surfhub.publicacionproductoservice.service.IPublicacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/v1/publicacion", produces = "application/json")
@CrossOrigin(origins = "*")
public class PublicacionController {

    private IPublicacionService publicacionService;

    @Autowired
    public PublicacionController(IPublicacionService publicacionService) {
        this.publicacionService = publicacionService;
    }

    @PostMapping("/save")
    public ResponseEntity<Publicacion> save(@RequestBody Publicacion request) {
        return ResponseEntity.ok(publicacionService.save(request));
    }


}
