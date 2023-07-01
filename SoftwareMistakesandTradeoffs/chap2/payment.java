// HTTPエンドポイント /paymentを持つ

@Path("/payment")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PaymentResource {

  private final PaymentService PaymentService = new PaymentService();
  private final AuthService authService = new AuthService();
}