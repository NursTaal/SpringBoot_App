package Spring1.Springboot2.DAO;


import Spring1.Springboot2.model.User;

import java.util.List;

public interface UserDAO {
    User getUserById(int id);
    List<User> getAllUsers();
    void addUser(User user);
    void updateUserById(int id, User user);
    void deleteUserById(int id);
}
