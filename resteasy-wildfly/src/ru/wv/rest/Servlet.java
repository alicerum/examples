package ru.wv.rest;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import ru.wv.rest.model.User;
import ru.wv.rest.service.UserService;

@Path ("/api")
public class Servlet {
	@Inject
	private UserService userService;
	
	@GET
	@Path("/users")
	@Produces(MediaType.APPLICATION_XML)
	public User getUsers() {
		return userService.getUsers().get(0);
	}
}
