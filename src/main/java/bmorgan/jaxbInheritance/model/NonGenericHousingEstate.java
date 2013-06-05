package bmorgan.jaxbInheritance.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NonGenericHousingEstate {

    private List<House> houses = new ArrayList<House>();

    public List<House> getHouses() {
        return houses;
    }

    public void setHouses(List<House> houses) {
        this.houses = houses;
    }

    public boolean addHouse(House house) {
        return houses.add(house);
    }
}
