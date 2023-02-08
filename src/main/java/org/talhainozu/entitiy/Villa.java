package org.talhainozu.entitiy;


import org.talhainozu.entitiy.common.Structure;

public class Villa extends Structure {
    //all getter and setters are implemented at Structure abstract class
    public Villa(Double price, Double squareMeters, Integer numberOfRooms, Integer numberOfLivingRoom) {
        super(price, squareMeters, numberOfRooms, numberOfLivingRoom);
    }
}
