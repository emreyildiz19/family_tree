package emre.yildiz.family_tree.Service;

import emre.yildiz.family_tree.Model.user;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class userService {

    private final emre.yildiz.family_tree.Repository.userRepository userRepository;

    public List getUsers() {
        return userRepository.findAll();
    }

    public user createUser(user newUser) {
      return userRepository.save(newUser);
    }

    public user getUserById(String id) {
        return userRepository.findById(id).
                orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
    }

    public user updateUser(String id, user user) {
        user.setId(id);
        return userRepository.save(user);
    }

    public void deleteUser(String id) {
        userRepository.deleteById(id);
    }
}
