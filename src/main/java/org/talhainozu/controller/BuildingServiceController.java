package org.talhainozu.controller;

import org.talhainozu.entitiy.common.Structure;
import org.talhainozu.service.common.DataService;
import org.talhainozu.service.PatikaBuildingService;
import org.talhainozu.service.PatikaStructureDataService;
import org.talhainozu.service.common.StructureService;

import java.util.List;
//Main controller which is responsible for usage of Services
public class BuildingServiceController {
    public static void main(String[] args) {
        StructureService structureService = new PatikaBuildingService(); // PatikaBuildingService which is instance of StructureService
        DataService dataService = new PatikaStructureDataService(); // PatikaStructureDataService which is instance of dataService(data generator)
        List<Structure> structureList = dataService.data(); // take data to list

        System.out.println("Total price of all Structures : " + structureService.totalPriceOfAllStructures(structureList));
        System.out.println("Total price of Houses : " + structureService.totalPriceOfHouses(structureList));
        System.out.println("Total price of Villas : " + structureService.totalPriceOfVillas(structureList));
        System.out.println("Total price of SummerHouses : " + structureService.totalPriceOfSummerHouses(structureList) +"\n");

        System.out.println("Mean squareMeter of all Structures : " + structureService.meanSquareMetersOfAllStructures(structureList));
        System.out.println("Mean squareMeter of Houses : " + structureService.meanSquareMetersOfHouses(structureList));
        System.out.println("Mean squareMeter of Villas : " + structureService.meanSquareMetersOfVillas(structureList));
        System.out.println("Mean squareMeter of SummerHouses : " + structureService.meanSquareMetersOfSummerHouses(structureList) + "\n");

        System.out.println("Filtered result : " + structureService.getStructureList(structureList,3,1));


    }
}