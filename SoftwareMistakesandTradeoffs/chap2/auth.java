public class AuthService {

  public boolean isTokenValid(String token) {
    return token.equals("secret");
  }
}