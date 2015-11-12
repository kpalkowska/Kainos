package view;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/")
@Produces(MediaType.TEXT_HTML)
public class ViewResource {
    @GET
    public PersonView get(@QueryParam("name") @DefaultValue("stranger") String name){
        return new PersonView(new Person(name));
    }
}
