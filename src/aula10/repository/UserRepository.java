package aula10.repository;

import aula10.util.Hash;
import java.util.HashMap;
import java.util.Map;

public class UserRepository {
    private final Map<String, String> users = new HashMap<>();

    public UserRepository() {
        users.put("admin", Hash.hashPassword("123"));
        users.put("joao", Hash.hashPassword("123456"));
    }

    public String getPasswordHashByUsername(String username) {
        return users.get(username);
    }
}
