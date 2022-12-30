package emre.yildiz.family_tree.Repository;

import emre.yildiz.family_tree.Model.familyTree;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface familyTreeRepository extends MongoRepository<familyTree,String> {

}
