package org.talhainozu.service.common;

import org.talhainozu.entitiy.common.Structure;

import java.util.List;

public interface StructureService {

    public double totalPriceOfAllStructures(List<Structure> structureList);//return total price of all type of buildings
    public double meanSquareMetersOfAllStructures(List<Structure> structureList);//return mean square meter of all type of buildings
    public double totalPriceOfHouses(List<Structure> structureList); // return total price of houses
    public double totalPriceOfVillas(List<Structure> structureList); // return total price of villas
    public double totalPriceOfSummerHouses(List<Structure> structureList); // return total price of summer houses
    public double meanSquareMetersOfHouses(List<Structure> structureList); // return mean square meter of houses
    public double meanSquareMetersOfVillas(List<Structure> structureList); // return mean square meter of villas
    public double meanSquareMetersOfSummerHouses(List<Structure> structureList); //  return mean square meter of summer houses
    public List<Structure> getStructureList(List<Structure> structureList,int numberOfRooms, int numberOfLivingRooms); // return all type of buildings which matches witch input infos, in a list


}
