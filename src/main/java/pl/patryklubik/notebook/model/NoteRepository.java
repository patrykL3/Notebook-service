package pl.patryklubik.notebook.model;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Create by Patryk Łubik on 03.05.2021.
 */

public interface NoteRepository extends JpaRepository<Note, Integer> {

}
