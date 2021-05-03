package pl.patryklubik.notebook.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;


/**
 * Create by Patryk Łubik on 03.05.2021.
 */

@Entity
@Table(name = "notes")
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank(message = "Notes title must not be null")
    private String title;
    @NotBlank(message = "Notes description must not be null")
    private String description;
    private boolean importanceFlag;

    Note() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isImportanceFlag() {
        return importanceFlag;
    }

    public void setImportanceFlag(boolean importanceFlag) {
        this.importanceFlag = importanceFlag;
    }

    public void updateFrom(final Note source) {

        title = source.title;
        description = source.description;
        importanceFlag = source.importanceFlag;
    }

}
