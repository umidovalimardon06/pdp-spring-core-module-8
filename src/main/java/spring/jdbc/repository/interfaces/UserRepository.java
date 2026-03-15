package spring.jdbc.repository.interfaces;

import org.springframework.stereotype.Repository;
import spring.jdbc.model.User;
import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository {
    void save(User user);
    Optional<User> findById(long id);
    List<User> findAll();
    void update(User user);
    void deleteById(long id);
}