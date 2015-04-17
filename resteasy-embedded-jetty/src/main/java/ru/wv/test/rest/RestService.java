package ru.wv.test.rest;

import ru.wv.test.model.User;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.Collections;
import java.util.List;

@Path("/api")
public class RestService {
    @GET
    @Path("/echo")
    @Produces(MediaType.APPLICATION_XML)
    public List<User> echo(@QueryParam("n") String name,
                           @QueryParam("a") int age) {
        User user = new User();
        user.setName(name);
        user.setAge(age);

        return Collections.singletonList(user);
    }
}
