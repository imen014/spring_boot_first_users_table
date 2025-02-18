package user.app.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Data;
import user.app.demo.model.User;
import user.app.demo.model.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
@Data
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

  
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
