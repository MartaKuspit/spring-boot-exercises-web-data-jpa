package pl.sdacademy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Balloon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int radius;
    private String color;

    public Long getId() {
        return id;
    }

    public int getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }
}

