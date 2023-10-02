package com.Nonanashi.demo.model;

import java.io.Serializable;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_Wine")
public class WineModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idWine;
    private String name;
    private float evaluation;

    public UUID getIdWine() {
        return idWine;
    }

    public String getName() {
        return name;
    }

    public float getEvaluation() {
        return evaluation;
    }

    public void setIdWine(UUID idWine) {
        this.idWine = idWine;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEvaluation(float evaluation) {
        this.evaluation = evaluation;
    }
    


}
