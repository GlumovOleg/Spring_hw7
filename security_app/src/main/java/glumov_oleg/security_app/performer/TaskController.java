package glumov_oleg.security_app.performer;

import glumov_oleg.security_app.note.Note;
import glumov_oleg.security_app.note.NoteService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Tag(name = "Task API")
public class TaskController {

    @Autowired
    private PerformerService performerService;

    @Autowired
    private NoteService noteService;

    @GetMapping("/notes")
    public List<Note> getAllNotes(){
        return noteService.getAllNotes();
    }

}
