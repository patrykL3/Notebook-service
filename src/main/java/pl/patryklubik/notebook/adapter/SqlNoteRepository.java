package pl.patryklubik.notebook.adapter;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.patryklubik.notebook.model.Note;
import pl.patryklubik.notebook.model.NoteRepository;

/**
 * Create by Patryk Łubik on 03.05.2021.
 */

@Repository
interface SqlNoteRepository extends NoteRepository, JpaRepository<Note, Integer> {
}