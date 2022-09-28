package kg.charginov.playroom.service.impl;

import kg.charginov.playroom.model.Toy;
import kg.charginov.playroom.model.enums.AgeGroup;
import kg.charginov.playroom.model.enums.ToySize;
import kg.charginov.playroom.service.PrintToysFieldsInterface;

import java.util.ArrayList;
import java.util.Collections;

public class PrintToysFields implements PrintToysFieldsInterface {

    @Override
    public void getPriceOfAllToys(ArrayList<Toy> toys){
        double sum = 0;
        for(Toy toy:toys){
            sum+=toy.getPrice();
        }
        System.out.println("Общая стоимость всех игрушек равен "+ sum);
    }

    @Override
    public void getAllToys(ArrayList<Toy> toys){
        for(Toy toy:toys){
            System.out.println(toy);
        }
    }

    @Override
    public void getAllToysByAgeRange(ArrayList<Toy> toys,int minAge,int maxAge){
        for(Toy toy:toys){
            if(toy.getAge()>=minAge && toy.getAge()<=maxAge){
                System.out.println(toy);
            }
        }
    }

    @Override
    public void getAllToysBySize(ArrayList<Toy> toys,ToySize size){
        for(Toy toy:toys){
            if(toy.getSize().equals(size)){
                System.out.println(toy);
            }
        }
    }

    @Override
    public void getAllToysByPriceRange(ArrayList<Toy> toys,int minPrice,int maxPrice){
        for(Toy toy:toys){
            if(toy.getPrice()>=minPrice && toy.getPrice()<=maxPrice){
                System.out.println(toy);
            }
        }
    }

}
