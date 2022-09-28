package kg.charginov.playroom;

import kg.charginov.playroom.model.Toy;
import kg.charginov.playroom.model.enums.ToySize;
import kg.charginov.playroom.service.impl.CreateToys;
import kg.charginov.playroom.service.impl.PrintToysFields;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        CreateToys createToys = new CreateToys();

        ArrayList<Toy> toys = createToys.create(5000.12,3,5);
        Collections.sort(toys);

        PrintToysFields printToysFields = new PrintToysFields();

        System.out.println("===================All Toys===================");
        printToysFields.getAllToys(toys);
        System.out.println("==================Age Range===================");
        printToysFields.getAllToysByAgeRange(toys,3,4);
        System.out.println("==================Price Range=================");
        printToysFields.getAllToysByPriceRange(toys,600,1500);
        System.out.println("==================Size Range==================");
        printToysFields.getAllToysBySize(toys, ToySize.SMALL);

        printToysFields.getPriceOfAllToys(toys);
    }
}
