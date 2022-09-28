package kg.charginov.playroom.service.impl;

import kg.charginov.playroom.model.Toy;
import kg.charginov.playroom.model.enums.AgeGroup;
import kg.charginov.playroom.model.enums.ToySize;
import kg.charginov.playroom.service.CreateToysInterface;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class CreateToys implements CreateToysInterface {
    private final ArrayList<Toy> toys = new ArrayList<>();

    @Override
    public ArrayList<Toy> create(Double money,int min,int max){
        Random r = new Random();
        int i = 0;
        while(money>0){
            double price =50 + (1500 - 50) * r.nextDouble();
            if(money-price<0){
                break;
            }
            ToySize toySize = intToSize(r.nextInt(3-1)+1);
            Integer ageGroup = r.nextInt(max-min)+min;
            toys.add(new Toy(i++,"Игрушка №"+i,toySize,price,ageGroup));
            money-=price;
        }
        return toys;
    }

    private ToySize intToSize(int size){
        return switch (size) {
            case 1 -> ToySize.SMALL;
            case 2 -> ToySize.MEDIUM;
            case 3 -> ToySize.LARGE;
            default -> null;
        };
    }

}
