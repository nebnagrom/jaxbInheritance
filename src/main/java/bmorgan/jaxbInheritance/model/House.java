package bmorgan.jaxbInheritance.model;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

@XmlRootElement
@XmlSeeAlso({ GreenHouse.class })
public class House {

    private String houseName;

    public House() {
        super();
    }

    public House(String houseName) {
        super();
        this.houseName = houseName;
    }

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

}
