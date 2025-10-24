package aula10.service;

import aula10.repository.UserRepository;
import aula10.util.Hash;

public class AuthService {
    private final UserRepository userRepository = new UserRepository();

    public boolean authenticate(String username, String password) throws Exception {
        String storedHash = userRepository.getPasswordHashByUsername(username);
        if (storedHash == null) {
            return false; // usuário não existe
        }

        String inputHash = Hash.hashPassword(password);
        return storedHash.equals(inputHash);
    }
}
