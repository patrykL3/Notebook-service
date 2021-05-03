package pl.patryklubik.notebook.model;

import java.util.List;
import java.util.Optional;


/**
 * Create by Patryk Łubik on 03.05.2021.
 */

public interface NoteRepository {

    List<Note> findAll();

    Optional<Note> findById(Integer id);

    Note save(Note entity);

    Optional<Note> deleteNoteById(Integer id);

    boolean existsById(Integer id);

}
