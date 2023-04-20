package com.pcPartMaker.model;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="memory_type")
@Data
public class MemoryType {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="id")
    int memoryTypeId;


    @Column(unique = true)
    private String ramGeneration;

    private int maxSpeed;

    public int getMemoryTypeId() {
        return memoryTypeId;
    }

    public String getRamGeneration() {
        return ramGeneration;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}