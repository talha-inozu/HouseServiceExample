package org.talhainozu.entitiy;


import org.talhainozu.entitiy.interfaces.Structure;

public class House extends Structure {

    public House(Double price, Double squareMeters, Integer numberOfRooms, Integer numberOfLivingRoom) {
        super(price, squareMeters, numberOfRooms, numberOfLivingRoom);
    }
}
