package emre.yildiz.family_tree.Service;

import emre.yildiz.family_tree.Model.familyTree;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class familyTreeService {

    private final emre.yildiz.family_tree.Repository.familyTreeRepository familyTreeRepository;

    public  familyTree createFamilyTree(familyTree newFamilyTree) {
      return familyTreeRepository.save(newFamilyTree);
    }

    public List<familyTree> GetFamilyTrees() {
        return familyTreeRepository.findAll();
    }


    public familyTree getFamilyTreeById(String id) {
        return familyTreeRepository.findById(id).
                orElseThrow(() -> new IllegalArgumentException("Invalid familyTree Id:" + id));
    }

    public familyTree updateFamilyTree(String id, familyTree familyTree) {
        familyTree.setId(id);
        return familyTreeRepository.save(familyTree);
    }

    public void deleteFamilyTree(String id) {
        familyTreeRepository.deleteById(id);
    }
}
