// HTTPエンドポイント /personを持つ

@Path("/person")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PersonResource {

  private final PersonService PersonService = new PersonService();
  private final AuthService authService = new AuthService();
}

@GET
@Path("/{token}")
public Response getPersonById(@PathParam("token") String token, @PathParam("id") String id) {
  if (authService.isTokenValid(token)) {
    return Response.ok(personService.getPersonById(id)).build();
  } else {
    return Response.status(Status.UNAUTHORIZED).build();
  }
}