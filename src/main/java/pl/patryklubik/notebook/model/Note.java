package pl.patryklubik.notebook.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//import javax.persistence.*;
import javax.validation.constraints.NotBlank;


/**
 * Create by Patryk Łubik on 03.05.2021.
 */

@Getter
@Setter
//@Entity
@Document
//@Table (name = "notes")
public class Note {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    @NotBlank(message = "Notes title must not be null")
    private String title;
    @NotBlank(message = "Notes description must not be null")
    private String description;
    private boolean importanceFlag;

    Note() {}


    public void updateFrom(final Note source) {

        title = source.title;
        description = source.description;
        importanceFlag = source.importanceFlag;
    }

}
