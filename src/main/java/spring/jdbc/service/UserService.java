package spring.jdbc.service;

import org.springframework.stereotype.Service;
import spring.jdbc.model.User;
import spring.jdbc.repository.interfaces.UserRepository;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void registerUser(String name, String email) {
        User user = new User(name, email);
        userRepository.save(user);
        System.out.println("Registered: " + user);
    }

    public void printAllUsers() {
        List<User> users = userRepository.findAll();
        users.forEach(System.out::println);
    }
}