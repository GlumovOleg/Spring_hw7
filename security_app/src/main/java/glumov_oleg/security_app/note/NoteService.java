package glumov_oleg.security_app.note;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteService {

    @Autowired
    private NoteRepository noteRepository;

    public Note createNote(Note note) {
        return noteRepository.save(note);
    }

    public List<Note> getAllNotes() {
        return noteRepository.findAll();
    }

    public Note getNoteById(Long id){
        return noteRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Заметка не найдена"));
    }

    public Note updatStatusNote(Long id, Note note){
        Note existNote = getNoteById(id);
        existNote.setStatus(note.getStatus());
        return noteRepository.save(existNote);
    }

    public void deleteNote(Long id){
        getNoteById(id);
        noteRepository.deleteById(id);
    }

}
