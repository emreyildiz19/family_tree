package emre.yildiz.family_tree.Controller;


import emre.yildiz.family_tree.Model.familyTree;
import emre.yildiz.family_tree.Service.familyTreeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/familytrees")
@AllArgsConstructor
public class familyTreeController {

    //private static final List<familyTree> familyTrees = new ArrayList<>();

    //public familyTreeController() {
      //  if (familyTrees.isEmpty()) {
        //    familyTree familyTree1 = new familyTree(new Date(),"1", "Yıldız ağacı");
          //  familyTree familyTree2 = new familyTree(new Date(),"2", "Söylemez ağacı");


            //familyTrees.add(familyTree1);
            //familyTrees.add(familyTree2);

        //}
    //}

    private final familyTreeService familyTreeService;

    @GetMapping
    public ResponseEntity<List<familyTree>> getFamilyTrees() {


        return new ResponseEntity<>(familyTreeService.GetFamilyTrees(),HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<familyTree> getFamilyTreeById(@PathVariable String id) {

        return new ResponseEntity<>(familyTreeService.getFamilyTreeById(id),HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<familyTree> createFamilyTree(@RequestBody familyTree newFamilyTree) {

        return new ResponseEntity<>(familyTreeService.createFamilyTree(newFamilyTree),HttpStatus.CREATED);
    }
    @PutMapping("/{id}")
    public ResponseEntity<familyTree> updateFamilyTree(@PathVariable String id, @RequestBody familyTree newFamilyTree) {

        return new ResponseEntity<>(familyTreeService.updateFamilyTree(id,newFamilyTree),HttpStatus.OK);

        }
        @DeleteMapping("/{id}")
        public ResponseEntity<familyTree> deleteFamilyTree(@PathVariable String id) {

                familyTreeService.deleteFamilyTree(id);
                return new ResponseEntity<>(HttpStatus.OK);
        }
}
