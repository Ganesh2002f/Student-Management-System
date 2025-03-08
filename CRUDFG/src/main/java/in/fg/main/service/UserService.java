package in.fg.main.service;

import in.fg.main.entity.User;

public interface UserService {

    void registerUser(User user);

    User findByUsername(String username);
}
