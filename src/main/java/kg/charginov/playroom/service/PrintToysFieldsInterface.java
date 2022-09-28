package kg.charginov.playroom.service;

import kg.charginov.playroom.model.Toy;
import kg.charginov.playroom.model.enums.ToySize;

import java.util.ArrayList;

public interface PrintToysFieldsInterface {

    public void getPriceOfAllToys(ArrayList<Toy> toys);

    public void getAllToys(ArrayList<Toy> toys);

    public void getAllToysByAgeRange(ArrayList<Toy> toys,int minAge,int maxAge);

    public void getAllToysBySize(ArrayList<Toy> toys, ToySize size);

    public void getAllToysByPriceRange(ArrayList<Toy> toys,int minPrice,int maxPrice);

}
