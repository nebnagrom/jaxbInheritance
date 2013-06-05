package bmorgan.jaxbInheritance.model;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class BlueHouse extends House {

    private Integer blueAttribute;

    public BlueHouse() {
        super();
    }

    public BlueHouse(String houseName, Integer blueAttribute) {
        super(houseName);
        this.blueAttribute = blueAttribute;
    }

    public Integer getBlueAttribute() {
        return blueAttribute;
    }

    public void setBlueAttribute(Integer blueAttribute) {
        this.blueAttribute = blueAttribute;
    }
}
