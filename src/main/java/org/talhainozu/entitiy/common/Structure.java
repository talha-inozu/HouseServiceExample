package org.talhainozu.entitiy.common;

import lombok.Getter;

@Getter
public abstract class Structure {
    public Double squareMeters ;
    public Integer numberOfRooms ;
    public Integer numberOfLivingRoom ;
    public Double price ;

    public Structure(Double price, Double squareMeters, Integer numberOfRooms, Integer numberOfLivingRoom) {
        this.price = price;
        this.squareMeters = squareMeters;
        this.numberOfRooms = numberOfRooms;
        this.numberOfLivingRoom = numberOfLivingRoom;
    }



}
