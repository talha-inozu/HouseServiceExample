package org.talhainozu.service;

import org.talhainozu.entitiy.House;
import org.talhainozu.entitiy.SummerHouse;
import org.talhainozu.entitiy.Villa;
import org.talhainozu.entitiy.common.Structure;
import org.talhainozu.service.common.StructureService;

import java.util.ArrayList;
import java.util.List;

public class PatikaBuildingService implements StructureService {

    @Override
    public double totalPriceOfAllStructures(List<Structure> structureList) {
        double totalPrice = 0;
        for(Structure structure: structureList){
            totalPrice += structure.getPrice();
        }
        return  totalPrice;
    }

    @Override
    public double meanSquareMetersOfAllStructures(List<Structure> structureList) {
        double totalSquareMeters = 0;
        for(Structure structure: structureList){
            totalSquareMeters += structure.getSquareMeters();
        }
        return  totalSquareMeters/structureList.size(); // mean = total / count
    }

    @Override
    public double totalPriceOfHouses(List<Structure> structureList) {
        double totalPriceOfHouses = 0;
        for(Structure structure: structureList){
            if(structure instanceof House)// check structure type
                totalPriceOfHouses += structure.getPrice();
        }
        return  totalPriceOfHouses;

    }

    @Override
    public double totalPriceOfVillas(List<Structure> structureList) {
        double totalPriceOfVillas = 0;
        for(Structure structure: structureList){
            if(structure instanceof Villa)// check structure type
                totalPriceOfVillas += structure.getPrice();
        }
        return  totalPriceOfVillas;
    }

    @Override
    public double totalPriceOfSummerHouses(List<Structure> structureList) {
        double totalPriceOfSummerHouses = 0;
        for(Structure structure: structureList){
            if(structure instanceof SummerHouse)// check structure type
                totalPriceOfSummerHouses += structure.getPrice();
        }
        return  totalPriceOfSummerHouses;
    }

    @Override
    public double meanSquareMetersOfHouses(List<Structure> structureList) {
        double totalSquareMetersOfHouses = 0;
        int houseCount = 0;
        for(Structure structure: structureList){
            if(structure instanceof House) {// check structure type
                houseCount++;
                totalSquareMetersOfHouses += structure.getSquareMeters();
            }

        }
        return  totalSquareMetersOfHouses/houseCount; // mean = total / count
    }

    @Override
    public double meanSquareMetersOfVillas(List<Structure> structureList) {
        double totalSquareMetersOfVillas = 0;
        int villasCount = 0;
        for(Structure structure: structureList){
            if(structure instanceof Villa) {// check structure type
                villasCount++;
                totalSquareMetersOfVillas += structure.getSquareMeters();
            }

        }
        return  totalSquareMetersOfVillas/villasCount;// mean = total / count
    }

    @Override
    public double meanSquareMetersOfSummerHouses(List<Structure> structureList) {
        double totalSquareMetersOfSummerHouses = 0;
        int summerHousesCount = 0;
        for(Structure structure: structureList){
            if(structure instanceof SummerHouse) { // check structure type
                summerHousesCount++;
                totalSquareMetersOfSummerHouses += structure.getSquareMeters();
            }

        }
        return  totalSquareMetersOfSummerHouses/summerHousesCount;// mean = total / count
    }

    @Override
    public List<Structure> getStructureList(List<Structure> structureList,int numberOfRooms, int numberOfLivingRooms) {
        List<Structure>  response = new ArrayList<>();
        for(Structure structure: structureList){ // check  matches
            if(structure.getNumberOfRooms() == numberOfRooms && structure.getNumberOfLivingRoom() == numberOfLivingRooms){
                response.add(structure);
            }

        }
        return response;
    }
}
