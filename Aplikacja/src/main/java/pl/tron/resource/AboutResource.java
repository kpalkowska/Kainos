package pl.tron.resource;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import pl.tron.About;
import pl.tron.view.AboutView;

@Path("/About")
@Produces(MediaType.TEXT_HTML)
public class AboutResource {
    @GET
    public AboutView get(@QueryParam("name") @DefaultValue("stranger") String name){
        return new AboutView(new About(name));
    }
}

