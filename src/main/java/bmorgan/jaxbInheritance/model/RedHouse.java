package bmorgan.jaxbInheritance.model;

public class RedHouse extends House {

    private String redAttribute;

    public RedHouse() {
        super();
    }

    public RedHouse(String houseName, String redAttribute) {
        super(houseName);
        this.redAttribute = redAttribute;
    }

    public String getRedAttribute() {
        return redAttribute;
    }

    public void setRedAttribute(String redAttribute) {
        this.redAttribute = redAttribute;
    }
}
