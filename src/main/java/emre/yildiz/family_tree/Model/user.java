package emre.yildiz.family_tree.Model;


import com.mongodb.lang.Nullable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class user {

    @Id
    private String id;
    private String name;
    private String surname;
    @Nullable
    private Object fathersId;
    @Nullable
    private Integer mothersTc;
    @Nullable
    private Integer spouseTc;
    private Date birthDate;
    @Nullable
    private Date deathDate;


    private user father;


    private Date createdDate = new Date();


}
