package bmorgan.jaxbInheritance.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@SuppressWarnings("rawtypes")
public class HouseBasedHousingEstate {

    private List houses = new ArrayList();

    public List getHouses() {
        return houses;
    }

    public void setHouses(List houses) {
        this.houses = houses;
    }
 
    @SuppressWarnings("unchecked")
    public boolean addHouse(House house){
        return houses.add(house);
    }
}
