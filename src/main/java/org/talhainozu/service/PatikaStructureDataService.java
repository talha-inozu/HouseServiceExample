package org.talhainozu.service;

import org.talhainozu.entitiy.House;
import org.talhainozu.entitiy.SummerHouse;
import org.talhainozu.entitiy.Villa;
import org.talhainozu.entitiy.interfaces.Structure;

import java.util.ArrayList;
import java.util.List;

public class PatikaStructureDataService implements DataService {
    @Override
    public List data() {
        List<Structure> dataList = new ArrayList<>();

        House house_1 = new House(1500.0 ,165.0 ,3,1);
        House house_2 = new House(25500.0 ,95.0 ,4,2);
        House house_3 = new House(15500.0 ,265.0 ,5,1);

        Villa villa_1 = new Villa(1500.0 ,55.0 ,2,1);
        Villa villa_2 = new Villa(2000.0 ,95.0 ,7,2);
        Villa villa_3 = new Villa(5000.0 ,70.0 ,3,1);

        SummerHouse summerHouse_1 = new SummerHouse(5000.0 ,47.0 ,1,1);
        SummerHouse summerHouse_2 = new SummerHouse(25000.0 ,88.0 ,3,2);
        SummerHouse summerHouse_3 = new SummerHouse(10000.0 ,77.0 ,7,1);

        dataList.add(house_1);
        dataList.add(house_2);
        dataList.add(house_3);
        dataList.add(villa_1);
        dataList.add(villa_2);
        dataList.add(villa_3);
        dataList.add(summerHouse_1);
        dataList.add(summerHouse_2);
        dataList.add(summerHouse_3);

        return dataList;
    }
}
