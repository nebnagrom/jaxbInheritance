package bmorgan.jaxbInheritance.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

import bmorgan.jaxbInheritance.model.BlueHouse;
import bmorgan.jaxbInheritance.model.GreenHouse;
import bmorgan.jaxbInheritance.model.HousingEstate;
import bmorgan.jaxbInheritance.model.RedHouse;

@Component
@Path("housingEstate")
public class HousingEstateResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("blue")
    public HousingEstate<BlueHouse> getBlue() {

        HousingEstate<BlueHouse> housingEstate = new HousingEstate<BlueHouse>();
        housingEstate.addHouse(new BlueHouse("first blue", 1));
        housingEstate.addHouse(new BlueHouse("2 blue", 2));

        return housingEstate;
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("red")
    public HousingEstate<RedHouse> getRed() {

        HousingEstate<RedHouse> housingEstate = new HousingEstate<RedHouse>();
        housingEstate.addHouse(new RedHouse("first red", "redone"));
        housingEstate.addHouse(new RedHouse("2 red", "more red"));

        return housingEstate;
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("green")
    public HousingEstate<GreenHouse> getGreen() {

        HousingEstate<GreenHouse> housingEstate = new HousingEstate<GreenHouse>();
        housingEstate.addHouse(new GreenHouse("frst green", true));
        housingEstate.addHouse(new GreenHouse("2nd green", false));

        return housingEstate;
    }
}
