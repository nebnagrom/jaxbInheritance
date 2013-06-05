package bmorgan.jaxbInheritance.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class HousingEstate<T extends House> {

    private List<T> houses = new ArrayList<T>();

    public List<T> getHouses() {
        return houses;
    }

    public void setHouses(List<T> houses) {
        this.houses = houses;
    }
 
    public boolean addHouse(T house){
        return houses.add(house);
    }
}
