package glumov_oleg.security_app.performer;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PerformerService {

    @Autowired
    private PerformerRepository performerRepository;

    public List<Performer> findAll() {
        return performerRepository.findAll();
    }

    public Performer findById(Long id) {
        return performerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Performer not found"));
    }

    public Performer save(Performer performer) {
        return performerRepository.save(performer);
    }

}
