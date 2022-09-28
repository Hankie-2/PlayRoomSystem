package kg.charginov.playroom.service;

import kg.charginov.playroom.model.Toy;

import java.util.ArrayList;

public interface CreateToysInterface {
    public ArrayList<Toy> create(Double money, int min, int max);
}
