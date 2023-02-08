package org.talhainozu.service;

import org.talhainozu.entitiy.interfaces.Structure;

import java.util.List;

public interface StructureService {

    public double totalPriceOfAllStructures(List<Structure> structureList);
    public double meanSquareMetersOfAllStructures(List<Structure> structureList);
    public double totalPriceOfHouses(List<Structure> structureList);
    public double totalPriceOfVillas(List<Structure> structureList);
    public double totalPriceOfSummerHouses(List<Structure> structureList);
    public double meanSquareMetersOfHouses(List<Structure> structureList);
    public double meanSquareMetersOfVillas(List<Structure> structureList);
    public double meanSquareMetersOfSummerHouses(List<Structure> structureList);
    public List<Structure> getStructureList(List<Structure> structureList,int numberOfRooms, int numberOfLivingRooms);


}
