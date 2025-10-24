package aula10.controller;

import aula10.service.AuthService;
import java.util.Scanner;
import java.util.logging.Logger;

public class Login {
    private static final Logger logger = Logger.getLogger(Login.class.getName());
    private final AuthService authService = new AuthService();

    public void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Usuário: ");
        String username = scanner.nextLine().trim();

        System.out.print("Senha: ");
        String password = scanner.nextLine().trim();

        try {
            if (username.isEmpty() || password.isEmpty()) {
                System.out.println("Usuário e senha não podem estar vazios.");
                logger.warning("Tentativa com campos vazios");
                return;
            }

            boolean sucesso = authService.authenticate(username, password);
            if (sucesso) {
                System.out.println("Login bem sucedido! Bem vindo, " + username + "!");
                logger.info("Login bem sucedido para o usuário: " + username);
            } else {
                System.out.println("Usuário ou senha incorretos.");
                logger.warning("Falha de login para o usuário: " + username);
            }

        } catch (Exception e) {
            System.out.println("Erro ao processar login: " + e.getMessage());
            logger.severe("Erro durante o login: " + e.getMessage());
        }

        scanner.close();
    }
}
