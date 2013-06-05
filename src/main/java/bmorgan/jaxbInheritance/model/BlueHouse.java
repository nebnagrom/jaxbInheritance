package bmorgan.jaxbInheritance.model;


public class BlueHouse extends House {

    private Integer blueAttribute;

    public BlueHouse() {
        super();
    }

    public BlueHouse(String houseName, Integer blueAttribute) {
        super(houseName);
        this.blueAttribute = blueAttribute;
    }

    public Integer getRedAttribute() {
        return blueAttribute;
    }

    public void setRedAttribute(Integer redAttribute) {
        this.blueAttribute = redAttribute;
    }
}
