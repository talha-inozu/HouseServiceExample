package org.talhainozu;

import org.talhainozu.persistance.Structure;
import org.talhainozu.service.DataService;
import org.talhainozu.service.PatikaBuildingService;
import org.talhainozu.service.PatikaStructureDataService;
import org.talhainozu.service.StructureService;

import java.util.List;

public class App {
    public static void main(String[] args) {
        StructureService structureService = new PatikaBuildingService();
        DataService dataService = new PatikaStructureDataService();
        List<Structure> structureList = dataService.data();

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