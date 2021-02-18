package me.guillaume.chuck_facts.application;

import me.guillaume.chuck_facts.infrastructure.persistence.ChuckFact;
import me.guillaume.chuck_facts.infrastructure.persistence.ChuckFactsRepository;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class ChuckFactsService {

    private final ChuckFactsRepository repository;

    public ChuckFactsService(ChuckFactsRepository repository) {
        this.repository = repository;
    }

    @PostConstruct
    public void initialize() {
        if (repository.findAll().isEmpty()) {
            repository.saveAndFlush(new ChuckFact("Chuck Norris once lost his wedding ring....since then it's been war in Middle Earth"));
        }
    }

    public List<ChuckFact> facts() {
        return repository.findAll();
    }

}
