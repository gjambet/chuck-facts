package me.guillaume.chuck_facts.infrastructure.persistence;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
class Initializer {

    private final ChuckFactsRepository repository;

    public Initializer(ChuckFactsRepository repository) {
        this.repository = repository;
    }

    @PostConstruct
    public void initialize() {

        repository.deleteAllInBatch();

        if (repository.findAll().isEmpty()) {
            repository.saveAndFlush(new ChuckFact("Chuck Norris can divide by zero."));
            repository.saveAndFlush(new ChuckFact("Chuck Norris once lost his wedding ring....since then it's been war in Middle Earth"));
            repository.saveAndFlush(new ChuckFact("In the Beginning there was nothing ... then Chuck Norris roundhouse kicked nothing and told it to get a job"));
            repository.saveAndFlush(new ChuckFact("When God said, “Let there be light!” Chuck said, “Say Please.”"));
        }
    }

}
