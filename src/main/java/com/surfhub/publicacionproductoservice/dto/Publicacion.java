package com.surfhub.publicacionproductoservice.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "publicacion")
public class Publicacion {

    @Id
    @GeneratedValue
    private Integer id;
    @Column(nullable = false)
    private Integer idSeller;
    @Column(nullable = false, length = 50)
    private String name;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "publicacion_category", joinColumns =
    @JoinColumn(name = "category_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "publicacion_id",
            referencedColumnName = "id"))
    private List<Category> categorias;

    @Column(nullable = false)
    private BigDecimal price;
    @Column(nullable = false)
    private Date date_published;
    @Column(nullable = false, length = 10)
    private String status;
    @Column(nullable = false, length = 10)
    private String product_status;
    @Column(nullable = false, length = 15)
    private String city;
    @Column(nullable = false, length = 20)
    private String address;

}
