package com.pcPartMaker.model;

import lombok.Builder;

import javax.persistence.*;


@Entity
@Table(name="graphics_card")
public class GraphicsCard {
    @Id
    private long modelNumber;
    @Column(unique = true)
    private String modelName;
    private int TDP;
    private double teraflopsPerSecond;
    private float clockSpeed;


    @OneToOne( fetch = FetchType.EAGER,
            optional = false)
    @JoinColumn( name = "componentId",
            referencedColumnName = "componentId"
    )
    private Component component;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(
            name="manufacturer",
            referencedColumnName = "manufacturerName"
            )
    private GpuManufacturer gpuManufacturer;

    public GraphicsCard() {

    }
}
