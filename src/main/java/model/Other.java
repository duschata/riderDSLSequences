package model;

import javax.persistence.Entity;

@Entity
public class Other extends CoreEntity {
    private String name;

    public Other(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
