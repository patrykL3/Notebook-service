package pl.patryklubik.notebook.model;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;


/**
 * Create by Patryk Łubik on 03.05.2021.
 */
public interface NoteRepository extends MongoRepository<Note, String> {

    List<Note> findAll();

    Optional<Note> findById(String id);

    Note save(Note entity);

    void deleteById(String id);

    boolean existsById(String id);

}
