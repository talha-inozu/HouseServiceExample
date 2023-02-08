package org.talhainozu.service;

import org.talhainozu.entitiy.House;
import org.talhainozu.entitiy.SummerHouse;
import org.talhainozu.entitiy.Villa;
import org.talhainozu.entitiy.interfaces.Structure;

import java.util.ArrayList;
import java.util.List;

public class PatikaBuildingService implements StructureService{

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
        return  totalSquareMeters/structureList.size();
    }

    @Override
    public double totalPriceOfHouses(List<Structure> structureList) {
        double totalPriceOfHouses = 0;
        for(Structure structure: structureList){
            if(structure instanceof House)
                totalPriceOfHouses += structure.getPrice();
        }
        return  totalPriceOfHouses;

    }

    @Override
    public double totalPriceOfVillas(List<Structure> structureList) {
        double totalPriceOfVillas = 0;
        for(Structure structure: structureList){
            if(structure instanceof Villa)
                totalPriceOfVillas += structure.getPrice();
        }
        return  totalPriceOfVillas;
    }

    @Override
    public double totalPriceOfSummerHouses(List<Structure> structureList) {
        double totalPriceOfSummerHouses = 0;
        for(Structure structure: structureList){
            if(structure instanceof SummerHouse)
                totalPriceOfSummerHouses += structure.getPrice();
        }
        return  totalPriceOfSummerHouses;
    }

    @Override
    public double meanSquareMetersOfHouses(List<Structure> structureList) {
        double totalSquareMetersOfHouses = 0;
        int houseCount = 0;
        for(Structure structure: structureList){
            if(structure instanceof House) {
                houseCount++;
                totalSquareMetersOfHouses += structure.getSquareMeters();
            }

        }
        return  totalSquareMetersOfHouses/houseCount;
    }

    @Override
    public double meanSquareMetersOfVillas(List<Structure> structureList) {
        double totalSquareMetersOfVillas = 0;
        int villasCount = 0;
        for(Structure structure: structureList){
            if(structure instanceof Villa) {
                villasCount++;
                totalSquareMetersOfVillas += structure.getSquareMeters();
            }

        }
        return  totalSquareMetersOfVillas/villasCount;
    }

    @Override
    public double meanSquareMetersOfSummerHouses(List<Structure> structureList) {
        double totalSquareMetersOfSummerHouses = 0;
        int summerHousesCount = 0;
        for(Structure structure: structureList){
            if(structure instanceof SummerHouse) {
                summerHousesCount++;
                totalSquareMetersOfSummerHouses += structure.getSquareMeters();
            }

        }
        return  totalSquareMetersOfSummerHouses/summerHousesCount;
    }

    @Override
    public List<Structure> getStructureList(List<Structure> structureList,int numberOfRooms, int numberOfLivingRooms) {
        List<Structure>  response = new ArrayList<>();
        for(Structure structure: structureList){
            if(structure.getNumberOfRooms() == numberOfRooms && structure.getNumberOfLivingRoom() == numberOfLivingRooms){
                response.add(structure);
            }

        }
        return response;
    }
}
