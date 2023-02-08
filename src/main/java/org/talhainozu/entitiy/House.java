package org.talhainozu.entitiy;


import org.talhainozu.entitiy.common.Structure;


public class House extends Structure {
    //all getter and setters are implemented at Structure abstract class
    public House(Double price, Double squareMeters, Integer numberOfRooms, Integer numberOfLivingRoom) {
        super(price, squareMeters, numberOfRooms, numberOfLivingRoom);
    }
}
