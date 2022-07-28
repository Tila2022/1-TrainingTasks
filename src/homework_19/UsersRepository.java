package homework_19;

import java.util.List;

public interface UsersRepository {
    User findById(int id);
    List<User> findAll();
    List<User> findByAge(int age);
    List<User> findByIsWorkerIsTrue();
    void save (User user);
    void update(User user);
}