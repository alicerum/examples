package ru.wv.test.rest;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Arrays;
import java.util.List;

@Path("/api")
public class RestService {
    @GET
    @Path("/echo")
    @Produces(MediaType.APPLICATION_JSON)
    public List<String> echo(@QueryParam("q") String original) {
        return Arrays.asList("", original);
    }
}
