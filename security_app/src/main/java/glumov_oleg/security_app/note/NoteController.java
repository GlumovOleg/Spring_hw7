package glumov_oleg.security_app.note;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/notyes")
public class NoteController {

    private final NoteService noteService;

    @Autowired
    public NoteController(NoteService noteService){
        this.noteService = noteService;
    }

    @GetMapping
    public List<Note> getAllNotes(){
        return noteService.getAllNotes();
    }

    @GetMapping("/{id}")
    public List<Note> getNoteById(@PathVariable Long id){
        return noteService.getAllNotes();
    }

    @GetMapping
    public Note createNote(@RequestBody Note note){
        return noteService.createNote(note);
    }

    @PutMapping("/{id}")
    public Note updateNote(@PathVariable Long id, @RequestBody Note note){
        return noteService.updatStatusNote(id, note);
    }

    @DeleteMapping("/{id}")
    public void deleteNote(@PathVariable Long id){
        noteService.deleteNote(id);
    }
}
