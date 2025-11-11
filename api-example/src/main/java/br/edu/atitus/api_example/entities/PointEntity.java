package br.edu.atitus.api_example.entities;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "tb_point")
public class PointEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(length = 100, nullable = false)
    private String description;

    @Column(columnDefinition = "decimal(17,14)", nullable = false)
    private Double latitude;

    @Column(columnDefinition = "decimal(17,14)", nullable = false)
    private Double longitude;

    @JoinColumn(name = "iduser")
    @ManyToOne(fetch = FetchType.LAZY)
    private UserEntity user;

}
