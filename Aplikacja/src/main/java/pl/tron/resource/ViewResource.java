package pl.tron.resource;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import pl.tron.Person;
import pl.tron.view.PersonView;

@Path("/")
@Produces(MediaType.TEXT_HTML)
public class ViewResource {
    @GET
    public PersonView get(@QueryParam("name") @DefaultValue("stranger") String name){
        return new PersonView(new Person(name));
     
    }
}
