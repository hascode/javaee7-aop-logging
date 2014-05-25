package com.hascode.tutorial;

import javax.annotation.security.RolesAllowed;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Stateless
@Path("/user")
@Interceptors(ActionProtocolInterceptor.class)
@RolesAllowed("admin")
public class UserWebservice {

	@DELETE
	@Path("/{userId}")
	public Response removeUser(@PathParam("userId") String userId) {
		// do stuff..
		return Response.ok().build();
	}

	@GET
	@Path("/{userId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getUser(@PathParam("userId") String userId) {
		// do stuff..
		return Response.ok().build();
	}
}
