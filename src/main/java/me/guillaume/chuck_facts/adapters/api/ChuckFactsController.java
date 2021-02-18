package me.guillaume.chuck_facts.adapters.api;

import me.guillaume.chuck_facts.application.ChuckFactsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static java.util.stream.Collectors.toList;

@RestController
public class ChuckFactsController {

    private final ChuckFactsService chuckFactsService;

    public ChuckFactsController(ChuckFactsService chuckFactsService) {
        this.chuckFactsService = chuckFactsService;
    }


    @GetMapping(value="/chuck-facts")
    public List<String> pippos() {
        return chuckFactsService.facts()
                .stream()
                .map(p-> p.getName())
                .collect(toList());
    }

}
