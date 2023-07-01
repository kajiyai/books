// HTTPエンドポイント /paymentを持つ

@Path("/payment")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PaymentResource {

  private final PaymentService PaymentService = new PaymentService();
  private final AuthService authService = new AuthService();
}

@GET
@Path("/{token}")
public Response getAllPayments(@PathParam("token") String token) {
  if (authService.isTokenValid(token)) {
    return Response.ok(paymentService.getAllPayments()).build();
  } else {
    return Response.status(Status.UNAUTHORIZED).build();
  }
}