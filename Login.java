public class Login {  
  public static void main(String[] args) {

    String user = args[0];
    String pass = args[1];

    if (user.equals("admin") && pass.equals("123")) {

      System.out.println("Bem-vindo!");

    } else {

      System.out.println("Erro");

    }

  }

}