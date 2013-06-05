package bmorgan.jaxbInheritance.model;

public class GreenHouse extends House {

    private Boolean greenAttribute;

    public GreenHouse() {
        super();
    }

    public GreenHouse(String houseName, Boolean greenAttribute) {
        super(houseName);
        this.greenAttribute = greenAttribute;
    }

    public Boolean getGreenAttribute() {
        return greenAttribute;
    }

    public void setGreenAttribute(Boolean greenAttribute) {
        this.greenAttribute = greenAttribute;
    }
}
