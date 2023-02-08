package org.talhainozu.model;

import lombok.Getter;
import org.talhainozu.persistance.Structure;


public class SummerHouse extends Structure {
    public SummerHouse(Double price, Double squareMeters, Integer numberOfRooms, Integer numberOfLivingRoom) {
        super(price, squareMeters, numberOfRooms, numberOfLivingRoom);
    }
}
