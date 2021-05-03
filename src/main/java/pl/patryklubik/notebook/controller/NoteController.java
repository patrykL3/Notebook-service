package pl.patryklubik.notebook.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.patryklubik.notebook.model.Note;
import pl.patryklubik.notebook.model.NoteRepository;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;


/**
 * Create by Patryk Łubik on 03.05.2021.
 */

@RestController
@RequestMapping("/notes")
public class NoteController {
    
    private final NoteRepository repository;

    NoteController(final NoteRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/all")
    ResponseEntity<List<Note>> getAllNotes () {

        return ResponseEntity.ok(repository.findAll());
    }

    @PostMapping("/add")
    ResponseEntity<Note> createNote(@RequestBody @Valid Note toCreate) {
        Note result = repository.save(toCreate);
        return ResponseEntity.created(URI.create("/" + result.getId())).body(result);
    }

    @PutMapping("/{id}")
    ResponseEntity<?> updateNote(@PathVariable int id, @RequestBody @Valid Note toUpdate) {

        if(!repository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }

        repository.findById(id)
                .ifPresent(note -> {
                    note.updateFrom(toUpdate);
                    repository.save(note);
                });
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/delete/{id}")
    ResponseEntity<?> deleteNote(@PathVariable int id) {

        if(!repository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }

        repository.deleteNoteById(id);
        return ResponseEntity.noContent().build();
    }
}
