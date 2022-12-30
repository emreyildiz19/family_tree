package emre.yildiz.family_tree.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class familyTree {
    @Id
    private String id;
    private String name;
    private Date createdDate = new Date();
}
