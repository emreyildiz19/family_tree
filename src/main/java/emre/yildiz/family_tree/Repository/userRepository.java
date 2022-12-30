package emre.yildiz.family_tree.Repository;

import emre.yildiz.family_tree.Model.user;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface userRepository extends MongoRepository<user,String> {

}

