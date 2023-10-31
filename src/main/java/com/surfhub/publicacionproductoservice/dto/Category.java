package com.surfhub.publicacionproductoservice.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="category")
public class Category {

    @Id
    @GeneratedValue
    private Integer id;
    @Column(length = 10)
    private String name;
    @ManyToMany(mappedBy = "categorias")
    private List<Publicacion> publicacionList;

}
