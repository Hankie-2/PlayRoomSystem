package kg.charginov.playroom.model;

import kg.charginov.playroom.model.enums.AgeGroup;
import kg.charginov.playroom.model.enums.ToySize;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Toy implements Comparable<Toy> {

    Integer id;

    String name;

    ToySize size;

    Double price;

    Integer age;

    public Toy(Integer id, String name, ToySize size, Double price, Integer age) {
        this.id = id;
        this.name = name;
        this.size = size;
        this.price = price;
        this.age = age;
    }

    @Override
    public int compareTo(Toy o) {
        return this.price.compareTo(o.price);
    }
}
