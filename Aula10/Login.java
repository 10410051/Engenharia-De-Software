package Aula10;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;


public class Login {
  public static void main(String[] args) {
    User user = new User();
    Scanner sc = new Scanner(System.in);
    HashMap

    String user = args[0];
    String pass = args[1];
  
    if (user.equals("admin") && pass.equals("123")) {
  
      System.out.println("Bem-vindo!");
  
    } else {
  
      System.out.println("Erro");
  
    }
  
  } 

}